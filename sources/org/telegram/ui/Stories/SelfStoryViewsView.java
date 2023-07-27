package org.telegram.ui.Stories;

import android.content.Context;
import android.graphics.Canvas;
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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$StoryItem;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Stories.StoriesController;
public class SelfStoryViewsView extends FrameLayout {
    public float bottomPadding;
    private int currentState;
    ArrayList<SelfStoryViewsPage> itemViews;
    boolean listenPager;
    public float maxSelfStoriesViewsOffset;
    private final PagerAdapter pagerAdapter;
    float progressToOpen;
    Theme.ResourcesProvider resourcesProvider;
    SelfStoriesPreviewView selfStoriesPreviewView;
    float selfStoriesViewsOffset;
    private Drawable shadowDrawable;
    ArrayList<StoryItemInternal> storyItems;
    StoryViewer storyViewer;
    float toHeight;
    public float toY;
    ViewPagerInner viewPager;
    ContainerView viewPagerContainer;

    public SelfStoryViewsView(final Context context, final StoryViewer storyViewer) {
        super(context);
        this.storyItems = new ArrayList<>();
        this.itemViews = new ArrayList<>();
        this.resourcesProvider = storyViewer.resourcesProvider;
        this.storyViewer = storyViewer;
        this.selfStoriesPreviewView = new SelfStoriesPreviewView(getContext()) {
            @Override
            void onDragging() {
                SelfStoryViewsView.this.listenPager = false;
            }

            @Override
            public void onClosestPositionChanged(int i) {
                super.onClosestPositionChanged(i);
                SelfStoryViewsView selfStoryViewsView = SelfStoryViewsView.this;
                if (selfStoryViewsView.listenPager || selfStoryViewsView.viewPager.getCurrentItem() == i) {
                    return;
                }
                try {
                    SelfStoryViewsView.this.viewPager.setCurrentItem(i, false);
                } catch (Throwable th) {
                    FileLog.e(th);
                    SelfStoryViewsView.this.viewPager.getAdapter().notifyDataSetChanged();
                    SelfStoryViewsView.this.viewPager.setCurrentItem(i, false);
                }
            }

            @Override
            public void onCenteredImageTap() {
                storyViewer.cancelSwipeToViews(false);
            }
        };
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
        this.viewPagerContainer = new ContainerView(context);
        ViewPagerInner viewPagerInner = new ViewPagerInner(this, context);
        this.viewPager = viewPagerInner;
        viewPagerInner.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int i) {
            }

            @Override
            public void onPageScrolled(int i, float f, int i2) {
                SelfStoryViewsView selfStoryViewsView = SelfStoryViewsView.this;
                if (selfStoryViewsView.listenPager) {
                    selfStoryViewsView.selfStoriesPreviewView.scrollToPositionWithOffset(i, f);
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {
                SelfStoryViewsView.this.currentState = i;
                if (SelfStoryViewsView.this.currentState == 1) {
                    SelfStoryViewsView.this.listenPager = true;
                }
            }
        });
        ViewPagerInner viewPagerInner2 = this.viewPager;
        PagerAdapter pagerAdapter = new PagerAdapter() {
            @Override
            public boolean isViewFromObject(View view, Object obj) {
                return view == obj;
            }

            @Override
            public int getCount() {
                return SelfStoryViewsView.this.storyItems.size();
            }

            @Override
            public Object instantiateItem(ViewGroup viewGroup, int i) {
                SelfStoryViewsPage selfStoryViewsPage = new SelfStoryViewsPage(storyViewer, context) {
                    @Override
                    protected void dispatchDraw(Canvas canvas) {
                        SelfStoryViewsView.this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), 0, getMeasuredWidth() + AndroidUtilities.dp(6.0f), getMeasuredHeight());
                        SelfStoryViewsView.this.shadowDrawable.draw(canvas);
                        super.dispatchDraw(canvas);
                    }
                };
                selfStoryViewsPage.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
                selfStoryViewsPage.setStoryItem(SelfStoryViewsView.this.storyItems.get(i));
                selfStoryViewsPage.setListBottomPadding(SelfStoryViewsView.this.bottomPadding);
                viewGroup.addView(selfStoryViewsPage);
                SelfStoryViewsView.this.itemViews.add(selfStoryViewsPage);
                return selfStoryViewsPage;
            }

            @Override
            public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
                viewGroup.removeView((View) obj);
                SelfStoryViewsView.this.itemViews.remove(obj);
            }
        };
        this.pagerAdapter = pagerAdapter;
        viewPagerInner2.setAdapter(pagerAdapter);
        this.viewPagerContainer.addView(this.viewPager, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.selfStoriesPreviewView, LayoutHelper.createFrame(-1, -1.0f));
        addView(this.viewPagerContainer);
        setVisibility(4);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int i3 = this.storyViewer.ATTACH_TO_FRAGMENT ? AndroidUtilities.statusBarHeight + 0 : 0;
        int size = View.MeasureSpec.getSize(i2);
        ((FrameLayout.LayoutParams) this.selfStoriesPreviewView.getLayoutParams()).topMargin = i3;
        this.toHeight = this.selfStoriesPreviewView.getFinalHeight();
        this.toY = AndroidUtilities.dp(20.0f) + i3;
        float dp = i3 + AndroidUtilities.dp(20.0f) + this.toHeight + AndroidUtilities.dp(24.0f);
        this.bottomPadding = dp;
        this.maxSelfStoriesViewsOffset = size - dp;
        for (int i4 = 0; i4 < this.itemViews.size(); i4++) {
            this.itemViews.get(i4).setListBottomPadding(this.bottomPadding);
        }
        super.onMeasure(i, i2);
    }

    public void setOffset(float f) {
        if (this.selfStoriesViewsOffset == f) {
            return;
        }
        this.selfStoriesViewsOffset = f;
        this.viewPagerContainer.setTranslationY(getMeasuredHeight() - f);
        float f2 = this.progressToOpen;
        float clamp = Utilities.clamp(f / this.maxSelfStoriesViewsOffset, 1.0f, 0.0f);
        this.progressToOpen = clamp;
        Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
        PeerStoriesView currentPeerView = this.storyViewer.getCurrentPeerView();
        if (f2 == 1.0f && this.progressToOpen != 1.0f) {
            currentPeerView.selectPosition(this.selfStoriesPreviewView.getClosestPosition());
            this.selfStoriesPreviewView.abortScroll();
        }
        if (currentPeerView != null) {
            this.selfStoriesPreviewView.imagesFromY = currentPeerView.storyContainer.getTop();
            this.selfStoriesPreviewView.imagesFromW = currentPeerView.storyContainer.getMeasuredWidth();
            this.selfStoriesPreviewView.imagesFromH = currentPeerView.storyContainer.getMeasuredHeight();
        }
        this.selfStoriesPreviewView.setProgressToOpen(this.progressToOpen);
        ViewPagerInner viewPagerInner = this.viewPager;
        if (viewPagerInner.gesturesEnabled && this.progressToOpen != 1.0f) {
            viewPagerInner.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.progressToOpen == 0.0f ? 4 : 0);
        if (this.progressToOpen != 1.0f) {
            this.viewPager.gesturesEnabled = false;
        }
    }

    public void setItems(ArrayList<TLRPC$StoryItem> arrayList, int i) {
        this.storyItems.clear();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.storyItems.add(new StoryItemInternal(this, arrayList.get(i2)));
        }
        ArrayList<StoriesController.UploadingStory> uploadingStories = MessagesController.getInstance(this.storyViewer.currentAccount).storiesController.getUploadingStories();
        for (int i3 = 0; i3 < uploadingStories.size(); i3++) {
            this.storyItems.add(new StoryItemInternal(this, uploadingStories.get(i3)));
        }
        this.selfStoriesPreviewView.setItems(this.storyItems, i);
        this.viewPager.setAdapter(null);
        this.viewPager.setAdapter(this.pagerAdapter);
        this.pagerAdapter.notifyDataSetChanged();
        this.viewPager.setCurrentItem(i);
    }

    public ImageReceiver getCrossfadeToImage() {
        return this.selfStoriesPreviewView.getCenteredImageReciever();
    }

    public class ContainerView extends FrameLayout implements NestedScrollingParent3 {
        private final NestedScrollingParentHelper nestedScrollingParentHelper;

        @Override
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        }

        @Override
        public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            return i == 2;
        }

        public ContainerView(Context context) {
            super(context);
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        }

        @Override
        public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
        }

        @Override
        public void onStopNestedScroll(View view, int i) {
            this.nestedScrollingParentHelper.onStopNestedScroll(view);
        }

        @Override
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 == 0 || i2 != 0) {
                return;
            }
            SelfStoryViewsView selfStoryViewsView = SelfStoryViewsView.this;
            float f = selfStoryViewsView.storyViewer.selfStoriesViewsOffset;
            float f2 = i4 + f;
            if (f2 <= f) {
                f = f2;
            }
            selfStoryViewsView.setOffset(f);
            SelfStoryViewsView.this.storyViewer.setSelfStoriesViewsOffset(f);
        }

        @Override
        public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
            SelfStoryViewsView selfStoryViewsView = SelfStoryViewsView.this;
            float f = selfStoryViewsView.storyViewer.selfStoriesViewsOffset;
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
            SelfStoryViewsView.this.storyViewer.setSelfStoriesViewsOffset(f2);
        }
    }

    public class ViewPagerInner extends ViewPager {
        boolean gesturesEnabled;

        public ViewPagerInner(SelfStoryViewsView selfStoryViewsView, Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.gesturesEnabled = true;
            }
            if (this.gesturesEnabled) {
                try {
                    return super.onInterceptTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }
            return false;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.gesturesEnabled = true;
            }
            if (this.gesturesEnabled) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public class StoryItemInternal {
        public TLRPC$StoryItem storyItem;
        public StoriesController.UploadingStory uploadingStory;

        public StoryItemInternal(SelfStoryViewsView selfStoryViewsView, TLRPC$StoryItem tLRPC$StoryItem) {
            this.storyItem = tLRPC$StoryItem;
        }

        public StoryItemInternal(SelfStoryViewsView selfStoryViewsView, StoriesController.UploadingStory uploadingStory) {
            this.uploadingStory = uploadingStory;
        }
    }
}
