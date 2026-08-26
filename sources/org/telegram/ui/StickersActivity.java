package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Business.BusinessLinksActivity;
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
import org.telegram.ui.Components.MentionsContainerView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.ReorderingBulletinLayout;
import org.telegram.ui.Components.Shaker$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.Components.TrendingStickersAlert;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public final class StickersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int activeReorderingRequests;
    public final int currentType;
    public ActionBarMenuItem deleteMenuItem;
    public ArrayList featured;
    public ArrayList frozenEmojiPacks;
    public AnonymousClass2 layoutManager;
    public UniversalRecyclerView listView;
    public final ArrayList loadingFeaturedStickerSets;
    public boolean needReorder;
    public NumberTextView selectedCountTextView;
    public final HashSet selectedSets;
    public final StickersActivity$$ExternalSyntheticLambda5 sendReorderRunnable;
    public ArrayList sets;
    public TrendingStickersAlert trendingStickersAlert;

    public final class AnonymousClass2 extends LinearLayoutManager {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass2(ViewGroup viewGroup, int i) {
            super(0, false);
            this.$r8$classId = i;
            this.this$0 = viewGroup;
        }

        @Override
        public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
            switch (this.$r8$classId) {
                case 0:
                    iArr[1] = ((StickersActivity) this.this$0).listView.getHeight();
                    break;
                default:
                    super.calculateExtraLayoutSpace(state, iArr);
                    break;
            }
        }

        @Override
        public int getExtraLayoutSpace(RecyclerView.State state) {
            switch (this.$r8$classId) {
                case 7:
                    return ((TopicsTabsView.AnonymousClass1) this.this$0).doNotDetachViews ? AndroidUtilities.displaySize.y : super.getExtraLayoutSpace(state);
                default:
                    return super.getExtraLayoutSpace(state);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            switch (this.$r8$classId) {
                case 1:
                    super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
                    if (!((FiltersView) this.this$0).isEnabled()) {
                        accessibilityNodeInfoCompat.setVisibleToUser(false);
                    }
                    break;
                case 8:
                    super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
                    if (((ViewPagerFixed.AnonymousClass3) this.this$0).isInHiddenMode) {
                        accessibilityNodeInfoCompat.setVisibleToUser(false);
                    }
                    break;
                default:
                    super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
                    break;
            }
        }

        @Override
        public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
            switch (this.$r8$classId) {
                case 4:
                    ItemOptions itemOptions = DialogsActivity.this.filterOptions;
                    if (itemOptions != null && itemOptions.isShown()) {
                        i = 0;
                    }
                    return super.scrollHorizontallyBy(i, recycler, state);
                case 5:
                default:
                    return super.scrollHorizontallyBy(i, recycler, state);
                case 6:
                    ReactionsContainerLayout reactionsContainerLayout = (ReactionsContainerLayout) this.this$0;
                    if (i < 0 && reactionsContainerLayout.pullingLeftOffset != 0.0f) {
                        float pullingLeftProgress = reactionsContainerLayout.getPullingLeftProgress();
                        reactionsContainerLayout.pullingLeftOffset += i;
                        if ((pullingLeftProgress > 1.0f) != (reactionsContainerLayout.getPullingLeftProgress() > 1.0f)) {
                            try {
                                reactionsContainerLayout.recyclerListView.performHapticFeedback(3);
                                break;
                            } catch (Exception unused) {
                            }
                        }
                        float f = reactionsContainerLayout.pullingLeftOffset;
                        if (f < 0.0f) {
                            i = (int) f;
                            reactionsContainerLayout.pullingLeftOffset = 0.0f;
                        } else {
                            i = 0;
                        }
                        IntroActivity.AnonymousClass1 anonymousClass1 = reactionsContainerLayout.customReactionsContainer;
                        if (anonymousClass1 != null) {
                            anonymousClass1.invalidate();
                        }
                        reactionsContainerLayout.recyclerListView.invalidate();
                    }
                    int iScrollHorizontallyBy = super.scrollHorizontallyBy(i, recycler, state);
                    if (i > 0 && iScrollHorizontallyBy == 0 && reactionsContainerLayout.recyclerListView.getScrollState() == 1 && reactionsContainerLayout.showCustomEmojiReaction()) {
                        ValueAnimator valueAnimator = reactionsContainerLayout.pullingDownBackAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            reactionsContainerLayout.pullingDownBackAnimator.cancel();
                        }
                        float pullingLeftProgress2 = reactionsContainerLayout.getPullingLeftProgress();
                        reactionsContainerLayout.pullingLeftOffset = (i * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + reactionsContainerLayout.pullingLeftOffset;
                        if ((pullingLeftProgress2 > 1.0f) != (reactionsContainerLayout.getPullingLeftProgress() > 1.0f)) {
                            try {
                                reactionsContainerLayout.recyclerListView.performHapticFeedback(3);
                                break;
                            } catch (Exception unused2) {
                            }
                        }
                        IntroActivity.AnonymousClass1 anonymousClass2 = reactionsContainerLayout.customReactionsContainer;
                        if (anonymousClass2 != null) {
                            anonymousClass2.invalidate();
                        }
                        reactionsContainerLayout.recyclerListView.invalidate();
                    }
                    return iScrollHorizontallyBy;
            }
        }

        @Override
        public void scrollToPositionWithOffset(int i, int i2) {
            switch (this.$r8$classId) {
                case 2:
                    scrollToPositionWithOffset(i, i2, this.mShouldReverseLayout);
                    break;
                default:
                    super.scrollToPositionWithOffset(i, i2);
                    break;
            }
        }

        @Override
        public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
            switch (this.$r8$classId) {
                case 3:
                    ChatUsersActivity chatUsersActivity = (ChatUsersActivity) this.this$0;
                    if (!chatUsersActivity.firstLoaded && chatUsersActivity.type == 0 && chatUsersActivity.participants.size() == 0) {
                        return 0;
                    }
                    return super.scrollVerticallyBy(i, recycler, state);
                default:
                    return super.scrollVerticallyBy(i, recycler, state);
            }
        }

        @Override
        public void setReverseLayout(boolean z) {
            switch (this.$r8$classId) {
                case 5:
                    super.setReverseLayout(z);
                    ((MentionsContainerView) this.this$0).listView.setTranslationY(AndroidUtilities.dp(6.0f) * (z ? -1 : 1));
                    break;
                default:
                    super.setReverseLayout(z);
                    break;
            }
        }

        @Override
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            switch (this.$r8$classId) {
                case 2:
                    ((ChannelAdminLogActivity) this.this$0).getClass();
                    LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 0);
                    linearSmoothScrollerCustom.mTargetPosition = i;
                    startSmoothScroll(linearSmoothScrollerCustom);
                    break;
                case 4:
                    final Context context = recyclerView.getContext();
                    LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(context) {
                        @Override
                        public final void onTargetFound(View view, RecyclerView.SmoothScroller.Action action) {
                            int iCalculateDxToMakeVisible = calculateDxToMakeVisible(getHorizontalSnapPreference(), view);
                            if (iCalculateDxToMakeVisible > 0 || (iCalculateDxToMakeVisible == 0 && view.getLeft() - AndroidUtilities.dp(21.0f) < 0)) {
                                iCalculateDxToMakeVisible += AndroidUtilities.dp(60.0f);
                            } else if (iCalculateDxToMakeVisible < 0) {
                                iCalculateDxToMakeVisible -= AndroidUtilities.dp(60.0f);
                            } else if (iCalculateDxToMakeVisible == 0) {
                                if (AndroidUtilities.dp(21.0f) + view.getRight() > ((DialogsActivity.AnonymousClass10) this.this$1.this$0).getMeasuredWidth()) {
                                    iCalculateDxToMakeVisible -= AndroidUtilities.dp(60.0f);
                                }
                            }
                            int iCalculateDyToMakeVisible = calculateDyToMakeVisible(getVerticalSnapPreference(), view);
                            int iMax = Math.max(180, calculateTimeForDeceleration((int) Math.sqrt((iCalculateDyToMakeVisible * iCalculateDyToMakeVisible) + (iCalculateDxToMakeVisible * iCalculateDxToMakeVisible))));
                            if (iMax > 0) {
                                action.update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iMax, this.mDecelerateInterpolator);
                            }
                        }
                    };
                    linearSmoothScroller.mTargetPosition = i;
                    startSmoothScroll(linearSmoothScroller);
                    break;
                case 8:
                    final Context context2 = recyclerView.getContext();
                    LinearSmoothScroller linearSmoothScroller2 = new LinearSmoothScroller(context2) {
                        @Override
                        public final void onTargetFound(View view, RecyclerView.SmoothScroller.Action action) {
                            int iCalculateDxToMakeVisible = calculateDxToMakeVisible(getHorizontalSnapPreference(), view);
                            if (iCalculateDxToMakeVisible > 0 || (iCalculateDxToMakeVisible == 0 && view.getLeft() - AndroidUtilities.dp(21.0f) < 0)) {
                                iCalculateDxToMakeVisible += AndroidUtilities.dp(60.0f);
                            } else if (iCalculateDxToMakeVisible < 0) {
                                iCalculateDxToMakeVisible -= AndroidUtilities.dp(60.0f);
                            } else if (iCalculateDxToMakeVisible == 0) {
                                if (AndroidUtilities.dp(21.0f) + view.getRight() > ((ViewPagerFixed.AnonymousClass3) this.this$1.this$0).getMeasuredWidth()) {
                                    iCalculateDxToMakeVisible -= AndroidUtilities.dp(60.0f);
                                }
                            }
                            int iCalculateDyToMakeVisible = calculateDyToMakeVisible(getVerticalSnapPreference(), view);
                            int iMax = Math.max(180, calculateTimeForDeceleration((int) Math.sqrt((iCalculateDyToMakeVisible * iCalculateDyToMakeVisible) + (iCalculateDxToMakeVisible * iCalculateDxToMakeVisible))));
                            if (iMax > 0) {
                                action.update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iMax, this.mDecelerateInterpolator);
                            }
                        }
                    };
                    linearSmoothScroller2.mTargetPosition = i;
                    startSmoothScroll(linearSmoothScroller2);
                    break;
                default:
                    super.smoothScrollToPosition(recyclerView, state, i);
                    break;
            }
        }

        @Override
        public boolean supportsPredictiveItemAnimations() {
            switch (this.$r8$classId) {
                case 0:
                    return false;
                case 1:
                    return false;
                case 2:
                    return true;
                case 3:
                default:
                    return super.supportsPredictiveItemAnimations();
                case 4:
                    return true;
                case 5:
                    return false;
            }
        }

        public AnonymousClass2(Object obj, int i) {
            super(1, false);
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }

    public final class AnonymousClass4 extends URLSpanNoUnderline {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass4(Object obj, int i) {
            super("@stickers", null);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onClick(View view) {
            switch (this.$r8$classId) {
                case 0:
                    StickersActivity stickersActivity = (StickersActivity) this.this$0;
                    MessagesController.getInstance(((BaseFragment) stickersActivity).currentAccount).openByUserName("stickers", stickersActivity, 3);
                    break;
                case 1:
                    ((BaseFragment) this.this$0).dismissCurrentDialog();
                    super.onClick(view);
                    break;
                case 2:
                    StickersAlert stickersAlert = (StickersAlert) this.this$0;
                    MessagesController.getInstance(((BottomSheet) stickersAlert).currentAccount).openByUserName(getURL(), stickersAlert.parentFragment, 1);
                    stickersAlert.lambda$showGiftOfferSheet$15();
                    break;
                case 3:
                    AndroidUtilities.addToClipboard(getURL());
                    BulletinFactory.of((BusinessLinksActivity) this.this$0).createCopyLinkBulletin(false).show();
                    break;
                case 4:
                    GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
                    MessagesController.getInstance(((BaseFragment) groupStickersActivity).currentAccount).openByUserName("stickers", groupStickersActivity, 1);
                    break;
                default:
                    PassportActivity.this.dismissCurrentDialog();
                    super.onClick(view);
                    break;
            }
        }

        public AnonymousClass4(String str, int i, Object obj) {
            super(str, null);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        public AnonymousClass4(String str, BusinessLinksActivity businessLinksActivity) {
            super(str, null);
            this.$r8$classId = 3;
            this.this$0 = businessLinksActivity;
        }

        public AnonymousClass4(BaseFragment baseFragment, String str) {
            super(str, null);
            this.$r8$classId = 1;
            this.this$0 = baseFragment;
        }
    }

    public StickersActivity(int i, ArrayList arrayList) {
        super(null);
        this.loadingFeaturedStickerSets = new ArrayList();
        this.selectedSets = new HashSet();
        this.sendReorderRunnable = new StickersActivity$$ExternalSyntheticLambda5(this, 0);
        this.currentType = i;
        this.frozenEmojiPacks = arrayList;
    }

    public final CharSequence addStickersBotSpan(String str) {
        int iIndexOf = str.indexOf("@stickers");
        if (iIndexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new AnonymousClass4(this, 0), iIndexOf, iIndexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return str;
    }

    public final void checkActionMode() {
        HashSet hashSet = this.selectedSets;
        int size = hashSet.size();
        boolean zIsActionModeShowed = this.actionBar.isActionModeShowed();
        int i = 0;
        if (size <= 0) {
            if (zIsActionModeShowed) {
                this.actionBar.hideActionMode$1();
                this.listView.allowReorder(false);
                sendReorder();
                return;
            }
            return;
        }
        if (hashSet.size() > 0) {
            ArrayList arrayList = this.sets;
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList.get(i2);
                i2++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
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
        this.selectedCountTextView.setNumber(size, zIsActionModeShowed);
        if (zIsActionModeShowed) {
            return;
        }
        this.actionBar.showActionMode(null, null);
        this.listView.allowReorder(true);
        if (SharedConfig.stickersReorderingHintUsed || this.currentType == 5) {
            return;
        }
        SharedConfig.setStickersReorderingHintUsed(true);
        Bulletin.make(this, new ReorderingBulletinLayout(getParentActivity(), LocaleController.getString(R.string.StickersReorderHint)), 3250).show();
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        zzkt.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.currentType;
        if (i == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.StickersName));
        } else if (i == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Masks));
        } else if (i == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Emoji));
        }
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 27));
        ActionBar.AnonymousClass1 anonymousClass1CreateActionMode = this.actionBar.createActionMode(null);
        NumberTextView numberTextView = new NumberTextView(anonymousClass1CreateActionMode.getContext());
        this.selectedCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedCountTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultIcon, false));
        anonymousClass1CreateActionMode.addView(this.selectedCountTextView, LayoutHelper.createLinear(1.0f, 0, -1, 72, 0, 0));
        this.selectedCountTextView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        anonymousClass1CreateActionMode.addItemWithWidth(2, R.drawable.msg_share, AndroidUtilities.dp(54.0f));
        anonymousClass1CreateActionMode.addItemWithWidth(0, R.drawable.msg_archive, AndroidUtilities.dp(54.0f));
        this.deleteMenuItem = anonymousClass1CreateActionMode.addItemWithWidth(1, R.drawable.msg_delete, AndroidUtilities.dp(54.0f));
        if (i != 5 || (arrayList = this.frozenEmojiPacks) == null) {
            this.sets = new ArrayList(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(MediaDataController.getInstance(this.currentAccount).getStickerSets(i)));
        } else {
            this.sets = arrayList;
        }
        this.featured = getFeaturedSets();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        final int i2 = 0;
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(getParentActivity(), getCurrentAccount(), getClassGuid(), new Utilities.Callback2(this) {
            public final StickersActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        this.f$0.fillItems$17((ArrayList) obj, (UniversalAdapter) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        this.f$0.whenReordered$2((ArrayList) obj2);
                        break;
                }
            }
        }, new StickersActivity$$ExternalSyntheticLambda2(this), new StickersActivity$$ExternalSyntheticLambda2(this), getResourceProvider());
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setFocusable(true);
        this.listView.setTag(7);
        final int i3 = 1;
        this.listView.listenReorder(new Utilities.Callback2(this) {
            public final StickersActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        this.f$0.fillItems$17((ArrayList) obj, (UniversalAdapter) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        this.f$0.whenReordered$2((ArrayList) obj2);
                        break;
                }
            }
        }, false);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, 0);
        this.layoutManager = anonymousClass2;
        anonymousClass2.setOrientation(1);
        this.listView.setLayoutManager(this.layoutManager);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.stickersDidLoad;
        int i4 = this.currentType;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == i4) {
                this.loadingFeaturedStickerSets.clear();
            }
            this.listView.adapter.update(true);
        } else if (i == NotificationCenter.featuredStickersDidLoad || i == NotificationCenter.featuredEmojiDidLoad) {
            this.listView.adapter.update(true);
        } else if (i == NotificationCenter.archivedStickersCountDidLoad && ((Integer) objArr[0]).intValue() == i4) {
            this.listView.adapter.update(true);
        }
    }

    public final void fillItems$17(ArrayList arrayList, UniversalAdapter universalAdapter) {
        ArrayList arrayList2;
        boolean z;
        String string;
        final int i = 2;
        final int i2 = 1;
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        UniversalRecyclerView universalRecyclerView = this.listView;
        int i3 = 5;
        int i4 = this.currentType;
        if (universalRecyclerView == null || (!universalRecyclerView.reorderingAllowed && !this.needReorder && this.activeReorderingRequests <= 0)) {
            if (i4 == 5) {
                ArrayList arrayList3 = new ArrayList(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i4)));
                this.frozenEmojiPacks = arrayList3;
                this.sets = arrayList3;
            } else {
                this.sets = new ArrayList(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i4)));
            }
        }
        this.featured = new ArrayList(getFeaturedSets());
        int i5 = 0;
        while (true) {
            int size = this.featured.size();
            arrayList2 = this.loadingFeaturedStickerSets;
            if (i5 >= size) {
                break;
            }
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) this.featured.get(i5)).set.id))) {
                this.featured.remove(i5);
                i5--;
            }
            i5++;
        }
        int size2 = this.featured.size();
        int archivedStickersCount = mediaDataController.getArchivedStickersCount(i4);
        int size3 = mediaDataController.getStickerSets(5).size();
        if (i4 == 0) {
            arrayList.size();
            arrayList.add(UItem.asButton(1, R.drawable.msg2_trending, LocaleController.getString(R.string.FeaturedStickers), size2 > 0 ? LocaleController.formatNumber(size2, ',') : ""));
            if (archivedStickersCount > 0) {
                arrayList.size();
                if (i4 == 0) {
                    arrayList.add(UItem.asButton(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
                } else {
                    arrayList.add(UItem.asButton(LocaleController.getString(i4 == 5 ? R.string.ArchivedEmojiPacks : R.string.ArchivedMasks), LocaleController.formatNumber(archivedStickersCount, ','), 2));
                }
            }
            arrayList.size();
            int i6 = R.drawable.msg2_smile_status;
            String string2 = LocaleController.getString(R.string.Emoji);
            String number = size3 > 0 ? LocaleController.formatNumber(size3, ',') : "";
            UItem uItem = new UItem(43);
            uItem.id = 3;
            uItem.iconResId = i6;
            uItem.text = string2;
            uItem.subtext = number;
            arrayList.add(uItem);
        } else if (archivedStickersCount > 0) {
            arrayList.size();
            if (i4 == 0) {
                arrayList.add(UItem.asButton(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
            } else {
                arrayList.add(UItem.asButton(LocaleController.getString(i4 == 5 ? R.string.ArchivedEmojiPacks : R.string.ArchivedMasks), LocaleController.formatNumber(archivedStickersCount, ','), 2));
            }
            if (i4 == 1) {
                String string3 = LocaleController.getString(R.string.ArchivedMasksInfo);
                UItem uItem2 = new UItem(7);
                uItem2.text = string3;
                arrayList.add(uItem2);
            }
        }
        if (i4 == 0) {
            arrayList.size();
            int i7 = R.drawable.msg2_reactions2;
            String string4 = LocaleController.getString(R.string.DoubleTapSetting);
            UItem uItem3 = new UItem(43);
            uItem3.id = 4;
            uItem3.iconResId = i7;
            uItem3.text = string4;
            uItem3.bind = new VoIPFragment$$ExternalSyntheticLambda7(this, i3);
            arrayList.add(uItem3);
            CharSequence charSequenceAddStickersBotSpan = addStickersBotSpan(LocaleController.getString(i4 == 5 ? R.string.EmojiBotInfo : R.string.StickersBotInfo));
            UItem uItem4 = new UItem(7);
            uItem4.text = charSequenceAddStickersBotSpan;
            arrayList.add(uItem4);
            String string5 = LocaleController.getString(R.string.StickersSettings);
            UItem uItem5 = new UItem(0);
            uItem5.text = string5;
            arrayList.add(uItem5);
            arrayList.size();
            String string6 = LocaleController.getString(R.string.SuggestStickers);
            int i8 = SharedConfig.suggestStickers;
            if (i8 != 0) {
                string = i8 != 1 ? LocaleController.getString(R.string.SuggestStickersNone) : LocaleController.getString(R.string.SuggestStickersInstalled);
            } else {
                string = LocaleController.getString(R.string.SuggestStickersAll);
            }
            UItem uItem6 = new UItem(43);
            uItem6.id = 5;
            uItem6.text = string6;
            uItem6.subtext = string;
            arrayList.add(uItem6);
            arrayList.size();
            UItem uItemAsCheck = UItem.asCheck(6, LocaleController.getString(R.string.LargeEmoji));
            uItemAsCheck.setChecked(SharedConfig.allowBigEmoji);
            arrayList.add(uItemAsCheck);
            arrayList.size();
            UItem uItemAsCheck2 = UItem.asCheck(7, LocaleController.getString(R.string.DynamicPackOrder));
            uItemAsCheck2.setChecked(SharedConfig.updateStickersOrderOnSend);
            arrayList.add(uItemAsCheck2);
            String string7 = LocaleController.getString(R.string.DynamicPackOrderInfo);
            UItem uItem7 = new UItem(7);
            uItem7.text = string7;
            arrayList.add(uItem7);
        }
        if (i4 == 5) {
            UItem uItemAsCheck3 = UItem.asCheck(9, LocaleController.getString(R.string.SuggestAnimatedEmoji));
            uItemAsCheck3.setChecked(SharedConfig.suggestAnimatedEmoji);
            arrayList.add(uItemAsCheck3);
            String string8 = LocaleController.getString(R.string.SuggestAnimatedEmojiInfo);
            UItem uItem8 = new UItem(7);
            uItem8.text = string8;
            arrayList.add(uItem8);
        }
        if (this.sets.size() > 0) {
            universalAdapter.whiteSectionStart();
            if (i4 == 5 || (!this.featured.isEmpty() && i4 == 0)) {
                String string9 = LocaleController.getString(i4 == 5 ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets);
                UItem uItem9 = new UItem(0);
                uItem9.text = string9;
                arrayList.add(uItem9);
            }
            universalAdapter.reorderSectionStart();
            ArrayList arrayList4 = this.sets;
            int size4 = arrayList4.size();
            int i9 = 0;
            while (i9 < size4) {
                Object obj = arrayList4.get(i9);
                i9++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i10 = StickerSetCell.Factory.$r8$clinit;
                UItem uItemOfFactory = UItem.ofFactory(StickerSetCell.Factory.class);
                uItemOfFactory.object = tL_messages_stickerSet;
                final int i11 = 0;
                uItemOfFactory.clickCallback = new View.OnClickListener(this) {
                    public final StickersActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                final StickersActivity stickersActivity = this.f$0;
                                stickersActivity.getClass();
                                if (view != null && (view.getParent() instanceof StickerSetCell)) {
                                    StickerSetCell stickerSetCell = (StickerSetCell) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = stickerSetCell.getStickersSet();
                                    ItemOptions itemOptions = new ItemOptions(stickersActivity, stickerSetCell, false, true);
                                    final int i12 = 0;
                                    itemOptions.add(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    stickersActivity.lambda$openStickerSetOptions$8(stickersSet);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity2 = stickersActivity;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity2.getClass();
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.getLinkForSet(tL_messages_stickerSet2)));
                                                        BulletinFactory.of(stickersActivity2).createCopyLinkBulletin(false).show();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    StickersActivity stickersActivity3 = stickersActivity;
                                                    stickersActivity3.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity3.getLinkForSet(tL_messages_stickerSet3));
                                                        stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e2) {
                                                        FileLog.e(e2);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    stickersActivity.lambda$openStickerSetOptions$12(stickersSet);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i13 = 1;
                                    itemOptions.addIf(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    stickersActivity.lambda$openStickerSetOptions$8(stickersSet);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity2 = stickersActivity;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity2.getClass();
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.getLinkForSet(tL_messages_stickerSet2)));
                                                        BulletinFactory.of(stickersActivity2).createCopyLinkBulletin(false).show();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    StickersActivity stickersActivity3 = stickersActivity;
                                                    stickersActivity3.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity3.getLinkForSet(tL_messages_stickerSet3));
                                                        stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e2) {
                                                        FileLog.e(e2);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    stickersActivity.lambda$openStickerSetOptions$12(stickersSet);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    itemOptions.add(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new StickersActivity$$ExternalSyntheticLambda18(0, stickersActivity, stickerSetCell), false);
                                    final int i14 = 2;
                                    itemOptions.addIf(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    stickersActivity.lambda$openStickerSetOptions$8(stickersSet);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity2 = stickersActivity;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity2.getClass();
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.getLinkForSet(tL_messages_stickerSet2)));
                                                        BulletinFactory.of(stickersActivity2).createCopyLinkBulletin(false).show();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    StickersActivity stickersActivity3 = stickersActivity;
                                                    stickersActivity3.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity3.getLinkForSet(tL_messages_stickerSet3));
                                                        stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e2) {
                                                        FileLog.e(e2);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    stickersActivity.lambda$openStickerSetOptions$12(stickersSet);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    boolean z2 = stickersSet.set.official;
                                    int i15 = R.drawable.msg_delete;
                                    String string10 = LocaleController.getString(R.string.StickersRemove);
                                    final int i16 = 3;
                                    Runnable runnable = new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    stickersActivity.lambda$openStickerSetOptions$8(stickersSet);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity2 = stickersActivity;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity2.getClass();
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.getLinkForSet(tL_messages_stickerSet2)));
                                                        BulletinFactory.of(stickersActivity2).createCopyLinkBulletin(false).show();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    StickersActivity stickersActivity3 = stickersActivity;
                                                    stickersActivity3.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity3.getLinkForSet(tL_messages_stickerSet3));
                                                        stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e2) {
                                                        FileLog.e(e2);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    stickersActivity.lambda$openStickerSetOptions$12(stickersSet);
                                                    break;
                                            }
                                        }
                                    };
                                    if (!z2) {
                                        itemOptions.add(i15, string10, runnable, true);
                                    }
                                    itemOptions.minWidthDp = 190;
                                    itemOptions.show();
                                    break;
                                }
                                break;
                            case 1:
                                this.f$0.onFeaturedAddClick(view);
                                break;
                            default:
                                this.f$0.onStickerSetButtonClick(view);
                                break;
                        }
                    }
                };
                uItemOfFactory.clickCallback2 = new View.OnClickListener(this) {
                    public final StickersActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i) {
                            case 0:
                                final StickersActivity stickersActivity = this.f$0;
                                stickersActivity.getClass();
                                if (view != null && (view.getParent() instanceof StickerSetCell)) {
                                    StickerSetCell stickerSetCell = (StickerSetCell) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = stickerSetCell.getStickersSet();
                                    ItemOptions itemOptions = new ItemOptions(stickersActivity, stickerSetCell, false, true);
                                    final int i12 = 0;
                                    itemOptions.add(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    stickersActivity.lambda$openStickerSetOptions$8(stickersSet);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity2 = stickersActivity;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity2.getClass();
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.getLinkForSet(tL_messages_stickerSet2)));
                                                        BulletinFactory.of(stickersActivity2).createCopyLinkBulletin(false).show();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    StickersActivity stickersActivity3 = stickersActivity;
                                                    stickersActivity3.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity3.getLinkForSet(tL_messages_stickerSet3));
                                                        stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e2) {
                                                        FileLog.e(e2);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    stickersActivity.lambda$openStickerSetOptions$12(stickersSet);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i13 = 1;
                                    itemOptions.addIf(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    stickersActivity.lambda$openStickerSetOptions$8(stickersSet);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity2 = stickersActivity;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity2.getClass();
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.getLinkForSet(tL_messages_stickerSet2)));
                                                        BulletinFactory.of(stickersActivity2).createCopyLinkBulletin(false).show();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    StickersActivity stickersActivity3 = stickersActivity;
                                                    stickersActivity3.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity3.getLinkForSet(tL_messages_stickerSet3));
                                                        stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e2) {
                                                        FileLog.e(e2);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    stickersActivity.lambda$openStickerSetOptions$12(stickersSet);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    itemOptions.add(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new StickersActivity$$ExternalSyntheticLambda18(0, stickersActivity, stickerSetCell), false);
                                    final int i14 = 2;
                                    itemOptions.addIf(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    stickersActivity.lambda$openStickerSetOptions$8(stickersSet);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity2 = stickersActivity;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity2.getClass();
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.getLinkForSet(tL_messages_stickerSet2)));
                                                        BulletinFactory.of(stickersActivity2).createCopyLinkBulletin(false).show();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    StickersActivity stickersActivity3 = stickersActivity;
                                                    stickersActivity3.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity3.getLinkForSet(tL_messages_stickerSet3));
                                                        stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e2) {
                                                        FileLog.e(e2);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    stickersActivity.lambda$openStickerSetOptions$12(stickersSet);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    boolean z2 = stickersSet.set.official;
                                    int i15 = R.drawable.msg_delete;
                                    String string10 = LocaleController.getString(R.string.StickersRemove);
                                    final int i16 = 3;
                                    Runnable runnable = new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    stickersActivity.lambda$openStickerSetOptions$8(stickersSet);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity2 = stickersActivity;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity2.getClass();
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.getLinkForSet(tL_messages_stickerSet2)));
                                                        BulletinFactory.of(stickersActivity2).createCopyLinkBulletin(false).show();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    StickersActivity stickersActivity3 = stickersActivity;
                                                    stickersActivity3.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity3.getLinkForSet(tL_messages_stickerSet3));
                                                        stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e2) {
                                                        FileLog.e(e2);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    stickersActivity.lambda$openStickerSetOptions$12(stickersSet);
                                                    break;
                                            }
                                        }
                                    };
                                    if (!z2) {
                                        itemOptions.add(i15, string10, runnable, true);
                                    }
                                    itemOptions.minWidthDp = 190;
                                    itemOptions.show();
                                    break;
                                }
                                break;
                            case 1:
                                this.f$0.onFeaturedAddClick(view);
                                break;
                            default:
                                this.f$0.onStickerSetButtonClick(view);
                                break;
                        }
                    }
                };
                uItemOfFactory.setChecked(this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet.set.id)));
                arrayList.add(uItemOfFactory);
                arrayList4 = arrayList4;
                i = 2;
            }
            universalAdapter.reorderSectionEnd();
            universalAdapter.whiteSectionEnd();
            if (i4 != 1 && i4 != 5) {
                UItem uItem10 = new UItem(7);
                uItem10.text = null;
                arrayList.add(uItem10);
            } else if (i4 == 1) {
                String string10 = LocaleController.getString(R.string.MasksInfo);
                UItem uItem11 = new UItem(7);
                uItem11.text = string10;
                arrayList.add(uItem11);
            }
        }
        if (this.featured.size() > 3) {
            this.featured = new ArrayList(this.featured.subList(0, 3));
            z = true;
        } else {
            z = false;
        }
        if (i4 == 5 && !this.featured.isEmpty()) {
            if (this.sets.size() > 0) {
                UItem uItem12 = new UItem(7);
                uItem12.text = null;
                arrayList.add(uItem12);
            }
            String string11 = LocaleController.getString(i4 == 5 ? R.string.FeaturedEmojiPacks : R.string.FeaturedStickers);
            int i12 = 0;
            UItem uItem13 = new UItem(0);
            uItem13.text = string11;
            arrayList.add(uItem13);
            ArrayList arrayList5 = this.featured;
            int size5 = arrayList5.size();
            while (i12 < size5) {
                Object obj2 = arrayList5.get(i12);
                i12++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i13 = FeaturedStickerSetCell2.Factory.$r8$clinit;
                UItem uItemOfFactory2 = UItem.ofFactory(FeaturedStickerSetCell2.Factory.class);
                uItemOfFactory2.object = stickerSetCovered;
                uItemOfFactory2.clickCallback = new View.OnClickListener(this) {
                    public final StickersActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i2) {
                            case 0:
                                final StickersActivity stickersActivity = this.f$0;
                                stickersActivity.getClass();
                                if (view != null && (view.getParent() instanceof StickerSetCell)) {
                                    StickerSetCell stickerSetCell = (StickerSetCell) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = stickerSetCell.getStickersSet();
                                    ItemOptions itemOptions = new ItemOptions(stickersActivity, stickerSetCell, false, true);
                                    final int i14 = 0;
                                    itemOptions.add(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    stickersActivity.lambda$openStickerSetOptions$8(stickersSet);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity2 = stickersActivity;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity2.getClass();
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.getLinkForSet(tL_messages_stickerSet2)));
                                                        BulletinFactory.of(stickersActivity2).createCopyLinkBulletin(false).show();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    StickersActivity stickersActivity3 = stickersActivity;
                                                    stickersActivity3.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity3.getLinkForSet(tL_messages_stickerSet3));
                                                        stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e2) {
                                                        FileLog.e(e2);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    stickersActivity.lambda$openStickerSetOptions$12(stickersSet);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i15 = 1;
                                    itemOptions.addIf(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i15) {
                                                case 0:
                                                    stickersActivity.lambda$openStickerSetOptions$8(stickersSet);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity2 = stickersActivity;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity2.getClass();
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.getLinkForSet(tL_messages_stickerSet2)));
                                                        BulletinFactory.of(stickersActivity2).createCopyLinkBulletin(false).show();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    StickersActivity stickersActivity3 = stickersActivity;
                                                    stickersActivity3.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity3.getLinkForSet(tL_messages_stickerSet3));
                                                        stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e2) {
                                                        FileLog.e(e2);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    stickersActivity.lambda$openStickerSetOptions$12(stickersSet);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    itemOptions.add(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new StickersActivity$$ExternalSyntheticLambda18(0, stickersActivity, stickerSetCell), false);
                                    final int i16 = 2;
                                    itemOptions.addIf(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    stickersActivity.lambda$openStickerSetOptions$8(stickersSet);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity2 = stickersActivity;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity2.getClass();
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.getLinkForSet(tL_messages_stickerSet2)));
                                                        BulletinFactory.of(stickersActivity2).createCopyLinkBulletin(false).show();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    StickersActivity stickersActivity3 = stickersActivity;
                                                    stickersActivity3.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity3.getLinkForSet(tL_messages_stickerSet3));
                                                        stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e2) {
                                                        FileLog.e(e2);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    stickersActivity.lambda$openStickerSetOptions$12(stickersSet);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    boolean z2 = stickersSet.set.official;
                                    int i17 = R.drawable.msg_delete;
                                    String string12 = LocaleController.getString(R.string.StickersRemove);
                                    final int i18 = 3;
                                    Runnable runnable = new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i18) {
                                                case 0:
                                                    stickersActivity.lambda$openStickerSetOptions$8(stickersSet);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity2 = stickersActivity;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity2.getClass();
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.getLinkForSet(tL_messages_stickerSet2)));
                                                        BulletinFactory.of(stickersActivity2).createCopyLinkBulletin(false).show();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    StickersActivity stickersActivity3 = stickersActivity;
                                                    stickersActivity3.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity3.getLinkForSet(tL_messages_stickerSet3));
                                                        stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e2) {
                                                        FileLog.e(e2);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    stickersActivity.lambda$openStickerSetOptions$12(stickersSet);
                                                    break;
                                            }
                                        }
                                    };
                                    if (!z2) {
                                        itemOptions.add(i17, string12, runnable, true);
                                    }
                                    itemOptions.minWidthDp = 190;
                                    itemOptions.show();
                                    break;
                                }
                                break;
                            case 1:
                                this.f$0.onFeaturedAddClick(view);
                                break;
                            default:
                                this.f$0.onStickerSetButtonClick(view);
                                break;
                        }
                    }
                };
                uItemOfFactory2.locked = arrayList2.contains(Long.valueOf(stickerSetCovered.set.id));
                arrayList.add(uItemOfFactory2);
            }
            if (z) {
                UItem uItemAsButton = UItem.asButton(8, R.drawable.msg2_trending, LocaleController.getString(R.string.ShowMoreEmojiPacks));
                uItemAsButton.accent = true;
                arrayList.add(uItemAsButton);
            }
        }
        if (i4 == 5) {
            CharSequence charSequenceAddStickersBotSpan2 = addStickersBotSpan(LocaleController.getString(i4 == 5 ? R.string.EmojiBotInfo : R.string.StickersBotInfo));
            UItem uItem14 = new UItem(7);
            uItem14.text = charSequenceAddStickersBotSpan2;
            arrayList.add(uItem14);
        }
    }

    public final ArrayList getFeaturedSets() {
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        if (this.currentType != 5) {
            return mediaDataController.getFeaturedStickerSets();
        }
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

    public final String getLinkForSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb.append("/");
        return String.format(locale, MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb, tL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers", "/%s"), tL_messages_stickerSet.set.short_name);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{StickerSetCell.class, TextSettingsCell.class, TextCheckCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        ActionBar actionBar = this.actionBar;
        int i2 = Theme.key_actionBarActionModeDefaultIcon;
        arrayList.add(new ThemeDescription(actionBar, 512, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, 1048576, null, null, null, null, Theme.key_actionBarActionModeDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 2097152, null, null, null, null, Theme.key_actionBarActionModeDefaultTop));
        arrayList.add(new ThemeDescription(this.actionBar, 4194304, null, null, null, null, Theme.key_actionBarActionModeDefaultSelector));
        arrayList.add(new ThemeDescription(this.selectedCountTextView, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 2, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteLinkText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 196608, new Class[]{StickerSetCell.class}, new String[]{"optionsButton"}, null, null, -1, null, Theme.key_stickers_menuSelector));
        int i4 = Theme.key_stickers_menu;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"optionsButton"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"reorderButton"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 8192, new Class[]{StickerSetCell.class}, new String[]{"checkBox"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 16384, new Class[]{StickerSetCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkboxCheck));
        TrendingStickersAlert trendingStickersAlert = this.trendingStickersAlert;
        if (trendingStickersAlert != null) {
            arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
        }
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$openStickerSetOptions$12(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), tL_messages_stickerSet, 0, this, true, true);
    }

    public final void lambda$openStickerSetOptions$8(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), tL_messages_stickerSet, !tL_messages_stickerSet.set.archived ? 1 : 2, this, true, true);
    }

    public final void lambda$processSelectionMenu$13(int i, ArrayList arrayList) {
        this.selectedSets.clear();
        this.listView.adapter.update(true);
        checkActionMode();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSets(arrayList, this.currentType, i == 1 ? 0 : 1, this, true);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        HashSet hashSet = this.selectedSets;
        if (hashSet.isEmpty()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        hashSet.clear();
        this.listView.adapter.update(true);
        checkActionMode();
        return false;
    }

    public final void onClick$10(UItem uItem, View view) {
        Object obj = uItem.object;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!this.selectedSets.isEmpty()) {
                toggleSelected((StickerSetCell) view);
                return;
            }
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet == null || !stickerSet.emojis) {
                showDialog(new StickersAlert(getParentActivity(), this, null, tL_messages_stickerSet, null, null));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            arrayList2.add(tL_inputStickerSetID);
            showDialog(new EmojiPacksAlert(this, getParentActivity(), getResourceProvider(), arrayList2));
        }
        boolean z = obj instanceof TLRPC.StickerSetCovered;
        int i = this.currentType;
        if (z) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet3.id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i != 5) {
                showDialog(new StickersAlert(getParentActivity(), this, tL_inputStickerSetID2, null, null, null));
                return;
            }
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(tL_inputStickerSetID2);
            showDialog(new EmojiPacksAlert(this, getParentActivity(), getResourceProvider(), arrayList3));
            return;
        }
        switch (uItem.id) {
            case 1:
            case 8:
                if (i == 5) {
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
                    TrendingStickersAlert trendingStickersAlert = new TrendingStickersAlert(getParentActivity(), this, new TrendingStickersLayout(getParentActivity(), new TrendingStickersLayout.Delegate() {
                        @Override
                        public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered2, boolean z2) {
                            StickersActivity stickersActivity = StickersActivity.this;
                            MediaDataController.getInstance(((BaseFragment) stickersActivity).currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered2, 2, StickersActivity.this, false, false);
                        }

                        @Override
                        public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered2) {
                            StickersActivity stickersActivity = StickersActivity.this;
                            MediaDataController.getInstance(((BaseFragment) stickersActivity).currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered2, 0, StickersActivity.this, false, false);
                        }
                    }, new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                    this.trendingStickersAlert = trendingStickersAlert;
                    trendingStickersAlert.show();
                }
                break;
            case 2:
                presentFragment(new ArchivedStickersActivity(i));
                break;
            case 3:
                presentFragment(new StickersActivity(5, null));
                break;
            case 4:
                presentFragment(new ReactionsDoubleTapManageActivity());
                break;
            case 5:
                ItemOptions itemOptions = new ItemOptions(this, view, false, true);
                itemOptions.addChecked(SharedConfig.suggestStickers == 0, 0, null, LocaleController.getString(R.string.SuggestStickersAll), new Shaker$$ExternalSyntheticLambda0(4, view));
                itemOptions.addChecked(SharedConfig.suggestStickers == 1, 0, null, LocaleController.getString(R.string.SuggestStickersInstalled), new Shaker$$ExternalSyntheticLambda0(5, view));
                itemOptions.addChecked(SharedConfig.suggestStickers == 2, 0, null, LocaleController.getString(R.string.SuggestStickersNone), new Shaker$$ExternalSyntheticLambda0(6, view));
                itemOptions.show();
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

    public final void onFeaturedAddClick(View view) {
        FeaturedStickerSetCell2 featuredStickerSetCell2 = (FeaturedStickerSetCell2) view.getParent();
        TLRPC.StickerSetCovered stickerSet = featuredStickerSetCell2.getStickerSet();
        ArrayList arrayList = this.loadingFeaturedStickerSets;
        if (arrayList.contains(Long.valueOf(stickerSet.set.id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.id));
        featuredStickerSetCell2.addButton.setDrawProgress(true, true);
        if (featuredStickerSetCell2.isInstalled) {
            MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), stickerSet, 0, this, false, false);
        } else {
            MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), stickerSet, 2, this, false, false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        int i = this.currentType;
        mediaDataController.checkStickers(i);
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
    public final void onFragmentDestroy() {
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
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    public final void onStickerSetButtonClick(View view) {
        StickerSetCell stickerSetCell;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (!(viewGroup.getParent() instanceof StickerSetCell) || (stickersSet = (stickerSetCell = (StickerSetCell) viewGroup.getParent()).getStickersSet()) == null || stickersSet.set == null) {
            return;
        }
        if (stickerSetCell.addButtonView != view) {
            if (stickerSetCell.removeButtonView == view) {
                MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), stickersSet, 0, this, false, true);
                return;
            } else {
                if (stickerSetCell.premiumButtonView == view) {
                    showDialog(new PremiumFeatureBottomSheet(this, getParentActivity(), getCurrentAccount(), false, 11, false, null));
                    return;
                }
                return;
            }
        }
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = getMediaDataController().getFeaturedEmojiSets();
        int i = 0;
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
            ArrayList arrayList = this.loadingFeaturedStickerSets;
            if (arrayList.contains(Long.valueOf(stickerSetCovered.set.id))) {
                return;
            } else {
                arrayList.add(Long.valueOf(stickerSetCovered.set.id));
            }
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        Activity parentActivity = getParentActivity();
        TLObject tLObject = stickersSet;
        if (stickerSetCovered2 != null) {
            tLObject = stickerSetCovered2;
        }
        mediaDataController.toggleStickerSet(parentActivity, tLObject, 2, this, false, false);
    }

    public final void processSelectionMenu(int i) {
        StickersActivity stickersActivity;
        String string;
        TextView textView;
        if (i == 2) {
            StringBuilder sb = new StringBuilder();
            int size = this.sets.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.sets.get(i2);
                if (this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    if (sb.length() != 0) {
                        sb.append("\n");
                    }
                    sb.append(getLinkForSet(tL_messages_stickerSet));
                }
            }
            String string2 = sb.toString();
            ShareAlert shareAlertCreateShareAlert = ShareAlert.createShareAlert(this.fragmentView.getContext(), null, string2, false, string2);
            shareAlertCreateShareAlert.delegate = new PollItemMenu.AnonymousClass6(this, 6);
            shareAlertCreateShareAlert.show();
            return;
        }
        if (i == 0 || i == 1) {
            ArrayList arrayList = new ArrayList(this.selectedSets.size());
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
                    for (int i4 = 0; i4 < size4; i4++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) this.sets.get(i4);
                        if (this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                            if (i == 0) {
                                stickersActivity = this;
                                MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), tL_messages_stickerSet3, !tL_messages_stickerSet3.set.archived ? 1 : 2, stickersActivity, true, true);
                            } else {
                                stickersActivity = this;
                                if (i == 1) {
                                    MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity, true, true);
                                } else if (i == 2) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", getLinkForSet(tL_messages_stickerSet3));
                                        getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                } else if (i == 3) {
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", getLinkForSet(tL_messages_stickerSet3)));
                                        BulletinFactory.of(this).createCopyLinkBulletin(false).show();
                                    } catch (Exception e2) {
                                        FileLog.e(e2);
                                    }
                                } else if (i == 4) {
                                    if (stickersActivity.selectedSets.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                        stickersActivity.selectedSets.remove(Long.valueOf(tL_messages_stickerSet3.set.id));
                                    } else {
                                        stickersActivity.selectedSets.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                    }
                                    stickersActivity.listView.adapter.update(true);
                                    checkActionMode();
                                }
                            }
                            stickersActivity.selectedSets.clear();
                            stickersActivity.listView.adapter.update(true);
                            checkActionMode();
                            return;
                        }
                    }
                    stickersActivity = this;
                    stickersActivity.selectedSets.clear();
                    stickersActivity.listView.adapter.update(true);
                    checkActionMode();
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                if (i == 1) {
                    builder.alertDialog.title = LocaleController.formatString(R.string.DeleteStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                    builder.alertDialog.message = LocaleController.formatString(R.string.DeleteStickersAlertMessage, Integer.valueOf(size3));
                    string = LocaleController.getString(R.string.Delete);
                } else {
                    builder.alertDialog.title = LocaleController.formatString(R.string.ArchiveStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                    builder.alertDialog.message = LocaleController.formatString(R.string.ArchiveStickersAlertMessage, Integer.valueOf(size3));
                    string = LocaleController.getString(R.string.Archive);
                }
                builder.setPositiveButton(string, new PassportActivity$$ExternalSyntheticLambda52(this, arrayList, i, 16));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialog = builder.alertDialog;
                showDialog(alertDialog);
                if (i == 1 && (textView = (TextView) alertDialog.getButton(-1)) != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                }
            }
        }
    }

    public final void sendReorder() {
        if (this.needReorder) {
            this.needReorder = false;
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            int i = this.currentType;
            mediaDataController.calcNewHash(i);
            this.activeReorderingRequests++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            tL_messages_reorderStickerSets.masks = i == 1;
            tL_messages_reorderStickerSets.emojis = i == 5;
            int iM = 0;
            while (iM < this.sets.size()) {
                iM = MessagesController$$ExternalSyntheticOutline2.m(((TLRPC.TL_messages_stickerSet) this.sets.get(iM)).set.id, tL_messages_reorderStickerSets.order, iM, 1);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new LinkManager$$ExternalSyntheticLambda3(this, 29));
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
            if (SharedConfig.updateStickersOrderOnSend) {
                SharedConfig.toggleUpdateStickersOrderOnSend();
                BulletinFactory.of(this).createSimpleBulletin(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).show();
                this.listView.adapter.update(true);
            }
        }
    }

    public final void setQuickReactionImage(View view) {
        if (view instanceof TextSettingsCell) {
            TextSettingsCell textSettingsCell = (TextSettingsCell) view;
            String doubleTapReaction = MediaDataController.getInstance(this.currentAccount).getDoubleTapReaction();
            if (doubleTapReaction != null) {
                if (doubleTapReaction.startsWith("animated_")) {
                    try {
                        AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(this.currentAccount, Long.parseLong(doubleTapReaction.substring(9)), null, 2);
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

    public final void toggleSelected(StickerSetCell stickerSetCell) {
        TLRPC.TL_messages_stickerSet stickersSet = stickerSetCell.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        HashSet hashSet = this.selectedSets;
        if (hashSet.contains(Long.valueOf(stickersSet.set.id))) {
            hashSet.remove(Long.valueOf(stickersSet.set.id));
            stickerSetCell.setChecked(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.id));
            stickerSetCell.setChecked(true, true);
        }
        this.listView.adapter.update(true);
        checkActionMode();
    }

    public final void whenReordered$2(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Object obj2 = ((UItem) obj).object;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        this.sets = arrayList2;
        this.needReorder = true;
        Collections.sort(MediaDataController.getInstance(this.currentAccount).getStickerSets(this.currentType), new TableModel$$ExternalSyntheticLambda0(this, 11));
        StickersActivity$$ExternalSyntheticLambda5 stickersActivity$$ExternalSyntheticLambda5 = this.sendReorderRunnable;
        AndroidUtilities.cancelRunOnUIThread(stickersActivity$$ExternalSyntheticLambda5);
        AndroidUtilities.runOnUIThread(stickersActivity$$ExternalSyntheticLambda5, 1000L);
    }
}
