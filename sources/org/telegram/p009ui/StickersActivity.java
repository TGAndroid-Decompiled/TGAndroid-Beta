package org.telegram.p009ui;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.ActionBarMenu;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BackDrawable;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.FeaturedStickerSetCell2;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.RadioColorCell;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Cells.StickerSetCell;
import org.telegram.p009ui.Cells.TextCell;
import org.telegram.p009ui.Cells.TextCheckCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Cells.TextSettingsCell;
import org.telegram.p009ui.Components.Bulletin;
import org.telegram.p009ui.Components.BulletinFactory;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.EmojiPacksAlert;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.NumberTextView;
import org.telegram.p009ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.ReorderingBulletinLayout;
import org.telegram.p009ui.Components.ShareAlert;
import org.telegram.p009ui.Components.StickersAlert;
import org.telegram.p009ui.Components.TrendingStickersAlert;
import org.telegram.p009ui.Components.TrendingStickersLayout;
import org.telegram.p009ui.Components.URLSpanNoUnderline;
import org.telegram.p009ui.StickersActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetID;
import org.telegram.tgnet.TLRPC$TL_messages_reorderStickerSets;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;

public class StickersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int activeReorderingRequests;
    private int archivedInfoRow;
    private int archivedRow;
    private int currentType;
    private ActionBarMenuItem deleteMenuItem;
    private int emojiPacksRow;
    private int featuredStickersEndRow;
    private int featuredStickersHeaderRow;
    private int featuredStickersShadowRow;
    private int featuredStickersShowMoreRow;
    private int featuredStickersStartRow;
    ArrayList<TLRPC$TL_messages_stickerSet> frozenEmojiPacks;
    private boolean isListeningForFeaturedUpdate;
    private ItemTouchHelper itemTouchHelper;
    private int largeEmojiRow;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private int loopInfoRow;
    private int loopRow;
    private int masksInfoRow;
    private int masksRow;
    private boolean needReorder;
    private int reactionsDoubleTapRow;
    private int rowCount;
    private NumberTextView selectedCountTextView;
    private int stickersBotInfo;
    private int stickersEndRow;
    private int stickersHeaderRow;
    private int stickersShadowRow;
    private int stickersStartRow;
    private int suggestAnimatedEmojiInfoRow;
    private int suggestAnimatedEmojiRow;
    private int suggestRow;
    private TrendingStickersAlert trendingStickersAlert;
    private boolean updateSuggestStickers;

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    private List<TLRPC$StickerSetCovered> getFeaturedSets() {
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        if (this.currentType == 5) {
            ArrayList arrayList = new ArrayList(mediaDataController.getFeaturedEmojiSets());
            int i = 0;
            while (i < arrayList.size()) {
                if (arrayList.get(i) == null || mediaDataController.isStickerPackInstalled(((TLRPC$StickerSetCovered) arrayList.get(i)).set.f890id, false)) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
            return arrayList;
        }
        return mediaDataController.getFeaturedStickerSets();
    }

    public class TouchHelperCallback extends ItemTouchHelper.Callback {
        @Override
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        }

        public TouchHelperCallback() {
            StickersActivity.this = r1;
        }

        @Override
        public boolean isLongPressDragEnabled() {
            return StickersActivity.this.listAdapter.hasSelected();
        }

        @Override
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() != 0) {
                return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        @Override
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            if (viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
                return false;
            }
            StickersActivity.this.listAdapter.swapElements(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            return true;
        }

        @Override
        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
        }

        @Override
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (i == 0) {
                StickersActivity.this.sendReorder();
            } else {
                StickersActivity.this.listView.cancelClickRunnables(false);
                viewHolder.itemView.setPressed(true);
            }
            super.onSelectedChanged(viewHolder, i);
        }

        @Override
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            super.clearView(recyclerView, viewHolder);
            viewHolder.itemView.setPressed(false);
        }
    }

    public StickersActivity(int i, ArrayList<TLRPC$TL_messages_stickerSet> arrayList) {
        this.currentType = i;
        this.frozenEmojiPacks = arrayList;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(this.currentType);
        int i = this.currentType;
        if (i == 0) {
            MediaDataController.getInstance(this.currentAccount).checkFeaturedStickers();
            MediaDataController.getInstance(this.currentAccount).checkStickers(1);
            MediaDataController.getInstance(this.currentAccount).checkStickers(5);
        } else if (i == 6) {
            MediaDataController.getInstance(this.currentAccount).checkFeaturedEmoji();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.archivedStickersCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        updateRows(false);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.currentType == 6) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.archivedStickersCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    @SuppressLint({"ClickableViewAccessibility"})
    public View createView(final Context context) {
        ArrayList<TLRPC$TL_messages_stickerSet> arrayList;
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.currentType;
        if (i == 0) {
            this.actionBar.setTitle(LocaleController.getString("StickersName", C1072R.string.StickersName));
        } else if (i == 1) {
            this.actionBar.setTitle(LocaleController.getString("Masks", C1072R.string.Masks));
        } else if (i == 5) {
            this.actionBar.setTitle(LocaleController.getString("Emoji", C1072R.string.Emoji));
        }
        this.actionBar.setActionBarMenuOnItemClick(new C1133ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    if (StickersActivity.this.onBackPressed()) {
                        StickersActivity.this.finishFragment();
                    }
                } else if (i2 == 0 || i2 == 1 || i2 == 2) {
                    if (!StickersActivity.this.needReorder) {
                        if (StickersActivity.this.activeReorderingRequests == 0) {
                            StickersActivity.this.listAdapter.processSelectionMenu(i2);
                            return;
                        }
                        return;
                    }
                    StickersActivity.this.sendReorder();
                }
            }
        });
        ActionBarMenu createActionMode = this.actionBar.createActionMode();
        NumberTextView numberTextView = new NumberTextView(createActionMode.getContext());
        this.selectedCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedCountTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.selectedCountTextView.setTextColor(Theme.getColor("actionBarActionModeDefaultIcon"));
        createActionMode.addView(this.selectedCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.selectedCountTextView.setOnTouchListener(StickersActivity$$ExternalSyntheticLambda1.INSTANCE);
        createActionMode.addItemWithWidth(2, C1072R.C1073drawable.msg_share, AndroidUtilities.m35dp(54.0f));
        if (this.currentType != 5) {
            createActionMode.addItemWithWidth(0, C1072R.C1073drawable.msg_archive, AndroidUtilities.m35dp(54.0f));
        }
        this.deleteMenuItem = createActionMode.addItemWithWidth(1, C1072R.C1073drawable.msg_delete, AndroidUtilities.m35dp(54.0f));
        if (this.currentType != 5 || (arrayList = this.frozenEmojiPacks) == null) {
            arrayList = new ArrayList<>(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(MediaDataController.getInstance(this.currentAccount).getStickerSets(this.currentType)));
        }
        this.listAdapter = new ListAdapter(context, arrayList, getFeaturedSets());
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setFocusable(true);
        this.listView.setTag(7);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setMoveDuration(350L);
        defaultItemAnimator.setMoveInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.listView.setItemAnimator(defaultItemAnimator);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }

            @Override
            public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
                iArr[1] = StickersActivity.this.listView.getHeight();
            }
        };
        this.layoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        this.listView.setLayoutManager(this.layoutManager);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new TouchHelperCallback());
        this.itemTouchHelper = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(this.listView);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setSupportsChangeAnimations(false);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                StickersActivity.this.lambda$createView$2(context, view, i2);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i2) {
                boolean lambda$createView$3;
                lambda$createView$3 = StickersActivity.this.lambda$createView$3(view, i2);
                return lambda$createView$3;
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$2(Context context, View view, int i) {
        if (i >= this.featuredStickersStartRow && i < this.featuredStickersEndRow && getParentActivity() != null) {
            TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
            TLRPC$StickerSet tLRPC$StickerSet = ((TLRPC$StickerSetCovered) this.listAdapter.featuredStickerSets.get(i - this.featuredStickersStartRow)).set;
            tLRPC$TL_inputStickerSetID.f880id = tLRPC$StickerSet.f890id;
            tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
            if (this.currentType == 5) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(tLRPC$TL_inputStickerSetID);
                showDialog(new EmojiPacksAlert(this, getParentActivity(), getResourceProvider(), arrayList));
                return;
            }
            showDialog(new StickersAlert(getParentActivity(), this, tLRPC$TL_inputStickerSetID, (TLRPC$TL_messages_stickerSet) null, (StickersAlert.StickersAlertDelegate) null));
            return;
        }
        if (i == this.featuredStickersShowMoreRow) {
            if (this.currentType == 5) {
                ArrayList arrayList2 = new ArrayList();
                List<TLRPC$StickerSetCovered> featuredSets = getFeaturedSets();
                if (featuredSets != null) {
                    for (int i2 = 0; i2 < featuredSets.size(); i2++) {
                        TLRPC$StickerSetCovered tLRPC$StickerSetCovered = featuredSets.get(i2);
                        if (tLRPC$StickerSetCovered != null && tLRPC$StickerSetCovered.set != null) {
                            TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID2 = new TLRPC$TL_inputStickerSetID();
                            TLRPC$StickerSet tLRPC$StickerSet2 = tLRPC$StickerSetCovered.set;
                            tLRPC$TL_inputStickerSetID2.f880id = tLRPC$StickerSet2.f890id;
                            tLRPC$TL_inputStickerSetID2.access_hash = tLRPC$StickerSet2.access_hash;
                            arrayList2.add(tLRPC$TL_inputStickerSetID2);
                        }
                    }
                }
                MediaDataController.getInstance(this.currentAccount).markFeaturedStickersAsRead(true, true);
                showDialog(new EmojiPacksAlert(this, getParentActivity(), getResourceProvider(), arrayList2));
                return;
            }
            TrendingStickersAlert trendingStickersAlert = new TrendingStickersAlert(context, this, new TrendingStickersLayout(context, new TrendingStickersLayout.Delegate() {
                @Override
                public void onStickerSetAdd(TLRPC$StickerSetCovered tLRPC$StickerSetCovered2, boolean z) {
                    MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), tLRPC$StickerSetCovered2, 2, StickersActivity.this, false, false);
                }

                @Override
                public void onStickerSetRemove(TLRPC$StickerSetCovered tLRPC$StickerSetCovered2) {
                    MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), tLRPC$StickerSetCovered2, 0, StickersActivity.this, false, false);
                }
            }), null);
            this.trendingStickersAlert = trendingStickersAlert;
            trendingStickersAlert.show();
        } else if (i >= this.stickersStartRow && i < this.stickersEndRow && getParentActivity() != null) {
            if (this.listAdapter.hasSelected()) {
                this.listAdapter.toggleSelected(i);
                return;
            }
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) this.listAdapter.stickerSets.get(i - this.stickersStartRow);
            ArrayList<TLRPC$Document> arrayList3 = tLRPC$TL_messages_stickerSet.documents;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                return;
            }
            TLRPC$StickerSet tLRPC$StickerSet3 = tLRPC$TL_messages_stickerSet.set;
            if (tLRPC$StickerSet3 != null && tLRPC$StickerSet3.emojis) {
                ArrayList arrayList4 = new ArrayList();
                TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID3 = new TLRPC$TL_inputStickerSetID();
                TLRPC$StickerSet tLRPC$StickerSet4 = tLRPC$TL_messages_stickerSet.set;
                tLRPC$TL_inputStickerSetID3.f880id = tLRPC$StickerSet4.f890id;
                tLRPC$TL_inputStickerSetID3.access_hash = tLRPC$StickerSet4.access_hash;
                arrayList4.add(tLRPC$TL_inputStickerSetID3);
                showDialog(new EmojiPacksAlert(this, getParentActivity(), getResourceProvider(), arrayList4));
                return;
            }
            showDialog(new StickersAlert(getParentActivity(), this, (TLRPC$InputStickerSet) null, tLRPC$TL_messages_stickerSet, (StickersAlert.StickersAlertDelegate) null));
        } else if (i == this.archivedRow) {
            presentFragment(new ArchivedStickersActivity(this.currentType));
        } else if (i == this.masksRow) {
            presentFragment(new StickersActivity(1, null));
        } else if (i == this.emojiPacksRow) {
            presentFragment(new StickersActivity(5, null));
        } else if (i == this.suggestRow) {
            if (getParentActivity() == null) {
                return;
            }
            final AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("SuggestStickers", C1072R.string.SuggestStickers));
            String[] strArr = {LocaleController.getString("SuggestStickersAll", C1072R.string.SuggestStickersAll), LocaleController.getString("SuggestStickersInstalled", C1072R.string.SuggestStickersInstalled), LocaleController.getString("SuggestStickersNone", C1072R.string.SuggestStickersNone)};
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            builder.setView(linearLayout);
            int i3 = 0;
            while (i3 < 3) {
                RadioColorCell radioColorCell = new RadioColorCell(getParentActivity());
                radioColorCell.setPadding(AndroidUtilities.m35dp(4.0f), 0, AndroidUtilities.m35dp(4.0f), 0);
                radioColorCell.setTag(Integer.valueOf(i3));
                radioColorCell.setCheckColor(Theme.getColor("radioBackground"), Theme.getColor("dialogRadioBackgroundChecked"));
                radioColorCell.setTextAndValue(strArr[i3], SharedConfig.suggestStickers == i3);
                radioColorCell.setBackground(Theme.createSelectorDrawable(Theme.getColor("listSelectorSDK21"), 2));
                linearLayout.addView(radioColorCell);
                radioColorCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        StickersActivity.this.lambda$createView$1(builder, view2);
                    }
                });
                i3++;
            }
            showDialog(builder.create());
        } else if (i == this.loopRow) {
            SharedConfig.toggleLoopStickers();
            this.listAdapter.notifyItemChanged(this.loopRow, 0);
        } else if (i == this.largeEmojiRow) {
            SharedConfig.toggleBigEmoji();
            ((TextCheckCell) view).setChecked(SharedConfig.allowBigEmoji);
        } else if (i == this.suggestAnimatedEmojiRow) {
            SharedConfig.toggleSuggestAnimatedEmoji();
            ((TextCheckCell) view).setChecked(SharedConfig.suggestAnimatedEmoji);
        } else if (i == this.reactionsDoubleTapRow) {
            presentFragment(new ReactionsDoubleTapManageActivity());
        }
    }

    public void lambda$createView$1(AlertDialog.Builder builder, View view) {
        SharedConfig.setSuggestStickers(((Integer) view.getTag()).intValue());
        this.updateSuggestStickers = true;
        this.listAdapter.notifyItemChanged(this.suggestRow);
        builder.getDismissRunnable().run();
    }

    public boolean lambda$createView$3(View view, int i) {
        if (this.listAdapter.hasSelected() || i < this.stickersStartRow || i >= this.stickersEndRow) {
            return false;
        }
        this.listAdapter.toggleSelected(i);
        return true;
    }

    @Override
    public boolean onBackPressed() {
        if (this.listAdapter.hasSelected()) {
            this.listAdapter.clearSelected();
            return false;
        }
        return super.onBackPressed();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.stickersDidLoad) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = this.currentType;
            if (intValue == i3) {
                this.listAdapter.loadingFeaturedStickerSets.clear();
                updateRows(((Boolean) objArr[1]).booleanValue());
            } else if (i3 == 0 && intValue == 1) {
                this.listAdapter.notifyItemChanged(this.masksRow);
            }
        } else if (i == NotificationCenter.featuredStickersDidLoad || i == NotificationCenter.featuredEmojiDidLoad) {
            updateRows(false);
        } else if (i == NotificationCenter.archivedStickersCountDidLoad) {
            if (((Integer) objArr[0]).intValue() == this.currentType) {
                updateRows(false);
            }
        } else {
            int i4 = NotificationCenter.currentUserPremiumStatusChanged;
        }
    }

    public void sendReorder() {
        if (this.needReorder) {
            MediaDataController.getInstance(this.currentAccount).calcNewHash(this.currentType);
            this.needReorder = false;
            this.activeReorderingRequests++;
            TLRPC$TL_messages_reorderStickerSets tLRPC$TL_messages_reorderStickerSets = new TLRPC$TL_messages_reorderStickerSets();
            int i = this.currentType;
            tLRPC$TL_messages_reorderStickerSets.masks = i == 1;
            tLRPC$TL_messages_reorderStickerSets.emojis = i == 5;
            for (int i2 = 0; i2 < this.listAdapter.stickerSets.size(); i2++) {
                tLRPC$TL_messages_reorderStickerSets.order.add(Long.valueOf(((TLRPC$TL_messages_stickerSet) this.listAdapter.stickerSets.get(i2)).set.f890id));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_reorderStickerSets, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StickersActivity.this.lambda$sendReorder$5(tLObject, tLRPC$TL_error);
                }
            });
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(this.currentType), Boolean.TRUE);
        }
    }

    public void lambda$sendReorder$4() {
        this.activeReorderingRequests--;
    }

    public void lambda$sendReorder$5(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersActivity.this.lambda$sendReorder$4();
            }
        });
    }

    private void updateRows(boolean z) {
        final ArrayList<TLRPC$TL_messages_stickerSet> arrayList;
        boolean z2;
        boolean z3;
        DiffUtil.DiffResult diffResult;
        int i;
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        if (this.currentType == 5) {
            if (z || this.frozenEmojiPacks == null) {
                this.frozenEmojiPacks = new ArrayList<>(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(this.currentType)));
            }
            arrayList = this.frozenEmojiPacks;
        } else {
            arrayList = new ArrayList<>(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(this.currentType)));
        }
        List<TLRPC$StickerSetCovered> featuredSets = getFeaturedSets();
        if (featuredSets.size() > 3) {
            featuredSets = featuredSets.subList(0, 3);
            z2 = true;
        } else {
            z2 = false;
        }
        final ArrayList arrayList2 = new ArrayList(featuredSets);
        if (this.currentType == 5) {
            z3 = UserConfig.getInstance(this.currentAccount).isPremium();
            if (!z3) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    } else if (!MessageObject.isPremiumEmojiPack(arrayList.get(i2))) {
                        z3 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (!z3) {
                int i3 = 0;
                while (true) {
                    if (i3 >= featuredSets.size()) {
                        break;
                    } else if (!MessageObject.isPremiumEmojiPack(featuredSets.get(i3))) {
                        z3 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        } else {
            z3 = false;
        }
        DiffUtil.DiffResult diffResult2 = null;
        if (this.listAdapter != null) {
            if (this.isPaused) {
                diffResult = null;
            } else {
                diffResult2 = DiffUtil.calculateDiff(new DiffUtil.Callback() {
                    List<TLRPC$TL_messages_stickerSet> oldList;

                    {
                        StickersActivity.this = this;
                        this.oldList = this.listAdapter.stickerSets;
                    }

                    @Override
                    public int getOldListSize() {
                        return this.oldList.size();
                    }

                    @Override
                    public int getNewListSize() {
                        return arrayList.size();
                    }

                    @Override
                    public boolean areItemsTheSame(int i4, int i5) {
                        return this.oldList.get(i4).set.f890id == ((TLRPC$TL_messages_stickerSet) arrayList.get(i5)).set.f890id;
                    }

                    @Override
                    public boolean areContentsTheSame(int i4, int i5) {
                        TLRPC$StickerSet tLRPC$StickerSet = this.oldList.get(i4).set;
                        TLRPC$StickerSet tLRPC$StickerSet2 = ((TLRPC$TL_messages_stickerSet) arrayList.get(i5)).set;
                        return TextUtils.equals(tLRPC$StickerSet.title, tLRPC$StickerSet2.title) && tLRPC$StickerSet.count == tLRPC$StickerSet2.count;
                    }
                });
                diffResult = DiffUtil.calculateDiff(new DiffUtil.Callback() {
                    List<TLRPC$StickerSetCovered> oldList;

                    {
                        StickersActivity.this = this;
                        this.oldList = this.listAdapter.featuredStickerSets;
                    }

                    @Override
                    public int getOldListSize() {
                        return this.oldList.size();
                    }

                    @Override
                    public int getNewListSize() {
                        return arrayList2.size();
                    }

                    @Override
                    public boolean areItemsTheSame(int i4, int i5) {
                        return this.oldList.get(i4).set.f890id == ((TLRPC$StickerSetCovered) arrayList2.get(i5)).set.f890id;
                    }

                    @Override
                    public boolean areContentsTheSame(int i4, int i5) {
                        TLRPC$StickerSet tLRPC$StickerSet = this.oldList.get(i4).set;
                        TLRPC$StickerSet tLRPC$StickerSet2 = ((TLRPC$StickerSetCovered) arrayList2.get(i5)).set;
                        return TextUtils.equals(tLRPC$StickerSet.title, tLRPC$StickerSet2.title) && tLRPC$StickerSet.count == tLRPC$StickerSet2.count && tLRPC$StickerSet.installed == tLRPC$StickerSet2.installed;
                    }
                });
            }
            this.listAdapter.setStickerSets(arrayList);
            this.listAdapter.setFeaturedStickerSets(arrayList2);
        } else {
            diffResult = null;
        }
        this.rowCount = 0;
        int i4 = this.currentType;
        if (i4 == 0) {
            int i5 = 0 + 1;
            this.rowCount = i5;
            this.suggestRow = 0;
            int i6 = i5 + 1;
            this.rowCount = i6;
            this.largeEmojiRow = i5;
            int i7 = i6 + 1;
            this.rowCount = i7;
            this.loopRow = i6;
            this.rowCount = i7 + 1;
            this.loopInfoRow = i7;
        } else {
            this.suggestRow = -1;
            this.largeEmojiRow = -1;
            this.loopRow = -1;
            this.loopInfoRow = -1;
        }
        if (i4 == 5 && z3) {
            int i8 = this.rowCount;
            int i9 = i8 + 1;
            this.rowCount = i9;
            this.suggestAnimatedEmojiRow = i8;
            this.rowCount = i9 + 1;
            this.suggestAnimatedEmojiInfoRow = i9;
        } else {
            this.suggestAnimatedEmojiRow = -1;
            this.suggestAnimatedEmojiInfoRow = -1;
        }
        if (i4 == 0) {
            int i10 = this.rowCount;
            int i11 = i10 + 1;
            this.rowCount = i11;
            this.masksRow = i10;
            this.rowCount = i11 + 1;
            this.emojiPacksRow = i11;
        } else {
            this.masksRow = -1;
            this.emojiPacksRow = -1;
        }
        if (mediaDataController.getArchivedStickersCount(i4) != 0 && (i = this.currentType) != 5) {
            boolean z4 = this.archivedRow == -1;
            int i12 = this.rowCount;
            int i13 = i12 + 1;
            this.rowCount = i13;
            this.archivedRow = i12;
            if (i == 1) {
                this.rowCount = i13 + 1;
            } else {
                i13 = -1;
            }
            this.archivedInfoRow = i13;
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null && z4) {
                listAdapter.notifyItemRangeInserted(i12, i13 == -1 ? 1 : 2);
            }
        } else {
            int i14 = this.archivedRow;
            int i15 = this.archivedInfoRow;
            this.archivedRow = -1;
            this.archivedInfoRow = -1;
            ListAdapter listAdapter2 = this.listAdapter;
            if (listAdapter2 != null && i14 != -1) {
                listAdapter2.notifyItemRangeRemoved(i14, i15 == -1 ? 1 : 2);
            }
        }
        int i16 = this.currentType;
        if (i16 == 0) {
            int i17 = this.rowCount;
            this.rowCount = i17 + 1;
            this.reactionsDoubleTapRow = i17;
        } else {
            this.reactionsDoubleTapRow = -1;
        }
        this.stickersBotInfo = -1;
        if (i16 == 0) {
            int i18 = this.rowCount;
            this.rowCount = i18 + 1;
            this.stickersBotInfo = i18;
        }
        this.featuredStickersHeaderRow = -1;
        this.featuredStickersStartRow = -1;
        this.featuredStickersEndRow = -1;
        this.featuredStickersShowMoreRow = -1;
        this.featuredStickersShadowRow = -1;
        if (!arrayList2.isEmpty() && this.currentType == 0) {
            int i19 = this.rowCount;
            int i20 = i19 + 1;
            this.rowCount = i20;
            this.featuredStickersHeaderRow = i19;
            this.featuredStickersStartRow = i20;
            int size = i20 + arrayList2.size();
            this.rowCount = size;
            this.featuredStickersEndRow = size;
            if (z2) {
                this.rowCount = size + 1;
                this.featuredStickersShowMoreRow = size;
            }
            int i21 = this.rowCount;
            this.rowCount = i21 + 1;
            this.featuredStickersShadowRow = i21;
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            if (this.currentType == 5 || (!arrayList2.isEmpty() && this.currentType == 0)) {
                int i22 = this.rowCount;
                this.rowCount = i22 + 1;
                this.stickersHeaderRow = i22;
            } else {
                this.stickersHeaderRow = -1;
            }
            int i23 = this.rowCount;
            this.stickersStartRow = i23;
            int i24 = i23 + size2;
            this.rowCount = i24;
            this.stickersEndRow = i24;
            int i25 = this.currentType;
            if (i25 != 1 && i25 != 5) {
                this.rowCount = i24 + 1;
                this.stickersShadowRow = i24;
                this.masksInfoRow = -1;
            } else if (i25 == 1) {
                this.rowCount = i24 + 1;
                this.masksInfoRow = i24;
                this.stickersShadowRow = -1;
            } else {
                this.stickersShadowRow = -1;
                this.masksInfoRow = -1;
            }
        } else {
            this.stickersHeaderRow = -1;
            this.stickersStartRow = -1;
            this.stickersEndRow = -1;
            this.stickersShadowRow = -1;
            this.masksInfoRow = -1;
        }
        if (!arrayList2.isEmpty() && this.currentType == 5) {
            if (size2 > 0) {
                int i26 = this.rowCount;
                this.rowCount = i26 + 1;
                this.featuredStickersShadowRow = i26;
            }
            int i27 = this.rowCount;
            int i28 = i27 + 1;
            this.rowCount = i28;
            this.featuredStickersHeaderRow = i27;
            this.featuredStickersStartRow = i28;
            int size3 = i28 + arrayList2.size();
            this.rowCount = size3;
            this.featuredStickersEndRow = size3;
            if (z2) {
                this.rowCount = size3 + 1;
                this.featuredStickersShowMoreRow = size3;
            }
        }
        if (this.currentType == 5) {
            int i29 = this.rowCount;
            this.rowCount = i29 + 1;
            this.stickersBotInfo = i29;
        }
        ListAdapter listAdapter3 = this.listAdapter;
        if (listAdapter3 != null) {
            if (diffResult2 != null) {
                final int i30 = this.stickersStartRow;
                if (i30 < 0) {
                    i30 = this.rowCount;
                }
                listAdapter3.notifyItemRangeChanged(0, i30);
                diffResult2.dispatchUpdatesTo(new ListUpdateCallback() {
                    @Override
                    public void onInserted(int i31, int i32) {
                        StickersActivity.this.listAdapter.notifyItemRangeInserted(i30 + i31, i32);
                    }

                    @Override
                    public void onRemoved(int i31, int i32) {
                        StickersActivity.this.listAdapter.notifyItemRangeRemoved(i30 + i31, i32);
                    }

                    @Override
                    public void onMoved(int i31, int i32) {
                        if (StickersActivity.this.currentType == 5) {
                            ListAdapter listAdapter4 = StickersActivity.this.listAdapter;
                            int i33 = i30;
                            listAdapter4.notifyItemMoved(i31 + i33, i33 + i32);
                        }
                    }

                    @Override
                    public void onChanged(int i31, int i32, Object obj) {
                        StickersActivity.this.listAdapter.notifyItemRangeChanged(i30 + i31, i32);
                    }
                });
            }
            if (diffResult != null) {
                final int i31 = this.featuredStickersStartRow;
                if (i31 < 0) {
                    i31 = this.rowCount;
                }
                this.listAdapter.notifyItemRangeChanged(0, i31);
                diffResult.dispatchUpdatesTo(new ListUpdateCallback() {
                    @Override
                    public void onMoved(int i32, int i33) {
                    }

                    @Override
                    public void onInserted(int i32, int i33) {
                        StickersActivity.this.listAdapter.notifyItemRangeInserted(i31 + i32, i33);
                    }

                    @Override
                    public void onRemoved(int i32, int i33) {
                        StickersActivity.this.listAdapter.notifyItemRangeRemoved(i31 + i32, i33);
                    }

                    @Override
                    public void onChanged(int i32, int i33, Object obj) {
                        StickersActivity.this.listAdapter.notifyItemRangeChanged(i31 + i32, i33);
                    }
                });
            }
        }
    }

    @Override
    @SuppressLint({"NotifyDataSetChanged"})
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private final LongSparseArray<Boolean> selectedItems = new LongSparseArray<>();
        private final List<TLRPC$TL_messages_stickerSet> stickerSets = new ArrayList();
        private final List<TLRPC$StickerSetCovered> featuredStickerSets = new ArrayList();
        private final List<Long> loadingFeaturedStickerSets = new ArrayList();

        public ListAdapter(Context context, List<TLRPC$TL_messages_stickerSet> list, List<TLRPC$StickerSetCovered> list2) {
            StickersActivity.this = r1;
            this.mContext = context;
            setStickerSets(list);
            if (list2.size() > 3) {
                setFeaturedStickerSets(list2.subList(0, 3));
            } else {
                setFeaturedStickerSets(list2);
            }
        }

        @Override
        @SuppressLint({"NotifyDataSetChanged"})
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            if (StickersActivity.this.isListeningForFeaturedUpdate) {
                StickersActivity.this.isListeningForFeaturedUpdate = false;
            }
        }

        public void setStickerSets(List<TLRPC$TL_messages_stickerSet> list) {
            this.stickerSets.clear();
            this.stickerSets.addAll(list);
        }

        public void setFeaturedStickerSets(List<TLRPC$StickerSetCovered> list) {
            this.featuredStickerSets.clear();
            this.featuredStickerSets.addAll(list);
        }

        @Override
        public int getItemCount() {
            return StickersActivity.this.rowCount;
        }

        @Override
        public long getItemId(int i) {
            if (i < StickersActivity.this.featuredStickersStartRow || i >= StickersActivity.this.featuredStickersEndRow) {
                return (i < StickersActivity.this.stickersStartRow || i >= StickersActivity.this.stickersEndRow) ? i : this.stickerSets.get(i - StickersActivity.this.stickersStartRow).set.f890id;
            }
            return this.featuredStickerSets.get(i - StickersActivity.this.featuredStickersStartRow).set.f890id;
        }

        public void processSelectionMenu(final int i) {
            String string;
            TextView textView;
            int i2 = 0;
            if (i == 2) {
                StringBuilder sb = new StringBuilder();
                int size = this.stickerSets.size();
                while (i2 < size) {
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSets.get(i2);
                    if (this.selectedItems.get(tLRPC$TL_messages_stickerSet.set.f890id, Boolean.FALSE).booleanValue()) {
                        if (sb.length() != 0) {
                            sb.append("\n");
                        }
                        sb.append(StickersActivity.this.getLinkForSet(tLRPC$TL_messages_stickerSet));
                    }
                    i2++;
                }
                String sb2 = sb.toString();
                ShareAlert createShareAlert = ShareAlert.createShareAlert(((BaseFragment) StickersActivity.this).fragmentView.getContext(), null, sb2, false, sb2, false);
                createShareAlert.setDelegate(new ShareAlert.ShareAlertDelegate() {
                    @Override
                    public void didShare() {
                        ListAdapter.this.clearSelected();
                    }

                    @Override
                    public boolean didCopy() {
                        ListAdapter.this.clearSelected();
                        return true;
                    }
                });
                createShareAlert.show();
            } else if (i == 0 || i == 1) {
                final ArrayList arrayList = new ArrayList(this.selectedItems.size());
                int size2 = this.stickerSets.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC$StickerSet tLRPC$StickerSet = this.stickerSets.get(i3).set;
                    if (this.selectedItems.get(tLRPC$StickerSet.f890id, Boolean.FALSE).booleanValue()) {
                        arrayList.add(tLRPC$StickerSet);
                    }
                }
                int size3 = arrayList.size();
                if (size3 != 0) {
                    if (size3 == 1) {
                        int size4 = this.stickerSets.size();
                        while (true) {
                            if (i2 >= size4) {
                                break;
                            }
                            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = this.stickerSets.get(i2);
                            if (this.selectedItems.get(tLRPC$TL_messages_stickerSet2.set.f890id, Boolean.FALSE).booleanValue()) {
                                processSelectionOption(i, tLRPC$TL_messages_stickerSet2);
                                break;
                            }
                            i2++;
                        }
                        StickersActivity.this.listAdapter.clearSelected();
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(StickersActivity.this.getParentActivity());
                    if (i == 1) {
                        builder.setTitle(LocaleController.formatString("DeleteStickerSetsAlertTitle", C1072R.string.DeleteStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0])));
                        builder.setMessage(LocaleController.formatString("DeleteStickersAlertMessage", C1072R.string.DeleteStickersAlertMessage, Integer.valueOf(size3)));
                        string = LocaleController.getString("Delete", C1072R.string.Delete);
                    } else {
                        builder.setTitle(LocaleController.formatString("ArchiveStickerSetsAlertTitle", C1072R.string.ArchiveStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0])));
                        builder.setMessage(LocaleController.formatString("ArchiveStickersAlertMessage", C1072R.string.ArchiveStickersAlertMessage, Integer.valueOf(size3)));
                        string = LocaleController.getString("Archive", C1072R.string.Archive);
                    }
                    builder.setPositiveButton(string, new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            StickersActivity.ListAdapter.this.lambda$processSelectionMenu$0(arrayList, i, dialogInterface, i4);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString("Cancel", C1072R.string.Cancel), null);
                    AlertDialog create = builder.create();
                    StickersActivity.this.showDialog(create);
                    if (i != 1 || (textView = (TextView) create.getButton(-1)) == null) {
                        return;
                    }
                    textView.setTextColor(Theme.getColor("dialogTextRed2"));
                }
            }
        }

        public void lambda$processSelectionMenu$0(ArrayList arrayList, int i, DialogInterface dialogInterface, int i2) {
            StickersActivity.this.listAdapter.clearSelected();
            MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSets(arrayList, StickersActivity.this.currentType, i == 1 ? 0 : 1, StickersActivity.this, true);
        }

        private void processSelectionOption(int i, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
            int indexOf;
            if (i == 0) {
                MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), tLRPC$TL_messages_stickerSet, !tLRPC$TL_messages_stickerSet.set.archived ? 1 : 2, StickersActivity.this, true, true);
            } else if (i == 1) {
                MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), tLRPC$TL_messages_stickerSet, 0, StickersActivity.this, true, true);
            } else if (i == 2) {
                try {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", StickersActivity.this.getLinkForSet(tLRPC$TL_messages_stickerSet));
                    StickersActivity.this.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString("StickersShare", C1072R.string.StickersShare)), 500);
                } catch (Exception e) {
                    FileLog.m31e(e);
                }
            } else if (i != 3) {
                if (i != 4 || (indexOf = this.stickerSets.indexOf(tLRPC$TL_messages_stickerSet)) < 0) {
                    return;
                }
                StickersActivity.this.listAdapter.toggleSelected(StickersActivity.this.stickersStartRow + indexOf);
            } else {
                try {
                    Locale locale = Locale.US;
                    StringBuilder sb = new StringBuilder();
                    sb.append("https://");
                    sb.append(MessagesController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).linkPrefix);
                    sb.append("/");
                    sb.append(tLRPC$TL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers");
                    sb.append("/%s");
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", String.format(locale, sb.toString(), tLRPC$TL_messages_stickerSet.set.short_name)));
                    BulletinFactory.createCopyLinkBulletin(StickersActivity.this).show();
                } catch (Exception e2) {
                    FileLog.m31e(e2);
                }
            }
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, int r13) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.StickersActivity.ListAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        public void lambda$onBindViewHolder$1(View view) {
            FeaturedStickerSetCell2 featuredStickerSetCell2 = (FeaturedStickerSetCell2) view.getParent();
            TLRPC$StickerSetCovered stickerSet = featuredStickerSetCell2.getStickerSet();
            if (this.loadingFeaturedStickerSets.contains(Long.valueOf(stickerSet.set.f890id))) {
                return;
            }
            StickersActivity.this.isListeningForFeaturedUpdate = true;
            this.loadingFeaturedStickerSets.add(Long.valueOf(stickerSet.set.f890id));
            featuredStickerSetCell2.setDrawProgress(true, true);
            if (featuredStickerSetCell2.isInstalled()) {
                MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), stickerSet, 0, StickersActivity.this, false, false);
            } else {
                MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), stickerSet, 2, StickersActivity.this, false, false);
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
            if (list.isEmpty()) {
                onBindViewHolder(viewHolder, i);
                return;
            }
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                if (i < StickersActivity.this.stickersStartRow || i >= StickersActivity.this.stickersEndRow) {
                    return;
                }
                StickerSetCell stickerSetCell = (StickerSetCell) viewHolder.itemView;
                if (list.contains(1)) {
                    stickerSetCell.setChecked(this.selectedItems.get(getItemId(i), Boolean.FALSE).booleanValue());
                }
                if (list.contains(2)) {
                    stickerSetCell.setReorderable(hasSelected());
                }
                if (list.contains(3)) {
                    stickerSetCell.setNeedDivider(i - StickersActivity.this.stickersStartRow != this.stickerSets.size() - 1);
                }
            } else if (itemViewType == 4) {
                if (list.contains(0) && i == StickersActivity.this.loopRow) {
                    ((TextCheckCell) viewHolder.itemView).setChecked(SharedConfig.loopStickers);
                }
            } else if (itemViewType == 7 && list.contains(4) && i >= StickersActivity.this.featuredStickersStartRow && i <= StickersActivity.this.featuredStickersEndRow) {
                ((FeaturedStickerSetCell2) viewHolder.itemView).setStickersSet(this.featuredStickerSets.get(i - StickersActivity.this.featuredStickersStartRow), true, false, false, true);
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == 7 || itemViewType == 2 || itemViewType == 4 || itemViewType == 5;
        }

        public boolean lambda$onCreateViewHolder$2(StickerSetCell stickerSetCell, View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                StickersActivity.this.itemTouchHelper.startDrag(StickersActivity.this.listView.getChildViewHolder(stickerSetCell));
                return false;
            }
            return false;
        }

        public void lambda$onCreateViewHolder$4(View view) {
            int[] iArr;
            final int[] iArr2;
            CharSequence[] charSequenceArr;
            final TLRPC$TL_messages_stickerSet stickersSet = ((StickerSetCell) view.getParent()).getStickersSet();
            AlertDialog.Builder builder = new AlertDialog.Builder(StickersActivity.this.getParentActivity());
            builder.setTitle(stickersSet.set.title);
            if (stickersSet.set.official) {
                iArr2 = new int[]{0, 4};
                charSequenceArr = new CharSequence[]{LocaleController.getString("StickersHide", C1072R.string.StickersHide), LocaleController.getString("StickersReorder", C1072R.string.StickersReorder)};
                iArr = new int[]{C1072R.C1073drawable.msg_archive, C1072R.C1073drawable.msg_reorder};
            } else {
                CharSequence[] charSequenceArr2 = {LocaleController.getString("StickersHide", C1072R.string.StickersHide), LocaleController.getString("StickersCopy", C1072R.string.StickersCopy), LocaleController.getString("StickersReorder", C1072R.string.StickersReorder), LocaleController.getString("StickersShare", C1072R.string.StickersShare), LocaleController.getString("StickersRemove", C1072R.string.StickersRemove)};
                iArr = new int[]{C1072R.C1073drawable.msg_archive, C1072R.C1073drawable.msg_link, C1072R.C1073drawable.msg_reorder, C1072R.C1073drawable.msg_share, C1072R.C1073drawable.msg_delete};
                iArr2 = new int[]{0, 3, 4, 2, 1};
                charSequenceArr = charSequenceArr2;
            }
            builder.setItems(charSequenceArr, iArr, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StickersActivity.ListAdapter.this.lambda$onCreateViewHolder$3(iArr2, stickersSet, dialogInterface, i);
                }
            });
            AlertDialog create = builder.create();
            StickersActivity.this.showDialog(create);
            if (iArr2[iArr2.length - 1] == 1) {
                create.setItemColor(charSequenceArr.length - 1, Theme.getColor("dialogTextRed2"), Theme.getColor("dialogRedIcon"));
            }
        }

        public void lambda$onCreateViewHolder$3(int[] iArr, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, DialogInterface dialogInterface, int i) {
            processSelectionOption(iArr[i], tLRPC$TL_messages_stickerSet);
        }

        @Override
        @SuppressLint({"ClickableViewAccessibility"})
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FeaturedStickerSetCell2 featuredStickerSetCell2;
            if (i == 0) {
                final StickerSetCell stickerSetCell = new StickerSetCell(this.mContext, 1) {
                    @Override
                    protected void onPremiumButtonClick() {
                        StickersActivity.this.showDialog(new PremiumFeatureBottomSheet(StickersActivity.this, 11, false));
                    }

                    @Override
                    protected void onAddButtonClick() {
                        TLRPC$TL_messages_stickerSet stickersSet = getStickersSet();
                        if (stickersSet == null || stickersSet.set == null) {
                            return;
                        }
                        ArrayList<TLRPC$StickerSetCovered> featuredEmojiSets = StickersActivity.this.getMediaDataController().getFeaturedEmojiSets();
                        TLRPC$StickerSetCovered tLRPC$StickerSetCovered = 0;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= featuredEmojiSets.size()) {
                                break;
                            } else if (stickersSet.set.f890id == featuredEmojiSets.get(i2).set.f890id) {
                                tLRPC$StickerSetCovered = featuredEmojiSets.get(i2);
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (tLRPC$StickerSetCovered != 0) {
                            if (ListAdapter.this.loadingFeaturedStickerSets.contains(Long.valueOf(tLRPC$StickerSetCovered.set.f890id))) {
                                return;
                            }
                            ListAdapter.this.loadingFeaturedStickerSets.add(Long.valueOf(tLRPC$StickerSetCovered.set.f890id));
                        }
                        MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), tLRPC$StickerSetCovered == 0 ? stickersSet : tLRPC$StickerSetCovered, 2, StickersActivity.this, false, false);
                    }

                    @Override
                    protected void onRemoveButtonClick() {
                        MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), getStickersSet(), 0, StickersActivity.this, false, true);
                    }
                };
                stickerSetCell.setBackgroundColor(StickersActivity.this.getThemedColor("windowBackgroundWhite"));
                stickerSetCell.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                    @Override
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean lambda$onCreateViewHolder$2;
                        lambda$onCreateViewHolder$2 = StickersActivity.ListAdapter.this.lambda$onCreateViewHolder$2(stickerSetCell, view, motionEvent);
                        return lambda$onCreateViewHolder$2;
                    }
                });
                stickerSetCell.setOnOptionsClick(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        StickersActivity.ListAdapter.this.lambda$onCreateViewHolder$4(view);
                    }
                });
                featuredStickerSetCell2 = stickerSetCell;
            } else if (i == 1) {
                View textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext);
                textInfoPrivacyCell.setBackground(Theme.getThemedDrawable(this.mContext, C1072R.C1073drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                featuredStickerSetCell2 = textInfoPrivacyCell;
            } else if (i == 2) {
                View textCell = new TextCell(this.mContext);
                textCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                featuredStickerSetCell2 = textCell;
            } else if (i == 3) {
                featuredStickerSetCell2 = new ShadowSectionCell(this.mContext);
            } else if (i == 5) {
                View textSettingsCell = new TextSettingsCell(this.mContext);
                textSettingsCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                featuredStickerSetCell2 = textSettingsCell;
            } else if (i == 6) {
                View headerCell = new HeaderCell(this.mContext);
                headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                featuredStickerSetCell2 = headerCell;
            } else if (i == 7) {
                FeaturedStickerSetCell2 featuredStickerSetCell22 = new FeaturedStickerSetCell2(this.mContext, StickersActivity.this.getResourceProvider()) {
                    @Override
                    protected void onPremiumButtonClick() {
                        StickersActivity.this.showDialog(new PremiumFeatureBottomSheet(StickersActivity.this, 11, false));
                    }
                };
                featuredStickerSetCell22.setBackgroundColor(StickersActivity.this.getThemedColor("windowBackgroundWhite"));
                featuredStickerSetCell22.getTextView().setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                featuredStickerSetCell2 = featuredStickerSetCell22;
            } else {
                View textCheckCell = new TextCheckCell(this.mContext);
                textCheckCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                featuredStickerSetCell2 = textCheckCell;
            }
            featuredStickerSetCell2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(featuredStickerSetCell2);
        }

        @Override
        public int getItemViewType(int i) {
            if (i < StickersActivity.this.featuredStickersStartRow || i >= StickersActivity.this.featuredStickersEndRow) {
                if (i < StickersActivity.this.stickersStartRow || i >= StickersActivity.this.stickersEndRow) {
                    if (i == StickersActivity.this.stickersBotInfo || i == StickersActivity.this.archivedInfoRow || i == StickersActivity.this.loopInfoRow || i == StickersActivity.this.suggestAnimatedEmojiInfoRow || i == StickersActivity.this.masksInfoRow) {
                        return 1;
                    }
                    if (i == StickersActivity.this.archivedRow || i == StickersActivity.this.masksRow || i == StickersActivity.this.emojiPacksRow || i == StickersActivity.this.suggestRow || i == StickersActivity.this.featuredStickersShowMoreRow) {
                        return 2;
                    }
                    if (i == StickersActivity.this.stickersShadowRow || i == StickersActivity.this.featuredStickersShadowRow) {
                        return 3;
                    }
                    if (i == StickersActivity.this.loopRow || i == StickersActivity.this.largeEmojiRow || i == StickersActivity.this.suggestAnimatedEmojiRow) {
                        return 4;
                    }
                    if (i == StickersActivity.this.reactionsDoubleTapRow) {
                        return 5;
                    }
                    return (i == StickersActivity.this.featuredStickersHeaderRow || i == StickersActivity.this.stickersHeaderRow) ? 6 : 0;
                }
                return 0;
            }
            return 7;
        }

        public void swapElements(int i, int i2) {
            if (i != i2) {
                StickersActivity.this.needReorder = true;
            }
            MediaDataController mediaDataController = MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount);
            swapListElements(this.stickerSets, i - StickersActivity.this.stickersStartRow, i2 - StickersActivity.this.stickersStartRow);
            Collections.sort(mediaDataController.getStickerSets(StickersActivity.this.currentType), new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$swapElements$5;
                    lambda$swapElements$5 = StickersActivity.ListAdapter.this.lambda$swapElements$5((TLRPC$TL_messages_stickerSet) obj, (TLRPC$TL_messages_stickerSet) obj2);
                    return lambda$swapElements$5;
                }
            });
            notifyItemMoved(i, i2);
            if (i == StickersActivity.this.stickersEndRow - 1 || i2 == StickersActivity.this.stickersEndRow - 1) {
                notifyItemRangeChanged(i, 3);
                notifyItemRangeChanged(i2, 3);
            }
        }

        public int lambda$swapElements$5(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2) {
            int indexOf = this.stickerSets.indexOf(tLRPC$TL_messages_stickerSet);
            int indexOf2 = this.stickerSets.indexOf(tLRPC$TL_messages_stickerSet2);
            if (indexOf < 0 || indexOf2 < 0) {
                return 0;
            }
            return indexOf - indexOf2;
        }

        private void swapListElements(List<TLRPC$TL_messages_stickerSet> list, int i, int i2) {
            list.set(i, list.get(i2));
            list.set(i2, list.get(i));
        }

        public void toggleSelected(int i) {
            long itemId = getItemId(i);
            LongSparseArray<Boolean> longSparseArray = this.selectedItems;
            longSparseArray.put(itemId, Boolean.valueOf(!longSparseArray.get(itemId, Boolean.FALSE).booleanValue()));
            notifyItemChanged(i, 1);
            checkActionMode();
        }

        public void clearSelected() {
            this.selectedItems.clear();
            notifyStickersItemsChanged(1);
            checkActionMode();
        }

        public boolean hasSelected() {
            return this.selectedItems.indexOfValue(Boolean.TRUE) != -1;
        }

        public int getSelectedCount() {
            int size = this.selectedItems.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                if (this.selectedItems.valueAt(i2).booleanValue()) {
                    i++;
                }
            }
            return i;
        }

        private void checkActionMode() {
            int selectedCount = StickersActivity.this.listAdapter.getSelectedCount();
            boolean isActionModeShowed = ((BaseFragment) StickersActivity.this).actionBar.isActionModeShowed();
            if (selectedCount <= 0) {
                if (isActionModeShowed) {
                    ((BaseFragment) StickersActivity.this).actionBar.hideActionMode();
                    notifyStickersItemsChanged(2);
                    return;
                }
                return;
            }
            checkActionModeIcons();
            StickersActivity.this.selectedCountTextView.setNumber(selectedCount, isActionModeShowed);
            if (isActionModeShowed) {
                return;
            }
            ((BaseFragment) StickersActivity.this).actionBar.showActionMode();
            notifyStickersItemsChanged(2);
            if (SharedConfig.stickersReorderingHintUsed || StickersActivity.this.currentType == 5) {
                return;
            }
            SharedConfig.setStickersReorderingHintUsed(true);
            Bulletin.make(((BaseFragment) StickersActivity.this).parentLayout.getLastFragment(), new ReorderingBulletinLayout(this.mContext, LocaleController.getString("StickersReorderHint", C1072R.string.StickersReorderHint), null), 3250).show();
        }

        private void checkActionModeIcons() {
            boolean z;
            if (hasSelected()) {
                int size = this.stickerSets.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                        break;
                    } else if (this.selectedItems.get(this.stickerSets.get(i).set.f890id, Boolean.FALSE).booleanValue() && this.stickerSets.get(i).set.official && !this.stickerSets.get(i).set.emojis) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                int i2 = z ? 0 : 8;
                if (StickersActivity.this.deleteMenuItem.getVisibility() != i2) {
                    StickersActivity.this.deleteMenuItem.setVisibility(i2);
                }
            }
        }

        private void notifyStickersItemsChanged(Object obj) {
            notifyItemRangeChanged(StickersActivity.this.stickersStartRow, StickersActivity.this.stickersEndRow - StickersActivity.this.stickersStartRow, obj);
        }

        private CharSequence addStickersBotSpan(String str) {
            int indexOf = str.indexOf("@stickers");
            if (indexOf != -1) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new URLSpanNoUnderline("@stickers") {
                        @Override
                        public void onClick(View view) {
                            MessagesController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).openByUserName("stickers", StickersActivity.this, 3);
                        }
                    }, indexOf, indexOf + 9, 18);
                    return spannableStringBuilder;
                } catch (Exception e) {
                    FileLog.m31e(e);
                }
            }
            return str;
        }
    }

    public String getLinkForSet(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        sb.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb.append("/");
        sb.append(tLRPC$TL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers");
        sb.append("/%s");
        return String.format(locale, sb.toString(), tLRPC$TL_messages_stickerSet.set.short_name);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{StickerSetCell.class, TextSettingsCell.class, TextCheckCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_AM_ITEMSCOLOR, null, null, null, null, "actionBarActionModeDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_AM_BACKGROUND, null, null, null, null, "actionBarActionModeDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_AM_TOPBACKGROUND, null, null, null, null, "actionBarActionModeDefaultTop"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_AM_SELECTORCOLOR, null, null, null, null, "actionBarActionModeDefaultSelector"));
        arrayList.add(new ThemeDescription(this.selectedCountTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "actionBarActionModeDefaultIcon"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrack"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrackChecked"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LINKCOLOR, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteLinkText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteValueText"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{StickerSetCell.class}, new String[]{"optionsButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "stickers_menuSelector"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"optionsButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "stickers_menu"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"reorderButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "stickers_menu"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{StickerSetCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{StickerSetCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkboxCheck"));
        TrendingStickersAlert trendingStickersAlert = this.trendingStickersAlert;
        if (trendingStickersAlert != null) {
            arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
        }
        return arrayList;
    }
}
