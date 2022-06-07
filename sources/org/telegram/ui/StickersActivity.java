package org.telegram.ui;

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
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetID;
import org.telegram.tgnet.TLRPC$TL_messages_reorderStickerSets;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.FeaturedStickerSetCell2;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.StickerSetCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ReorderingBulletinLayout;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TrendingStickersAlert;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.StickersActivity;

public class StickersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int activeReorderingRequests;
    private int archivedInfoRow;
    private int archivedRow;
    private int currentType;
    private ActionBarMenuItem deleteMenuItem;
    private int featuredStickersEndRow;
    private int featuredStickersHeaderRow;
    private int featuredStickersShadowRow;
    private int featuredStickersShowMoreRow;
    private int featuredStickersStartRow;
    private boolean isListeningForFeaturedUpdate;
    private DefaultItemAnimator itemAnimator;
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
    private int suggestRow;
    private TrendingStickersAlert trendingStickersAlert;

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public class TouchHelperCallback extends ItemTouchHelper.Callback {
        @Override
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        }

        public TouchHelperCallback() {
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

    public StickersActivity(int i) {
        this.currentType = i;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(this.currentType);
        if (this.currentType == 0) {
            MediaDataController.getInstance(this.currentAccount).checkFeaturedStickers();
            MediaDataController.getInstance(this.currentAccount).checkStickers(1);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.archivedStickersCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredStickersDidLoad);
        updateRows();
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.archivedStickersCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    @Override
    @SuppressLint({"ClickableViewAccessibility"})
    public View createView(final Context context) {
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setAllowOverlayTitle(true);
        if (this.currentType == 0) {
            this.actionBar.setTitle(LocaleController.getString("StickersName", R.string.StickersName));
        } else {
            this.actionBar.setTitle(LocaleController.getString("Masks", R.string.Masks));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    if (StickersActivity.this.onBackPressed()) {
                        StickersActivity.this.finishFragment();
                    }
                } else if (i != 0 && i != 1 && i != 2) {
                } else {
                    if (StickersActivity.this.needReorder) {
                        StickersActivity.this.sendReorder();
                    } else if (StickersActivity.this.activeReorderingRequests == 0) {
                        StickersActivity.this.listAdapter.processSelectionMenu(i);
                    }
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
        createActionMode.addItemWithWidth(2, R.drawable.msg_share, AndroidUtilities.dp(54.0f));
        createActionMode.addItemWithWidth(0, R.drawable.msg_archive, AndroidUtilities.dp(54.0f));
        this.deleteMenuItem = createActionMode.addItemWithWidth(1, R.drawable.msg_delete, AndroidUtilities.dp(54.0f));
        this.listAdapter = new ListAdapter(context, MessagesController.getInstance(this.currentAccount).filterPremiumStickers(MediaDataController.getInstance(this.currentAccount).getStickerSets(this.currentType)), MediaDataController.getInstance(this.currentAccount).getFeaturedStickerSets());
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setFocusable(true);
        this.listView.setTag(7);
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
        DefaultItemAnimator defaultItemAnimator = (DefaultItemAnimator) this.listView.getItemAnimator();
        this.itemAnimator = defaultItemAnimator;
        defaultItemAnimator.setSupportsChangeAnimations(false);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                StickersActivity.this.lambda$createView$2(context, view, i);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i) {
                boolean lambda$createView$3;
                lambda$createView$3 = StickersActivity.this.lambda$createView$3(view, i);
                return lambda$createView$3;
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$2(Context context, View view, int i) {
        if (i >= this.featuredStickersStartRow && i < this.featuredStickersEndRow && getParentActivity() != null) {
            TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
            TLRPC$StickerSet tLRPC$StickerSet = ((TLRPC$StickerSetCovered) this.listAdapter.featuredStickerSets.get(i - this.featuredStickersStartRow)).set;
            tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet.id;
            tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
            showDialog(new StickersAlert(getParentActivity(), this, tLRPC$TL_inputStickerSetID, (TLRPC$TL_messages_stickerSet) null, (StickersAlert.StickersAlertDelegate) null));
        } else if (i == this.featuredStickersShowMoreRow) {
            TrendingStickersAlert trendingStickersAlert = new TrendingStickersAlert(context, this, new TrendingStickersLayout(context, new TrendingStickersLayout.Delegate() {
                @Override
                public void onStickerSetAdd(TLRPC$StickerSetCovered tLRPC$StickerSetCovered, boolean z) {
                    MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), tLRPC$StickerSetCovered, 2, StickersActivity.this, false, false);
                }

                @Override
                public void onStickerSetRemove(TLRPC$StickerSetCovered tLRPC$StickerSetCovered) {
                    MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), tLRPC$StickerSetCovered, 0, StickersActivity.this, false, false);
                }
            }), null);
            this.trendingStickersAlert = trendingStickersAlert;
            trendingStickersAlert.show();
        } else if (i < this.stickersStartRow || i >= this.stickersEndRow || getParentActivity() == null) {
            if (i == this.archivedRow) {
                presentFragment(new ArchivedStickersActivity(this.currentType));
            } else if (i == this.masksRow) {
                presentFragment(new StickersActivity(1));
            } else if (i == this.suggestRow) {
                if (getParentActivity() != null) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                    builder.setTitle(LocaleController.getString("SuggestStickers", R.string.SuggestStickers));
                    String[] strArr = {LocaleController.getString("SuggestStickersAll", R.string.SuggestStickersAll), LocaleController.getString("SuggestStickersInstalled", R.string.SuggestStickersInstalled), LocaleController.getString("SuggestStickersNone", R.string.SuggestStickersNone)};
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    builder.setView(linearLayout);
                    int i2 = 0;
                    while (i2 < 3) {
                        RadioColorCell radioColorCell = new RadioColorCell(getParentActivity());
                        radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        radioColorCell.setTag(Integer.valueOf(i2));
                        radioColorCell.setCheckColor(Theme.getColor("radioBackground"), Theme.getColor("dialogRadioBackgroundChecked"));
                        radioColorCell.setTextAndValue(strArr[i2], SharedConfig.suggestStickers == i2);
                        linearLayout.addView(radioColorCell);
                        radioColorCell.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view2) {
                                StickersActivity.this.lambda$createView$1(builder, view2);
                            }
                        });
                        i2++;
                    }
                    showDialog(builder.create());
                }
            } else if (i == this.loopRow) {
                SharedConfig.toggleLoopStickers();
                this.listAdapter.notifyItemChanged(this.loopRow, 0);
            } else if (i == this.largeEmojiRow) {
                SharedConfig.toggleBigEmoji();
                ((TextCheckCell) view).setChecked(SharedConfig.allowBigEmoji);
            } else if (i == this.reactionsDoubleTapRow) {
                presentFragment(new ReactionsDoubleTapManageActivity());
            }
        } else if (!this.listAdapter.hasSelected()) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) this.listAdapter.stickerSets.get(i - this.stickersStartRow);
            ArrayList<TLRPC$Document> arrayList = tLRPC$TL_messages_stickerSet.documents;
            if (arrayList != null && !arrayList.isEmpty()) {
                showDialog(new StickersAlert(getParentActivity(), this, (TLRPC$InputStickerSet) null, tLRPC$TL_messages_stickerSet, (StickersAlert.StickersAlertDelegate) null));
            }
        } else {
            this.listAdapter.toggleSelected(i);
        }
    }

    public void lambda$createView$1(AlertDialog.Builder builder, View view) {
        SharedConfig.setSuggestStickers(((Integer) view.getTag()).intValue());
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
        if (!this.listAdapter.hasSelected()) {
            return super.onBackPressed();
        }
        this.listAdapter.clearSelected();
        return false;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.stickersDidLoad) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = this.currentType;
            if (intValue == i3) {
                this.listAdapter.loadingFeaturedStickerSets.clear();
                updateRows();
            } else if (i3 == 0 && intValue == 1) {
                this.listAdapter.notifyItemChanged(this.masksRow);
            }
        } else if (i == NotificationCenter.featuredStickersDidLoad) {
            updateRows();
        } else if (i == NotificationCenter.archivedStickersCountDidLoad && ((Integer) objArr[0]).intValue() == this.currentType) {
            updateRows();
        }
    }

    public void sendReorder() {
        if (this.needReorder) {
            MediaDataController.getInstance(this.currentAccount).calcNewHash(this.currentType);
            this.needReorder = false;
            this.activeReorderingRequests++;
            TLRPC$TL_messages_reorderStickerSets tLRPC$TL_messages_reorderStickerSets = new TLRPC$TL_messages_reorderStickerSets();
            tLRPC$TL_messages_reorderStickerSets.masks = this.currentType == 1;
            for (int i = 0; i < this.listAdapter.stickerSets.size(); i++) {
                tLRPC$TL_messages_reorderStickerSets.order.add(Long.valueOf(((TLRPC$TL_messages_stickerSet) this.listAdapter.stickerSets.get(i)).set.id));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_reorderStickerSets, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StickersActivity.this.lambda$sendReorder$5(tLObject, tLRPC$TL_error);
                }
            });
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(this.currentType));
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

    private void updateRows() {
        boolean z;
        DiffUtil.DiffResult diffResult;
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        final ArrayList<TLRPC$TL_messages_stickerSet> filterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(this.currentType));
        final List<TLRPC$StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
        if (featuredStickerSets.size() > 3) {
            featuredStickerSets = featuredStickerSets.subList(0, 3);
            z = true;
        } else {
            z = false;
        }
        DiffUtil.DiffResult diffResult2 = null;
        if (this.listAdapter != null) {
            if (!this.isPaused) {
                diffResult2 = DiffUtil.calculateDiff(new DiffUtil.Callback() {
                    List<TLRPC$TL_messages_stickerSet> oldList;

                    {
                        this.oldList = StickersActivity.this.listAdapter.stickerSets;
                    }

                    @Override
                    public int getOldListSize() {
                        return this.oldList.size();
                    }

                    @Override
                    public int getNewListSize() {
                        return filterPremiumStickers.size();
                    }

                    @Override
                    public boolean areItemsTheSame(int i, int i2) {
                        return this.oldList.get(i).set.id == ((TLRPC$TL_messages_stickerSet) filterPremiumStickers.get(i2)).set.id;
                    }

                    @Override
                    public boolean areContentsTheSame(int i, int i2) {
                        TLRPC$StickerSet tLRPC$StickerSet = this.oldList.get(i).set;
                        TLRPC$StickerSet tLRPC$StickerSet2 = ((TLRPC$TL_messages_stickerSet) filterPremiumStickers.get(i2)).set;
                        return TextUtils.equals(tLRPC$StickerSet.title, tLRPC$StickerSet2.title) && tLRPC$StickerSet.count == tLRPC$StickerSet2.count;
                    }
                });
                diffResult = DiffUtil.calculateDiff(new DiffUtil.Callback() {
                    List<TLRPC$StickerSetCovered> oldList;

                    {
                        this.oldList = StickersActivity.this.listAdapter.featuredStickerSets;
                    }

                    @Override
                    public int getOldListSize() {
                        return this.oldList.size();
                    }

                    @Override
                    public int getNewListSize() {
                        return featuredStickerSets.size();
                    }

                    @Override
                    public boolean areItemsTheSame(int i, int i2) {
                        return this.oldList.get(i).set.id == ((TLRPC$StickerSetCovered) featuredStickerSets.get(i2)).set.id;
                    }

                    @Override
                    public boolean areContentsTheSame(int i, int i2) {
                        TLRPC$StickerSet tLRPC$StickerSet = this.oldList.get(i).set;
                        TLRPC$StickerSet tLRPC$StickerSet2 = ((TLRPC$StickerSetCovered) featuredStickerSets.get(i2)).set;
                        return TextUtils.equals(tLRPC$StickerSet.title, tLRPC$StickerSet2.title) && tLRPC$StickerSet.count == tLRPC$StickerSet2.count && tLRPC$StickerSet.installed == tLRPC$StickerSet2.installed;
                    }
                });
            } else {
                diffResult = null;
            }
            this.listAdapter.setStickerSets(filterPremiumStickers);
            this.listAdapter.setFeaturedStickerSets(featuredStickerSets);
        } else {
            diffResult = null;
        }
        this.rowCount = 0;
        int i = this.currentType;
        if (i == 0) {
            int i2 = 0 + 1;
            this.rowCount = i2;
            this.suggestRow = 0;
            int i3 = i2 + 1;
            this.rowCount = i3;
            this.largeEmojiRow = i2;
            int i4 = i3 + 1;
            this.rowCount = i4;
            this.loopRow = i3;
            this.rowCount = i4 + 1;
            this.loopInfoRow = i4;
        } else {
            this.suggestRow = -1;
            this.largeEmojiRow = -1;
            this.loopRow = -1;
            this.loopInfoRow = -1;
        }
        if (i == 0) {
            int i5 = this.rowCount;
            this.rowCount = i5 + 1;
            this.masksRow = i5;
        } else {
            this.masksRow = -1;
        }
        int archivedStickersCount = mediaDataController.getArchivedStickersCount(i);
        int i6 = 2;
        if (archivedStickersCount != 0) {
            boolean z2 = this.archivedRow == -1;
            int i7 = this.rowCount;
            int i8 = i7 + 1;
            this.rowCount = i8;
            this.archivedRow = i7;
            if (this.currentType == 1) {
                this.rowCount = i8 + 1;
            } else {
                i8 = -1;
            }
            this.archivedInfoRow = i8;
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null && z2) {
                if (i8 == -1) {
                    i6 = 1;
                }
                listAdapter.notifyItemRangeInserted(i7, i6);
            }
        } else {
            int i9 = this.archivedRow;
            int i10 = this.archivedInfoRow;
            this.archivedRow = -1;
            this.archivedInfoRow = -1;
            ListAdapter listAdapter2 = this.listAdapter;
            if (!(listAdapter2 == null || i9 == -1)) {
                if (i10 == -1) {
                    i6 = 1;
                }
                listAdapter2.notifyItemRangeRemoved(i9, i6);
            }
        }
        if (this.currentType == 0) {
            int i11 = this.rowCount;
            int i12 = i11 + 1;
            this.rowCount = i12;
            this.reactionsDoubleTapRow = i11;
            this.rowCount = i12 + 1;
            this.stickersBotInfo = i12;
        } else {
            this.reactionsDoubleTapRow = -1;
            this.stickersBotInfo = -1;
        }
        if (featuredStickerSets.isEmpty() || this.currentType != 0) {
            this.featuredStickersHeaderRow = -1;
            this.featuredStickersStartRow = -1;
            this.featuredStickersEndRow = -1;
            this.featuredStickersShowMoreRow = -1;
            this.featuredStickersShadowRow = -1;
        } else {
            int i13 = this.rowCount;
            int i14 = i13 + 1;
            this.rowCount = i14;
            this.featuredStickersHeaderRow = i13;
            this.featuredStickersStartRow = i14;
            int size = i14 + featuredStickerSets.size();
            this.rowCount = size;
            this.featuredStickersEndRow = size;
            if (z) {
                this.rowCount = size + 1;
                this.featuredStickersShowMoreRow = size;
            } else {
                this.featuredStickersShowMoreRow = -1;
            }
            int i15 = this.rowCount;
            this.rowCount = i15 + 1;
            this.featuredStickersShadowRow = i15;
        }
        int size2 = filterPremiumStickers.size();
        if (size2 > 0) {
            if (this.featuredStickersHeaderRow != -1) {
                int i16 = this.rowCount;
                this.rowCount = i16 + 1;
                this.stickersHeaderRow = i16;
            } else {
                this.stickersHeaderRow = -1;
            }
            int i17 = this.rowCount;
            this.stickersStartRow = i17;
            int i18 = i17 + size2;
            this.rowCount = i18;
            this.stickersEndRow = i18;
            if (this.currentType != 1) {
                this.rowCount = i18 + 1;
                this.stickersShadowRow = i18;
                this.masksInfoRow = -1;
            } else {
                this.rowCount = i18 + 1;
                this.masksInfoRow = i18;
                this.stickersShadowRow = -1;
            }
        } else {
            this.stickersHeaderRow = -1;
            this.stickersStartRow = -1;
            this.stickersEndRow = -1;
            this.stickersShadowRow = -1;
            this.masksInfoRow = -1;
        }
        ListAdapter listAdapter3 = this.listAdapter;
        if (listAdapter3 != null) {
            if (diffResult2 != null) {
                final int i19 = this.stickersStartRow;
                if (i19 < 0) {
                    i19 = this.rowCount;
                }
                listAdapter3.notifyItemRangeChanged(0, i19);
                diffResult2.dispatchUpdatesTo(new ListUpdateCallback() {
                    @Override
                    public void onMoved(int i20, int i21) {
                    }

                    @Override
                    public void onInserted(int i20, int i21) {
                        StickersActivity.this.listAdapter.notifyItemRangeInserted(i19 + i20, i21);
                    }

                    @Override
                    public void onRemoved(int i20, int i21) {
                        StickersActivity.this.listAdapter.notifyItemRangeRemoved(i19 + i20, i21);
                    }

                    @Override
                    public void onChanged(int i20, int i21, Object obj) {
                        StickersActivity.this.listAdapter.notifyItemRangeChanged(i19 + i20, i21);
                    }
                });
            }
            if (diffResult != null) {
                final int i20 = this.featuredStickersStartRow;
                if (i20 < 0) {
                    i20 = this.rowCount;
                }
                this.listAdapter.notifyItemRangeChanged(0, i20);
                diffResult.dispatchUpdatesTo(new ListUpdateCallback() {
                    @Override
                    public void onMoved(int i21, int i22) {
                    }

                    @Override
                    public void onInserted(int i21, int i22) {
                        StickersActivity.this.listAdapter.notifyItemRangeInserted(i20 + i21, i22);
                    }

                    @Override
                    public void onRemoved(int i21, int i22) {
                        StickersActivity.this.listAdapter.notifyItemRangeRemoved(i20 + i21, i22);
                    }

                    @Override
                    public void onChanged(int i21, int i22, Object obj) {
                        StickersActivity.this.listAdapter.notifyItemRangeChanged(i20 + i21, i22);
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
                return (i < StickersActivity.this.stickersStartRow || i >= StickersActivity.this.stickersEndRow) ? i : this.stickerSets.get(i - StickersActivity.this.stickersStartRow).set.id;
            }
            return this.featuredStickerSets.get(i - StickersActivity.this.featuredStickersStartRow).set.id;
        }

        public void processSelectionMenu(final int i) {
            String str;
            TextView textView;
            int i2 = 0;
            if (i == 2) {
                StringBuilder sb = new StringBuilder();
                int size = this.stickerSets.size();
                while (i2 < size) {
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSets.get(i2);
                    if (this.selectedItems.get(tLRPC$TL_messages_stickerSet.set.id, Boolean.FALSE).booleanValue()) {
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
                    if (this.selectedItems.get(tLRPC$StickerSet.id, Boolean.FALSE).booleanValue()) {
                        arrayList.add(tLRPC$StickerSet);
                    }
                }
                int size3 = arrayList.size();
                if (size3 == 0) {
                    return;
                }
                if (size3 != 1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(StickersActivity.this.getParentActivity());
                    if (i == 1) {
                        builder.setTitle(LocaleController.formatString("DeleteStickerSetsAlertTitle", R.string.DeleteStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0])));
                        builder.setMessage(LocaleController.formatString("DeleteStickersAlertMessage", R.string.DeleteStickersAlertMessage, Integer.valueOf(size3)));
                        str = LocaleController.getString("Delete", R.string.Delete);
                    } else {
                        builder.setTitle(LocaleController.formatString("ArchiveStickerSetsAlertTitle", R.string.ArchiveStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0])));
                        builder.setMessage(LocaleController.formatString("ArchiveStickersAlertMessage", R.string.ArchiveStickersAlertMessage, Integer.valueOf(size3)));
                        str = LocaleController.getString("Archive", R.string.Archive);
                    }
                    builder.setPositiveButton(str, new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            StickersActivity.ListAdapter.this.lambda$processSelectionMenu$0(arrayList, i, dialogInterface, i4);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    AlertDialog create = builder.create();
                    StickersActivity.this.showDialog(create);
                    if (i == 1 && (textView = (TextView) create.getButton(-1)) != null) {
                        textView.setTextColor(Theme.getColor("dialogTextRed2"));
                        return;
                    }
                    return;
                }
                int size4 = this.stickerSets.size();
                while (true) {
                    if (i2 >= size4) {
                        break;
                    }
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = this.stickerSets.get(i2);
                    if (this.selectedItems.get(tLRPC$TL_messages_stickerSet2.set.id, Boolean.FALSE).booleanValue()) {
                        processSelectionOption(i, tLRPC$TL_messages_stickerSet2);
                        break;
                    }
                    i2++;
                }
                StickersActivity.this.listAdapter.clearSelected();
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
                    StickersActivity.this.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString("StickersShare", R.string.StickersShare)), 500);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i == 3) {
                try {
                    Locale locale = Locale.US;
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", String.format(locale, "https://" + MessagesController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).linkPrefix + "/addstickers/%s", tLRPC$TL_messages_stickerSet.set.short_name)));
                    BulletinFactory.createCopyLinkBulletin(StickersActivity.this).show();
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            } else if (i == 4 && (indexOf = this.stickerSets.indexOf(tLRPC$TL_messages_stickerSet)) >= 0) {
                StickersActivity.this.listAdapter.toggleSelected(StickersActivity.this.stickersStartRow + indexOf);
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            TLRPC$TL_availableReaction tLRPC$TL_availableReaction;
            boolean z = false;
            boolean z2 = true;
            switch (viewHolder.getItemViewType()) {
                case 0:
                    StickerSetCell stickerSetCell = (StickerSetCell) viewHolder.itemView;
                    int i2 = i - StickersActivity.this.stickersStartRow;
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSets.get(i2);
                    if (i2 == this.stickerSets.size() - 1) {
                        z2 = false;
                    }
                    stickerSetCell.setStickersSet(tLRPC$TL_messages_stickerSet, z2);
                    stickerSetCell.setChecked(this.selectedItems.get(getItemId(i), Boolean.FALSE).booleanValue(), false);
                    stickerSetCell.setReorderable(hasSelected(), false);
                    return;
                case 1:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i == StickersActivity.this.stickersBotInfo) {
                        textInfoPrivacyCell.setText(addStickersBotSpan(LocaleController.getString("StickersBotInfo", R.string.StickersBotInfo)));
                        return;
                    } else if (i == StickersActivity.this.archivedInfoRow) {
                        if (StickersActivity.this.currentType == 0) {
                            textInfoPrivacyCell.setText(LocaleController.getString("ArchivedStickersInfo", R.string.ArchivedStickersInfo));
                            return;
                        } else {
                            textInfoPrivacyCell.setText(LocaleController.getString("ArchivedMasksInfo", R.string.ArchivedMasksInfo));
                            return;
                        }
                    } else if (i == StickersActivity.this.loopInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString("LoopAnimatedStickersInfo", R.string.LoopAnimatedStickersInfo));
                        return;
                    } else if (i == StickersActivity.this.masksInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString("MasksInfo", R.string.MasksInfo));
                        return;
                    } else {
                        return;
                    }
                case 2:
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    if (i == StickersActivity.this.featuredStickersShowMoreRow) {
                        textCell.setColors("windowBackgroundWhiteBlueText4", "windowBackgroundWhiteBlueText4");
                        textCell.setTextAndIcon(LocaleController.getString((int) R.string.ShowMoreStickers), R.drawable.msg_trending, false);
                        return;
                    }
                    textCell.setColors("windowBackgroundWhiteGrayIcon", "windowBackgroundWhiteBlackText");
                    String str2 = "";
                    if (i == StickersActivity.this.archivedRow) {
                        int archivedStickersCount = MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).getArchivedStickersCount(StickersActivity.this.currentType);
                        if (archivedStickersCount > 0) {
                            str2 = Integer.toString(archivedStickersCount);
                        }
                        if (StickersActivity.this.currentType == 0) {
                            textCell.setTextAndValueAndIcon(LocaleController.getString((int) R.string.ArchivedStickers), str2, R.drawable.msg_archived_stickers, true);
                            return;
                        } else {
                            textCell.setTextAndValue(LocaleController.getString("ArchivedMasks", R.string.ArchivedMasks), str2, true);
                            return;
                        }
                    } else if (i == StickersActivity.this.masksRow) {
                        MediaDataController mediaDataController = MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount);
                        int size = MessagesController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(1)).size() + mediaDataController.getArchivedStickersCount(1);
                        String string = LocaleController.getString("Masks", R.string.Masks);
                        if (size > 0) {
                            str2 = Integer.toString(size);
                        }
                        textCell.setTextAndValueAndIcon(string, str2, R.drawable.msg_mask, true);
                        return;
                    } else if (i == StickersActivity.this.suggestRow) {
                        int i3 = SharedConfig.suggestStickers;
                        if (i3 == 0) {
                            str = LocaleController.getString("SuggestStickersAll", R.string.SuggestStickersAll);
                        } else if (i3 != 1) {
                            str = LocaleController.getString("SuggestStickersNone", R.string.SuggestStickersNone);
                        } else {
                            str = LocaleController.getString("SuggestStickersInstalled", R.string.SuggestStickersInstalled);
                        }
                        textCell.setTextAndValue(LocaleController.getString("SuggestStickers", R.string.SuggestStickers), str, true);
                        return;
                    } else {
                        return;
                    }
                case 3:
                    if (i == StickersActivity.this.stickersShadowRow) {
                        viewHolder.itemView.setBackground(Theme.getThemedDrawable(this.mContext, (int) R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                        return;
                    }
                    return;
                case 4:
                    TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                    if (i == StickersActivity.this.loopRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString((int) R.string.LoopAnimatedStickers), SharedConfig.loopStickers, true);
                        return;
                    } else if (i == StickersActivity.this.largeEmojiRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString((int) R.string.LargeEmoji), SharedConfig.allowBigEmoji, true);
                        return;
                    } else {
                        return;
                    }
                case 5:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                    textSettingsCell.setText(LocaleController.getString((int) R.string.DoubleTapSetting), false);
                    textSettingsCell.setIcon(R.drawable.msg_reactions2);
                    String doubleTapReaction = MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).getDoubleTapReaction();
                    if (doubleTapReaction != null && (tLRPC$TL_availableReaction = MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).getReactionsMap().get(doubleTapReaction)) != null) {
                        textSettingsCell.getValueBackupImageView().getImageReceiver().setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.static_icon), "100_100", DocumentObject.getSvgThumb(tLRPC$TL_availableReaction.static_icon.thumbs, "windowBackgroundGray", 1.0f), "webp", tLRPC$TL_availableReaction, 1);
                        return;
                    }
                    return;
                case 6:
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (i == StickersActivity.this.featuredStickersHeaderRow) {
                        headerCell.setText(LocaleController.getString((int) R.string.FeaturedStickers));
                        return;
                    } else if (i == StickersActivity.this.stickersHeaderRow) {
                        headerCell.setText(LocaleController.getString((int) R.string.ChooseStickerMyStickerSets));
                        return;
                    } else {
                        return;
                    }
                case 7:
                    FeaturedStickerSetCell2 featuredStickerSetCell2 = (FeaturedStickerSetCell2) viewHolder.itemView;
                    TLRPC$StickerSetCovered tLRPC$StickerSetCovered = this.featuredStickerSets.get(i - StickersActivity.this.featuredStickersStartRow);
                    if (StickersActivity.this.isListeningForFeaturedUpdate || (featuredStickerSetCell2.getStickerSet() != null && featuredStickerSetCell2.getStickerSet().set.id == tLRPC$StickerSetCovered.set.id)) {
                        z = true;
                    }
                    featuredStickerSetCell2.setStickersSet(tLRPC$StickerSetCovered, true, false, false, z);
                    featuredStickerSetCell2.setDrawProgress(this.loadingFeaturedStickerSets.contains(Long.valueOf(tLRPC$StickerSetCovered.set.id)), z);
                    featuredStickerSetCell2.setAddOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            StickersActivity.ListAdapter.this.lambda$onBindViewHolder$1(view);
                        }
                    });
                    return;
                default:
                    return;
            }
        }

        public void lambda$onBindViewHolder$1(View view) {
            FeaturedStickerSetCell2 featuredStickerSetCell2 = (FeaturedStickerSetCell2) view.getParent();
            TLRPC$StickerSetCovered stickerSet = featuredStickerSetCell2.getStickerSet();
            if (!this.loadingFeaturedStickerSets.contains(Long.valueOf(stickerSet.set.id))) {
                StickersActivity.this.isListeningForFeaturedUpdate = true;
                this.loadingFeaturedStickerSets.add(Long.valueOf(stickerSet.set.id));
                featuredStickerSetCell2.setDrawProgress(true, true);
                if (featuredStickerSetCell2.isInstalled()) {
                    MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), stickerSet, 0, StickersActivity.this, false, false);
                } else {
                    MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), stickerSet, 2, StickersActivity.this, false, false);
                }
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
            if (list.isEmpty()) {
                onBindViewHolder(viewHolder, i);
                return;
            }
            int itemViewType = viewHolder.getItemViewType();
            boolean z = false;
            if (itemViewType != 0) {
                if (itemViewType != 4) {
                    if (itemViewType == 7 && list.contains(4) && i >= StickersActivity.this.featuredStickersStartRow && i <= StickersActivity.this.featuredStickersEndRow) {
                        ((FeaturedStickerSetCell2) viewHolder.itemView).setStickersSet(this.featuredStickerSets.get(i - StickersActivity.this.featuredStickersStartRow), true, false, false, true);
                    }
                } else if (list.contains(0) && i == StickersActivity.this.loopRow) {
                    ((TextCheckCell) viewHolder.itemView).setChecked(SharedConfig.loopStickers);
                }
            } else if (i >= StickersActivity.this.stickersStartRow && i < StickersActivity.this.stickersEndRow) {
                StickerSetCell stickerSetCell = (StickerSetCell) viewHolder.itemView;
                if (list.contains(1)) {
                    stickerSetCell.setChecked(this.selectedItems.get(getItemId(i), Boolean.FALSE).booleanValue());
                }
                if (list.contains(2)) {
                    stickerSetCell.setReorderable(hasSelected());
                }
                if (list.contains(3)) {
                    if (i - StickersActivity.this.stickersStartRow != this.stickerSets.size() - 1) {
                        z = true;
                    }
                    stickerSetCell.setNeedDivider(z);
                }
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == 7 || itemViewType == 2 || itemViewType == 4 || itemViewType == 5;
        }

        public boolean lambda$onCreateViewHolder$2(StickerSetCell stickerSetCell, View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            StickersActivity.this.itemTouchHelper.startDrag(StickersActivity.this.listView.getChildViewHolder(stickerSetCell));
            return false;
        }

        public void lambda$onCreateViewHolder$4(View view) {
            CharSequence[] charSequenceArr;
            int[] iArr;
            final int[] iArr2;
            final TLRPC$TL_messages_stickerSet stickersSet = ((StickerSetCell) view.getParent()).getStickersSet();
            AlertDialog.Builder builder = new AlertDialog.Builder(StickersActivity.this.getParentActivity());
            builder.setTitle(stickersSet.set.title);
            if (stickersSet.set.official) {
                iArr2 = new int[]{0, 4};
                charSequenceArr = new CharSequence[]{LocaleController.getString("StickersHide", R.string.StickersHide), LocaleController.getString("StickersReorder", R.string.StickersReorder)};
                iArr = new int[]{R.drawable.msg_archive, R.drawable.msg_reorder};
            } else {
                CharSequence[] charSequenceArr2 = {LocaleController.getString("StickersHide", R.string.StickersHide), LocaleController.getString("StickersCopy", R.string.StickersCopy), LocaleController.getString("StickersReorder", R.string.StickersReorder), LocaleController.getString("StickersShare", R.string.StickersShare), LocaleController.getString("StickersRemove", R.string.StickersRemove)};
                iArr = new int[]{R.drawable.msg_archive, R.drawable.msg_link, R.drawable.msg_reorder, R.drawable.msg_share, R.drawable.msg_delete};
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
            TextCheckCell textCheckCell;
            if (i == 0) {
                final StickerSetCell stickerSetCell = new StickerSetCell(this.mContext, 1);
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
                textCheckCell = stickerSetCell;
            } else if (i == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext);
                textInfoPrivacyCell.setBackground(Theme.getThemedDrawable(this.mContext, (int) R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                textCheckCell = textInfoPrivacyCell;
            } else if (i == 2) {
                TextCell textCell = new TextCell(this.mContext);
                textCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                textCheckCell = textCell;
            } else if (i == 3) {
                textCheckCell = new ShadowSectionCell(this.mContext);
            } else if (i == 5) {
                TextSettingsCell textSettingsCell = new TextSettingsCell(this.mContext);
                textSettingsCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                textCheckCell = textSettingsCell;
            } else if (i == 6) {
                HeaderCell headerCell = new HeaderCell(this.mContext);
                headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                textCheckCell = headerCell;
            } else if (i != 7) {
                TextCheckCell textCheckCell2 = new TextCheckCell(this.mContext);
                textCheckCell2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                textCheckCell = textCheckCell2;
            } else {
                FeaturedStickerSetCell2 featuredStickerSetCell2 = new FeaturedStickerSetCell2(this.mContext, StickersActivity.this.getResourceProvider());
                featuredStickerSetCell2.setBackgroundColor(StickersActivity.this.getThemedColor("windowBackgroundWhite"));
                featuredStickerSetCell2.getTextView().setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textCheckCell = featuredStickerSetCell2;
            }
            textCheckCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(textCheckCell);
        }

        @Override
        public int getItemViewType(int i) {
            if (i >= StickersActivity.this.featuredStickersStartRow && i < StickersActivity.this.featuredStickersEndRow) {
                return 7;
            }
            if (i >= StickersActivity.this.stickersStartRow && i < StickersActivity.this.stickersEndRow) {
                return 0;
            }
            if (i == StickersActivity.this.stickersBotInfo || i == StickersActivity.this.archivedInfoRow || i == StickersActivity.this.loopInfoRow || i == StickersActivity.this.masksInfoRow) {
                return 1;
            }
            if (i == StickersActivity.this.archivedRow || i == StickersActivity.this.masksRow || i == StickersActivity.this.suggestRow || i == StickersActivity.this.featuredStickersShowMoreRow) {
                return 2;
            }
            if (i == StickersActivity.this.stickersShadowRow || i == StickersActivity.this.featuredStickersShadowRow) {
                return 3;
            }
            if (i == StickersActivity.this.loopRow || i == StickersActivity.this.largeEmojiRow) {
                return 4;
            }
            if (i == StickersActivity.this.reactionsDoubleTapRow) {
                return 5;
            }
            return (i == StickersActivity.this.featuredStickersHeaderRow || i == StickersActivity.this.stickersHeaderRow) ? 6 : 0;
        }

        public void swapElements(int i, int i2) {
            if (i != i2) {
                StickersActivity.this.needReorder = true;
            }
            MediaDataController mediaDataController = MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount);
            int i3 = i - StickersActivity.this.stickersStartRow;
            int i4 = i2 - StickersActivity.this.stickersStartRow;
            swapListElements(this.stickerSets, i3, i4);
            swapListElements(mediaDataController.getStickerSets(StickersActivity.this.currentType), i3, i4);
            notifyItemMoved(i, i2);
            if (i == StickersActivity.this.stickersEndRow - 1 || i2 == StickersActivity.this.stickersEndRow - 1) {
                notifyItemRangeChanged(i, 3);
                notifyItemRangeChanged(i2, 3);
            }
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
            if (selectedCount > 0) {
                checkActionModeIcons();
                StickersActivity.this.selectedCountTextView.setNumber(selectedCount, isActionModeShowed);
                if (!isActionModeShowed) {
                    ((BaseFragment) StickersActivity.this).actionBar.showActionMode();
                    notifyStickersItemsChanged(2);
                    if (!SharedConfig.stickersReorderingHintUsed) {
                        SharedConfig.setStickersReorderingHintUsed(true);
                        Bulletin.make(((BaseFragment) StickersActivity.this).parentLayout, new ReorderingBulletinLayout(this.mContext, LocaleController.getString("StickersReorderHint", R.string.StickersReorderHint), null), 3250).show();
                    }
                }
            } else if (isActionModeShowed) {
                ((BaseFragment) StickersActivity.this).actionBar.hideActionMode();
                notifyStickersItemsChanged(2);
            }
        }

        private void checkActionModeIcons() {
            boolean z;
            if (hasSelected()) {
                int size = this.stickerSets.size();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        if (this.selectedItems.get(this.stickerSets.get(i2).set.id, Boolean.FALSE).booleanValue() && this.stickerSets.get(i2).set.official) {
                            z = false;
                            break;
                        }
                        i2++;
                    } else {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    i = 8;
                }
                if (StickersActivity.this.deleteMenuItem.getVisibility() != i) {
                    StickersActivity.this.deleteMenuItem.setVisibility(i);
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
                    FileLog.e(e);
                }
            }
            return str;
        }
    }

    public String getLinkForSet(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        Locale locale = Locale.US;
        return String.format(locale, "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/addstickers/%s", tLRPC$TL_messages_stickerSet.set.short_name);
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
