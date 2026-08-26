package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CachedMediaLayout;
import org.telegram.ui.ChangeUsernameActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda141;
import org.telegram.ui.ChatEditTypeActivity;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugView;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.poll.PollAttachedMedia;
import org.telegram.ui.Components.poll.PollAttachedMediaPack;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda79;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.PhotoViewer$73$$ExternalSyntheticLambda0;
import org.telegram.ui.PollCreateActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.iv.RichEditor;

public class ViewPagerFixed extends FrameLayout {
    public static final DialogsActivity$$ExternalSyntheticLambda79 interpolator = new DialogsActivity$$ExternalSyntheticLambda79(2);
    public Adapter adapter;
    public float additionalOffset;
    public boolean allowDisallowInterceptTouch;
    public boolean animatingForward;
    public boolean backAnimation;
    public float backProgress;
    public int currentPosition;
    public float currentProgress;
    public ValueAnimator manualScrolling;
    public final int maximumVelocity;
    public boolean maybeStartTracking;
    public int nextPosition;
    public final AnimationNotificationsLocker notificationsLocker;
    public final Rect rect;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean startedTracking;
    public int startedTrackingPointerId;
    public int startedTrackingX;
    public int startedTrackingY;
    public AnimatorSet tabsAnimation;
    public boolean tabsAnimationInProgress;
    public AnonymousClass3 tabsView;
    public final float touchSlop;
    public final ChatActivity.AnonymousClass133 updateTabProgress;
    public VelocityTracker velocityTracker;
    public final View[] viewPages;
    public final int[] viewTypes;
    public final SparseArray viewsByType;

    public final class AnonymousClass2 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ViewPagerFixed this$0;

        public AnonymousClass2(ViewPagerFixed viewPagerFixed, int i) {
            this.$r8$classId = i;
            this.this$0 = viewPagerFixed;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ViewPagerFixed viewPagerFixed = this.this$0;
                    if (viewPagerFixed.viewPages[1] != null) {
                        viewPagerFixed.swapViews();
                        SparseArray sparseArray = viewPagerFixed.viewsByType;
                        int i = viewPagerFixed.viewTypes[1];
                        View[] viewArr = viewPagerFixed.viewPages;
                        sparseArray.put(i, viewArr[1]);
                        viewPagerFixed.removeView(viewArr[1]);
                        viewPagerFixed.setTranslationX(viewArr[0], 0.0f);
                        viewArr[1] = null;
                    }
                    viewPagerFixed.manualScrolling = null;
                    viewPagerFixed.onTabAnimationUpdate(true);
                    AnonymousClass3 anonymousClass3 = viewPagerFixed.tabsView;
                    if (anonymousClass3 != null) {
                        anonymousClass3.listView.invalidate();
                        viewPagerFixed.tabsView.listView.invalidateViews();
                        viewPagerFixed.tabsView.invalidate();
                    }
                    viewPagerFixed.onScrollEnd();
                    viewPagerFixed.notificationsLocker.unlock();
                    break;
                case 1:
                    ViewPagerFixed viewPagerFixed2 = this.this$0;
                    viewPagerFixed2.tabsAnimation = null;
                    View[] viewArr2 = viewPagerFixed2.viewPages;
                    if (viewArr2[1] != null) {
                        if (!viewPagerFixed2.backAnimation) {
                            viewPagerFixed2.swapViews();
                        }
                        viewPagerFixed2.viewsByType.put(viewPagerFixed2.viewTypes[1], viewArr2[1]);
                        viewPagerFixed2.removeView(viewArr2[1]);
                        viewArr2[1].setVisibility(8);
                        viewArr2[1] = null;
                    }
                    viewPagerFixed2.tabsAnimationInProgress = false;
                    viewPagerFixed2.maybeStartTracking = false;
                    AnonymousClass3 anonymousClass4 = viewPagerFixed2.tabsView;
                    if (anonymousClass4 != null) {
                        anonymousClass4.setEnabled(true);
                    }
                    viewPagerFixed2.onTabAnimationUpdate(false);
                    viewPagerFixed2.onScrollEnd();
                    viewPagerFixed2.notificationsLocker.unlock();
                    break;
                case 2:
                    ViewPagerFixed viewPagerFixed3 = this.this$0;
                    viewPagerFixed3.tabsAnimation = null;
                    View view = viewPagerFixed3.viewPages[1];
                    if (view != null) {
                        viewPagerFixed3.removeView(view);
                        viewPagerFixed3.viewPages[1] = null;
                    }
                    viewPagerFixed3.tabsAnimationInProgress = false;
                    AnonymousClass3 anonymousClass5 = viewPagerFixed3.tabsView;
                    if (anonymousClass5 != null) {
                        anonymousClass5.setEnabled(true);
                        AnonymousClass3 anonymousClass6 = viewPagerFixed3.tabsView;
                        anonymousClass6.animatingIndicator = false;
                        anonymousClass6.indicatorProgress2 = 1.0f;
                        anonymousClass6.listView.invalidateViews();
                        viewPagerFixed3.tabsView.invalidate();
                    }
                    break;
                default:
                    ViewPagerFixed viewPagerFixed4 = this.this$0;
                    viewPagerFixed4.tabsAnimation = null;
                    View[] viewArr3 = viewPagerFixed4.viewPages;
                    if (viewArr3[1] != null) {
                        if (!viewPagerFixed4.backAnimation) {
                            viewPagerFixed4.swapViews();
                        }
                        viewPagerFixed4.viewsByType.put(viewPagerFixed4.viewTypes[1], viewArr3[1]);
                        viewPagerFixed4.removeView(viewArr3[1]);
                        viewArr3[1].setVisibility(8);
                        viewArr3[1] = null;
                    }
                    viewPagerFixed4.tabsAnimationInProgress = false;
                    viewPagerFixed4.maybeStartTracking = false;
                    AnonymousClass3 anonymousClass7 = viewPagerFixed4.tabsView;
                    if (anonymousClass7 != null) {
                        anonymousClass7.setEnabled(true);
                    }
                    viewPagerFixed4.onTabAnimationUpdate(false);
                    viewPagerFixed4.onScrollEnd();
                    viewPagerFixed4.notificationsLocker.unlock();
                    break;
            }
        }
    }

    public final class AnonymousClass3 extends TabsView {
        public AnonymousClass3(Context context, boolean z, int i, Theme.ResourcesProvider resourcesProvider) {
            super(i, context, resourcesProvider, z);
        }

        public final void selectTab(float f, int i, int i2) {
            float f2;
            if (f < 0.0f) {
                f2 = 0.0f;
            } else {
                f2 = f > 1.0f ? 1.0f : f;
            }
            this.currentPosition = i;
            SparseIntArray sparseIntArray = this.positionToId;
            this.selectedTabId = sparseIntArray.get(i);
            if (f2 > 0.0f) {
                TabsView.TabsViewDelegate tabsViewDelegate = this.delegate;
                if (tabsViewDelegate != null) {
                    Adapter adapter = ViewPagerFixed.this.adapter;
                }
                this.manualScrollingToPosition = i2;
                this.manualScrollingToId = sparseIntArray.get(i2);
            } else {
                this.manualScrollingToPosition = -1;
                this.manualScrollingToId = -1;
            }
            this.animatingIndicatorProgress = f2;
            invalidateViews();
            invalidate();
            scrollToChild(i);
            if (f2 >= 1.0f) {
                this.manualScrollingToPosition = -1;
                this.manualScrollingToId = -1;
                this.currentPosition = i2;
                this.selectedTabId = sparseIntArray.get(i2);
            }
            TabsView.TabsViewDelegate tabsViewDelegate2 = this.delegate;
            if (tabsViewDelegate2 != null) {
                ViewPagerFixed.this.invalidateBlur();
            }
            ViewPagerFixed.this.onTabPageSelected(f <= 0.5f ? i : i2, i < i2);
        }
    }

    public final class AnonymousClass4 implements TabsView.TabsViewDelegate {
        public AnonymousClass4() {
        }

        public final void onPageScrolled(float f) {
            ViewPagerFixed viewPagerFixed = ViewPagerFixed.this;
            if (f == 1.0f) {
                if (viewPagerFixed.viewPages[1] != null) {
                    viewPagerFixed.swapViews();
                    SparseArray sparseArray = viewPagerFixed.viewsByType;
                    int i = viewPagerFixed.viewTypes[1];
                    View[] viewArr = viewPagerFixed.viewPages;
                    sparseArray.put(i, viewArr[1]);
                    viewPagerFixed.removeView(viewArr[1]);
                    viewPagerFixed.setTranslationX(viewArr[0], 0.0f);
                    viewArr[1] = null;
                }
                viewPagerFixed.onTabScrollEnd(viewPagerFixed.currentPosition);
                return;
            }
            View[] viewArr2 = viewPagerFixed.viewPages;
            View view = viewArr2[1];
            if (view == null) {
                return;
            }
            boolean z = viewPagerFixed.animatingForward;
            View[] viewArr3 = viewPagerFixed.viewPages;
            if (z) {
                viewPagerFixed.setTranslationX(view, (1.0f - f) * viewArr2[0].getMeasuredWidth());
                View view2 = viewArr3[0];
                viewPagerFixed.setTranslationX(view2, (-view2.getMeasuredWidth()) * f);
            } else {
                viewPagerFixed.setTranslationX(view, (1.0f - f) * (-viewArr2[0].getMeasuredWidth()));
                View view3 = viewArr3[0];
                viewPagerFixed.setTranslationX(view3, view3.getMeasuredWidth() * f);
            }
            viewPagerFixed.onTabAnimationUpdate(false);
        }
    }

    public abstract class Adapter {
        public void applyReorder(ArrayList arrayList) {
        }

        public abstract void bindView(View view, int i, int i2);

        public boolean canReorder(int i) {
            return false;
        }

        public abstract View createView(int i);

        public abstract int getItemCount();

        public int getItemId(int i) {
            return i;
        }

        public CharSequence getItemTitle(int i) {
            return "";
        }

        public int getItemViewType(int i) {
            return 0;
        }
    }

    public ViewPagerFixed(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentProgress = 1.0f;
        this.viewsByType = new SparseArray();
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.updateTabProgress = new ChatActivity.AnonymousClass133(this, 10);
        this.rect = new Rect();
        this.allowDisallowInterceptTouch = true;
        this.resourcesProvider = resourcesProvider;
        this.touchSlop = AndroidUtilities.getPixelsInCM(0.3f, true);
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.viewTypes = new int[2];
        this.viewPages = new View[2];
        setClipChildren(true);
    }

    public static RecyclerListView findRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RecyclerListView) {
                return (RecyclerListView) childAt;
            }
            if (childAt instanceof ViewGroup) {
                findRecyclerView(childAt);
            }
        }
        return null;
    }

    public void addMoreTabs() {
    }

    public boolean canScroll(MotionEvent motionEvent) {
        return true;
    }

    public boolean canScrollBackward(MotionEvent motionEvent) {
        return true;
    }

    public boolean canScrollForward(MotionEvent motionEvent) {
        return canScroll(motionEvent);
    }

    @Override
    public final boolean canScrollHorizontally(int i) {
        if (i != 0) {
            if (!this.tabsAnimationInProgress && !this.startedTracking) {
                boolean z = i > 0;
                if ((z || this.currentPosition != 0) && (!z || this.currentPosition != this.adapter.getItemCount() - 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void cancelTouches() {
        float measuredWidth;
        int i = 3;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        }
        if (this.startedTracking) {
            View[] viewArr = this.viewPages;
            float x = viewArr[0].getX();
            this.tabsAnimation = new AnimatorSet();
            if (this.additionalOffset == 0.0f) {
                this.backAnimation = Math.abs(x) < ((float) viewArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(0.0f) < 3500.0f || Math.abs(0.0f) < Math.abs(0.0f));
            } else if (Math.abs(0.0f) > 1500.0f) {
                this.backAnimation = false;
            } else if (this.animatingForward) {
                View view = viewArr[1];
                if (view != null) {
                    this.backAnimation = view.getX() > ((float) (viewArr[0].getMeasuredWidth() >> 1));
                } else {
                    this.backAnimation = false;
                }
            } else {
                this.backAnimation = viewArr[0].getX() < ((float) (viewArr[0].getMeasuredWidth() >> 1));
            }
            if (this.backAnimation) {
                measuredWidth = Math.abs(x);
                if (this.animatingForward) {
                    this.tabsAnimation.playTogether(translateAnimator(viewArr[0], 0.0f));
                    View view2 = viewArr[1];
                    if (view2 != null) {
                        this.tabsAnimation.playTogether(translateAnimator(view2, view2.getMeasuredWidth()));
                    }
                } else {
                    this.tabsAnimation.playTogether(translateAnimator(viewArr[0], 0.0f));
                    View view3 = viewArr[1];
                    if (view3 != null) {
                        this.tabsAnimation.playTogether(translateAnimator(view3, -view3.getMeasuredWidth()));
                    }
                }
            } else if (this.nextPosition >= 0) {
                measuredWidth = viewArr[0].getMeasuredWidth() - Math.abs(x);
                if (this.animatingForward) {
                    AnimatorSet animatorSet = this.tabsAnimation;
                    View view4 = viewArr[0];
                    animatorSet.playTogether(translateAnimator(view4, -view4.getMeasuredWidth()));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.tabsAnimation.playTogether(translateAnimator(view5, 0.0f));
                    }
                } else {
                    AnimatorSet animatorSet2 = this.tabsAnimation;
                    View view6 = viewArr[0];
                    animatorSet2.playTogether(translateAnimator(view6, view6.getMeasuredWidth()));
                    View view7 = viewArr[1];
                    if (view7 != null) {
                        this.tabsAnimation.playTogether(translateAnimator(view7, 0.0f));
                    }
                }
            } else {
                measuredWidth = 0.0f;
            }
            if (this.nextPosition < 0) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.backProgress, this.backAnimation ? 0.0f : 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ViewPagerFixed$$ExternalSyntheticLambda0(this, i));
                this.tabsAnimation.playTogether(valueAnimatorOfFloat);
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(this.updateTabProgress);
            this.tabsAnimation.playTogether(valueAnimatorOfFloat2);
            this.tabsAnimation.setInterpolator(interpolator);
            int measuredWidth2 = getMeasuredWidth();
            float f = measuredWidth2 / 2;
            float fSin = (((float) Math.sin((Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2) - 0.5f) * 0.47123894f)) * f) + f;
            float fAbs = Math.abs(0.0f);
            this.tabsAnimation.setDuration(Math.max(150, Math.min(fAbs > 0.0f ? Math.round(Math.abs(fSin / fAbs) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.tabsAnimation.addListener(new AnonymousClass2(this, i));
            this.tabsAnimation.start();
            this.tabsAnimationInProgress = true;
            this.startedTracking = false;
            onTabAnimationUpdate(false);
        } else {
            this.maybeStartTracking = false;
            AnonymousClass3 anonymousClass3 = this.tabsView;
            if (anonymousClass3 != null) {
                anonymousClass3.setEnabled(true);
            }
        }
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.velocityTracker = null;
        }
    }

    public final boolean checkTabsAnimationInProgress() {
        boolean z;
        if (!this.tabsAnimationInProgress) {
            return false;
        }
        boolean z2 = this.backAnimation;
        View[] viewArr = this.viewPages;
        if (z2) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                setTranslationX(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    setTranslationX(view, viewArr[0].getMeasuredWidth() * (this.animatingForward ? 1 : -1));
                }
                z = true;
            } else {
                z = false;
            }
        } else if (Math.abs(viewArr[1].getTranslationX()) < 1.0f) {
            View view2 = viewArr[0];
            setTranslationX(view2, view2.getMeasuredWidth() * (this.animatingForward ? -1 : 1));
            View view3 = viewArr[1];
            if (view3 != null) {
                setTranslationX(view3, 0.0f);
            }
            z = true;
        } else {
            z = false;
        }
        onTabAnimationUpdate(true);
        if (z) {
            AnimatorSet animatorSet = this.tabsAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.tabsAnimation = null;
            }
            this.tabsAnimationInProgress = false;
        }
        return this.tabsAnimationInProgress;
    }

    public final AnonymousClass3 createTabsView(int i, boolean z) {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(getContext(), z, i, this.resourcesProvider);
        this.tabsView = anonymousClass3;
        anonymousClass3.tabMarginDp = tabMarginDp();
        this.tabsView.setDelegate(new AnonymousClass4());
        fillTabs$1(false);
        return this.tabsView;
    }

    public final void fillTabs$1(boolean z) {
        AnonymousClass3 anonymousClass3;
        if (this.adapter == null || (anonymousClass3 = this.tabsView) == null) {
            return;
        }
        anonymousClass3.tabs.clear();
        anonymousClass3.positionToId.clear();
        anonymousClass3.idToPosition.clear();
        anonymousClass3.positionToWidth.clear();
        anonymousClass3.positionToX.clear();
        anonymousClass3.allTabsWidth = 0;
        for (int i = 0; i < this.adapter.getItemCount(); i++) {
            this.adapter.getClass();
            this.tabsView.addTab(this.adapter.getItemId(i), this.adapter.getItemTitle(i));
        }
        addMoreTabs();
        if (z) {
            TabsView.AnonymousClass2 anonymousClass2 = this.tabsView.listView;
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) CubicBezierInterpolator.DEFAULT);
            TransitionManager.beginDelayedTransition(anonymousClass2, transitionSet);
        }
        this.tabsView.adapter.mObservable.notifyChanged();
    }

    public final View findScrollingChild(ViewGroup viewGroup, float f, float f2) {
        View viewFindScrollingChild;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.rect;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f, (int) f2)) {
                    continue;
                } else {
                    if (childAt.canScrollHorizontally(-1)) {
                        return childAt;
                    }
                    if ((childAt instanceof ViewGroup) && (viewFindScrollingChild = findScrollingChild((ViewGroup) childAt, f - rect.left, f2 - rect.top)) != null) {
                        return viewFindScrollingChild;
                    }
                }
            }
        }
        return null;
    }

    public float getAvailableTranslationX() {
        return AndroidUtilities.displaySize.x;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public float getCurrentPositionAlpha() {
        View[] viewArr = this.viewPages;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public View getCurrentView() {
        return this.viewPages[0];
    }

    public long getManualScrollDuration() {
        return 540L;
    }

    public int getNextPosition() {
        return this.nextPosition;
    }

    public float getNextPositionAlpha() {
        View[] viewArr = this.viewPages;
        View view = viewArr[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float fClamp;
        View[] viewArr = this.viewPages;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            fClamp = 0.0f;
        } else {
            fClamp = (this.currentPosition * Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
        }
        View view2 = viewArr[1];
        if (view2 == null || view2.getVisibility() != 0) {
            return fClamp;
        }
        return (this.nextPosition * Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + fClamp;
    }

    public View[] getViewPages() {
        return this.viewPages;
    }

    public void invalidateBlur() {
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AnonymousClass3 anonymousClass3 = this.tabsView;
        if (anonymousClass3 != null && anonymousClass3.animatingIndicator) {
            return false;
        }
        if (checkTabsAnimationInProgress()) {
            return true;
        }
        onTouchEvent(motionEvent);
        return this.startedTracking;
    }

    public void onItemSelected(View view, View view2, int i, int i2) {
    }

    public void onScrollEnd() {
    }

    public void onStartTracking() {
    }

    public void onTabAnimationUpdate(boolean z) {
    }

    public void onTabPageSelected(int i) {
    }

    public void onTabScrollEnd(int i) {
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return onTouchEventInternal(motionEvent);
    }

    public final boolean onTouchEventInternal(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ViewPagerFixed.onTouchEventInternal(android.view.MotionEvent):boolean");
    }

    public final boolean prepareForMoving$1(MotionEvent motionEvent, boolean z) {
        if (!z && this.currentPosition == 0) {
            this.backProgress = 0.0f;
            return false;
        }
        if ((z && this.currentPosition == this.adapter.getItemCount() - 1) || this.manualScrolling != null || !canScroll(motionEvent) || ((z && !canScrollForward(motionEvent)) || (!z && !canScrollBackward(motionEvent)))) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.maybeStartTracking = false;
        this.startedTracking = true;
        onStartTracking();
        this.startedTrackingX = (int) (motionEvent.getX() + this.additionalOffset);
        AnonymousClass3 anonymousClass3 = this.tabsView;
        if (anonymousClass3 != null) {
            anonymousClass3.setEnabled(false);
        }
        this.notificationsLocker.lock();
        this.animatingForward = z;
        this.nextPosition = this.currentPosition + (z ? 1 : -1);
        updateViewForIndex(1);
        View[] viewArr = this.viewPages;
        View view = viewArr[1];
        if (view != null) {
            if (z) {
                setTranslationX(view, viewArr[0].getMeasuredWidth());
            } else {
                setTranslationX(view, -viewArr[0].getMeasuredWidth());
            }
        }
        onTabAnimationUpdate(false);
        return true;
    }

    public final void rebuild(boolean z) {
        int i = 2;
        onTouchEvent(null);
        Adapter adapter = this.adapter;
        adapter.getClass();
        if (!(adapter instanceof CachedMediaLayout.AnonymousClass1)) {
            z = false;
        }
        AnimatorSet animatorSet = this.tabsAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.tabsAnimation = null;
        }
        View[] viewArr = this.viewPages;
        View view = viewArr[1];
        if (view != null) {
            removeView(view);
            viewArr[1] = null;
        }
        View view2 = viewArr[0];
        viewArr[1] = view2;
        int iIntValue = (view2 == null || view2.getTag() == null) ? 0 : ((Integer) viewArr[1].getTag()).intValue();
        if (this.adapter.getItemCount() == 0) {
            View view3 = viewArr[1];
            if (view3 != null) {
                removeView(view3);
                viewArr[1] = null;
            }
            View view4 = viewArr[0];
            if (view4 != null) {
                removeView(view4);
                viewArr[0] = null;
                return;
            }
            return;
        }
        if (this.currentPosition > this.adapter.getItemCount() - 1) {
            this.currentPosition = this.adapter.getItemCount() - 1;
        }
        if (this.currentPosition < 0) {
            this.currentPosition = 0;
        }
        int itemViewType = this.adapter.getItemViewType(this.currentPosition);
        int[] iArr = this.viewTypes;
        iArr[0] = itemViewType;
        View viewCreateView = this.adapter.createView(itemViewType);
        viewArr[0] = viewCreateView;
        this.adapter.bindView(viewCreateView, this.currentPosition, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        if ((viewArr[0].getTag() == null ? 0 : ((Integer) viewArr[0].getTag()).intValue()) == iIntValue) {
            z = false;
        }
        if (z) {
            this.tabsView.getClass();
        }
        fillTabs$1(z);
        if (!z) {
            View view5 = viewArr[1];
            if (view5 != null) {
                removeView(view5);
                viewArr[1] = null;
                return;
            }
            return;
        }
        this.tabsAnimation = new AnimatorSet();
        View view6 = viewArr[1];
        if (view6 != null) {
            setTranslationX(view6, 0.0f);
        }
        View view7 = viewArr[0];
        if (view7 != null) {
            setTranslationX(view7, -getMeasuredWidth());
        }
        View view8 = viewArr[1];
        if (view8 != null) {
            this.tabsAnimation.playTogether(translateAnimator(view8, getMeasuredWidth()));
        }
        View view9 = viewArr[0];
        if (view9 != null) {
            this.tabsAnimation.playTogether(translateAnimator(view9, 0.0f));
        }
        onTabAnimationUpdate(true);
        AnonymousClass3 anonymousClass3 = this.tabsView;
        anonymousClass3.indicatorProgress2 = 0.0f;
        anonymousClass3.listView.invalidateViews();
        this.tabsView.invalidate();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ViewPagerFixed$$ExternalSyntheticLambda0(this, i));
        this.tabsAnimation.playTogether(valueAnimatorOfFloat);
        this.tabsAnimation.setInterpolator(interpolator);
        this.tabsAnimation.setDuration(220L);
        this.tabsAnimation.addListener(new AnonymousClass2(this, i));
        this.tabsView.setEnabled(false);
        this.tabsAnimationInProgress = true;
        this.tabsAnimation.start();
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.allowDisallowInterceptTouch && this.maybeStartTracking && !this.startedTracking) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void scrollToPosition$1(int i) {
        int i2 = 0;
        if (i != this.currentPosition) {
            ValueAnimator valueAnimator = this.manualScrolling;
            if (valueAnimator == null || this.nextPosition != i) {
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.manualScrolling = null;
                }
                boolean z = this.currentPosition < i;
                this.animatingForward = z;
                this.nextPosition = i;
                updateViewForIndex(1);
                onTabPageSelected(i, z);
                View[] viewArr = this.viewPages;
                View view = viewArr[0];
                int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
                if (z) {
                    setTranslationX(viewArr[1], measuredWidth);
                } else {
                    setTranslationX(viewArr[1], -measuredWidth);
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.manualScrolling = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ViewPagerFixed$$ExternalSyntheticLambda0(this, i2));
                this.manualScrolling.addListener(new AnonymousClass2(this, i2));
                this.manualScrolling.setDuration(getManualScrollDuration());
                this.manualScrolling.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.manualScrolling.start();
            }
        }
    }

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
        int itemViewType = adapter.getItemViewType(this.currentPosition);
        int[] iArr = this.viewTypes;
        iArr[0] = itemViewType;
        View viewCreateView = adapter.createView(itemViewType);
        View[] viewArr = this.viewPages;
        viewArr[0] = viewCreateView;
        if (viewCreateView == null && this.currentPosition != 0) {
            this.currentPosition = 0;
            int itemViewType2 = adapter.getItemViewType(0);
            iArr[0] = itemViewType2;
            viewArr[0] = adapter.createView(itemViewType2);
        }
        adapter.bindView(viewArr[0], this.currentPosition, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        fillTabs$1(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z) {
        this.allowDisallowInterceptTouch = z;
    }

    public void setPosition(int i) {
        if (this.adapter == null) {
            this.currentPosition = i;
            onTabAnimationUpdate(false);
        }
        AnimatorSet animatorSet = this.tabsAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View[] viewArr = this.viewPages;
        View view = viewArr[1];
        if (view != null) {
            this.viewsByType.put(this.viewTypes[1], view);
            removeView(viewArr[1]);
            viewArr[1] = null;
        }
        int i2 = this.currentPosition;
        if (i2 != i) {
            this.currentPosition = i;
            this.nextPosition = 0;
            this.currentProgress = 1.0f;
            View view2 = viewArr[0];
            updateViewForIndex(0);
            onItemSelected(viewArr[0], view2, this.currentPosition, i2);
            setTranslationX(viewArr[0], 0.0f);
            AnonymousClass3 anonymousClass3 = this.tabsView;
            if (anonymousClass3 != null) {
                anonymousClass3.selectTab(this.currentProgress, this.currentPosition, this.nextPosition);
            }
            onTabAnimationUpdate(true);
        }
    }

    public void setTranslationX(View view, float f) {
        view.setTranslationX(f);
    }

    public void swapViews() {
        View[] viewArr = this.viewPages;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i = this.currentPosition;
        int i2 = this.nextPosition;
        this.currentPosition = i2;
        this.nextPosition = i;
        this.currentProgress = 1.0f - this.currentProgress;
        int[] iArr = this.viewTypes;
        int i3 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i3;
        onItemSelected(view2, view, i2, i);
    }

    public int tabMarginDp() {
        return 16;
    }

    public final ValueAnimator translateAnimator(final View view, final float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getTranslationX(), f);
        valueAnimatorOfFloat.addUpdateListener(new StickerTabView.AnonymousClass2(this, view, 1));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            public boolean canceled;

            @Override
            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.canceled = true;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                if (this.canceled) {
                    return;
                }
                ViewPagerFixed.this.setTranslationX(view, f);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final void updateViewForIndex(int i) {
        int i2 = i == 0 ? this.currentPosition : this.nextPosition;
        if (i2 < 0 || i2 >= this.adapter.getItemCount()) {
            return;
        }
        View[] viewArr = this.viewPages;
        View view = viewArr[i];
        SparseArray sparseArray = this.viewsByType;
        int[] iArr = this.viewTypes;
        if (view == null) {
            int itemViewType = this.adapter.getItemViewType(i2);
            iArr[i] = itemViewType;
            View viewCreateView = (View) sparseArray.get(itemViewType);
            if (viewCreateView == null) {
                viewCreateView = this.adapter.createView(iArr[i]);
            } else {
                sparseArray.remove(iArr[i]);
            }
            if (viewCreateView.getParent() != null) {
                ((ViewGroup) viewCreateView.getParent()).removeView(viewCreateView);
            }
            addView(viewCreateView);
            viewCreateView.setTranslationX(getMeasuredWidth());
            viewArr[i] = viewCreateView;
            this.adapter.bindView(viewCreateView, i2, iArr[i]);
            viewArr[i].setVisibility(0);
            return;
        }
        if (iArr[i] == this.adapter.getItemViewType(i2)) {
            this.adapter.bindView(viewArr[i], i2, iArr[i]);
            viewArr[i].setVisibility(0);
            return;
        }
        sparseArray.put(iArr[i], viewArr[i]);
        viewArr[i].setVisibility(8);
        removeView(viewArr[i]);
        int itemViewType2 = this.adapter.getItemViewType(i2);
        iArr[i] = itemViewType2;
        View viewCreateView2 = (View) sparseArray.get(itemViewType2);
        if (viewCreateView2 == null) {
            viewCreateView2 = this.adapter.createView(iArr[i]);
        } else {
            sparseArray.remove(iArr[i]);
        }
        addView(viewCreateView2);
        viewArr[i] = viewCreateView2;
        viewCreateView2.setVisibility(0);
        Adapter adapter = this.adapter;
        adapter.bindView(viewArr[i], i2, adapter.getItemViewType(i2));
    }

    public void onTabPageSelected(int i, boolean z) {
        onTabPageSelected(i);
    }

    public abstract class TabsView extends FrameLayout {
        public static final int $r8$clinit = 0;
        public int activeTextColorKey;
        public final FloatingDebugView.AnonymousClass3 adapter;
        public int additionalTabWidth;
        public int allTabsWidth;
        public boolean animatingIndicator;
        public float animatingIndicatorProgress;
        public final LaunchActivity.AnonymousClass18 animationRunnable;
        public float animationTime;
        public int backgroundColorKey;
        public BlurredBackgroundDrawable blurredBackgroundDrawable;
        public final Paint counterPaint;
        public int currentPosition;
        public TabsViewDelegate delegate;
        public final TextPaint deletePaint;
        public float hideProgress;
        public final SparseIntArray idToPosition;
        public boolean ignoreLayout;
        public float indicatorProgress2;
        public final CubicBezierInterpolator interpolator;
        public boolean isEditing;
        public boolean isInHiddenMode;
        public AnonymousClass7 itemAnimator;
        public ItemTouchHelper itemTouchHelper;
        public float lastDrawnIndicatorW;
        public final StickersActivity.AnonymousClass2 layoutManager;
        public final AnonymousClass2 listView;
        public int manualScrollingToId;
        public int manualScrollingToPosition;
        public Utilities.Callback2Return onTabLongClick;
        public final SparseIntArray positionToId;
        public final SparseIntArray positionToWidth;
        public final SparseIntArray positionToX;
        public Utilities.Callback2Return preTabClick;
        public int prevLayoutWidth;
        public int previousId;
        public int previousPosition;
        public boolean reordering;
        public final Theme.ResourcesProvider resourcesProvider;
        public int scrollingToChild;
        public int selectedTabId;
        public int selectorColorKey;
        public final GradientDrawable selectorDrawable;
        public final Paint selectorPaint;
        public final int selectorType;
        public int tabLineColorKey;
        public int tabMarginDp;
        public final ArrayList tabs;
        public ValueAnimator tabsAnimator;
        public final TextPaint textCounterPaint;
        public final TextPaint textPaint;
        public int unactiveTextColorKey;

        public final class Tab {
            public final int id;
            public CharSequence title;
            public int titleWidth;

            public Tab(int i, CharSequence charSequence) {
                this.id = i;
                this.title = charSequence;
            }
        }

        public final class TabView extends View {
            public Tab currentTab;
            public CharSequence currentText;
            public final RectF rect;
            public boolean reordering;
            public final AnimatedFloat shakeAlpha;
            public Shaker shaker;
            public int tabWidth;
            public Text text;
            public final AnonymousClass3 this$0;

            public TabView(AnonymousClass3 anonymousClass3, Context context) {
                super(context);
                this.this$0 = anonymousClass3;
                this.rect = new RectF();
                this.shakeAlpha = new AnimatedFloat(360L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
            }

            @Override
            public int getId() {
                return this.currentTab.id;
            }

            @Override
            public final void onDraw(Canvas canvas) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                Canvas canvas2;
                int i7;
                int i8;
                canvas.save();
                float f = this.shakeAlpha.set(this.reordering);
                if (f > 0.0f) {
                    if (this.shaker == null) {
                        this.shaker = new Shaker(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    this.shaker.concat(canvas, f);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                int i9 = this.currentTab.id;
                if (i9 != Integer.MAX_VALUE) {
                    int i10 = TabsView.$r8$clinit;
                }
                AnonymousClass3 anonymousClass3 = this.this$0;
                int i11 = anonymousClass3.manualScrollingToId;
                if (i11 != -1) {
                    i = i11;
                    i2 = anonymousClass3.selectedTabId;
                } else {
                    i = anonymousClass3.selectedTabId;
                    i2 = anonymousClass3.previousId;
                }
                if (i9 == i) {
                    i3 = anonymousClass3.activeTextColorKey;
                    i4 = anonymousClass3.unactiveTextColorKey;
                    i5 = Theme.key_chats_tabUnreadActiveBackground;
                    i6 = Theme.key_chats_tabUnreadUnactiveBackground;
                } else {
                    i3 = anonymousClass3.unactiveTextColorKey;
                    i4 = anonymousClass3.activeTextColorKey;
                    i5 = Theme.key_chats_tabUnreadUnactiveBackground;
                    i6 = Theme.key_chats_tabUnreadActiveBackground;
                }
                int i12 = i6;
                int i13 = i5;
                TextPaint textPaint = anonymousClass3.textPaint;
                Theme.ResourcesProvider resourcesProvider = anonymousClass3.resourcesProvider;
                if (anonymousClass3.selectorType == 9) {
                    textPaint.setColor(Theme.getColor(anonymousClass3.unactiveTextColorKey, resourcesProvider));
                } else if ((anonymousClass3.animatingIndicator || i11 != -1) && (i9 == i || i9 == i2)) {
                    textPaint.setColor(ColorUtils.blendARGB(anonymousClass3.animatingIndicatorProgress, Theme.getColor(i4, resourcesProvider), Theme.getColor(i3, resourcesProvider)));
                } else {
                    textPaint.setColor(Theme.getColor(i3, resourcesProvider));
                }
                this.currentTab.getClass();
                int iDp = (this.currentTab.id == Integer.MAX_VALUE || !anonymousClass3.isEditing) ? 0 : (int) ((AndroidUtilities.dp(20.0f) * 0.0f) + 0);
                this.tabWidth = this.currentTab.titleWidth + (iDp != 0 ? AndroidUtilities.dp(0.0f) + iDp : 0);
                int measuredWidth = (getMeasuredWidth() - this.tabWidth) / 2;
                CharSequence charSequence = this.currentTab.title;
                if ((charSequence == null && this.currentText != null) || !TextUtils.equals(charSequence, this.currentText)) {
                    Tab tab = this.currentTab;
                    CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(tab.title, textPaint.getFontMetricsInt(), false);
                    tab.title = charSequenceReplaceEmoji;
                    this.currentText = charSequenceReplaceEmoji;
                    Text text = this.text;
                    if (text != null) {
                        AnimatedEmojiSpan.release(text.parentView, text.animatedEmojis);
                    }
                    Text text2 = new Text(this.currentText, textPaint.getTextSize() / AndroidUtilities.density, textPaint.getTypeface());
                    text2.supportAnimatedEmojis(this);
                    this.text = text2;
                }
                Text text3 = this.text;
                if (text3 != null) {
                    text3.ellipsizeWidth = AndroidUtilities.dp(400.0f);
                    i7 = measuredWidth;
                    text3.draw(measuredWidth, getMeasuredHeight() / 2, 1.0f, textPaint.getColor(), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    i7 = measuredWidth;
                }
                if (this.currentTab.id != Integer.MAX_VALUE && anonymousClass3.isEditing) {
                    TextPaint textPaint2 = anonymousClass3.textCounterPaint;
                    textPaint2.setColor(Theme.getColor(anonymousClass3.backgroundColorKey, resourcesProvider));
                    boolean zHasThemeKey = Theme.hasThemeKey(i13);
                    Paint paint = anonymousClass3.counterPaint;
                    if (zHasThemeKey && Theme.hasThemeKey(i12)) {
                        int color = Theme.getColor(i13, resourcesProvider);
                        if ((anonymousClass3.animatingIndicator || anonymousClass3.manualScrollingToPosition != -1) && ((i8 = this.currentTab.id) == i || i8 == i2)) {
                            paint.setColor(ColorUtils.blendARGB(anonymousClass3.animatingIndicatorProgress, Theme.getColor(i12, resourcesProvider), color));
                        } else {
                            paint.setColor(color);
                        }
                    } else {
                        paint.setColor(textPaint.getColor());
                    }
                    int iDp2 = AndroidUtilities.dp(6.0f) + i7 + this.currentTab.titleWidth;
                    int iM$2 = OKLCH.m$2(20.0f, getMeasuredHeight(), 2);
                    if (this.currentTab.id == Integer.MAX_VALUE || !anonymousClass3.isEditing) {
                        paint.setAlpha(255);
                    } else {
                        paint.setAlpha((int) 0.0f);
                    }
                    RectF rectF = this.rect;
                    rectF.set(iDp2, iM$2, iDp2 + iDp, AndroidUtilities.dp(20.0f) + iM$2);
                    float f2 = AndroidUtilities.density * 11.5f;
                    canvas2.drawRoundRect(rectF, f2, f2, paint);
                    if (this.currentTab.id != Integer.MAX_VALUE && anonymousClass3.isEditing) {
                        TextPaint textPaint3 = anonymousClass3.deletePaint;
                        textPaint3.setColor(textPaint2.getColor());
                        textPaint3.setAlpha((int) 0.0f);
                        float fDp = AndroidUtilities.dp(3.0f);
                        canvas2.drawLine(rectF.centerX() - fDp, rectF.centerY() - fDp, rectF.centerX() + fDp, rectF.centerY() + fDp, textPaint3);
                        canvas.drawLine(rectF.centerX() - fDp, rectF.centerY() + fDp, rectF.centerX() + fDp, rectF.centerY() - fDp, textPaint3);
                    }
                }
                int i14 = this.currentTab.id;
                canvas.restore();
            }

            @Override
            public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                int i;
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                Tab tab = this.currentTab;
                accessibilityNodeInfo.setSelected((tab == null || (i = this.this$0.selectedTabId) == -1 || tab.id != i) ? false : true);
            }

            @Override
            public final void onMeasure(int i, int i2) {
                Tab tab = this.currentTab;
                AnonymousClass3 anonymousClass3 = this.this$0;
                int iCeil = (int) Math.ceil(HintView2.measureCorrectly(tab.title, anonymousClass3.textPaint));
                tab.titleWidth = iCeil;
                setMeasuredDimension(AndroidUtilities.dp(anonymousClass3.tabMarginDp * 2) + Math.max(0, iCeil) + anonymousClass3.additionalTabWidth, View.MeasureSpec.getSize(i2));
            }

            public void setReordering(boolean z) {
                if (this.reordering == z) {
                    return;
                }
                this.reordering = z;
                invalidate();
            }
        }

        public interface TabsViewDelegate {
        }

        public TabsView(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context);
            int i2 = 8;
            this.indicatorProgress2 = 1.0f;
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            TextPaint textPaint2 = new TextPaint(1);
            this.textCounterPaint = textPaint2;
            TextPaint textPaint3 = new TextPaint(1);
            this.deletePaint = textPaint3;
            this.counterPaint = new Paint(1);
            this.tabs = new ArrayList();
            this.tabMarginDp = 16;
            this.selectedTabId = -1;
            this.manualScrollingToPosition = -1;
            this.manualScrollingToId = -1;
            this.scrollingToChild = -1;
            this.tabLineColorKey = Theme.key_profile_tabSelectedLine;
            this.activeTextColorKey = Theme.key_profile_tabSelectedText;
            this.unactiveTextColorKey = Theme.key_profile_tabText;
            this.selectorColorKey = Theme.key_profile_tabSelector;
            this.backgroundColorKey = Theme.key_actionBarDefault;
            this.interpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.positionToId = new SparseIntArray(5);
            this.idToPosition = new SparseIntArray(5);
            this.positionToWidth = new SparseIntArray(5);
            this.positionToX = new SparseIntArray(5);
            final AnonymousClass3 anonymousClass3 = (AnonymousClass3) this;
            this.animationRunnable = new LaunchActivity.AnonymousClass18(anonymousClass3, 6);
            this.selectorPaint = new Paint(1);
            this.resourcesProvider = resourcesProvider;
            this.selectorType = i;
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            textPaint.setTextSize(AndroidUtilities.dp((i == 9 || i == 10 || i == -2) ? 14.0f : 15.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint3.setStyle(Paint.Style.STROKE);
            textPaint3.setStrokeCap(Paint.Cap.ROUND);
            textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
            this.selectorDrawable = gradientDrawable;
            gradientDrawable.setColor(Theme.getColor(this.tabLineColorKey, resourcesProvider));
            if (i == -2) {
                float fDpf2 = AndroidUtilities.dpf2(13.0f);
                gradientDrawable.setCornerRadii(new float[]{fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2});
            } else {
                float fDpf3 = AndroidUtilities.dpf2(3.0f);
                gradientDrawable.setCornerRadii(new float[]{fDpf3, fDpf3, fDpf3, fDpf3, 0.0f, 0.0f, 0.0f, 0.0f});
            }
            setHorizontalScrollBarEnabled(false);
            ?? r6 = new RecyclerListView(context) {
                @Override
                public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
                    super.addView(view, i3, layoutParams);
                    if (anonymousClass3.isInHiddenMode) {
                        view.setScaleX(0.3f);
                        view.setScaleY(0.3f);
                        view.setAlpha(0.0f);
                    } else {
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        view.setAlpha(1.0f);
                    }
                }

                @Override
                public final boolean canHighlightChildAt(View view, float f, float f2) {
                    if (!anonymousClass3.isEditing) {
                        return true;
                    }
                    int iDp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((TabView) view).rect;
                    float f3 = iDp;
                    return rectF.left - f3 >= f || rectF.right + f3 <= f;
                }

                @Override
                public final void setAlpha(float f) {
                    super.setAlpha(f);
                    anonymousClass3.invalidate();
                }
            };
            this.listView = r6;
            r6.setOverScrollMode(2);
            if (z) {
                r6.setItemAnimator(null);
            } else {
                ((DefaultItemAnimator) r6.getItemAnimator()).delayAnimations = false;
            }
            if (i == -2) {
                r6.setSelectorType(9);
                r6.setSelectorRadius(6);
            } else {
                r6.setSelectorType(i == 10 ? 9 : i);
                if (i == 3) {
                    r6.setSelectorRadius(0);
                } else {
                    r6.setSelectorRadius(6);
                }
            }
            r6.setSelectorDrawableColor(Theme.getColor(this.selectorColorKey, resourcesProvider));
            StickersActivity.AnonymousClass2 anonymousClass2 = new StickersActivity.AnonymousClass2((ViewGroup) anonymousClass3, i2);
            this.layoutManager = anonymousClass2;
            r6.setLayoutManager(anonymousClass2);
            r6.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
            r6.setClipToPadding(false);
            r6.setDrawSelectorBehind(true);
            FloatingDebugView.AnonymousClass3 anonymousClass4 = new FloatingDebugView.AnonymousClass3(3, context, anonymousClass3);
            this.adapter = anonymousClass4;
            anonymousClass4.setHasStableIds(z);
            r6.setAdapter(anonymousClass4);
            AnonymousClass3 anonymousClass5 = (AnonymousClass3) this;
            r6.setOnItemClickListener(new ViewPagerFixed$TabsView$$ExternalSyntheticLambda0(anonymousClass5));
            r6.setOnItemLongClickListener(new ViewPagerFixed$TabsView$$ExternalSyntheticLambda0(anonymousClass5));
            r6.setOnScrollListener(new LocationActivity.AnonymousClass10(anonymousClass3, 12));
            if (i == 9 || i == 10) {
                addView((View) r6, LayoutHelper.createFrame(-2, -1, 1));
            } else {
                addView((View) r6, LayoutHelper.createFrame(-1.0f, -1));
            }
        }

        public final void addTab(int i, CharSequence charSequence) {
            ArrayList arrayList = this.tabs;
            int size = arrayList.size();
            if (size == 0 && this.selectedTabId == -1) {
                this.selectedTabId = i;
            }
            this.positionToId.put(size, i);
            this.idToPosition.put(i, size);
            int i2 = this.selectedTabId;
            if (i2 != -1 && i2 == i) {
                this.currentPosition = size;
            }
            Tab tab = new Tab(i, charSequence);
            int i3 = this.allTabsWidth;
            int iCeil = (int) Math.ceil(HintView2.measureCorrectly(charSequence, this.textPaint));
            tab.titleWidth = iCeil;
            this.allTabsWidth = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(Math.max(0, iCeil), this.tabMarginDp * 2, i3);
            arrayList.add(tab);
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            float f;
            float f2;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
            int i;
            int i2;
            int iDp;
            int iLerp;
            boolean zDrawChild = super.drawChild(canvas, view, j);
            AnonymousClass2 anonymousClass2 = this.listView;
            if (view == anonymousClass2) {
                int measuredHeight = getMeasuredHeight();
                boolean z = this.isInHiddenMode;
                if (z) {
                    float f3 = this.hideProgress;
                    if (f3 != 1.0f) {
                        float f4 = f3 + 0.1f;
                        this.hideProgress = f4;
                        if (f4 > 1.0f) {
                            this.hideProgress = 1.0f;
                        }
                        invalidate();
                    } else if (!z) {
                        f = this.hideProgress;
                        if (f != 0.0f) {
                            f2 = f - 0.12f;
                            this.hideProgress = f2;
                            if (f2 < 0.0f) {
                                this.hideProgress = 0.0f;
                            }
                            invalidate();
                        }
                    }
                } else if (!z) {
                    f = this.hideProgress;
                    if (f != 0.0f) {
                        f2 = f - 0.12f;
                        this.hideProgress = f2;
                        if (f2 < 0.0f) {
                            this.hideProgress = 0.0f;
                        }
                        invalidate();
                    }
                }
                GradientDrawable gradientDrawable = this.selectorDrawable;
                gradientDrawable.setAlpha((int) (anonymousClass2.getAlpha() * 255.0f));
                if (this.animatingIndicator || this.manualScrollingToPosition != -1) {
                    int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition == -1 || (viewHolderFindViewHolderForAdapterPosition = anonymousClass2.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition)) == null) {
                        iLerp = 0;
                        iDp = 0;
                    } else {
                        if (this.animatingIndicator) {
                            i = this.previousPosition;
                            i2 = this.currentPosition;
                        } else {
                            i = this.currentPosition;
                            i2 = this.manualScrollingToPosition;
                        }
                        SparseIntArray sparseIntArray = this.positionToX;
                        int i3 = sparseIntArray.get(i);
                        int i4 = sparseIntArray.get(i2);
                        SparseIntArray sparseIntArray2 = this.positionToWidth;
                        int i5 = sparseIntArray2.get(i);
                        int i6 = sparseIntArray2.get(i2);
                        if (this.additionalTabWidth != 0) {
                            iDp = AndroidUtilities.dp(this.tabMarginDp) + ((int) (((i4 - i3) * this.animatingIndicatorProgress) + i3));
                        } else {
                            iDp = AndroidUtilities.dp(this.tabMarginDp) + (((int) (((i4 - i3) * this.animatingIndicatorProgress) + i3)) - (sparseIntArray.get(iFindFirstVisibleItemPosition) - viewHolderFindViewHolderForAdapterPosition.itemView.getLeft()));
                        }
                        iLerp = (int) (((i6 - i5) * this.animatingIndicatorProgress) + i5);
                    }
                } else {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = anonymousClass2.findViewHolderForAdapterPosition(this.currentPosition);
                    if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                        TabView tabView = (TabView) viewHolderFindViewHolderForAdapterPosition2.itemView;
                        iLerp = tabView.tabWidth;
                        iDp = (int) (tabView.getX() + ((tabView.getMeasuredWidth() - iLerp) / 2));
                    } else {
                        iLerp = 0;
                        iDp = 0;
                    }
                }
                int x = (int) (anonymousClass2.getX() + iDp);
                if (iLerp != 0) {
                    int i7 = this.selectorType;
                    if (i7 != 9 && i7 != 10) {
                        float f5 = x;
                        float f6 = iLerp;
                        this.lastDrawnIndicatorW = f6;
                        float f7 = this.indicatorProgress2;
                        if (f7 != 1.0f) {
                            x = (int) AndroidUtilities.lerp(f5, f5, f7);
                            iLerp = (int) AndroidUtilities.lerp(this.lastDrawnIndicatorW, f6, this.indicatorProgress2);
                        }
                        if (i7 != -2) {
                            gradientDrawable.setBounds(x, (int) ((this.hideProgress * AndroidUtilities.dpr(4.0f)) + (measuredHeight - AndroidUtilities.dpr(4.0f))), iLerp + x, (int) ((this.hideProgress * AndroidUtilities.dpr(4.0f)) + measuredHeight));
                            gradientDrawable.draw(canvas);
                            return zDrawChild;
                        }
                        float f8 = this.additionalTabWidth / 2.0f;
                        int iDp2 = (measuredHeight / 2) - AndroidUtilities.dp(14.0f);
                        gradientDrawable.setBounds((int) ((x - AndroidUtilities.dp(12.5f)) - f8), iDp2, (int) (AndroidUtilities.dp(12.5f) + x + iLerp + f8), AndroidUtilities.dp(28.0f) + iDp2);
                        gradientDrawable.setAlpha(31);
                        gradientDrawable.draw(canvas);
                        return zDrawChild;
                    }
                    Paint paint = this.selectorPaint;
                    paint.setColor(Theme.multAlpha(0.15f, this.textPaint.getColor()));
                    float f9 = measuredHeight / 2.0f;
                    float fDp = AndroidUtilities.dp(26.0f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f10 = fDp / 2.0f;
                    rectF.set(x - AndroidUtilities.dp(12.0f), f9 - f10, AndroidUtilities.dp(12.0f) + x + iLerp, f9 + f10);
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                }
            }
            return zDrawChild;
        }

        public float getAnimatingIndicatorProgress() {
            return this.animatingIndicatorProgress;
        }

        public int getCurrentPosition() {
            return this.currentPosition;
        }

        public int getCurrentTabId() {
            return this.selectedTabId;
        }

        public int getFirstTabId() {
            return this.positionToId.get(0, 0);
        }

        public int getPreviousPosition() {
            return this.previousPosition;
        }

        public Drawable getSelectorDrawable() {
            return this.selectorDrawable;
        }

        public RecyclerListView getTabsContainer() {
            return this.listView;
        }

        public final void hide(boolean z, boolean z2) {
            this.isInHiddenMode = z;
            int i = 0;
            AnonymousClass2 anonymousClass2 = this.listView;
            if (z2) {
                while (i < anonymousClass2.getChildCount()) {
                    anonymousClass2.getChildAt(i).animate().alpha(z ? 0.0f : 1.0f).scaleX(z ? 0.0f : 1.0f).scaleY(z ? 0.0f : 1.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).setDuration(220L).start();
                    i++;
                }
            } else {
                while (i < anonymousClass2.getChildCount()) {
                    View childAt = anonymousClass2.getChildAt(i);
                    childAt.setScaleX(z ? 0.0f : 1.0f);
                    childAt.setScaleY(z ? 0.0f : 1.0f);
                    childAt.setAlpha(z ? 0.0f : 1.0f);
                    i++;
                }
                this.hideProgress = z ? 1.0f : 0.0f;
            }
            invalidate();
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int i5 = i3 - i;
            if (this.prevLayoutWidth != i5) {
                this.prevLayoutWidth = i5;
                this.scrollingToChild = -1;
                if (this.animatingIndicator) {
                    AndroidUtilities.cancelRunOnUIThread(this.animationRunnable);
                    this.animatingIndicator = false;
                    setEnabled(true);
                    TabsViewDelegate tabsViewDelegate = this.delegate;
                    if (tabsViewDelegate != null) {
                        ((AnonymousClass4) tabsViewDelegate).onPageScrolled(1.0f);
                    }
                }
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int i3;
            ArrayList arrayList = this.tabs;
            if (!arrayList.isEmpty()) {
                int size = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(7.0f)) - AndroidUtilities.dp(7.0f);
                int i4 = this.additionalTabWidth;
                if (arrayList.size() == 1 || (i3 = this.selectorType) == 9 || i3 == 10) {
                    this.additionalTabWidth = 0;
                } else {
                    int i5 = this.allTabsWidth;
                    this.additionalTabWidth = i5 < size ? (size - i5) / arrayList.size() : 0;
                }
                if (i4 != this.additionalTabWidth) {
                    this.ignoreLayout = true;
                    this.adapter.mObservable.notifyChanged();
                    this.ignoreLayout = false;
                }
                SparseIntArray sparseIntArray = this.positionToX;
                sparseIntArray.clear();
                SparseIntArray sparseIntArray2 = this.positionToWidth;
                sparseIntArray2.clear();
                int iDp = AndroidUtilities.dp(7.0f);
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    Tab tab = (Tab) arrayList.get(i6);
                    int iCeil = (int) Math.ceil(HintView2.measureCorrectly(tab.title, this.textPaint));
                    tab.titleWidth = iCeil;
                    int iMax = Math.max(0, iCeil);
                    sparseIntArray2.put(i6, iMax);
                    sparseIntArray.put(i6, (this.additionalTabWidth / 2) + iDp);
                    iDp += AndroidUtilities.dp(this.tabMarginDp * 2) + iMax + this.additionalTabWidth;
                }
            }
            super.onMeasure(i, i2);
        }

        @Override
        public final void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        public final void scrollToChild(int i) {
            ArrayList arrayList = this.tabs;
            if (arrayList.isEmpty() || this.scrollingToChild == i || i < 0 || i >= arrayList.size()) {
                return;
            }
            this.scrollingToChild = i;
            AnonymousClass2 anonymousClass2 = this.listView;
            if (anonymousClass2.getVisibility() == 8 || anonymousClass2.getMeasuredWidth() == 0) {
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda17(this, i, 9), 100L);
            } else {
                anonymousClass2.smoothScrollToPosition(i);
            }
        }

        public final void scrollToTab(int i, int i2) {
            int i3 = 2;
            int i4 = this.currentPosition;
            boolean z = i4 < i2;
            this.scrollingToChild = -1;
            this.previousPosition = i4;
            this.previousId = this.selectedTabId;
            TabsViewDelegate tabsViewDelegate = this.delegate;
            if (tabsViewDelegate != null) {
                Adapter adapter = ViewPagerFixed.this.adapter;
            }
            this.currentPosition = i2;
            this.selectedTabId = i;
            ValueAnimator valueAnimator = this.tabsAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.animatingIndicator) {
                this.animatingIndicator = false;
            }
            this.animationTime = 0.0f;
            this.animatingIndicatorProgress = 0.0f;
            this.animatingIndicator = true;
            setEnabled(false);
            TabsViewDelegate tabsViewDelegate2 = this.delegate;
            if (tabsViewDelegate2 != null) {
                ViewPagerFixed viewPagerFixed = ViewPagerFixed.this;
                viewPagerFixed.animatingForward = z;
                viewPagerFixed.nextPosition = i2;
                viewPagerFixed.updateViewForIndex(1);
                viewPagerFixed.onTabPageSelected(i2, z);
                View[] viewArr = viewPagerFixed.viewPages;
                View view = viewArr[0];
                int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
                View view2 = viewArr[1];
                if (view2 != null) {
                    if (z) {
                        viewPagerFixed.setTranslationX(view2, measuredWidth);
                    } else {
                        viewPagerFixed.setTranslationX(view2, -measuredWidth);
                    }
                }
            }
            scrollToChild(this.currentPosition);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.tabsAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, i3));
            this.tabsAnimator.setDuration(250L);
            this.tabsAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.tabsAnimator.addListener(new Tooltip.AnonymousClass1(this, 19));
            this.tabsAnimator.start();
        }

        public final void selectTabWithId(float f, int i) {
            int i2 = this.idToPosition.get(i, -1);
            if (i2 < 0) {
                return;
            }
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f > 0.0f) {
                this.manualScrollingToPosition = i2;
                this.manualScrollingToId = i;
            } else {
                this.manualScrollingToPosition = -1;
                this.manualScrollingToId = -1;
            }
            this.animatingIndicatorProgress = f;
            invalidateViews();
            invalidate();
            scrollToChild(i2);
            if (f >= 1.0f) {
                this.manualScrollingToPosition = -1;
                this.manualScrollingToId = -1;
                this.currentPosition = i2;
                this.selectedTabId = i;
            }
        }

        public void setAnimationIdicatorProgress(float f) {
            this.animatingIndicatorProgress = f;
            invalidateViews();
            invalidate();
            TabsViewDelegate tabsViewDelegate = this.delegate;
            if (tabsViewDelegate != null) {
                ((AnonymousClass4) tabsViewDelegate).onPageScrolled(f);
            }
        }

        public void setBlurredBackground(BlurredBackgroundDrawable blurredBackgroundDrawable) {
            this.blurredBackgroundDrawable = blurredBackgroundDrawable;
            setBackground(blurredBackgroundDrawable);
        }

        public void setDelegate(TabsViewDelegate tabsViewDelegate) {
            this.delegate = tabsViewDelegate;
        }

        public void setIsEditing(boolean z) {
            this.isEditing = z;
            invalidateViews();
            invalidate();
        }

        public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
            this.onTabLongClick = callback2Return;
        }

        public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
            this.preTabClick = callback2Return;
        }

        public void setReordering(boolean z) {
            if (this.reordering == z) {
                return;
            }
            this.reordering = z;
            if (z && this.itemTouchHelper == null) {
                this.itemTouchHelper = new ItemTouchHelper(new AnonymousClass6(this, 0));
            }
            if (this.reordering && this.itemAnimator == null) {
                ?? r0 = new DefaultItemAnimator() {
                    @Override
                    public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                        TabsView.this.invalidate();
                    }
                };
                this.itemAnimator = r0;
                r0.mSupportsChangeAnimations = false;
                r0.delayAnimations = false;
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                r0.mAddInterpolator = cubicBezierInterpolator;
                r0.mMoveInterpolator = cubicBezierInterpolator;
                r0.mRemoveInterpolator = cubicBezierInterpolator;
                r0.mChangeInterpolator = cubicBezierInterpolator;
                r0.setDurations(350L);
            }
            ItemTouchHelper itemTouchHelper = this.itemTouchHelper;
            AnonymousClass2 anonymousClass2 = this.listView;
            if (itemTouchHelper != null) {
                itemTouchHelper.attachToRecyclerView(z ? anonymousClass2 : null);
            }
            anonymousClass2.setItemAnimator(z ? this.itemAnimator : null);
            AndroidUtilities.forEachViews((RecyclerView) anonymousClass2, (Consumer) new ChatActivity$$ExternalSyntheticLambda141(2, this, z));
        }

        public final class AnonymousClass6 extends ItemTouchHelper.Callback {
            public final int $r8$classId;
            public final Object this$0;

            public AnonymousClass6(Object obj, int i) {
                this.$r8$classId = i;
                this.this$0 = obj;
            }

            public boolean canMove(int i) {
                PollCreateActivity pollCreateActivity = (PollCreateActivity) this.this$0;
                return !pollCreateActivity.onlyAdding || i - pollCreateActivity.answerStartRow >= pollCreateActivity.oldAnswersCount;
            }

            @Override
            public void clearView(RecyclerView.ViewHolder viewHolder) {
                switch (this.$r8$classId) {
                    case 1:
                        View view = viewHolder.itemView;
                        Object tag = view.getTag();
                        if (tag instanceof Float) {
                            float fFloatValue = ((Float) tag).floatValue();
                            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                            ViewCompat.Api21Impl.setElevation(view, fFloatValue);
                        }
                        view.setTag(null);
                        view.setTranslationX(0.0f);
                        view.setTranslationY(0.0f);
                        viewHolder.itemView.setPressed(false);
                        break;
                    case 2:
                        View view2 = viewHolder.itemView;
                        Object tag2 = view2.getTag();
                        if (tag2 instanceof Float) {
                            float fFloatValue2 = ((Float) tag2).floatValue();
                            WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                            ViewCompat.Api21Impl.setElevation(view2, fFloatValue2);
                        }
                        view2.setTag(null);
                        view2.setTranslationX(0.0f);
                        view2.setTranslationY(0.0f);
                        View view3 = viewHolder.itemView;
                        view3.setPressed(false);
                        view3.setBackground(null);
                        break;
                    case 3:
                        View view4 = viewHolder.itemView;
                        Object tag3 = view4.getTag();
                        if (tag3 instanceof Float) {
                            float fFloatValue3 = ((Float) tag3).floatValue();
                            WeakHashMap weakHashMap3 = ViewCompat.sViewPropertyAnimatorMap;
                            ViewCompat.Api21Impl.setElevation(view4, fFloatValue3);
                        }
                        view4.setTag(null);
                        view4.setTranslationX(0.0f);
                        view4.setTranslationY(0.0f);
                        viewHolder.itemView.setPressed(false);
                        break;
                    case 4:
                        View view5 = viewHolder.itemView;
                        Object tag4 = view5.getTag();
                        if (tag4 instanceof Float) {
                            float fFloatValue4 = ((Float) tag4).floatValue();
                            WeakHashMap weakHashMap4 = ViewCompat.sViewPropertyAnimatorMap;
                            ViewCompat.Api21Impl.setElevation(view5, fFloatValue4);
                        }
                        view5.setTag(null);
                        view5.setTranslationX(0.0f);
                        view5.setTranslationY(0.0f);
                        View view6 = viewHolder.itemView;
                        view6.setPressed(false);
                        if (view6.getBackground() instanceof RichEditor.DraggingDrawable) {
                            RichEditor.DraggingDrawable draggingDrawable = (RichEditor.DraggingDrawable) view6.getBackground();
                            if (draggingDrawable.dragging) {
                                draggingDrawable.dragging = false;
                                draggingDrawable.invalidateSelf();
                            }
                        }
                        UniversalRecyclerView universalRecyclerView = (UniversalRecyclerView) this.this$0;
                        if (universalRecyclerView.isReorderRemoving()) {
                            universalRecyclerView.onReorderRemove(viewHolder);
                            view6.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                        }
                        break;
                    case 5:
                        View view7 = viewHolder.itemView;
                        Object tag5 = view7.getTag();
                        if (tag5 instanceof Float) {
                            float fFloatValue5 = ((Float) tag5).floatValue();
                            WeakHashMap weakHashMap5 = ViewCompat.sViewPropertyAnimatorMap;
                            ViewCompat.Api21Impl.setElevation(view7, fFloatValue5);
                        }
                        view7.setTag(null);
                        view7.setTranslationX(0.0f);
                        view7.setTranslationY(0.0f);
                        viewHolder.itemView.setPressed(false);
                        break;
                    case 6:
                        View view8 = viewHolder.itemView;
                        Object tag6 = view8.getTag();
                        if (tag6 instanceof Float) {
                            float fFloatValue6 = ((Float) tag6).floatValue();
                            WeakHashMap weakHashMap6 = ViewCompat.sViewPropertyAnimatorMap;
                            ViewCompat.Api21Impl.setElevation(view8, fFloatValue6);
                        }
                        view8.setTag(null);
                        view8.setTranslationX(0.0f);
                        view8.setTranslationY(0.0f);
                        viewHolder.itemView.setPressed(false);
                        break;
                    default:
                        super.clearView(viewHolder);
                        break;
                }
            }

            @Override
            public final int getMovementFlags(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder) {
                int i;
                switch (this.$r8$classId) {
                    case 0:
                        TabsViewDelegate tabsViewDelegate = ((TabsView) this.this$0).delegate;
                        int adapterPosition = viewHolder.getAdapterPosition();
                        Adapter adapter = ViewPagerFixed.this.adapter;
                        return adapter == null ? false : adapter.canReorder(adapterPosition) ? ItemTouchHelper.Callback.makeMovementFlags(12, 0) : ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                    case 1:
                        return (viewHolder.mItemViewType == 1 && ((ChangeUsernameActivity.UsernameCell) viewHolder.itemView).active) ? ItemTouchHelper.Callback.makeMovementFlags(3, 0) : ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                    case 2:
                        return viewHolder.mItemViewType != 5 ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(3, 0);
                    case 3:
                        int adapterPosition2 = viewHolder.getAdapterPosition();
                        SearchDownloadsContainer searchDownloadsContainer = (SearchDownloadsContainer) this.this$0;
                        return (adapterPosition2 < searchDownloadsContainer.downloadingFilesStartRow || viewHolder.getAdapterPosition() >= searchDownloadsContainer.downloadingFilesEndRow) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(3, 0);
                    case 4:
                        UniversalRecyclerView universalRecyclerView = (UniversalRecyclerView) this.this$0;
                        if (!universalRecyclerView.reorderingAllowed || universalRecyclerView.adapter.getReorderSectionId(viewHolder.getAdapterPosition()) < 0) {
                            return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                        }
                        if (universalRecyclerView.layoutManager.mOrientation == 0) {
                            if (universalRecyclerView.reorderingOnOtherAxis) {
                                i = 15;
                            } else {
                                i = 12;
                            }
                        } else if (universalRecyclerView.reorderingOnOtherAxis) {
                            i = 15;
                        } else {
                            i = 3;
                        }
                        return ItemTouchHelper.Callback.makeMovementFlags(i, 0);
                    case 5:
                        return (viewHolder.mItemViewType == 5 && canMove(viewHolder.getAdapterPosition())) ? ItemTouchHelper.Callback.makeMovementFlags(3, 0) : ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                    default:
                        BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditContainer.BotPreviewsEditLangContainer) this.this$0;
                        if (!SharedMediaLayout.this.isActionModeShowed || !botPreviewsEditLangContainer.adapter.canReorder(viewHolder.getAdapterPosition())) {
                            return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                        }
                        botPreviewsEditLangContainer.listView.setItemAnimator(botPreviewsEditLangContainer.itemAnimator);
                        return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
                }
            }

            @Override
            public boolean isLongPressDragEnabled() {
                switch (this.$r8$classId) {
                    case 3:
                        return ((SearchDownloadsContainer) this.this$0).uiCallback.actionModeShowing();
                    case 4:
                        UniversalRecyclerView universalRecyclerView = (UniversalRecyclerView) this.this$0;
                        return universalRecyclerView.reorderingAllowed && universalRecyclerView.reorderingLongPressEnabled;
                    case 5:
                        return true;
                    case 6:
                        return SharedMediaLayout.this.isActionModeShowed;
                    default:
                        return super.isLongPressDragEnabled();
                }
            }

            @Override
            public void onChildDraw(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
                Object obj = this.this$0;
                int i2 = 0;
                float f3 = 0.0f;
                switch (this.$r8$classId) {
                    case 0:
                        View view = viewHolder.itemView;
                        if (z && view.getTag() == null) {
                            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                            Float fValueOf = Float.valueOf(ViewCompat.Api21Impl.getElevation(view));
                            int childCount = recyclerView.getChildCount();
                            while (i2 < childCount) {
                                View childAt = recyclerView.getChildAt(i2);
                                if (childAt != view) {
                                    float elevation = ViewCompat.Api21Impl.getElevation(childAt);
                                    if (elevation > f3) {
                                        f3 = elevation;
                                    }
                                }
                                i2++;
                            }
                            ViewCompat.Api21Impl.setElevation(view, f3 + 1.0f);
                            view.setTag(fValueOf);
                        }
                        view.setTranslationX(f);
                        view.setTranslationY(f2);
                        ((TabsView) obj).invalidate();
                        break;
                    case 1:
                        View view2 = viewHolder.itemView;
                        if (z && view2.getTag() == null) {
                            WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                            Float fValueOf2 = Float.valueOf(ViewCompat.Api21Impl.getElevation(view2));
                            int childCount2 = recyclerView.getChildCount();
                            while (i2 < childCount2) {
                                View childAt2 = recyclerView.getChildAt(i2);
                                if (childAt2 != view2) {
                                    float elevation2 = ViewCompat.Api21Impl.getElevation(childAt2);
                                    if (elevation2 > f3) {
                                        f3 = elevation2;
                                    }
                                }
                                i2++;
                            }
                            ViewCompat.Api21Impl.setElevation(view2, f3 + 1.0f);
                            view2.setTag(fValueOf2);
                        }
                        view2.setTranslationX(f);
                        view2.setTranslationY(f2);
                        break;
                    case 2:
                        View view3 = viewHolder.itemView;
                        if (z && view3.getTag() == null) {
                            WeakHashMap weakHashMap3 = ViewCompat.sViewPropertyAnimatorMap;
                            Float fValueOf3 = Float.valueOf(ViewCompat.Api21Impl.getElevation(view3));
                            int childCount3 = recyclerView.getChildCount();
                            while (i2 < childCount3) {
                                View childAt3 = recyclerView.getChildAt(i2);
                                if (childAt3 != view3) {
                                    float elevation3 = ViewCompat.Api21Impl.getElevation(childAt3);
                                    if (elevation3 > f3) {
                                        f3 = elevation3;
                                    }
                                }
                                i2++;
                            }
                            ViewCompat.Api21Impl.setElevation(view3, f3 + 1.0f);
                            view3.setTag(fValueOf3);
                        }
                        view3.setTranslationX(f);
                        view3.setTranslationY(f2);
                        break;
                    case 3:
                        View view4 = viewHolder.itemView;
                        if (z && view4.getTag() == null) {
                            WeakHashMap weakHashMap4 = ViewCompat.sViewPropertyAnimatorMap;
                            Float fValueOf4 = Float.valueOf(ViewCompat.Api21Impl.getElevation(view4));
                            int childCount4 = recyclerView.getChildCount();
                            while (i2 < childCount4) {
                                View childAt4 = recyclerView.getChildAt(i2);
                                if (childAt4 != view4) {
                                    float elevation4 = ViewCompat.Api21Impl.getElevation(childAt4);
                                    if (elevation4 > f3) {
                                        f3 = elevation4;
                                    }
                                }
                                i2++;
                            }
                            ViewCompat.Api21Impl.setElevation(view4, f3 + 1.0f);
                            view4.setTag(fValueOf4);
                        }
                        view4.setTranslationX(f);
                        view4.setTranslationY(f2);
                        break;
                    case 4:
                        UniversalRecyclerView universalRecyclerView = (UniversalRecyclerView) obj;
                        if (i != 2 || z || !universalRecyclerView.isReorderRemoving()) {
                            View view5 = viewHolder.itemView;
                            if (z && view5.getTag() == null) {
                                WeakHashMap weakHashMap5 = ViewCompat.sViewPropertyAnimatorMap;
                                Float fValueOf5 = Float.valueOf(ViewCompat.Api21Impl.getElevation(view5));
                                int childCount5 = recyclerView.getChildCount();
                                while (i2 < childCount5) {
                                    View childAt5 = recyclerView.getChildAt(i2);
                                    if (childAt5 != view5) {
                                        float elevation5 = ViewCompat.Api21Impl.getElevation(childAt5);
                                        if (elevation5 > f3) {
                                            f3 = elevation5;
                                        }
                                    }
                                    i2++;
                                }
                                ViewCompat.Api21Impl.setElevation(view5, f3 + 1.0f);
                                view5.setTag(fValueOf5);
                            }
                            view5.setTranslationX(f);
                            view5.setTranslationY(f2);
                            if (i == 2 && z) {
                                universalRecyclerView.onReorderMoved(viewHolder);
                                break;
                            }
                        }
                        break;
                    case 5:
                        View view6 = viewHolder.itemView;
                        if (z && view6.getTag() == null) {
                            WeakHashMap weakHashMap6 = ViewCompat.sViewPropertyAnimatorMap;
                            Float fValueOf6 = Float.valueOf(ViewCompat.Api21Impl.getElevation(view6));
                            int childCount6 = recyclerView.getChildCount();
                            while (i2 < childCount6) {
                                View childAt6 = recyclerView.getChildAt(i2);
                                if (childAt6 != view6) {
                                    float elevation6 = ViewCompat.Api21Impl.getElevation(childAt6);
                                    if (elevation6 > f3) {
                                        f3 = elevation6;
                                    }
                                }
                                i2++;
                            }
                            ViewCompat.Api21Impl.setElevation(view6, f3 + 1.0f);
                            view6.setTag(fValueOf6);
                        }
                        view6.setTranslationX(f);
                        view6.setTranslationY(f2);
                        break;
                    default:
                        super.onChildDraw(recyclerView, viewHolder, f, f2, i, z);
                        break;
                }
            }

            @Override
            public final boolean onMove(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                int i;
                int i2;
                int i3;
                ArrayList arrayList;
                switch (this.$r8$classId) {
                    case 0:
                        int adapterPosition = viewHolder.getAdapterPosition();
                        int adapterPosition2 = viewHolder2.getAdapterPosition();
                        TabsView tabsView = (TabsView) this.this$0;
                        Adapter adapter = ViewPagerFixed.this.adapter;
                        int i4 = 0;
                        if (!(adapter == null ? false : adapter.canReorder(adapterPosition))) {
                            return false;
                        }
                        Adapter adapter2 = ViewPagerFixed.this.adapter;
                        if (!(adapter2 == null ? false : adapter2.canReorder(adapterPosition2))) {
                            return false;
                        }
                        ArrayList arrayList2 = tabsView.tabs;
                        Utilities.swapItems(arrayList2, adapterPosition, adapterPosition2);
                        tabsView.adapter.mObservable.notifyItemMoved(adapterPosition, adapterPosition2);
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList2.size();
                        while (i4 < size) {
                            Object obj = arrayList2.get(i4);
                            i4++;
                            arrayList3.add(Integer.valueOf(((Tab) obj).id));
                        }
                        Adapter adapter3 = ViewPagerFixed.this.adapter;
                        if (adapter3 != null) {
                            adapter3.applyReorder(arrayList3);
                        }
                        return true;
                    case 1:
                        if (viewHolder.mItemViewType == viewHolder2.mItemViewType) {
                            View view = viewHolder2.itemView;
                            if (!(view instanceof ChangeUsernameActivity.UsernameCell) || ((ChangeUsernameActivity.UsernameCell) view).active) {
                                ChatEditTypeActivity.UsernamesListView.Adapter adapter4 = ((ChatEditTypeActivity.UsernamesListView) this.this$0).adapter;
                                int adapterPosition3 = viewHolder.getAdapterPosition();
                                int adapterPosition4 = viewHolder2.getAdapterPosition();
                                int i5 = adapterPosition3 - 1;
                                int i6 = adapterPosition4 - 1;
                                if (i5 >= adapter4.this$1.this$0.usernames.size()) {
                                    return true;
                                }
                                ChatEditTypeActivity.UsernamesListView usernamesListView = adapter4.this$1;
                                if (i6 >= usernamesListView.this$0.usernames.size()) {
                                    return true;
                                }
                                if (adapterPosition3 != adapterPosition4) {
                                    usernamesListView.needReorder = true;
                                }
                                ChatEditTypeActivity chatEditTypeActivity = usernamesListView.this$0;
                                ArrayList arrayList4 = chatEditTypeActivity.usernames;
                                TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList4.get(i5);
                                arrayList4.set(i5, (TLRPC.TL_username) arrayList4.get(i6));
                                arrayList4.set(i6, tL_username);
                                RecyclerView.AdapterDataObservable adapterDataObservable = adapter4.mObservable;
                                adapterDataObservable.notifyItemMoved(adapterPosition3, adapterPosition4);
                                int size2 = chatEditTypeActivity.usernames.size();
                                if (adapterPosition3 != size2 && adapterPosition4 != size2) {
                                    return true;
                                }
                                adapterDataObservable.notifyItemRangeChanged(adapterPosition3, 1, 3);
                                adapterDataObservable.notifyItemRangeChanged(adapterPosition4, 1, 3);
                                return true;
                            }
                        }
                        return false;
                    case 2:
                        if (viewHolder.mItemViewType != viewHolder2.mItemViewType) {
                            return false;
                        }
                        ChatAttachAlertPollLayout.ListAdapter listAdapter = ((ChatAttachAlertPollLayout) this.this$0).listAdapter;
                        int adapterPosition5 = viewHolder.getAdapterPosition();
                        int adapterPosition6 = viewHolder2.getAdapterPosition();
                        ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                        int i7 = chatAttachAlertPollLayout.answerStartRow;
                        int i8 = adapterPosition5 - i7;
                        int i9 = adapterPosition6 - i7;
                        if (i8 >= 0 && i9 >= 0 && i8 < (i = chatAttachAlertPollLayout.answersCount) && i9 < i) {
                            PollAttachedMedia pollAttachedMedia = (PollAttachedMedia) chatAttachAlertPollLayout.attachedMedia.medias.get(i8);
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                            PollAttachedMediaPack pollAttachedMediaPack = chatAttachAlertPollLayout2.attachedMedia;
                            pollAttachedMediaPack.medias.put(i8, (PollAttachedMedia) pollAttachedMediaPack.medias.get(i9));
                            chatAttachAlertPollLayout2.attachedMedia.medias.put(i9, pollAttachedMedia);
                            CharSequence[] charSequenceArr = chatAttachAlertPollLayout2.answers;
                            CharSequence charSequence = charSequenceArr[i8];
                            charSequenceArr[i8] = charSequenceArr[i9];
                            charSequenceArr[i9] = charSequence;
                            boolean[] zArr = chatAttachAlertPollLayout2.answersChecks;
                            boolean z = zArr[i8];
                            zArr[i8] = zArr[i9];
                            zArr[i9] = z;
                            listAdapter.mObservable.notifyItemMoved(adapterPosition5, adapterPosition6);
                        }
                        return true;
                    case 3:
                        int adapterPosition7 = viewHolder2.getAdapterPosition();
                        SearchDownloadsContainer searchDownloadsContainer = (SearchDownloadsContainer) this.this$0;
                        if (adapterPosition7 >= searchDownloadsContainer.downloadingFilesStartRow && viewHolder2.getAdapterPosition() < searchDownloadsContainer.downloadingFilesEndRow) {
                            int adapterPosition8 = viewHolder.getAdapterPosition();
                            int adapterPosition9 = viewHolder2.getAdapterPosition();
                            int i10 = searchDownloadsContainer.downloadingFilesStartRow;
                            int i11 = adapterPosition8 - i10;
                            int i12 = adapterPosition9 - i10;
                            ArrayList arrayList5 = searchDownloadsContainer.currentLoadingFiles;
                            arrayList5.indexOf(Integer.valueOf(i11));
                            arrayList5.get(adapterPosition8 - searchDownloadsContainer.downloadingFilesStartRow);
                            MessageObject messageObject = (MessageObject) arrayList5.get(i11);
                            MessageObject messageObject2 = (MessageObject) arrayList5.get(i12);
                            arrayList5.set(i11, messageObject2);
                            arrayList5.set(i12, messageObject);
                            DownloadController.getInstance(searchDownloadsContainer.currentAccount).swapLoadingPriority(messageObject, messageObject2);
                            searchDownloadsContainer.adapter.mObservable.notifyItemMoved(adapterPosition8, adapterPosition9);
                        }
                        return false;
                    case 4:
                        UniversalRecyclerView universalRecyclerView = (UniversalRecyclerView) this.this$0;
                        if (universalRecyclerView.adapter.getReorderSectionId(viewHolder.getAdapterPosition()) < 0) {
                            return false;
                        }
                        UniversalAdapter universalAdapter = universalRecyclerView.adapter;
                        if (universalAdapter.getReorderSectionId(viewHolder.getAdapterPosition()) != universalAdapter.getReorderSectionId(viewHolder2.getAdapterPosition())) {
                            return false;
                        }
                        int adapterPosition10 = viewHolder.getAdapterPosition();
                        int adapterPosition11 = viewHolder2.getAdapterPosition();
                        if (universalAdapter.onReordered != null) {
                            int reorderSectionId = universalAdapter.getReorderSectionId(adapterPosition10);
                            int reorderSectionId2 = universalAdapter.getReorderSectionId(adapterPosition11);
                            if (reorderSectionId >= 0 && reorderSectionId == reorderSectionId2) {
                                boolean zHasDivider = universalAdapter.hasDivider(adapterPosition10);
                                boolean zHasDivider2 = universalAdapter.hasDivider(adapterPosition11);
                                ArrayList arrayList6 = universalAdapter.items;
                                arrayList6.add(adapterPosition11, (UItem) arrayList6.remove(adapterPosition10));
                                RecyclerView.AdapterDataObservable adapterDataObservable2 = universalAdapter.mObservable;
                                adapterDataObservable2.notifyItemMoved(adapterPosition10, adapterPosition11);
                                if (universalAdapter.hasDivider(adapterPosition11) != zHasDivider) {
                                    adapterDataObservable2.notifyItemRangeChanged(adapterPosition11, 1, 3);
                                }
                                if (universalAdapter.hasDivider(adapterPosition10) != zHasDivider2) {
                                    adapterDataObservable2.notifyItemRangeChanged(adapterPosition10, 1, 3);
                                }
                                if (universalAdapter.orderChanged && (i2 = universalAdapter.orderChangedId) != reorderSectionId && i2 >= 0) {
                                    ArrayList arrayList7 = universalAdapter.reorderSections;
                                    if (i2 < arrayList7.size()) {
                                        UniversalAdapter.Section section = (UniversalAdapter.Section) arrayList7.get(i2);
                                        universalAdapter.onReordered.run(Integer.valueOf(i2), new ArrayList(arrayList6.subList(section.start, section.end + 1)));
                                        universalAdapter.orderChanged = false;
                                    }
                                }
                                universalAdapter.orderChanged = true;
                                universalAdapter.orderChangedId = reorderSectionId;
                            }
                        }
                        universalRecyclerView.swappedElements();
                        return true;
                    case 5:
                        if (viewHolder.mItemViewType != viewHolder2.mItemViewType || !canMove(viewHolder.getAdapterPosition()) || !canMove(viewHolder2.getAdapterPosition())) {
                            return false;
                        }
                        PollCreateActivity.ListAdapter listAdapter2 = ((PollCreateActivity) this.this$0).listAdapter;
                        int adapterPosition12 = viewHolder.getAdapterPosition();
                        int adapterPosition13 = viewHolder2.getAdapterPosition();
                        PollCreateActivity pollCreateActivity = PollCreateActivity.this;
                        int i13 = pollCreateActivity.answerStartRow;
                        int i14 = adapterPosition12 - i13;
                        int i15 = adapterPosition13 - i13;
                        if (i14 >= 0 && i15 >= 0 && i14 < (i3 = pollCreateActivity.answersCount) && i15 < i3) {
                            CharSequence[] charSequenceArr2 = pollCreateActivity.answers;
                            CharSequence charSequence2 = charSequenceArr2[i14];
                            charSequenceArr2[i14] = charSequenceArr2[i15];
                            charSequenceArr2[i15] = charSequence2;
                            int[] iArr = pollCreateActivity.answerIds;
                            if (iArr != null) {
                                int i16 = iArr[i14];
                                iArr[i14] = iArr[i15];
                                iArr[i15] = i16;
                            }
                            boolean[] zArr2 = pollCreateActivity.answersChecks;
                            boolean z2 = zArr2[i14];
                            zArr2[i14] = zArr2[i15];
                            zArr2[i15] = z2;
                            listAdapter2.mObservable.notifyItemMoved(adapterPosition12, adapterPosition13);
                        }
                        return true;
                    default:
                        BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditContainer.BotPreviewsEditLangContainer) this.this$0;
                        if (!botPreviewsEditLangContainer.adapter.canReorder(viewHolder.getAdapterPosition())) {
                            return false;
                        }
                        int adapterPosition14 = viewHolder2.getAdapterPosition();
                        BotPreviewsEditContainer.BotPreviewsEditLangContainer.AnonymousClass7 anonymousClass7 = botPreviewsEditLangContainer.adapter;
                        if (!anonymousClass7.canReorder(adapterPosition14)) {
                            return false;
                        }
                        int adapterPosition15 = viewHolder.getAdapterPosition();
                        int adapterPosition16 = viewHolder2.getAdapterPosition();
                        StoriesController.BotPreviewsList botPreviewsList = anonymousClass7.storiesList;
                        if (botPreviewsList != null && adapterPosition15 >= 0 && adapterPosition15 < botPreviewsList.messageObjects.size() && adapterPosition16 >= 0 && adapterPosition16 < anonymousClass7.storiesList.messageObjects.size()) {
                            if (anonymousClass7.storiesList != null) {
                                arrayList = new ArrayList();
                                for (int i17 = 0; i17 < anonymousClass7.storiesList.messageObjects.size(); i17++) {
                                    arrayList.add(Integer.valueOf(((MessageObject) anonymousClass7.storiesList.messageObjects.get(i17)).getId()));
                                }
                            } else {
                                arrayList = new ArrayList(anonymousClass7.storiesList.pinnedIds);
                            }
                            if (!anonymousClass7.applyingReorder) {
                                ArrayList arrayList8 = anonymousClass7.lastPinnedIds;
                                arrayList8.clear();
                                arrayList8.addAll(arrayList);
                                anonymousClass7.applyingReorder = true;
                            }
                            MessageObject messageObject3 = (MessageObject) anonymousClass7.storiesList.messageObjects.get(adapterPosition15);
                            arrayList.remove(Integer.valueOf(messageObject3.getId()));
                            arrayList.add(Utilities.clamp(adapterPosition16, arrayList.size(), 0), Integer.valueOf(messageObject3.getId()));
                            anonymousClass7.storiesList.updatePinnedOrder(arrayList, false);
                            anonymousClass7.mObservable.notifyItemMoved(adapterPosition15, adapterPosition16);
                        }
                        return true;
                }
            }

            @Override
            public void onMoved(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3) {
                switch (this.$r8$classId) {
                    case 4:
                        break;
                    default:
                        super.onMoved(recyclerListView, viewHolder, viewHolder2, i, i2, i3);
                        break;
                }
            }

            @Override
            public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
                int i2;
                switch (this.$r8$classId) {
                    case 1:
                        ChatEditTypeActivity.UsernamesListView usernamesListView = (ChatEditTypeActivity.UsernamesListView) this.this$0;
                        int i3 = 0;
                        if (i != 0) {
                            usernamesListView.this$0.ignoreScroll = true;
                            usernamesListView.cancelClickRunnables(false);
                            viewHolder.itemView.setPressed(true);
                            break;
                        } else {
                            ChatEditTypeActivity chatEditTypeActivity = usernamesListView.this$0;
                            chatEditTypeActivity.ignoreScroll = false;
                            if (usernamesListView.needReorder && chatEditTypeActivity.currentChat != null) {
                                usernamesListView.needReorder = false;
                                TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                                TLRPC.Chat chat = chatEditTypeActivity.currentChat;
                                tL_inputChannel.channel_id = chat.id;
                                tL_inputChannel.access_hash = chat.access_hash;
                                tL_channels_reorderUsernames.channel = tL_inputChannel;
                                ArrayList<String> arrayList = new ArrayList<>();
                                int i4 = 0;
                                while (true) {
                                    ArrayList arrayList2 = chatEditTypeActivity.editableUsernames;
                                    if (i4 >= arrayList2.size()) {
                                        while (true) {
                                            ArrayList arrayList3 = chatEditTypeActivity.usernames;
                                            if (i3 >= arrayList3.size()) {
                                                tL_channels_reorderUsernames.order = arrayList;
                                                chatEditTypeActivity.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new PassportActivity$$ExternalSyntheticLambda1(6));
                                                chatEditTypeActivity.currentChat.usernames.clear();
                                                chatEditTypeActivity.currentChat.usernames.addAll(arrayList2);
                                                chatEditTypeActivity.currentChat.usernames.addAll(arrayList3);
                                                chatEditTypeActivity.getMessagesController().putChat(chatEditTypeActivity.currentChat, true);
                                            } else {
                                                if (((TLRPC.TL_username) arrayList3.get(i3)).active) {
                                                    arrayList.add(((TLRPC.TL_username) arrayList3.get(i3)).username);
                                                }
                                                i3++;
                                            }
                                        }
                                    } else {
                                        if (((TLRPC.TL_username) arrayList2.get(i4)).active) {
                                            arrayList.add(((TLRPC.TL_username) arrayList2.get(i4)).username);
                                        }
                                        i4++;
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        if (i != 0) {
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) this.this$0;
                            chatAttachAlertPollLayout.listView.setItemAnimator(chatAttachAlertPollLayout.itemAnimator);
                            chatAttachAlertPollLayout.listView.cancelClickRunnables(false);
                            viewHolder.itemView.setPressed(true);
                            viewHolder.itemView.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, chatAttachAlertPollLayout.resourcesProvider));
                        }
                        break;
                    case 3:
                        if (i != 0) {
                            ((SearchDownloadsContainer) this.this$0).recyclerListView.cancelClickRunnables(false);
                            viewHolder.itemView.setPressed(true);
                        }
                        break;
                    case 4:
                        UniversalRecyclerView universalRecyclerView = (UniversalRecyclerView) this.this$0;
                        if (viewHolder != null) {
                            universalRecyclerView.hideSelector(false);
                        }
                        if (i == 0) {
                            UniversalAdapter universalAdapter = universalRecyclerView.adapter;
                            if (universalAdapter.orderChanged && (i2 = universalAdapter.orderChangedId) >= 0) {
                                ArrayList arrayList4 = universalAdapter.reorderSections;
                                if (i2 < arrayList4.size()) {
                                    UniversalAdapter.Section section = (UniversalAdapter.Section) arrayList4.get(i2);
                                    universalAdapter.onReordered.run(Integer.valueOf(i2), new ArrayList(universalAdapter.items.subList(section.start, section.end + 1)));
                                    universalAdapter.orderChanged = false;
                                }
                            }
                            if (universalRecyclerView.reorderingViewHolder != null) {
                                universalRecyclerView.onReorderEnd();
                                universalRecyclerView.reorderingViewHolder = null;
                            }
                        } else {
                            universalRecyclerView.cancelClickRunnables(false);
                            if (viewHolder != null) {
                                View view = viewHolder.itemView;
                                view.setPressed(true);
                                if (view.getBackground() instanceof RichEditor.DraggingDrawable) {
                                    RichEditor.DraggingDrawable draggingDrawable = (RichEditor.DraggingDrawable) view.getBackground();
                                    if (!draggingDrawable.dragging) {
                                        draggingDrawable.dragging = true;
                                        draggingDrawable.invalidateSelf();
                                    }
                                }
                                if (i == 2) {
                                    universalRecyclerView.reorderingViewHolder = viewHolder;
                                    universalRecyclerView.onReorderStart(viewHolder);
                                }
                            }
                        }
                        break;
                    case 5:
                        if (i != 0) {
                            ((PollCreateActivity) this.this$0).listView.cancelClickRunnables(false);
                            viewHolder.itemView.setPressed(true);
                        }
                        break;
                    case 6:
                        BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditContainer.BotPreviewsEditLangContainer) this.this$0;
                        if (viewHolder != null) {
                            botPreviewsEditLangContainer.listView.hideSelector(false);
                        }
                        if (i == 0) {
                            BotPreviewsEditContainer.BotPreviewsEditLangContainer.AnonymousClass7 anonymousClass7 = botPreviewsEditLangContainer.adapter;
                            if (anonymousClass7.storiesList != null && anonymousClass7.applyingReorder) {
                                ArrayList arrayList5 = new ArrayList();
                                for (int i5 = 0; i5 < anonymousClass7.storiesList.messageObjects.size(); i5++) {
                                    arrayList5.add(Integer.valueOf(((MessageObject) anonymousClass7.storiesList.messageObjects.get(i5)).getId()));
                                }
                                ArrayList arrayList6 = anonymousClass7.lastPinnedIds;
                                boolean z = arrayList6.size() != arrayList5.size();
                                if (!z) {
                                    for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                                        if (arrayList6.get(i6) != arrayList5.get(i6)) {
                                            z = true;
                                        }
                                    }
                                }
                                if (z) {
                                    anonymousClass7.storiesList.updatePinnedOrder(arrayList5, true);
                                }
                                anonymousClass7.applyingReorder = false;
                            }
                            botPreviewsEditLangContainer.listView.setItemAnimator(null);
                        } else {
                            botPreviewsEditLangContainer.listView.cancelClickRunnables(false);
                            if (viewHolder != null) {
                                viewHolder.itemView.setPressed(true);
                            }
                        }
                        break;
                }
            }

            @Override
            public final void onSwiped(RecyclerView.ViewHolder viewHolder) {
                int i = this.$r8$classId;
            }

            private final void onSwiped$org$telegram$ui$ChatEditTypeActivity$UsernamesListView$TouchHelperCallback(RecyclerView.ViewHolder viewHolder) {
            }

            private final void onSwiped$org$telegram$ui$Components$ChatAttachAlertPollLayout$TouchHelperCallback(RecyclerView.ViewHolder viewHolder) {
            }

            private final void onSwiped$org$telegram$ui$Components$SearchDownloadsContainer$TouchHelperCallback(RecyclerView.ViewHolder viewHolder) {
            }

            private final void onSwiped$org$telegram$ui$Components$UniversalRecyclerView$TouchHelperCallback(RecyclerView.ViewHolder viewHolder) {
            }

            private final void onSwiped$org$telegram$ui$Components$ViewPagerFixed$TabsView$6(RecyclerView.ViewHolder viewHolder) {
            }

            private final void onSwiped$org$telegram$ui$PollCreateActivity$TouchHelperCallback(RecyclerView.ViewHolder viewHolder) {
            }

            private final void onSwiped$org$telegram$ui$Stories$bots$BotPreviewsEditContainer$BotPreviewsEditLangContainer$10(RecyclerView.ViewHolder viewHolder) {
            }

            private final void onMoved$org$telegram$ui$Components$UniversalRecyclerView$TouchHelperCallback(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3) {
            }
        }
    }
}
