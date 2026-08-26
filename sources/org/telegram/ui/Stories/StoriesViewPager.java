package org.telegram.ui.Stories;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda6;

public abstract class StoriesViewPager extends ViewPager {
    public int currentAccount;
    public int currentState;
    public ArrayList days;
    public long daysDialogId;
    public PeerStoriesView.Delegate delegate;
    public ArrayList dialogs;
    public Runnable doOnNextIdle;
    public int keyboardHeight;
    public float lastProgressToDismiss;
    public final PeerStoriesView.AnonymousClass34 lockTouchRunnable;
    public final AnonymousClass2 pagerAdapter;
    public float progress;
    public final PeerStoriesView.SharedResources resources;
    public int selectedPosition;
    public final StoryViewer storyViewer;
    public int toPosition;
    public boolean touchEnabled;
    public boolean touchLocked;
    public boolean updateDelegate;
    public int updateVisibleItemPosition;

    public final class PageLayout extends FrameLayout {
        public ArrayList day;
        public long dialogId;
        public boolean isVisible;
        public PeerStoriesView peerStoryView;
        public final HwStoriesViewPager this$0;

        public PageLayout(HwStoriesViewPager hwStoriesViewPager, Context context) {
            super(context);
            this.this$0 = hwStoriesViewPager;
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            if (this.isVisible) {
                super.dispatchDraw(canvas);
            }
        }
    }

    public StoriesViewPager(int i, Context context, final StoryViewer storyViewer, DarkThemeResourceProvider darkThemeResourceProvider) {
        super(context);
        this.dialogs = new ArrayList();
        this.touchEnabled = true;
        final HwStoriesViewPager hwStoriesViewPager = (HwStoriesViewPager) this;
        this.lockTouchRunnable = new PeerStoriesView.AnonymousClass34(hwStoriesViewPager, 4);
        this.updateVisibleItemPosition = -1;
        this.currentAccount = i;
        this.resources = new PeerStoriesView.SharedResources(context);
        this.storyViewer = storyViewer;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(hwStoriesViewPager, context, storyViewer, darkThemeResourceProvider);
        this.pagerAdapter = anonymousClass2;
        setAdapter(anonymousClass2);
        setPageTransformer(false, new GiftSheet$$ExternalSyntheticLambda6((HwStoriesViewPager) this, 28));
        setOffscreenPageLimit(0);
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public final void onPageScrollStateChanged(int i2) {
                HwStoriesViewPager hwStoriesViewPager2 = hwStoriesViewPager;
                StoryViewer storyViewer2 = StoryViewer.this;
                storyViewer2.getClass();
                storyViewer2.updatePlayingMode();
                Runnable runnable = hwStoriesViewPager2.doOnNextIdle;
                if (runnable != null && i2 == 0) {
                    runnable.run();
                    hwStoriesViewPager2.doOnNextIdle = null;
                }
                hwStoriesViewPager2.currentState = i2;
                StoryViewer storyViewer3 = StoryViewer.this;
                if (storyViewer3.storiesViewPager.currentState == 1) {
                    AndroidUtilities.cancelRunOnUIThread(storyViewer3.longPressRunnable);
                }
            }

            @Override
            public final void onPageScrolled(int i2, float f, int i3) {
                HwStoriesViewPager hwStoriesViewPager2 = hwStoriesViewPager;
                hwStoriesViewPager2.selectedPosition = i2;
                hwStoriesViewPager2.toPosition = i3 > 0 ? i2 + 1 : i2 - 1;
                hwStoriesViewPager2.progress = f;
                long j = UserConfig.getInstance(hwStoriesViewPager2.currentAccount).clientUserId;
                int i4 = hwStoriesViewPager2.selectedPosition;
                if (i4 >= 0 && (hwStoriesViewPager2.days != null ? hwStoriesViewPager2.daysDialogId == j : !(i4 >= hwStoriesViewPager2.dialogs.size() || ((Long) hwStoriesViewPager2.dialogs.get(hwStoriesViewPager2.selectedPosition)).longValue() != j))) {
                    PeerStoriesView.Delegate delegate = hwStoriesViewPager2.delegate;
                    float f2 = 1.0f - hwStoriesViewPager2.progress;
                    StoryViewer storyViewer2 = StoryViewer.this;
                    if (storyViewer2.hideEnterViewProgress != f2) {
                        storyViewer2.hideEnterViewProgress = f2;
                        storyViewer2.containerView.invalidate();
                        return;
                    }
                    return;
                }
                int i5 = hwStoriesViewPager2.toPosition;
                if (i5 < 0 || (hwStoriesViewPager2.days != null ? hwStoriesViewPager2.daysDialogId != j : i5 >= hwStoriesViewPager2.dialogs.size() || ((Long) hwStoriesViewPager2.dialogs.get(hwStoriesViewPager2.toPosition)).longValue() != j)) {
                    StoryViewer storyViewer3 = StoryViewer.this;
                    if (storyViewer3.hideEnterViewProgress != 0.0f) {
                        storyViewer3.hideEnterViewProgress = 0.0f;
                        storyViewer3.containerView.invalidate();
                        return;
                    }
                    return;
                }
                PeerStoriesView.Delegate delegate2 = hwStoriesViewPager2.delegate;
                float f3 = hwStoriesViewPager2.progress;
                StoryViewer storyViewer4 = StoryViewer.this;
                if (storyViewer4.hideEnterViewProgress != f3) {
                    storyViewer4.hideEnterViewProgress = f3;
                    storyViewer4.containerView.invalidate();
                }
            }

            @Override
            public final void onPageSelected(int i2) {
                HwStoriesViewPager hwStoriesViewPager2 = hwStoriesViewPager;
                PeerStoriesView currentPeerView = hwStoriesViewPager2.getCurrentPeerView();
                if (currentPeerView == null) {
                    return;
                }
                PeerStoriesView.Delegate delegate = hwStoriesViewPager2.delegate;
                long currentPeer = currentPeerView.getCurrentPeer();
                int selectedPosition = currentPeerView.getSelectedPosition();
                StoryViewer storyViewer2 = StoryViewer.this;
                if (storyViewer2.lastPosition != selectedPosition || storyViewer2.lastDialogId != currentPeer) {
                    storyViewer2.lastDialogId = currentPeer;
                    storyViewer2.lastPosition = selectedPosition;
                }
                hwStoriesViewPager2.updateActiveStory();
                StoryViewer storyViewer3 = storyViewer;
                StoryViewer.PlaceProvider placeProvider = storyViewer3.placeProvider;
                if (placeProvider != null) {
                    if (i2 < 3) {
                        placeProvider.loadNext(false);
                    } else if (i2 > hwStoriesViewPager2.pagerAdapter.getCount() - 4) {
                        storyViewer3.placeProvider.loadNext(true);
                    }
                }
            }
        });
        setOverScrollMode(2);
    }

    public static boolean eq(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != arrayList2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final void checkPageVisibility() {
        PageLayout pageLayout;
        boolean z;
        HwStoriesViewPager hwStoriesViewPager;
        if (this.updateVisibleItemPosition >= 0) {
            for (int i = 0; i < getChildCount(); i++) {
                if (((Integer) getChildAt(i).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.updateVisibleItemPosition && !(z = (pageLayout = (PageLayout) getChildAt(i)).isVisible)) {
                    this.updateVisibleItemPosition = -1;
                    boolean z2 = true;
                    if (!z) {
                        pageLayout.isVisible = true;
                        pageLayout.invalidate();
                        pageLayout.peerStoryView.setIsVisible(true);
                        int i2 = 0;
                        while (true) {
                            hwStoriesViewPager = pageLayout.this$0;
                            if (i2 >= hwStoriesViewPager.getChildCount()) {
                                break;
                            }
                            PageLayout pageLayout2 = (PageLayout) hwStoriesViewPager.getChildAt(i2);
                            if (pageLayout2.isVisible && !pageLayout2.peerStoryView.currentStory.allowScreenshots()) {
                                z2 = false;
                                break;
                            }
                            i2++;
                        }
                        hwStoriesViewPager.storyViewer.allowScreenshots(z2);
                    }
                    if (this.days != null) {
                        PeerStoriesView peerStoriesView = pageLayout.peerStoryView;
                        long j = pageLayout.dialogId;
                        ArrayList arrayList = pageLayout.day;
                        peerStoriesView.dialogId = j;
                        peerStoriesView.day = arrayList;
                        peerStoriesView.bindInternal(0);
                    } else {
                        pageLayout.peerStoryView.setDialogId(pageLayout.dialogId, 0);
                    }
                }
            }
        }
    }

    public long getCurrentDialogId() {
        if (this.days != null) {
            return this.daysDialogId;
        }
        if (getCurrentItem() < this.dialogs.size()) {
            return ((Long) this.dialogs.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public PeerStoriesView getCurrentPeerView() {
        for (int i = 0; i < getChildCount(); i++) {
            if (((Integer) getChildAt(i).getTag()).intValue() == getCurrentItem()) {
                return (PeerStoriesView) ((FrameLayout) getChildAt(i)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.dialogs;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.touchEnabled && !this.touchLocked) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.updateDelegate) {
            this.updateDelegate = false;
            PeerStoriesView currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                PeerStoriesView.Delegate delegate = this.delegate;
                long currentPeer = currentPeerView.getCurrentPeer();
                int selectedPosition = currentPeerView.getSelectedPosition();
                StoryViewer storyViewer = StoryViewer.this;
                if (storyViewer.lastPosition != selectedPosition || storyViewer.lastDialogId != currentPeer) {
                    storyViewer.lastDialogId = currentPeer;
                    storyViewer.lastPosition = selectedPosition;
                }
            }
        }
        checkPageVisibility();
        updateActiveStory();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.touchEnabled && !this.touchLocked) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.touchLocked) {
            return motionEvent.getAction() == 0 || motionEvent.getAction() == 2;
        }
        return false;
    }

    public final void setDays(int i, long j, ArrayList arrayList) {
        boolean z;
        StoryViewer storyViewer;
        ArrayList arrayList2;
        int size = 0;
        if (this.daysDialogId == j) {
            ArrayList arrayList3 = this.days;
            if (arrayList3 == null && arrayList == null) {
                if (this.currentAccount == i) {
                    return;
                }
            } else if (arrayList3 != null && arrayList != null && arrayList3.size() == arrayList.size()) {
                int i2 = 0;
                while (true) {
                    if (i2 < arrayList3.size()) {
                        if (eq((ArrayList) arrayList3.get(i2), (ArrayList) arrayList.get(i2))) {
                            i2++;
                        }
                    } else if (this.currentAccount == i) {
                        return;
                    }
                }
            }
        }
        if (this.daysDialogId == j && this.currentAccount == i && (arrayList2 = this.days) != null && arrayList != null && arrayList.size() > arrayList2.size()) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList2.size()) {
                    z = true;
                    break;
                } else {
                    if (!eq((ArrayList) arrayList2.get(i3), (ArrayList) arrayList.get(i3))) {
                        z = false;
                        break;
                    }
                    i3++;
                }
            }
        } else {
            z = false;
            break;
        }
        this.daysDialogId = j;
        this.days = arrayList;
        this.currentAccount = i;
        AnonymousClass2 anonymousClass2 = this.pagerAdapter;
        if (z && anonymousClass2 != null) {
            anonymousClass2.notifyDataSetChanged();
            this.updateDelegate = true;
            return;
        }
        setAdapter(null);
        setAdapter(anonymousClass2);
        while (true) {
            int size2 = arrayList.size();
            storyViewer = this.storyViewer;
            if (size >= size2 || ((ArrayList) arrayList.get(size)).contains(Integer.valueOf(storyViewer.dayStoryId))) {
                break;
            } else {
                size++;
            }
        }
        if (storyViewer.reversed) {
            size = (arrayList.size() - 1) - size;
        }
        setCurrentItem(size);
        this.updateDelegate = true;
    }

    public void setDelegate(PeerStoriesView.Delegate delegate) {
        this.delegate = delegate;
    }

    public void setHorizontalProgressToDismiss(float f) {
        if (Math.abs(f) > 1.0f || this.lastProgressToDismiss == f) {
            return;
        }
        this.lastProgressToDismiss = f;
        setCameraDistance(getWidth() * 15);
        setPivotX(f < 0.0f ? getWidth() : 0.0f);
        setPivotY(getHeight() * 0.5f);
        setRotationY(f * 90.0f);
    }

    public void setKeyboardHeight(int i) {
        if (this.keyboardHeight != i) {
            this.keyboardHeight = i;
            PeerStoriesView currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z) {
        for (int i = 0; i < getChildCount(); i++) {
            ((PeerStoriesView) ((FrameLayout) getChildAt(i)).getChildAt(0)).setPaused(z);
        }
    }

    public final boolean switchToNext(boolean z) {
        StoryViewer storyViewer = this.storyViewer;
        boolean z2 = false;
        if (z) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.days;
            if (arrayList == null) {
                arrayList = this.dialogs;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (storyViewer.USE_SURFACE_VIEW && Build.VERSION.SDK_INT < 33) {
                    z2 = true;
                }
                setCurrentItem(currentItem2, !z2);
                return true;
            }
        }
        if (z || getCurrentItem() <= 0) {
            return false;
        }
        int currentItem3 = getCurrentItem() - 1;
        if (storyViewer.USE_SURFACE_VIEW && Build.VERSION.SDK_INT < 33) {
            z2 = true;
        }
        setCurrentItem(currentItem3, !z2);
        return true;
    }

    public final void updateActiveStory() {
        for (int i = 0; i < getChildCount(); i++) {
            PeerStoriesView peerStoriesView = (PeerStoriesView) ((FrameLayout) getChildAt(i)).getChildAt(0);
            peerStoriesView.setActive(((Integer) getChildAt(i).getTag()).intValue() == getCurrentItem() && !peerStoriesView.editOpened);
        }
    }

    public final class AnonymousClass2 extends PagerAdapter {
        public final ArrayList cachedViews = new ArrayList();
        public final HwStoriesViewPager this$0;
        public final Context val$context;
        public final DarkThemeResourceProvider val$resourcesProvider;
        public final StoryViewer val$storyViewer;

        public AnonymousClass2(HwStoriesViewPager hwStoriesViewPager, Context context, StoryViewer storyViewer, DarkThemeResourceProvider darkThemeResourceProvider) {
            this.this$0 = hwStoriesViewPager;
            this.val$context = context;
            this.val$storyViewer = storyViewer;
            this.val$resourcesProvider = darkThemeResourceProvider;
        }

        @Override
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            FrameLayout frameLayout = (FrameLayout) obj;
            viewGroup.removeView(frameLayout);
            PeerStoriesView peerStoriesView = (PeerStoriesView) frameLayout.getChildAt(0);
            AndroidUtilities.removeFromParent(peerStoriesView);
            this.cachedViews.add(peerStoriesView);
        }

        @Override
        public final int getCount() {
            HwStoriesViewPager hwStoriesViewPager = this.this$0;
            ArrayList arrayList = hwStoriesViewPager.days;
            return arrayList != null ? arrayList.size() : hwStoriesViewPager.dialogs.size();
        }

        @Override
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            AnonymousClass2 anonymousClass2;
            PeerStoriesView anonymousClass1;
            HwStoriesViewPager hwStoriesViewPager = this.this$0;
            PageLayout pageLayout = new PageLayout(hwStoriesViewPager, this.val$context);
            ArrayList arrayList = this.cachedViews;
            if (arrayList.isEmpty()) {
                anonymousClass2 = this;
                anonymousClass1 = anonymousClass2.new AnonymousClass1(this.val$context, this.val$storyViewer, hwStoriesViewPager.resources, this.val$resourcesProvider);
            } else {
                anonymousClass1 = (PeerStoriesView) arrayList.remove(0);
                anonymousClass1.headerView.backupImageView.getImageReceiver().setVisible(true, true);
                if (anonymousClass1.changeBoundAnimator != null) {
                    anonymousClass1.chatActivityEnterView.reset();
                    anonymousClass1.chatActivityEnterView.setAlpha(1.0f - anonymousClass1.outT);
                }
                ReactionsContainerLayout reactionsContainerLayout = anonymousClass1.reactionsContainerLayout;
                if (reactionsContainerLayout != null) {
                    reactionsContainerLayout.reset();
                }
                ReactionsContainerLayout reactionsContainerLayout2 = anonymousClass1.likesReactionLayout;
                if (reactionsContainerLayout2 != null) {
                    reactionsContainerLayout2.reset();
                }
                InstantCameraView instantCameraView = anonymousClass1.instantCameraView;
                if (instantCameraView != null) {
                    AndroidUtilities.removeFromParent(instantCameraView);
                    anonymousClass1.instantCameraView.hideCamera(true);
                    anonymousClass1.instantCameraView = null;
                }
                anonymousClass1.setActive(false);
                anonymousClass1.setIsVisible(false);
                anonymousClass1.isLongPressed = false;
                anonymousClass1.progressToHideInterface.set(0.0f, false);
                anonymousClass1.viewsThumbImageReceiver = null;
                anonymousClass1.messageSent = false;
                PeerStoriesView.AnonymousClass5 anonymousClass5 = anonymousClass1.storyCaptionView;
                if (anonymousClass5.textSelectionHelper.isInSelectionMode()) {
                    anonymousClass5.textSelectionHelper.clear();
                }
                anonymousClass2 = this;
            }
            pageLayout.peerStoryView = anonymousClass1;
            anonymousClass1.setAccount(hwStoriesViewPager.currentAccount);
            anonymousClass1.setDelegate(hwStoriesViewPager.delegate);
            StoryViewer storyViewer = anonymousClass2.val$storyViewer;
            anonymousClass1.setLongpressed(storyViewer.isLongpressed);
            pageLayout.setTag(Integer.valueOf(i));
            ArrayList arrayList2 = hwStoriesViewPager.days;
            if (arrayList2 != null) {
                if (storyViewer.reversed) {
                    i = (arrayList2.size() - 1) - i;
                }
                ArrayList arrayList3 = (ArrayList) arrayList2.get(i);
                pageLayout.day = arrayList3;
                StoriesController.StoriesList storiesList = storyViewer.storiesList;
                if ((storiesList instanceof StoriesController.SearchStoriesList) || (storiesList instanceof StoriesController.StoryRepostsList)) {
                    MessageObject messageObjectFindMessageObject = storiesList.findMessageObject(((Integer) arrayList3.get(0)).intValue());
                    pageLayout.dialogId = messageObjectFindMessageObject == null ? hwStoriesViewPager.daysDialogId : messageObjectFindMessageObject.getDialogId();
                } else {
                    pageLayout.dialogId = hwStoriesViewPager.daysDialogId;
                }
            } else {
                pageLayout.day = null;
                pageLayout.dialogId = ((Long) hwStoriesViewPager.dialogs.get(i)).longValue();
            }
            pageLayout.addView(anonymousClass1);
            anonymousClass1.requestLayout();
            viewGroup.addView(pageLayout);
            return pageLayout;
        }

        @Override
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public final class AnonymousClass1 extends PeerStoriesView {
            public AnonymousClass1(Context context, StoryViewer storyViewer, PeerStoriesView.SharedResources sharedResources, DarkThemeResourceProvider darkThemeResourceProvider) {
                super(context, storyViewer, sharedResources, darkThemeResourceProvider);
            }

            @Override
            public final void invalidate() {
                if (HwFrameLayout.hwEnabled) {
                    HwFrameLayout.hwViews.add(this);
                } else {
                    super.invalidate();
                }
            }

            @Override
            public final boolean isSelectedPeer() {
                return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == AnonymousClass2.this.this$0.getCurrentItem();
            }

            @Override
            public final void invalidate(int i, int i2, int i3, int i4) {
                if (HwFrameLayout.hwEnabled) {
                    HwFrameLayout.hwViews.add(this);
                } else {
                    super.invalidate(i, i2, i3, i4);
                }
            }
        }
    }
}
