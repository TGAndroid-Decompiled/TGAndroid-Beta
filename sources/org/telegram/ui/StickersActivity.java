package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.FeaturedStickerSetCell2;
import org.telegram.ui.Cells.StickerSetCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ReorderingBulletinLayout;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TrendingStickersAlert;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class StickersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int activeReorderingRequests;
    private ActionBarMenuItem archiveMenuItem;
    private int archivedRow;
    private int currentType;
    private ActionBarMenuItem deleteMenuItem;
    private int dynamicPackOrder;
    private int emojiPacksRow;
    private ArrayList featured;
    private int featuredRow;
    ArrayList frozenEmojiPacks;
    private int largeEmojiRow;
    private LinearLayoutManager layoutManager;
    private UniversalRecyclerView listView;
    private boolean needReorder;
    private int reactionsDoubleTapRow;
    private NumberTextView selectedCountTextView;
    private ArrayList sets;
    private ActionBarMenuItem shareMenuItem;
    private int suggestRow;
    private TrendingStickersAlert trendingStickersAlert;
    private final List loadingFeaturedStickerSets = new ArrayList();
    private final HashSet selectedSets = new HashSet();
    private Runnable sendReorderRunnable = new Runnable() {
        @Override
        public final void run() {
            this.f$0.sendReorder();
        }
    };

    public static boolean $r8$lambda$rCjDdM67qMAN32fq_ATfRf1ng0Y(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    private ArrayList getFeaturedSets() {
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        if (this.currentType == 5) {
            ArrayList arrayList = new ArrayList(mediaDataController.getFeaturedEmojiSets());
            int i = 0;
            while (i < arrayList.size()) {
                if (arrayList.get(i) == null || mediaDataController.isStickerPackInstalled(((TLRPC.StickerSetCovered) arrayList.get(i)).set.id, false)) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
            return arrayList;
        }
        return mediaDataController.getFeaturedStickerSets();
    }

    public StickersActivity(int i, ArrayList arrayList) {
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
    public View createView(Context context) {
        ArrayList arrayList;
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.currentType;
        if (i == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.StickersName));
        } else if (i == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Masks));
        } else if (i == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Emoji));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 != -1) {
                    StickersActivity.this.processSelectionMenu(i2);
                } else if (StickersActivity.this.onBackPressed(true)) {
                    StickersActivity.this.finishFragment();
                }
            }
        });
        ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode();
        NumberTextView numberTextView = new NumberTextView(actionBarMenuCreateActionMode.getContext());
        this.selectedCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedCountTextView.setTextColor(Theme.getColor(Theme.key_actionBarActionModeDefaultIcon));
        actionBarMenuCreateActionMode.addView(this.selectedCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.selectedCountTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return StickersActivity.$r8$lambda$rCjDdM67qMAN32fq_ATfRf1ng0Y(view, motionEvent);
            }
        });
        this.shareMenuItem = actionBarMenuCreateActionMode.addItemWithWidth(2, R.drawable.msg_share, AndroidUtilities.dp(54.0f));
        this.archiveMenuItem = actionBarMenuCreateActionMode.addItemWithWidth(0, R.drawable.msg_archive, AndroidUtilities.dp(54.0f));
        this.deleteMenuItem = actionBarMenuCreateActionMode.addItemWithWidth(1, R.drawable.msg_delete, AndroidUtilities.dp(54.0f));
        if (this.currentType == 5 && (arrayList = this.frozenEmojiPacks) != null) {
            this.sets = arrayList;
        } else {
            this.sets = new ArrayList(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(MediaDataController.getInstance(this.currentAccount).getStickerSets(this.currentType)));
        }
        this.featured = getFeaturedSets();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return Boolean.valueOf(this.f$0.onLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue()));
            }
        });
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setFocusable(true);
        this.listView.setTag(7);
        this.listView.listenReorder(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.whenReordered(((Integer) obj).intValue(), (ArrayList) obj2);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }

            @Override
            protected void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
                iArr[1] = StickersActivity.this.listView.getHeight();
            }
        };
        this.layoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        this.listView.setLayoutManager(this.layoutManager);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        return this.fragmentView;
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (this.selectedSets.isEmpty()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        clearSelected();
        return false;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == this.currentType) {
                this.loadingFeaturedStickerSets.clear();
            }
            this.listView.adapter.update(true);
        } else if (i == NotificationCenter.featuredStickersDidLoad || i == NotificationCenter.featuredEmojiDidLoad) {
            this.listView.adapter.update(true);
        } else if (i == NotificationCenter.archivedStickersCountDidLoad && ((Integer) objArr[0]).intValue() == this.currentType) {
            this.listView.adapter.update(true);
        }
    }

    private String suggestStickersName() {
        int i = SharedConfig.suggestStickers;
        if (i == 0) {
            return LocaleController.getString(R.string.SuggestStickersAll);
        }
        if (i == 1) {
            return LocaleController.getString(R.string.SuggestStickersInstalled);
        }
        return LocaleController.getString(R.string.SuggestStickersNone);
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        boolean z;
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || (!universalRecyclerView.isReorderAllowed() && !this.needReorder && this.activeReorderingRequests <= 0)) {
            if (this.currentType == 5) {
                ArrayList arrayList2 = new ArrayList(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(this.currentType)));
                this.frozenEmojiPacks = arrayList2;
                this.sets = arrayList2;
            } else {
                this.sets = new ArrayList(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(this.currentType)));
            }
        }
        this.featured = new ArrayList(getFeaturedSets());
        int i = 0;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= this.featured.size()) {
                break;
            }
            if (this.loadingFeaturedStickerSets.contains(Long.valueOf(((TLRPC.StickerSetCovered) this.featured.get(i2)).set.id))) {
                this.featured.remove(i2);
                i2--;
            }
            i2++;
        }
        int size = this.featured.size();
        int archivedStickersCount = mediaDataController.getArchivedStickersCount(this.currentType);
        int size2 = mediaDataController.getStickerSets(5).size();
        if (this.currentType == 0) {
            this.featuredRow = arrayList.size();
            arrayList.add(UItem.asButton(1, R.drawable.msg2_trending, LocaleController.getString(R.string.FeaturedStickers), size > 0 ? LocaleController.formatNumber(size, ',') : ""));
            if (archivedStickersCount > 0) {
                this.archivedRow = arrayList.size();
                int i3 = this.currentType;
                if (i3 == 0) {
                    arrayList.add(UItem.asButton(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
                } else {
                    arrayList.add(UItem.asButton(2, LocaleController.getString(i3 == 5 ? R.string.ArchivedEmojiPacks : R.string.ArchivedMasks), LocaleController.formatNumber(archivedStickersCount, ',')));
                }
            }
            this.emojiPacksRow = arrayList.size();
            arrayList.add(UItem.asSettingsCell(3, R.drawable.msg2_smile_status, LocaleController.getString(R.string.Emoji), size2 > 0 ? LocaleController.formatNumber(size2, ',') : ""));
        } else if (archivedStickersCount > 0) {
            this.archivedRow = arrayList.size();
            int i4 = this.currentType;
            if (i4 == 0) {
                arrayList.add(UItem.asButton(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
            } else {
                arrayList.add(UItem.asButton(2, LocaleController.getString(i4 == 5 ? R.string.ArchivedEmojiPacks : R.string.ArchivedMasks), LocaleController.formatNumber(archivedStickersCount, ',')));
            }
            if (this.currentType == 1) {
                arrayList.add(UItem.asShadow(LocaleController.getString(R.string.ArchivedMasksInfo)));
            }
        }
        if (this.currentType == 0) {
            this.reactionsDoubleTapRow = arrayList.size();
            arrayList.add(UItem.asSettingsCell(4, R.drawable.msg2_reactions2, LocaleController.getString(R.string.DoubleTapSetting)).onBind(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.setQuickReactionImage((View) obj);
                }
            }));
            arrayList.add(UItem.asShadow(addStickersBotSpan(LocaleController.getString(this.currentType == 5 ? R.string.EmojiBotInfo : R.string.StickersBotInfo))));
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.StickersSettings)));
            this.suggestRow = arrayList.size();
            arrayList.add(UItem.asSettingsCell(5, LocaleController.getString(R.string.SuggestStickers), suggestStickersName()));
            this.largeEmojiRow = arrayList.size();
            arrayList.add(UItem.asCheck(6, LocaleController.getString(R.string.LargeEmoji)).setChecked(SharedConfig.allowBigEmoji));
            this.dynamicPackOrder = arrayList.size();
            arrayList.add(UItem.asCheck(7, LocaleController.getString(R.string.DynamicPackOrder)).setChecked(SharedConfig.updateStickersOrderOnSend));
            arrayList.add(UItem.asShadow(LocaleController.getString(R.string.DynamicPackOrderInfo)));
        }
        if (this.currentType == 5) {
            arrayList.add(UItem.asCheck(9, LocaleController.getString(R.string.SuggestAnimatedEmoji)).setChecked(SharedConfig.suggestAnimatedEmoji));
            arrayList.add(UItem.asShadow(LocaleController.getString(R.string.SuggestAnimatedEmojiInfo)));
        }
        if (this.sets.size() > 0) {
            universalAdapter.whiteSectionStart();
            if (this.currentType == 5 || (!this.featured.isEmpty() && this.currentType == 0)) {
                arrayList.add(UItem.asHeader(LocaleController.getString(this.currentType == 5 ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets)));
            }
            universalAdapter.reorderSectionStart();
            ArrayList arrayList3 = this.sets;
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj = arrayList3.get(i5);
                i5++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                arrayList.add(StickerSetCell.Factory.of(tL_messages_stickerSet).setClickCallback(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.openStickerSetOptions(view);
                    }
                }).setClickCallback2(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.onStickerSetButtonClick(view);
                    }
                }).setChecked(this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet.set.id))));
            }
            universalAdapter.reorderSectionEnd();
            universalAdapter.whiteSectionEnd();
            int i6 = this.currentType;
            if (i6 != 1 && i6 != 5) {
                arrayList.add(UItem.asShadow(null));
            } else if (i6 == 1) {
                arrayList.add(UItem.asShadow(LocaleController.getString(R.string.MasksInfo)));
            }
        }
        if (this.featured.size() > 3) {
            this.featured = new ArrayList(this.featured.subList(0, 3));
        } else {
            z = false;
        }
        if (this.currentType == 5 && !this.featured.isEmpty()) {
            if (this.sets.size() > 0) {
                arrayList.add(UItem.asShadow(null));
            }
            arrayList.add(UItem.asHeader(LocaleController.getString(this.currentType == 5 ? R.string.FeaturedEmojiPacks : R.string.FeaturedStickers)));
            ArrayList arrayList4 = this.featured;
            int size4 = arrayList4.size();
            while (i < size4) {
                Object obj2 = arrayList4.get(i);
                i++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                arrayList.add(FeaturedStickerSetCell2.Factory.of(stickerSetCovered).setClickCallback(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.onFeaturedAddClick(view);
                    }
                }).setLocked(this.loadingFeaturedStickerSets.contains(Long.valueOf(stickerSetCovered.set.id))));
            }
            if (z) {
                arrayList.add(UItem.asButton(8, R.drawable.msg2_trending, LocaleController.getString(R.string.ShowMoreEmojiPacks)).accent());
            }
        }
        int i7 = this.currentType;
        if (i7 == 5) {
            arrayList.add(UItem.asShadow(addStickersBotSpan(LocaleController.getString(i7 == 5 ? R.string.EmojiBotInfo : R.string.StickersBotInfo))));
        }
    }

    public void onClick(UItem uItem, final View view, int i, float f, float f2) {
        Object obj = uItem.object;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (this.selectedSets.isEmpty()) {
                ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
                if (arrayList == null || arrayList.isEmpty()) {
                    return;
                }
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null && stickerSet.emojis) {
                    ArrayList arrayList2 = new ArrayList();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    tL_inputStickerSetID.id = stickerSet2.id;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    arrayList2.add(tL_inputStickerSetID);
                    showDialog(new EmojiPacksAlert(this, getParentActivity(), getResourceProvider(), arrayList2));
                }
                showDialog(new StickersAlert(getParentActivity(), this, null, tL_messages_stickerSet, null, false));
                return;
            }
            toggleSelected((StickerSetCell) view);
            return;
        }
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet3.id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (this.currentType == 5) {
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(tL_inputStickerSetID2);
                showDialog(new EmojiPacksAlert(this, getParentActivity(), getResourceProvider(), arrayList3));
                return;
            }
            showDialog(new StickersAlert(getParentActivity(), this, tL_inputStickerSetID2, null, null, false));
            return;
        }
        switch (uItem.id) {
            case 1:
            case 8:
                if (this.currentType == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList featuredSets = getFeaturedSets();
                    if (featuredSets != null) {
                        for (int i2 = 0; i2 < featuredSets.size(); i2++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) featuredSets.get(i2);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.id = stickerSet4.id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    MediaDataController.getInstance(this.currentAccount).markFeaturedStickersAsRead(true, true);
                    showDialog(new EmojiPacksAlert(this, getParentActivity(), getResourceProvider(), arrayList4));
                } else {
                    TrendingStickersAlert trendingStickersAlert = new TrendingStickersAlert(getContext(), this, new TrendingStickersLayout(getContext(), new TrendingStickersLayout.Delegate() {
                        @Override
                        public void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered2, boolean z) {
                            MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), stickerSetCovered2, 2, StickersActivity.this, false, false);
                        }

                        @Override
                        public void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered2) {
                            MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), stickerSetCovered2, 0, StickersActivity.this, false, false);
                        }
                    }), null);
                    this.trendingStickersAlert = trendingStickersAlert;
                    trendingStickersAlert.show();
                }
                break;
            case 2:
                presentFragment(new ArchivedStickersActivity(this.currentType));
                break;
            case 3:
                presentFragment(new StickersActivity(5, null));
                break;
            case 4:
                presentFragment(new ReactionsDoubleTapManageActivity());
                break;
            case 5:
                ItemOptions.makeOptions(this, view).addChecked(SharedConfig.suggestStickers == 0, LocaleController.getString(R.string.SuggestStickersAll), new Runnable() {
                    @Override
                    public final void run() {
                        StickersActivity.$r8$lambda$IqXvhUBY50Bhj0yCxfWSEqn5CRI(view);
                    }
                }).addChecked(SharedConfig.suggestStickers == 1, LocaleController.getString(R.string.SuggestStickersInstalled), new Runnable() {
                    @Override
                    public final void run() {
                        StickersActivity.$r8$lambda$8K5rbn3DXzUBLU4mUe9Ff5sQT70(view);
                    }
                }).addChecked(SharedConfig.suggestStickers == 2, LocaleController.getString(R.string.SuggestStickersNone), new Runnable() {
                    @Override
                    public final void run() {
                        StickersActivity.$r8$lambda$ohvYuUetgKUAp9Hnpx7Pdppbn0A(view);
                    }
                }).show();
                break;
            case 6:
                SharedConfig.toggleBigEmoji();
                ((TextCheckCell) view).setChecked(SharedConfig.allowBigEmoji);
                break;
            case 7:
                SharedConfig.toggleUpdateStickersOrderOnSend();
                ((TextCheckCell) view).setChecked(SharedConfig.updateStickersOrderOnSend);
                break;
            case 9:
                SharedConfig.toggleSuggestAnimatedEmoji();
                ((TextCheckCell) view).setChecked(SharedConfig.suggestAnimatedEmoji);
                break;
        }
    }

    public static void $r8$lambda$IqXvhUBY50Bhj0yCxfWSEqn5CRI(View view) {
        SharedConfig.setSuggestStickers(0);
        ((TextSettingsCell) view).setValue(LocaleController.getString(R.string.SuggestStickersAll), true);
    }

    public static void $r8$lambda$8K5rbn3DXzUBLU4mUe9Ff5sQT70(View view) {
        SharedConfig.setSuggestStickers(1);
        ((TextSettingsCell) view).setValue(LocaleController.getString(R.string.SuggestStickersInstalled), true);
    }

    public static void $r8$lambda$ohvYuUetgKUAp9Hnpx7Pdppbn0A(View view) {
        SharedConfig.setSuggestStickers(2);
        ((TextSettingsCell) view).setValue(LocaleController.getString(R.string.SuggestStickersNone), true);
    }

    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        if (!this.selectedSets.isEmpty() || !(uItem.object instanceof TLRPC.TL_messages_stickerSet)) {
            return false;
        }
        toggleSelected((StickerSetCell) view);
        return true;
    }

    public void whenReordered(int i, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Object obj2 = ((UItem) obj).object;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        this.sets = arrayList2;
        this.needReorder = true;
        Collections.sort(MediaDataController.getInstance(this.currentAccount).getStickerSets(this.currentType), new Comparator() {
            @Override
            public final int compare(Object obj3, Object obj4) {
                return StickersActivity.$r8$lambda$_WubvnB2fA5o3oHpAqM9u421b5g(this.f$0, (TLRPC.TL_messages_stickerSet) obj3, (TLRPC.TL_messages_stickerSet) obj4);
            }
        });
        AndroidUtilities.cancelRunOnUIThread(this.sendReorderRunnable);
        AndroidUtilities.runOnUIThread(this.sendReorderRunnable, 1000L);
    }

    public static int $r8$lambda$_WubvnB2fA5o3oHpAqM9u421b5g(StickersActivity stickersActivity, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet2) {
        int iIndexOf = stickersActivity.sets.indexOf(tL_messages_stickerSet);
        int iIndexOf2 = stickersActivity.sets.indexOf(tL_messages_stickerSet2);
        if (iIndexOf < 0 || iIndexOf2 < 0) {
            return 0;
        }
        return iIndexOf - iIndexOf2;
    }

    public void sendReorder() {
        if (this.needReorder) {
            this.needReorder = false;
            MediaDataController.getInstance(this.currentAccount).calcNewHash(this.currentType);
            this.activeReorderingRequests++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            int i = this.currentType;
            tL_messages_reorderStickerSets.masks = i == 1;
            tL_messages_reorderStickerSets.emojis = i == 5;
            for (int i2 = 0; i2 < this.sets.size(); i2++) {
                tL_messages_reorderStickerSets.order.add(Long.valueOf(((TLRPC.TL_messages_stickerSet) this.sets.get(i2)).set.id));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StickersActivity.$r8$lambda$kZduiOnIOySfB2CDBMPSHhu8_Ig(this.f$0, tLObject, tL_error);
                }
            });
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(this.currentType), Boolean.TRUE);
            if (SharedConfig.updateStickersOrderOnSend) {
                SharedConfig.toggleUpdateStickersOrderOnSend();
                BulletinFactory.of(this).createSimpleBulletin(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo)).show();
                this.listView.adapter.update(true);
            }
        }
    }

    public static void $r8$lambda$5K8w0XQRwy9E4SRP07z_VxhsjZI(StickersActivity stickersActivity) {
        stickersActivity.activeReorderingRequests--;
    }

    public static void $r8$lambda$kZduiOnIOySfB2CDBMPSHhu8_Ig(final StickersActivity stickersActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
        stickersActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersActivity.$r8$lambda$5K8w0XQRwy9E4SRP07z_VxhsjZI(this.f$0);
            }
        });
    }

    public void openStickerSetOptions(View view) {
        if (view == null || !(view.getParent() instanceof StickerSetCell)) {
            return;
        }
        final StickerSetCell stickerSetCell = (StickerSetCell) view.getParent();
        final TLRPC.TL_messages_stickerSet stickersSet = stickerSetCell.getStickersSet();
        ItemOptions.makeOptions(this, stickerSetCell).add(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() {
            @Override
            public final void run() {
                StickersActivity stickersActivity = this.f$0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickersSet;
                MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), tL_messages_stickerSet, !tL_messages_stickerSet.set.archived ? 1 : 2, stickersActivity, true, true);
            }
        }).addIf(!stickersSet.set.official, R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() {
            @Override
            public final void run() {
                StickersActivity.$r8$lambda$Jokij79I5bHwC05cXxI11sexPN0(this.f$0, stickersSet);
            }
        }).add(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new Runnable() {
            @Override
            public final void run() {
                this.f$0.toggleSelected(stickerSetCell);
            }
        }).addIf(!stickersSet.set.official, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() {
            @Override
            public final void run() {
                StickersActivity.$r8$lambda$GsfZD2ypZdjXB7pwVK0hATp70kE(this.f$0, stickersSet);
            }
        }).addIf(!stickersSet.set.official, R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.StickersRemove), true, new Runnable() {
            @Override
            public final void run() {
                StickersActivity stickersActivity = this.f$0;
                MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, true, true);
            }
        }).setMinWidth(190).show();
    }

    public static void $r8$lambda$Jokij79I5bHwC05cXxI11sexPN0(StickersActivity stickersActivity, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        stickersActivity.getClass();
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity.getLinkForSet(tL_messages_stickerSet)));
            BulletinFactory.createCopyLinkBulletin(stickersActivity).show();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$GsfZD2ypZdjXB7pwVK0hATp70kE(StickersActivity stickersActivity, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        stickersActivity.getClass();
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", stickersActivity.getLinkForSet(tL_messages_stickerSet));
            stickersActivity.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void onStickerSetButtonClick(View view) {
        StickerSetCell stickerSetCell;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup.getParent() instanceof StickerSetCell) && (stickersSet = (stickerSetCell = (StickerSetCell) viewGroup.getParent()).getStickersSet()) != null && stickersSet.set != null) {
                int i = 0;
                if (stickerSetCell.addButtonView == view) {
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = getMediaDataController().getFeaturedEmojiSets();
                    while (true) {
                        if (i >= featuredEmojiSets.size()) {
                            stickerSetCovered = null;
                            break;
                        } else {
                            if (stickersSet.set.id == featuredEmojiSets.get(i).set.id) {
                                stickerSetCovered = featuredEmojiSets.get(i);
                                break;
                            }
                            i++;
                        }
                    }
                    if (stickerSetCovered != null) {
                        if (!this.loadingFeaturedStickerSets.contains(Long.valueOf(stickerSetCovered.set.id))) {
                            this.loadingFeaturedStickerSets.add(Long.valueOf(stickerSetCovered.set.id));
                        }
                    }
                    MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), stickerSetCovered == null ? stickersSet : stickerSetCovered, 2, this, false, false);
                    return;
                }
                if (stickerSetCell.removeButtonView == view) {
                    MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), stickersSet, 0, this, false, true);
                } else if (stickerSetCell.premiumButtonView == view) {
                    showDialog(new PremiumFeatureBottomSheet(this, 11, false));
                }
            }
        }
    }

    public void onFeaturedAddClick(View view) {
        FeaturedStickerSetCell2 featuredStickerSetCell2 = (FeaturedStickerSetCell2) view.getParent();
        TLRPC.StickerSetCovered stickerSet = featuredStickerSetCell2.getStickerSet();
        if (this.loadingFeaturedStickerSets.contains(Long.valueOf(stickerSet.set.id))) {
            return;
        }
        this.loadingFeaturedStickerSets.add(Long.valueOf(stickerSet.set.id));
        featuredStickerSetCell2.setDrawProgress(true, true);
        if (featuredStickerSetCell2.isInstalled()) {
            MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), stickerSet, 0, this, false, false);
        } else {
            MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), stickerSet, 2, this, false, false);
        }
    }

    public void toggleSelected(StickerSetCell stickerSetCell) {
        TLRPC.TL_messages_stickerSet stickersSet = stickerSetCell.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        if (this.selectedSets.contains(Long.valueOf(stickersSet.set.id))) {
            this.selectedSets.remove(Long.valueOf(stickersSet.set.id));
            stickerSetCell.setChecked(false, true);
        } else {
            this.selectedSets.add(Long.valueOf(stickersSet.set.id));
            stickerSetCell.setChecked(true, true);
        }
        this.listView.adapter.update(true);
        checkActionMode();
    }

    private void toggleSelected(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet == null) {
            return;
        }
        if (this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
            this.selectedSets.remove(Long.valueOf(tL_messages_stickerSet.set.id));
        } else {
            this.selectedSets.add(Long.valueOf(tL_messages_stickerSet.set.id));
        }
        this.listView.adapter.update(true);
        checkActionMode();
    }

    public void setQuickReactionImage(View view) {
        if (view instanceof TextSettingsCell) {
            TextSettingsCell textSettingsCell = (TextSettingsCell) view;
            String doubleTapReaction = MediaDataController.getInstance(this.currentAccount).getDoubleTapReaction();
            if (doubleTapReaction != null) {
                if (doubleTapReaction.startsWith("animated_")) {
                    try {
                        AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(this.currentAccount, 2, Long.parseLong(doubleTapReaction.substring(9)));
                        animatedEmojiDrawableMake.addView(textSettingsCell.getValueBackupImageView());
                        textSettingsCell.getValueBackupImageView().setImageDrawable(animatedEmojiDrawableMake);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(doubleTapReaction);
                if (tL_availableReaction != null) {
                    textSettingsCell.getValueBackupImageView().getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "100_100_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, Theme.key_windowBackgroundGray, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    public void clearSelected() {
        this.selectedSets.clear();
        this.listView.adapter.update(true);
        checkActionMode();
    }

    public boolean hasSelected() {
        return this.selectedSets.size() > 0;
    }

    public int getSelectedCount() {
        return this.selectedSets.size();
    }

    private void checkActionMode() {
        int selectedCount = getSelectedCount();
        boolean zIsActionModeShowed = this.actionBar.isActionModeShowed();
        if (selectedCount <= 0) {
            if (zIsActionModeShowed) {
                this.actionBar.hideActionMode();
                this.listView.allowReorder(false);
                sendReorder();
                return;
            }
            return;
        }
        checkActionModeIcons();
        this.selectedCountTextView.setNumber(selectedCount, zIsActionModeShowed);
        if (zIsActionModeShowed) {
            return;
        }
        this.actionBar.showActionMode();
        this.listView.allowReorder(true);
        if (SharedConfig.stickersReorderingHintUsed || this.currentType == 5) {
            return;
        }
        SharedConfig.setStickersReorderingHintUsed(true);
        Bulletin.make(this, new ReorderingBulletinLayout(getContext(), LocaleController.getString(R.string.StickersReorderHint), null), 3250).show();
    }

    private void checkActionModeIcons() {
        if (hasSelected()) {
            ArrayList arrayList = this.sets;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet.official && !stickerSet.emojis) {
                        i = 8;
                        break;
                    }
                }
            }
            if (this.deleteMenuItem.getVisibility() != i) {
                this.deleteMenuItem.setVisibility(i);
            }
        }
    }

    private CharSequence addStickersBotSpan(String str) {
        String str2 = "@stickers";
        int iIndexOf = str.indexOf("@stickers");
        if (iIndexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new URLSpanNoUnderline(str2) {
                    @Override
                    public void onClick(View view) {
                        MessagesController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).openByUserName("stickers", StickersActivity.this, 3);
                    }
                }, iIndexOf, iIndexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return str;
    }

    private String getLinkForSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        sb.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb.append("/");
        sb.append(tL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers");
        sb.append("/%s");
        return String.format(locale, sb.toString(), tL_messages_stickerSet.set.short_name);
    }

    public void processSelectionMenu(final int i) {
        String string;
        TextView textView;
        int i2 = 0;
        if (i == 2) {
            StringBuilder sb = new StringBuilder();
            int size = this.sets.size();
            while (i2 < size) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.sets.get(i2);
                if (this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    if (sb.length() != 0) {
                        sb.append("\n");
                    }
                    sb.append(getLinkForSet(tL_messages_stickerSet));
                }
                i2++;
            }
            String string2 = sb.toString();
            ShareAlert shareAlertCreateShareAlert = ShareAlert.createShareAlert(this.fragmentView.getContext(), null, string2, false, string2, false);
            shareAlertCreateShareAlert.setDelegate(new ShareAlert.ShareAlertDelegate() {
                @Override
                public void didShare() {
                    StickersActivity.this.clearSelected();
                }

                @Override
                public boolean didCopy() {
                    StickersActivity.this.clearSelected();
                    return true;
                }
            });
            shareAlertCreateShareAlert.show();
            return;
        }
        if (i == 0 || i == 1) {
            final ArrayList arrayList = new ArrayList(this.selectedSets.size());
            int size2 = this.sets.size();
            for (int i3 = 0; i3 < size2; i3++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.sets.get(i3);
                if (this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 == 1) {
                    int size4 = this.sets.size();
                    while (i2 < size4) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) this.sets.get(i2);
                        if (this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                            processSelectionOption(i, tL_messages_stickerSet3);
                            break;
                        }
                        i2++;
                    }
                    clearSelected();
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                if (i == 1) {
                    builder.setTitle(LocaleController.formatString(R.string.DeleteStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0])));
                    builder.setMessage(LocaleController.formatString(R.string.DeleteStickersAlertMessage, Integer.valueOf(size3)));
                    string = LocaleController.getString(R.string.Delete);
                } else {
                    builder.setTitle(LocaleController.formatString(R.string.ArchiveStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0])));
                    builder.setMessage(LocaleController.formatString(R.string.ArchiveStickersAlertMessage, Integer.valueOf(size3)));
                    string = LocaleController.getString(R.string.Archive);
                }
                builder.setPositiveButton(string, new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i4) {
                        StickersActivity.$r8$lambda$YM_R33Jqfmd5H57RwphKUQs2L2w(this.f$0, arrayList, i, alertDialog, i4);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate = builder.create();
                showDialog(alertDialogCreate);
                if (i != 1 || (textView = (TextView) alertDialogCreate.getButton(-1)) == null) {
                    return;
                }
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }
    }

    public static void $r8$lambda$YM_R33Jqfmd5H57RwphKUQs2L2w(StickersActivity stickersActivity, ArrayList arrayList, int i, AlertDialog alertDialog, int i2) {
        stickersActivity.clearSelected();
        MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSets(arrayList, stickersActivity.currentType, i == 1 ? 0 : 1, stickersActivity, true);
    }

    private void processSelectionOption(int i, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (i == 0) {
            MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), tL_messages_stickerSet, tL_messages_stickerSet.set.archived ? 2 : 1, this, true, true);
            return;
        }
        if (i == 1) {
            MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), tL_messages_stickerSet, 0, this, true, true);
            return;
        }
        if (i == 2) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", getLinkForSet(tL_messages_stickerSet));
                getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i != 3) {
            if (i == 4) {
                toggleSelected(tL_messages_stickerSet);
            }
        } else {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", getLinkForSet(tL_messages_stickerSet)));
                BulletinFactory.createCopyLinkBulletin(this).show();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{StickerSetCell.class, TextSettingsCell.class, TextCheckCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        ActionBar actionBar = this.actionBar;
        int i2 = ThemeDescription.FLAG_AB_AM_ITEMSCOLOR;
        int i3 = Theme.key_actionBarActionModeDefaultIcon;
        arrayList.add(new ThemeDescription(actionBar, i2, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_AM_BACKGROUND, null, null, null, null, Theme.key_actionBarActionModeDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_AM_TOPBACKGROUND, null, null, null, null, Theme.key_actionBarActionModeDefaultTop));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_AM_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarActionModeDefaultSelector));
        arrayList.add(new ThemeDescription(this.selectedCountTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LINKCOLOR, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteLinkText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{StickerSetCell.class}, new String[]{"optionsButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_stickers_menuSelector));
        int i5 = Theme.key_stickers_menu;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"optionsButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"reorderButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{StickerSetCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{StickerSetCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_checkboxCheck));
        TrendingStickersAlert trendingStickersAlert = this.trendingStickersAlert;
        if (trendingStickersAlert != null) {
            arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
        }
        return arrayList;
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
