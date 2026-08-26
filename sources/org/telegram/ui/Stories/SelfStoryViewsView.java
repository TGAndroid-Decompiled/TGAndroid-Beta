package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.iv.RichMediaCell$$ExternalSyntheticLambda1;

public final class SelfStoryViewsView extends FrameLayout {
    public float bottomPadding;
    public long dialogId;
    public final ArrayList itemViews;
    public int keyboardHeight;
    public boolean listenPager;
    public float maxSelfStoriesViewsOffset;
    public final AnonymousClass4 pagerAdapter;
    public float progressToKeyboard;
    public float progressToOpen;
    public final AnonymousClass1 selfStoriesPreviewView;
    public float selfStoriesViewsOffset;
    public final Drawable shadowDrawable;
    public final SelfStoryViewsPage.FiltersState sharedFilterState;
    public final ArrayList storyItems;
    public final StoryViewer storyViewer;
    public float toHeight;
    public float toY;
    public final AnonymousClass2 viewPager;
    public final ContainerView viewPagerContainer;

    public final class AnonymousClass1 extends SelfStoriesPreviewView {
        public final SelfStoryViewsView this$0;
        public final StoryViewer val$storyViewer;

        public AnonymousClass1(Context context, SelfStoryViewsView selfStoryViewsView, StoryViewer storyViewer) {
            super(context);
            this.this$0 = selfStoryViewsView;
            this.val$storyViewer = storyViewer;
        }

        @Override
        public final void onClosestPositionChanged(int i) {
            StoryViewer.PlaceProvider placeProvider;
            SelfStoryViewsView selfStoryViewsView = this.this$0;
            if (selfStoryViewsView.listenPager) {
                return;
            }
            AnonymousClass2 anonymousClass2 = selfStoryViewsView.viewPager;
            if (anonymousClass2.getCurrentItem() != i) {
                try {
                    anonymousClass2.setCurrentItem(i, false);
                } catch (Throwable th) {
                    FileLog.e(th);
                    anonymousClass2.getAdapter().notifyDataSetChanged();
                    anonymousClass2.setCurrentItem(i, false);
                }
            }
            StoryViewer storyViewer = this.val$storyViewer;
            if (storyViewer.storiesList == null || (placeProvider = storyViewer.placeProvider) == null) {
                return;
            }
            if (i < 10) {
                placeProvider.loadNext(false);
            } else if (i >= this.storyItems.size() - 10) {
                storyViewer.placeProvider.loadNext(true);
            }
        }
    }

    public final class AnonymousClass2 extends ViewPager {
        public boolean gesturesEnabled;
        public final SelfStoryViewsView this$0$1;

        public AnonymousClass2(Context context) {
            super(context);
            this.this$0$1 = SelfStoryViewsView.this;
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getY() >= SelfStoryViewsView.this.getCurrentTopOffset() || motionEvent.getAction() != 0) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return false;
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            float y = motionEvent.getY();
            SelfStoryViewsView selfStoryViewsView = SelfStoryViewsView.this;
            if (y < selfStoryViewsView.getCurrentTopOffset() || Math.abs(selfStoryViewsView.getCurrentTopOffset() - selfStoryViewsView.bottomPadding) > AndroidUtilities.dp(1.0f)) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                this.gesturesEnabled = true;
            }
            if (!this.gesturesEnabled || this.this$0$1.keyboardHeight > 0) {
                return false;
            }
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
                return false;
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            float y = motionEvent.getY();
            SelfStoryViewsView selfStoryViewsView = SelfStoryViewsView.this;
            if (y < selfStoryViewsView.getCurrentTopOffset() || Math.abs(selfStoryViewsView.getCurrentTopOffset() - selfStoryViewsView.bottomPadding) > AndroidUtilities.dp(1.0f)) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                this.gesturesEnabled = true;
            }
            if (!this.gesturesEnabled || this.this$0$1.keyboardHeight > 0) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public final class AnonymousClass4 extends PagerAdapter {
        public final SelfStoryViewsView this$0;
        public final Context val$context;
        public final StoryViewer val$storyViewer;

        public final class AnonymousClass1 extends SelfStoryViewsPage {
            public AnonymousClass1(StoryViewer storyViewer, Context context, SelfStoryViewsPage.FiltersState filtersState, PeerStoriesView$$ExternalSyntheticLambda27 peerStoriesView$$ExternalSyntheticLambda27) {
                super(storyViewer, context, filtersState, peerStoriesView$$ExternalSyntheticLambda27);
            }
        }

        public AnonymousClass4(Context context, SelfStoryViewsView selfStoryViewsView, StoryViewer storyViewer) {
            this.this$0 = selfStoryViewsView;
            this.val$storyViewer = storyViewer;
            this.val$context = context;
        }

        @Override
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            this.this$0.itemViews.remove(obj);
        }

        @Override
        public final int getCount() {
            return this.this$0.storyItems.size();
        }

        @Override
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            SelfStoryViewsView selfStoryViewsView = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.val$storyViewer, this.val$context, selfStoryViewsView.sharedFilterState, new PeerStoriesView$$ExternalSyntheticLambda27(this, 2));
            anonymousClass1.setTag(Integer.valueOf(i));
            anonymousClass1.setShadowDrawable(selfStoryViewsView.shadowDrawable);
            anonymousClass1.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            long j = selfStoryViewsView.dialogId;
            StoryItemInternal storyItemInternal = (StoryItemInternal) selfStoryViewsView.storyItems.get(i);
            anonymousClass1.dialogId = j;
            anonymousClass1.storyItem = storyItemInternal;
            anonymousClass1.updateViewsVisibility();
            anonymousClass1.updateViewState(false);
            if (storyItemInternal != null && storyItemInternal.storyItem != null) {
                NotificationsController.getInstance(anonymousClass1.currentAccount).processSeenStoryReactions(j, storyItemInternal.storyItem.id);
            }
            anonymousClass1.setListBottomPadding(selfStoryViewsView.bottomPadding);
            viewGroup.addView(anonymousClass1);
            selfStoryViewsView.itemViews.add(anonymousClass1);
            return anonymousClass1;
        }

        @Override
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public final class ContainerView extends FrameLayout implements NestedScrollingParent3 {
        public final NestedScrollingParentHelper nestedScrollingParentHelper;

        public ContainerView(Context context) {
            super(context);
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper();
        }

        @Override
        public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
            SelfStoryViewsView selfStoryViewsView = SelfStoryViewsView.this;
            if (selfStoryViewsView.keyboardHeight > 0) {
                return;
            }
            StoryViewer storyViewer = selfStoryViewsView.storyViewer;
            float f = storyViewer.selfStoriesViewsOffset;
            float f2 = selfStoryViewsView.maxSelfStoriesViewsOffset;
            if (f >= f2 || i2 <= 0) {
                return;
            }
            float f3 = f + i2;
            iArr[1] = i2;
            if (f3 <= f2) {
                f2 = f3;
            }
            selfStoryViewsView.setOffset(f2);
            storyViewer.selfStoriesViewsOffset = f2;
            PeerStoriesView currentPeerView = storyViewer.storiesViewPager.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            StoryViewer.AnonymousClass3 anonymousClass3 = storyViewer.containerView;
            if (anonymousClass3 != null) {
                anonymousClass3.invalidate();
            }
        }

        @Override
        public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        }

        @Override
        public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            this.nestedScrollingParentHelper.mNestedScrollAxesTouch = i;
        }

        @Override
        public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            return SelfStoryViewsView.this.keyboardHeight <= 0 && i == 2;
        }

        @Override
        public final void onStopNestedScroll(View view, int i) {
            this.nestedScrollingParentHelper.mNestedScrollAxesTouch = 0;
        }

        @Override
        public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            SelfStoryViewsView selfStoryViewsView = SelfStoryViewsView.this;
            if (selfStoryViewsView.keyboardHeight <= 0 && i4 != 0 && i2 == 0) {
                StoryViewer storyViewer = selfStoryViewsView.storyViewer;
                float f = storyViewer.selfStoriesViewsOffset;
                float f2 = i4 + f;
                if (f2 <= f) {
                    f = f2;
                }
                selfStoryViewsView.setOffset(f);
                storyViewer.selfStoriesViewsOffset = f;
                PeerStoriesView currentPeerView = storyViewer.storiesViewPager.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                StoryViewer.AnonymousClass3 anonymousClass3 = storyViewer.containerView;
                if (anonymousClass3 != null) {
                    anonymousClass3.invalidate();
                }
            }
        }
    }

    public final class StoryItemInternal {
        public TL_stories.StoryItem storyItem;
        public StoriesController.UploadingStory uploadingStory;
    }

    public SelfStoryViewsView(Context context, StoryViewer storyViewer) {
        super(context);
        this.storyItems = new ArrayList();
        this.itemViews = new ArrayList();
        this.sharedFilterState = new SelfStoryViewsPage.FiltersState();
        DarkThemeResourceProvider darkThemeResourceProvider = storyViewer.resourcesProvider;
        this.storyViewer = storyViewer;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext(), this, storyViewer);
        this.selfStoriesPreviewView = anonymousClass1;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, darkThemeResourceProvider), PorterDuff.Mode.MULTIPLY));
        ContainerView containerView = new ContainerView(context);
        this.viewPagerContainer = containerView;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
        this.viewPager = anonymousClass2;
        anonymousClass2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public final void onPageScrollStateChanged(int i) {
                SelfStoryViewsView selfStoryViewsView = SelfStoryViewsView.this;
                selfStoryViewsView.getClass();
                if (i == 1) {
                    selfStoryViewsView.listenPager = true;
                }
            }

            @Override
            public final void onPageScrolled(int i, float f, int i2) {
                float f2;
                SelfStoryViewsView selfStoryViewsView = SelfStoryViewsView.this;
                if (selfStoryViewsView.listenPager) {
                    AnonymousClass1 anonymousClass3 = selfStoryViewsView.selfStoriesPreviewView;
                    anonymousClass3.scroller.abortAnimation();
                    if (Math.abs(f) > 1.0f) {
                        return;
                    }
                    ValueAnimator valueAnimator = anonymousClass3.scrollAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        anonymousClass3.scrollAnimator = null;
                    }
                    float f3 = (-anonymousClass3.getMeasuredWidth()) / 2.0f;
                    int i3 = anonymousClass3.viewW;
                    float f4 = (i3 / 2.0f) + f3 + ((i3 + anonymousClass3.childPadding) * i);
                    if (f > 0.0f) {
                        float f5 = (-anonymousClass3.getMeasuredWidth()) / 2.0f;
                        int i4 = anonymousClass3.viewW;
                        f2 = (i4 / 2.0f) + f5 + ((i + 1) * (i4 + anonymousClass3.childPadding));
                    } else {
                        float f6 = (-anonymousClass3.getMeasuredWidth()) / 2.0f;
                        int i5 = anonymousClass3.viewW;
                        f2 = (i5 / 2.0f) + f6 + ((i - 1) * (i5 + anonymousClass3.childPadding));
                        f = -f;
                    }
                    if (f == 0.0f) {
                        anonymousClass3.scrollX = f4;
                    } else {
                        anonymousClass3.scrollX = AndroidUtilities.lerp(f4, f2, f);
                    }
                    anonymousClass3.checkScroll = false;
                    anonymousClass3.invalidate();
                }
            }

            @Override
            public final void onPageSelected(int i) {
            }
        });
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, this, storyViewer);
        this.pagerAdapter = anonymousClass4;
        anonymousClass2.setAdapter(anonymousClass4);
        containerView.addView(anonymousClass2, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(anonymousClass1, LayoutHelper.createFrame(-1, -1.0f));
        addView(containerView);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f = this.bottomPadding;
        SelfStoryViewsPage currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f;
    }

    public SelfStoriesPreviewView.ImageHolder getCrossfadeToImage() {
        return this.selfStoriesPreviewView.getCenteredImageReciever();
    }

    public SelfStoryViewsPage getCurrentPage() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.itemViews;
            if (i >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((SelfStoryViewsPage) arrayList.get(i)).getTag()).intValue() == this.viewPager.getCurrentItem()) {
                return (SelfStoryViewsPage) arrayList.get(i);
            }
            i++;
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.selfStoriesPreviewView.getClosestPosition();
        if (closestPosition < 0) {
            return null;
        }
        ArrayList arrayList = this.storyItems;
        if (closestPosition >= arrayList.size()) {
            return null;
        }
        return ((StoryItemInternal) arrayList.get(closestPosition)).storyItem;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        int i4 = this.storyViewer.ATTACH_TO_FRAGMENT ? AndroidUtilities.statusBarHeight : 0;
        int size = View.MeasureSpec.getSize(i2);
        AnonymousClass1 anonymousClass1 = this.selfStoriesPreviewView;
        ((FrameLayout.LayoutParams) anonymousClass1.getLayoutParams()).topMargin = i4;
        this.toHeight = anonymousClass1.getFinalHeight();
        this.toY = AndroidUtilities.dp(20.0f) + i4;
        ((FrameLayout.LayoutParams) this.viewPagerContainer.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float fDp = (((AndroidUtilities.dp(20.0f) + i4) + this.toHeight) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.bottomPadding = fDp;
        this.maxSelfStoriesViewsOffset = size - fDp;
        while (true) {
            ArrayList arrayList = this.itemViews;
            if (i3 >= arrayList.size()) {
                super.onMeasure(i, i2);
                return;
            } else {
                ((SelfStoryViewsPage) arrayList.get(i3)).setListBottomPadding(this.bottomPadding);
                i3++;
            }
        }
    }

    public final void setItems(int i, long j, ArrayList arrayList) {
        ArrayList arrayList2 = this.storyItems;
        arrayList2.clear();
        this.dialogId = j;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i3);
            StoryItemInternal storyItemInternal = new StoryItemInternal();
            storyItemInternal.storyItem = storyItem;
            arrayList2.add(storyItemInternal);
        }
        ArrayList arrayList3 = (ArrayList) MessagesController.getInstance(this.storyViewer.currentAccount).storiesController.uploadingStoriesByDialogId.get(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (arrayList3 != null) {
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                StoriesController.UploadingStory uploadingStory = (StoriesController.UploadingStory) arrayList3.get(i4);
                StoryItemInternal storyItemInternal2 = new StoryItemInternal();
                storyItemInternal2.uploadingStory = uploadingStory;
                arrayList2.add(storyItemInternal2);
            }
        }
        AnonymousClass1 anonymousClass1 = this.selfStoriesPreviewView;
        anonymousClass1.storyItems.clear();
        ArrayList arrayList4 = anonymousClass1.storyItems;
        arrayList4.addAll(arrayList2);
        int measuredWidth = anonymousClass1.getMeasuredWidth();
        int i5 = anonymousClass1.viewW;
        anonymousClass1.minScroll = (-(measuredWidth - i5)) / 2.0f;
        anonymousClass1.maxScroll = ((anonymousClass1.getMeasuredWidth() - anonymousClass1.viewW) / 2.0f) + (((arrayList4.size() * (i5 + anonymousClass1.childPadding)) - anonymousClass1.childPadding) - anonymousClass1.getMeasuredWidth());
        if (anonymousClass1.getMeasuredHeight() > 0) {
            anonymousClass1.scrollToPosition(i, false, false);
        } else {
            anonymousClass1.scrollToPositionInLayout = i;
        }
        while (true) {
            ArrayList arrayList5 = anonymousClass1.lastDrawnImageReceivers;
            if (i2 >= arrayList5.size()) {
                AnonymousClass2 anonymousClass2 = this.viewPager;
                anonymousClass2.setAdapter(null);
                AnonymousClass4 anonymousClass4 = this.pagerAdapter;
                anonymousClass2.setAdapter(anonymousClass4);
                anonymousClass4.notifyDataSetChanged();
                anonymousClass2.setCurrentItem(i);
                return;
            }
            ((SelfStoriesPreviewView.ImageHolder) arrayList5.get(i2)).onBind(((SelfStoriesPreviewView.ImageHolder) arrayList5.get(i2)).position);
            i2++;
        }
    }

    public void setKeyboardHeight(int i) {
        SelfStoryViewsPage currentPage;
        boolean z = this.keyboardHeight >= AndroidUtilities.dp(20.0f);
        boolean z2 = i >= AndroidUtilities.dp(20.0f);
        if (z2 != z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progressToKeyboard, z2 ? 1.0f : 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new RichMediaCell$$ExternalSyntheticLambda1(this, 13));
            valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.start();
        }
        this.keyboardHeight = i;
        if (i <= 0 || (currentPage = getCurrentPage()) == null) {
            return;
        }
        currentPage.recyclerListView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
        FrameLayout frameLayout = currentPage.topViewsContainer;
        if (frameLayout.getTranslationY() != 0.0f) {
            currentPage.scroller.smoothScrollBy((int) frameLayout.getTranslationY(), 250L, AdjustPanLayoutHelper.keyboardInterpolator);
        }
    }

    public void setOffset(float f) {
        int closestPosition;
        HwStoriesViewPager hwStoriesViewPager;
        boolean z;
        if (this.selfStoriesViewsOffset == f) {
            return;
        }
        this.selfStoriesViewsOffset = f;
        this.viewPagerContainer.setTranslationY(((-this.bottomPadding) + getMeasuredHeight()) - this.selfStoriesViewsOffset);
        float f2 = this.progressToOpen;
        float fClamp = Utilities.clamp(f / this.maxSelfStoriesViewsOffset, 1.0f, 0.0f);
        this.progressToOpen = fClamp;
        Utilities.clamp(fClamp / 0.5f, 1.0f, 0.0f);
        StoryViewer storyViewer = this.storyViewer;
        PeerStoriesView currentPeerView = storyViewer.getCurrentPeerView();
        AnonymousClass1 anonymousClass1 = this.selfStoriesPreviewView;
        if (f2 == 1.0f && this.progressToOpen != 1.0f) {
            if (storyViewer.storiesList != null) {
                MessageObject messageObject = (MessageObject) storyViewer.storiesList.messageObjects.get(Utilities.clamp(anonymousClass1.getClosestPosition(), storyViewer.storiesList.messageObjects.size() - 1, 0));
                long jDay = StoriesController.StoriesList.day(messageObject);
                StoryViewer.TransitionViewHolder transitionViewHolder = storyViewer.transitionViewHolder;
                ImageReceiver imageReceiver = transitionViewHolder.storyImage;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    transitionViewHolder.storyImage = null;
                }
                StoryViewer.AnonymousClass4 anonymousClass4 = storyViewer.storiesViewPager;
                int i = messageObject.storyItem.id;
                for (int i2 = 0; i2 < anonymousClass4.days.size(); i2++) {
                    StoryViewer storyViewer2 = anonymousClass4.storyViewer;
                    if (jDay == StoriesController.StoriesList.day(storyViewer2.storiesList.findMessageObject(((Integer) ((ArrayList) anonymousClass4.days.get(i2)).get(0)).intValue()))) {
                        int size = storyViewer2.reversed ? (anonymousClass4.days.size() - 1) - i2 : i2;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= ((ArrayList) anonymousClass4.days.get(i2)).size()) {
                                i3 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) anonymousClass4.days.get(i2)).get(i3)).intValue() == i) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (anonymousClass4.getCurrentPeerView() != null && anonymousClass4.getCurrentItem() == size) {
                            PeerStoriesView currentPeerView2 = anonymousClass4.getCurrentPeerView();
                            if (currentPeerView2.selectedPosition == i3) {
                                break;
                            }
                            currentPeerView2.selectedPosition = i3;
                            currentPeerView2.updatePosition(false);
                            break;
                        }
                        anonymousClass4.setCurrentItem(size, false);
                        PeerStoriesView currentPeerView3 = anonymousClass4.getCurrentPeerView();
                        if (currentPeerView3 == null) {
                            break;
                        }
                        StoriesViewPager.PageLayout pageLayout = (StoriesViewPager.PageLayout) currentPeerView3.getParent();
                        if (!pageLayout.isVisible) {
                            pageLayout.isVisible = true;
                            pageLayout.invalidate();
                            pageLayout.peerStoryView.setIsVisible(true);
                            int i4 = 0;
                            while (true) {
                                hwStoriesViewPager = pageLayout.this$0;
                                if (i4 >= hwStoriesViewPager.getChildCount()) {
                                    z = true;
                                    break;
                                }
                                StoriesViewPager.PageLayout pageLayout2 = (StoriesViewPager.PageLayout) hwStoriesViewPager.getChildAt(i4);
                                if (pageLayout2.isVisible && !pageLayout2.peerStoryView.currentStory.allowScreenshots()) {
                                    z = false;
                                    break;
                                }
                                i4++;
                            }
                            hwStoriesViewPager.storyViewer.allowScreenshots(z);
                        }
                        if (anonymousClass4.days == null) {
                            pageLayout.peerStoryView.setDialogId(pageLayout.dialogId, i3);
                            break;
                        }
                        PeerStoriesView peerStoriesView = pageLayout.peerStoryView;
                        long j = pageLayout.dialogId;
                        ArrayList arrayList = pageLayout.day;
                        peerStoriesView.dialogId = j;
                        peerStoriesView.day = arrayList;
                        peerStoriesView.bindInternal(i3);
                        break;
                    }
                }
            } else if (currentPeerView != null && currentPeerView.selectedPosition != (closestPosition = anonymousClass1.getClosestPosition())) {
                currentPeerView.selectedPosition = closestPosition;
                currentPeerView.updatePosition(false);
            }
            anonymousClass1.scroller.abortAnimation();
            ValueAnimator valueAnimator = anonymousClass1.scrollAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                anonymousClass1.scrollAnimator = null;
            }
            anonymousClass1.scrollToPosition(anonymousClass1.lastClosestPosition, false, true);
        }
        if (currentPeerView != null) {
            PeerStoriesView.AnonymousClass4 anonymousClass5 = currentPeerView.storyContainer;
            anonymousClass1.imagesFromY = anonymousClass5.getTop();
            anonymousClass1.imagesFromW = anonymousClass5.getMeasuredWidth();
            anonymousClass1.imagesFromH = anonymousClass5.getMeasuredHeight();
        }
        anonymousClass1.setProgressToOpen(this.progressToOpen);
        AnonymousClass2 anonymousClass2 = this.viewPager;
        if (anonymousClass2.gesturesEnabled && this.progressToOpen != 1.0f) {
            anonymousClass2.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.progressToOpen == 0.0f ? 4 : 0);
        if (this.progressToOpen != 1.0f) {
            anonymousClass2.gesturesEnabled = false;
        }
    }
}
