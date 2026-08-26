package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BlurredFrameLayout;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ProfileGooeyView$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda22;
import org.telegram.ui.Stories.StoriesController;

public abstract class ProfileStoriesCollectionTabs extends BlurredFrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final Adapter adapter;
    public final Rect clipRect;
    public final StoriesController.StoriesCollections collections;
    public int initialAlbumId;
    public boolean reorderingCollections;
    public final ProfileActivity$9$$ExternalSyntheticLambda1 sendCollectionsOrder;
    public final ViewPagerFixed.AnonymousClass3 tabsView;
    public final AnonymousClass1 viewPager;
    public ValueAnimator visibilityAnimator;
    public float visibilityFactor;
    public boolean visibilityValue;

    public ProfileStoriesCollectionTabs(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, StoriesController.StoriesCollections storiesCollections, final SharedMediaLayout.AnonymousClass14 anonymousClass14) {
        super(context, sizeNotifierFrameLayout);
        this.clipRect = new Rect();
        this.collections = storiesCollections;
        Objects.requireNonNull(storiesCollections);
        this.sendCollectionsOrder = new ProfileActivity$9$$ExternalSyntheticLambda1(storiesCollections, 5);
        SharedMediaLayout.AnonymousClass15 anonymousClass15 = (SharedMediaLayout.AnonymousClass15) this;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(anonymousClass15, context, anonymousClass14);
        this.viewPager = anonymousClass1;
        anonymousClass1.setAllowDisallowInterceptTouch(true);
        Adapter adapter = new Adapter(anonymousClass15);
        this.adapter = adapter;
        adapter.canCreateNewAlbum = storiesCollections.canCreateNewAlbum();
        anonymousClass1.setAdapter(adapter);
        anonymousClass1.setTranslationY(AndroidUtilities.dp(42.0f));
        ViewPagerFixed.AnonymousClass3 anonymousClass3CreateTabsView = anonymousClass1.createTabsView(10, true);
        this.tabsView = anonymousClass3CreateTabsView;
        int i = Theme.key_profile_tabSelectedLine;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        int i3 = Theme.key_profile_tabText;
        int i4 = Theme.key_profile_tabSelector;
        int i5 = Theme.key_actionBarDefault;
        anonymousClass3CreateTabsView.tabLineColorKey = i;
        anonymousClass3CreateTabsView.activeTextColorKey = i2;
        anonymousClass3CreateTabsView.unactiveTextColorKey = i3;
        anonymousClass3CreateTabsView.selectorColorKey = i4;
        anonymousClass3CreateTabsView.backgroundColorKey = i5;
        anonymousClass3CreateTabsView.selectorDrawable.setColor(Theme.getColor(i, anonymousClass3CreateTabsView.resourcesProvider));
        anonymousClass3CreateTabsView.tabMarginDp = 12;
        final SharedMediaLayout.AnonymousClass15 anonymousClass16 = (SharedMediaLayout.AnonymousClass15) this;
        final int i6 = 0;
        anonymousClass3CreateTabsView.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                switch (i6) {
                    case 0:
                        if (anonymousClass16.reorderingCollections) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() != -1) {
                            return Boolean.FALSE;
                        }
                        SharedMediaLayout.AnonymousClass14 anonymousClass17 = anonymousClass14;
                        ProfileGooeyView$$ExternalSyntheticLambda0 profileGooeyView$$ExternalSyntheticLambda0 = new ProfileGooeyView$$ExternalSyntheticLambda0(anonymousClass17, 24);
                        AlertsCreator.createStoriesAlbumEnterNameForCreate(anonymousClass17.val$context, anonymousClass17.val$parent, anonymousClass17.val$resourcesProvider, profileGooeyView$$ExternalSyntheticLambda0);
                        return Boolean.TRUE;
                    default:
                        View view = (View) obj2;
                        SharedMediaLayout.AnonymousClass15 anonymousClass18 = anonymousClass16;
                        if (num.intValue() == -1 || num.intValue() == 0 || anonymousClass18.reorderingCollections) {
                            return Boolean.FALSE;
                        }
                        final SharedMediaLayout.AnonymousClass14 anonymousClass19 = anonymousClass14;
                        final int iIntValue = num.intValue();
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        StoriesController storiesController = sharedMediaLayout.getStoriesController();
                        long clientUserId = UserConfig.getInstance(storiesController.currentAccount).getClientUserId();
                        long j = sharedMediaLayout.dialog_id;
                        if (clientUserId == j || storiesController.canEditStories(j)) {
                            BaseFragment baseFragment = sharedMediaLayout.profileActivity;
                            ItemOptions itemOptions = new ItemOptions(baseFragment, view, false, true);
                            itemOptions.setScrimViewBackground(new ProfileGiftsContainer.AnonymousClass3(anonymousClass19));
                            final int i7 = 0;
                            itemOptions.add(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i7) {
                                        case 0:
                                            SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                            sharedMediaLayout2.openAddStoriesToAlbumSheet(sharedMediaLayout2.profileActivity, sharedMediaLayout2.dialog_id, iIntValue);
                                            break;
                                        case 1:
                                            SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                            sharedMediaLayout3.openRenameStoriesAlbumAlert(sharedMediaLayout3.profileActivity, sharedMediaLayout3.dialog_id, iIntValue);
                                            break;
                                        case 2:
                                            SharedMediaLayout.this.startAlbumsReorder(iIntValue);
                                            break;
                                        default:
                                            SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                            sharedMediaLayout4.openDeleteStoriesAlbumAlert(sharedMediaLayout4.profileActivity, sharedMediaLayout4.dialog_id, iIntValue);
                                            break;
                                    }
                                }
                            }, false);
                            sharedMediaLayout.addStoryAlbumShareItemOptions(baseFragment, sharedMediaLayout.dialog_id, iIntValue, itemOptions);
                            final int i8 = 1;
                            itemOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i8) {
                                        case 0:
                                            SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                            sharedMediaLayout2.openAddStoriesToAlbumSheet(sharedMediaLayout2.profileActivity, sharedMediaLayout2.dialog_id, iIntValue);
                                            break;
                                        case 1:
                                            SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                            sharedMediaLayout3.openRenameStoriesAlbumAlert(sharedMediaLayout3.profileActivity, sharedMediaLayout3.dialog_id, iIntValue);
                                            break;
                                        case 2:
                                            SharedMediaLayout.this.startAlbumsReorder(iIntValue);
                                            break;
                                        default:
                                            SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                            sharedMediaLayout4.openDeleteStoriesAlbumAlert(sharedMediaLayout4.profileActivity, sharedMediaLayout4.dialog_id, iIntValue);
                                            break;
                                    }
                                }
                            }, false);
                            final int i9 = 2;
                            itemOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i9) {
                                        case 0:
                                            SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                            sharedMediaLayout2.openAddStoriesToAlbumSheet(sharedMediaLayout2.profileActivity, sharedMediaLayout2.dialog_id, iIntValue);
                                            break;
                                        case 1:
                                            SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                            sharedMediaLayout3.openRenameStoriesAlbumAlert(sharedMediaLayout3.profileActivity, sharedMediaLayout3.dialog_id, iIntValue);
                                            break;
                                        case 2:
                                            SharedMediaLayout.this.startAlbumsReorder(iIntValue);
                                            break;
                                        default:
                                            SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                            sharedMediaLayout4.openDeleteStoriesAlbumAlert(sharedMediaLayout4.profileActivity, sharedMediaLayout4.dialog_id, iIntValue);
                                            break;
                                    }
                                }
                            }, false);
                            final int i10 = 3;
                            itemOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                            sharedMediaLayout2.openAddStoriesToAlbumSheet(sharedMediaLayout2.profileActivity, sharedMediaLayout2.dialog_id, iIntValue);
                                            break;
                                        case 1:
                                            SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                            sharedMediaLayout3.openRenameStoriesAlbumAlert(sharedMediaLayout3.profileActivity, sharedMediaLayout3.dialog_id, iIntValue);
                                            break;
                                        case 2:
                                            SharedMediaLayout.this.startAlbumsReorder(iIntValue);
                                            break;
                                        default:
                                            SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                            sharedMediaLayout4.openDeleteStoriesAlbumAlert(sharedMediaLayout4.profileActivity, sharedMediaLayout4.dialog_id, iIntValue);
                                            break;
                                    }
                                }
                            }, true);
                            itemOptions.show();
                        }
                        return Boolean.TRUE;
                }
            }
        });
        final int i7 = 1;
        anonymousClass3CreateTabsView.setOnTabLongClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                switch (i7) {
                    case 0:
                        if (anonymousClass16.reorderingCollections) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() != -1) {
                            return Boolean.FALSE;
                        }
                        SharedMediaLayout.AnonymousClass14 anonymousClass17 = anonymousClass14;
                        ProfileGooeyView$$ExternalSyntheticLambda0 profileGooeyView$$ExternalSyntheticLambda0 = new ProfileGooeyView$$ExternalSyntheticLambda0(anonymousClass17, 24);
                        AlertsCreator.createStoriesAlbumEnterNameForCreate(anonymousClass17.val$context, anonymousClass17.val$parent, anonymousClass17.val$resourcesProvider, profileGooeyView$$ExternalSyntheticLambda0);
                        return Boolean.TRUE;
                    default:
                        View view = (View) obj2;
                        SharedMediaLayout.AnonymousClass15 anonymousClass18 = anonymousClass16;
                        if (num.intValue() == -1 || num.intValue() == 0 || anonymousClass18.reorderingCollections) {
                            return Boolean.FALSE;
                        }
                        final SharedMediaLayout.AnonymousClass14 anonymousClass19 = anonymousClass14;
                        final int iIntValue = num.intValue();
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        StoriesController storiesController = sharedMediaLayout.getStoriesController();
                        long clientUserId = UserConfig.getInstance(storiesController.currentAccount).getClientUserId();
                        long j = sharedMediaLayout.dialog_id;
                        if (clientUserId == j || storiesController.canEditStories(j)) {
                            BaseFragment baseFragment = sharedMediaLayout.profileActivity;
                            ItemOptions itemOptions = new ItemOptions(baseFragment, view, false, true);
                            itemOptions.setScrimViewBackground(new ProfileGiftsContainer.AnonymousClass3(anonymousClass19));
                            final int i8 = 0;
                            itemOptions.add(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i8) {
                                        case 0:
                                            SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                            sharedMediaLayout2.openAddStoriesToAlbumSheet(sharedMediaLayout2.profileActivity, sharedMediaLayout2.dialog_id, iIntValue);
                                            break;
                                        case 1:
                                            SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                            sharedMediaLayout3.openRenameStoriesAlbumAlert(sharedMediaLayout3.profileActivity, sharedMediaLayout3.dialog_id, iIntValue);
                                            break;
                                        case 2:
                                            SharedMediaLayout.this.startAlbumsReorder(iIntValue);
                                            break;
                                        default:
                                            SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                            sharedMediaLayout4.openDeleteStoriesAlbumAlert(sharedMediaLayout4.profileActivity, sharedMediaLayout4.dialog_id, iIntValue);
                                            break;
                                    }
                                }
                            }, false);
                            sharedMediaLayout.addStoryAlbumShareItemOptions(baseFragment, sharedMediaLayout.dialog_id, iIntValue, itemOptions);
                            final int i9 = 1;
                            itemOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i9) {
                                        case 0:
                                            SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                            sharedMediaLayout2.openAddStoriesToAlbumSheet(sharedMediaLayout2.profileActivity, sharedMediaLayout2.dialog_id, iIntValue);
                                            break;
                                        case 1:
                                            SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                            sharedMediaLayout3.openRenameStoriesAlbumAlert(sharedMediaLayout3.profileActivity, sharedMediaLayout3.dialog_id, iIntValue);
                                            break;
                                        case 2:
                                            SharedMediaLayout.this.startAlbumsReorder(iIntValue);
                                            break;
                                        default:
                                            SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                            sharedMediaLayout4.openDeleteStoriesAlbumAlert(sharedMediaLayout4.profileActivity, sharedMediaLayout4.dialog_id, iIntValue);
                                            break;
                                    }
                                }
                            }, false);
                            final int i10 = 2;
                            itemOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                            sharedMediaLayout2.openAddStoriesToAlbumSheet(sharedMediaLayout2.profileActivity, sharedMediaLayout2.dialog_id, iIntValue);
                                            break;
                                        case 1:
                                            SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                            sharedMediaLayout3.openRenameStoriesAlbumAlert(sharedMediaLayout3.profileActivity, sharedMediaLayout3.dialog_id, iIntValue);
                                            break;
                                        case 2:
                                            SharedMediaLayout.this.startAlbumsReorder(iIntValue);
                                            break;
                                        default:
                                            SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                            sharedMediaLayout4.openDeleteStoriesAlbumAlert(sharedMediaLayout4.profileActivity, sharedMediaLayout4.dialog_id, iIntValue);
                                            break;
                                    }
                                }
                            }, false);
                            final int i11 = 3;
                            itemOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                            sharedMediaLayout2.openAddStoriesToAlbumSheet(sharedMediaLayout2.profileActivity, sharedMediaLayout2.dialog_id, iIntValue);
                                            break;
                                        case 1:
                                            SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                            sharedMediaLayout3.openRenameStoriesAlbumAlert(sharedMediaLayout3.profileActivity, sharedMediaLayout3.dialog_id, iIntValue);
                                            break;
                                        case 2:
                                            SharedMediaLayout.this.startAlbumsReorder(iIntValue);
                                            break;
                                        default:
                                            SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                            sharedMediaLayout4.openDeleteStoriesAlbumAlert(sharedMediaLayout4.profileActivity, sharedMediaLayout4.dialog_id, iIntValue);
                                            break;
                                    }
                                }
                            }, true);
                            itemOptions.show();
                        }
                        return Boolean.TRUE;
                }
            }
        });
        addView(anonymousClass3CreateTabsView, LayoutHelper.createFrame(-1, 42, 48));
        setVisibility$1(!storiesCollections.collections.isEmpty(), false, true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long jLongValue = ((Long) objArr[0]).longValue();
            StoriesController.StoriesCollections storiesCollections = this.collections;
            if (jLongValue != storiesCollections.dialogId) {
                return;
            }
            ViewPagerFixed.AnonymousClass3 anonymousClass3 = this.tabsView;
            int currentTabId = anonymousClass3 != null ? anonymousClass3.getCurrentTabId() : 0;
            boolean zCanCreateNewAlbum = storiesCollections.canCreateNewAlbum();
            Adapter adapter = this.adapter;
            adapter.canCreateNewAlbum = zCanCreateNewAlbum;
            this.viewPager.fillTabs$1(true);
            setVisibility$1(!storiesCollections.collections.isEmpty(), true, false);
            int i3 = this.initialAlbumId;
            if (i3 > 0) {
                if (adapter.getItemPosition(i3) != -1) {
                    AndroidUtilities.runOnUIThread(new ProfileStoriesCollectionTabs$$ExternalSyntheticLambda0(this, this.initialAlbumId, 1), 500L);
                    this.initialAlbumId = 0;
                    return;
                }
                return;
            }
            if (anonymousClass3 == null || currentTabId <= 0 || storiesCollections.findById(currentTabId) != null) {
                return;
            }
            anonymousClass3.scrollToTab(0, 0);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.visibilityValue && super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentAlbumId() {
        return this.adapter.getItemId(this.tabsView.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.visibilityFactor;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.visibilityFactor;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.collections.currentAccount).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.collections.currentAccount).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.clipRect;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
    }

    public abstract void onVisibilityChange();

    public void setInitialTabId(int i) {
        if (this.adapter.getItemPosition(i) != -1) {
            AndroidUtilities.runOnUIThread(new ProfileStoriesCollectionTabs$$ExternalSyntheticLambda0(this, i, 0), 500L);
        } else {
            this.initialAlbumId = i;
        }
    }

    public void setReorderingAlbums(boolean z) {
        if (this.reorderingCollections == z) {
            return;
        }
        this.reorderingCollections = z;
        ViewPagerFixed.AnonymousClass3 anonymousClass3 = this.tabsView;
        anonymousClass3.setReordering(z);
        boolean z2 = this.reorderingCollections;
        SharedMediaLayout.AnonymousClass15 anonymousClass15 = (SharedMediaLayout.AnonymousClass15) this;
        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
        TextView textView = sharedMediaLayout.saveItem;
        textView.setVisibility(0);
        textView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.4f).scaleY(z2 ? 1.0f : 0.4f).withEndAction(new FileLoader$$ExternalSyntheticLambda1(24, anonymousClass15, z2)).start();
        sharedMediaLayout.updateOptionsSearch(true);
        if (z) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment instanceof ProfileActivity) {
                ((ProfileActivity) safeLastFragment).scrollToSharedMedia(false);
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda22((ProfileActivity) safeLastFragment, 1));
            }
        }
        if (z) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.sendCollectionsOrder);
        StoriesController.StoriesCollections storiesCollections = this.collections;
        storiesCollections.sendOrder();
        storiesCollections.updateAlbumsListCache(false);
        int currentPosition = anonymousClass3.getCurrentPosition();
        Adapter adapter = this.adapter;
        int itemId = adapter.getItemId(currentPosition);
        this.viewPager.fillTabs$1(true);
        int itemPosition = adapter.getItemPosition(itemId);
        anonymousClass3.selectTab(0.0f, itemPosition, itemPosition);
    }

    public final void setVisibility$1(boolean z, boolean z2, boolean z3) {
        if (this.visibilityValue != z || z3) {
            this.visibilityValue = z;
            setEnabled(z);
            ValueAnimator valueAnimator = this.visibilityAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.visibilityAnimator = null;
            }
            if (!z2) {
                this.visibilityFactor = z ? 1.0f : 0.0f;
                onVisibilityChange();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.visibilityFactor, z ? 1.0f : 0.0f);
            this.visibilityAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(480L);
            this.visibilityAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.visibilityAnimator.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 29));
            this.visibilityAnimator.start();
        }
    }

    public final class AnonymousClass1 extends ViewPagerFixed {
        public final int $r8$classId = 1;
        public final FrameLayout this$0;
        public Object val$delegate;

        public AnonymousClass1(SharedMediaLayout.AnonymousClass12 anonymousClass12, Context context) {
            super(context, null);
            this.this$0 = anonymousClass12;
        }

        @Override
        public boolean canScroll(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 1:
                    return !SharedMediaLayout.this.isActionModeShowed;
                default:
                    return super.canScroll(motionEvent);
            }
        }

        @Override
        public final void onTabAnimationUpdate(boolean z) {
            switch (this.$r8$classId) {
                case 0:
                    SharedMediaLayout.this.onPageMediaProgress(((SharedMediaLayout.AnonymousClass15) this.this$0).tabsView.getAnimatingIndicatorProgress());
                    break;
                default:
                    SharedMediaLayout.AnonymousClass12 anonymousClass12 = (SharedMediaLayout.AnonymousClass12) this.this$0;
                    String currentLang = anonymousClass12.getCurrentLang();
                    if (!TextUtils.equals((String) this.val$delegate, currentLang)) {
                        this.val$delegate = currentLang;
                        SharedMediaLayout.this.onSelectedTabChanged();
                    }
                    break;
            }
        }

        @Override
        public void onTabPageSelected(int i) {
            switch (this.$r8$classId) {
                case 1:
                    SharedMediaLayout.AnonymousClass12 anonymousClass12 = (SharedMediaLayout.AnonymousClass12) this.this$0;
                    String currentLang = anonymousClass12.getCurrentLang();
                    if (!TextUtils.equals((String) this.val$delegate, currentLang)) {
                        this.val$delegate = currentLang;
                        SharedMediaLayout.this.onSelectedTabChanged();
                    }
                    break;
            }
        }

        @Override
        public final void onTabScrollEnd(int i) {
            switch (this.$r8$classId) {
                case 0:
                    ((SharedMediaLayout.AnonymousClass15) this.this$0).tabsView.positionToId.get(i, -1);
                    SharedMediaLayout.this.onPageMediaProgress(1.0f);
                    break;
                default:
                    SharedMediaLayout.AnonymousClass12 anonymousClass12 = (SharedMediaLayout.AnonymousClass12) this.this$0;
                    String currentLang = anonymousClass12.getCurrentLang();
                    if (!TextUtils.equals((String) this.val$delegate, currentLang)) {
                        this.val$delegate = currentLang;
                        SharedMediaLayout.this.onSelectedTabChanged();
                    }
                    break;
            }
        }

        public AnonymousClass1(SharedMediaLayout.AnonymousClass15 anonymousClass15, Context context, SharedMediaLayout.AnonymousClass14 anonymousClass14) {
            super(context, null);
            this.this$0 = anonymousClass15;
            this.val$delegate = anonymousClass14;
        }

        @Override
        public void onTabPageSelected(int i, boolean z) {
            switch (this.$r8$classId) {
                case 0:
                    int i2 = ((SharedMediaLayout.AnonymousClass15) this.this$0).tabsView.positionToId.get(i, -1);
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    if (i2 <= 0) {
                        SharedMediaLayout.MediaPage[] mediaPageArr = sharedMediaLayout.mediaPages;
                        if (mediaPageArr[0].selectedType != 8) {
                            SharedMediaLayout.MediaPage mediaPage = mediaPageArr[1];
                            mediaPage.selectedType = 8;
                            mediaPage.setVisibility(0);
                            sharedMediaLayout.hideFloatingDateView$2();
                            sharedMediaLayout.switchToCurrentSelectedMode(true);
                            sharedMediaLayout.animatingForward = z;
                            sharedMediaLayout.onSelectedTabChanged();
                            sharedMediaLayout.animateSearchToOptions(!sharedMediaLayout.isSearchItemVisible(8), true);
                            sharedMediaLayout.updateOptionsSearch(true);
                            break;
                        }
                    } else {
                        SharedMediaLayout.StoryAlbumData storyAlbumDataStoryAlbums_getByAlbumId = sharedMediaLayout.storyAlbums_getByAlbumId(i2);
                        SharedMediaLayout.MediaPage[] mediaPageArr2 = sharedMediaLayout.mediaPages;
                        int i3 = mediaPageArr2[0].selectedType;
                        int i4 = storyAlbumDataStoryAlbums_getByAlbumId.tabType;
                        if (i3 != i4) {
                            SharedMediaLayout.MediaPage mediaPage2 = mediaPageArr2[1];
                            mediaPage2.selectedType = i4;
                            mediaPage2.setVisibility(0);
                            sharedMediaLayout.hideFloatingDateView$2();
                            sharedMediaLayout.switchToCurrentSelectedMode(true);
                            sharedMediaLayout.animatingForward = z;
                            sharedMediaLayout.onSelectedTabChanged();
                            sharedMediaLayout.animateSearchToOptions(!sharedMediaLayout.isSearchItemVisible(i4), true);
                            sharedMediaLayout.updateOptionsSearch(true);
                            break;
                        }
                    }
                    break;
                default:
                    super.onTabPageSelected(i, z);
                    break;
            }
        }
    }

    public final class Adapter extends ViewPagerFixed.Adapter {
        public boolean canCreateNewAlbum;
        public final SharedMediaLayout.AnonymousClass15 this$0;

        public Adapter(SharedMediaLayout.AnonymousClass15 anonymousClass15) {
            this.this$0 = anonymousClass15;
        }

        @Override
        public final void applyReorder(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                if (iIntValue != -1 && iIntValue != -2 && iIntValue != 0) {
                    arrayList2.add(num);
                }
            }
            SharedMediaLayout.AnonymousClass15 anonymousClass15 = this.this$0;
            ViewPagerFixed.AnonymousClass3 anonymousClass3 = anonymousClass15.tabsView;
            int itemId = getItemId(anonymousClass3.getCurrentPosition());
            StoriesController.StoriesCollections storiesCollections = anonymousClass15.collections;
            storiesCollections.getClass();
            HashMap map = new HashMap();
            ArrayList arrayList3 = storiesCollections.collections;
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                StoriesController.StoryAlbum storyAlbum = (StoriesController.StoryAlbum) obj2;
                map.put(Integer.valueOf(storyAlbum.album_id), storyAlbum);
            }
            ArrayList arrayList4 = new ArrayList();
            int size3 = arrayList2.size();
            while (i < size3) {
                Object obj3 = arrayList2.get(i);
                i++;
                Integer num2 = (Integer) obj3;
                num2.getClass();
                StoriesController.StoryAlbum storyAlbum2 = (StoriesController.StoryAlbum) map.get(num2);
                if (storyAlbum2 != null) {
                    arrayList4.add(storyAlbum2);
                }
            }
            arrayList3.clear();
            arrayList3.addAll(arrayList4);
            if (itemId >= 0) {
                int itemPosition = getItemPosition(itemId);
                anonymousClass3.selectTab(0.0f, itemPosition, itemPosition);
            }
            ProfileActivity$9$$ExternalSyntheticLambda1 profileActivity$9$$ExternalSyntheticLambda1 = anonymousClass15.sendCollectionsOrder;
            AndroidUtilities.cancelRunOnUIThread(profileActivity$9$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(profileActivity$9$$ExternalSyntheticLambda1, 1000L);
        }

        @Override
        public final boolean canReorder(int i) {
            if (i == 0) {
                return false;
            }
            return (this.canCreateNewAlbum && i == getItemCount() - 1) ? false : true;
        }

        @Override
        public final View createView(int i) {
            if (i == -1) {
                return null;
            }
            return new View(this.this$0.getContext());
        }

        @Override
        public final int getItemCount() {
            return this.this$0.collections.collections.size() + 1 + (this.canCreateNewAlbum ? 1 : 0);
        }

        @Override
        public final int getItemId(int i) {
            if (i == 0) {
                return 0;
            }
            if (this.canCreateNewAlbum && i == getItemCount() - 1) {
                return -1;
            }
            return ((StoriesController.StoryAlbum) this.this$0.collections.collections.get(i - 1)).album_id;
        }

        public final int getItemPosition(int i) {
            if (i == 0) {
                return 0;
            }
            int iIndexOf = this.this$0.collections.indexOf(i);
            if (iIndexOf == -1) {
                return -1;
            }
            return iIndexOf + 1;
        }

        @Override
        public final CharSequence getItemTitle(int i) {
            if (i == 0) {
                return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
            }
            if (!this.canCreateNewAlbum || i != getItemCount() - 1) {
                return ((StoriesController.StoryAlbum) this.this$0.collections.collections.get(i - 1)).title;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.poll_add_plus);
            coloredImageSpan.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
            return spannableStringBuilder;
        }

        @Override
        public final int getItemViewType(int i) {
            if (this.canCreateNewAlbum && i == getItemCount() - 1) {
                return -1;
            }
            return i;
        }

        @Override
        public final void bindView(View view, int i, int i2) {
        }
    }
}
