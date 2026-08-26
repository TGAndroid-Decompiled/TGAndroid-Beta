package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import androidx.dynamicanimation.animation.SpringAnimation;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;

public abstract class RightSlidingDialogContainer extends FrameLayout {
    public static final int $r8$clinit = 0;
    public static long fragmentDialogId;
    public Paint actionModePaint;
    public ActionBar currentActionBarView;
    public DialogsActivity.AnonymousClass33 currentFragment;
    public LoginActivity.AnonymousClass4 currentFragmentFullscreenView;
    public View currentFragmentView;
    public float currentTop;
    public boolean enabled;
    public int fragmentViewPadding;
    public boolean isOpenned;
    public boolean isPaused;
    public int lastSize;
    public boolean maybeStartTracking;
    public INavigationLayout navigationLayout;
    public final AnimationNotificationsLocker notificationsLocker;
    public ValueAnimator openAnimator;
    public float openedProgress;
    public SpringAnimation replaceAnimation;
    public boolean replaceAnimationInProgress;
    public float replaceProgress;
    public DialogsActivity.AnonymousClass33 replacingFragment;
    public boolean startedTracking;
    public int startedTrackingPointerId;
    public int startedTrackingX;
    public int startedTrackingY;
    public float swipeBackX;
    public VelocityTracker velocityTracker;

    public final class AnonymousClass2 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final RightSlidingDialogContainer this$0;

        public AnonymousClass2(RightSlidingDialogContainer rightSlidingDialogContainer, int i) {
            this.$r8$classId = i;
            this.this$0 = rightSlidingDialogContainer;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    RightSlidingDialogContainer rightSlidingDialogContainer = this.this$0;
                    if (rightSlidingDialogContainer.openAnimator != null) {
                        rightSlidingDialogContainer.openAnimator = null;
                        rightSlidingDialogContainer.openedProgress = 0.0f;
                        rightSlidingDialogContainer.updateOpenAnimationProgress();
                        rightSlidingDialogContainer.notificationsLocker.unlock();
                        DialogsActivity.AnonymousClass33 anonymousClass33 = rightSlidingDialogContainer.currentFragment;
                        if (anonymousClass33 != null) {
                            anonymousClass33.onPause();
                            rightSlidingDialogContainer.currentFragment.onFragmentDestroy();
                            rightSlidingDialogContainer.removeAllViews();
                            rightSlidingDialogContainer.currentFragment = null;
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                        }
                        rightSlidingDialogContainer.openAnimationFinished(false);
                        break;
                    }
                    break;
                default:
                    RightSlidingDialogContainer rightSlidingDialogContainer2 = this.this$0;
                    if (rightSlidingDialogContainer2.openAnimator != null) {
                        rightSlidingDialogContainer2.openAnimator = null;
                        rightSlidingDialogContainer2.openAnimationFinished(true);
                        break;
                    }
                    break;
            }
        }
    }

    public RightSlidingDialogContainer(Context context) {
        super(context);
        this.openedProgress = 0.0f;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.enabled = true;
    }

    public static int getRightPaddingSize() {
        return SharedConfig.useThreeLinesLayout ? 74 : 76;
    }

    public static void setReplaceProgress(BaseFragment baseFragment, BaseFragment baseFragment2, float f) {
        if (baseFragment == null && baseFragment2 == null) {
            return;
        }
        int measuredWidth = baseFragment != null ? baseFragment.getFragmentView().getMeasuredWidth() : baseFragment2.getFragmentView().getMeasuredWidth();
        if (baseFragment != null) {
            if (baseFragment.getFragmentView() != null) {
                baseFragment.getFragmentView().setAlpha(1.0f - f);
                baseFragment.getFragmentView().setTranslationX(measuredWidth * 0.6f * f);
            }
            baseFragment.setPreviewOpenedProgress(1.0f - f);
        }
        if (baseFragment2 != null) {
            if (baseFragment2.getFragmentView() != null) {
                baseFragment2.getFragmentView().setAlpha(1.0f);
                baseFragment2.getFragmentView().setTranslationX((1.0f - f) * measuredWidth);
            }
            baseFragment2.setPreviewReplaceProgress(f);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.replaceAnimationInProgress) {
            setReplaceProgress(this.replacingFragment, this.currentFragment, this.replaceProgress);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f = this.openedProgress;
        ActionBar actionBar = this.currentActionBarView;
        float alpha = (actionBar == null || actionBar.getActionMode() == null) ? 0.0f : this.currentActionBarView.getActionMode().getAlpha();
        ActionBar actionBar2 = this.currentActionBarView;
        float fMax = Math.max(alpha, actionBar2 == null ? 0.0f : actionBar2.searchFieldVisibleAlpha) * f;
        if (this.currentFragment == null || this.currentActionBarView == null || fMax <= 0.0f) {
            return;
        }
        if (this.actionModePaint == null) {
            this.actionModePaint = new Paint();
        }
        this.actionModePaint.setColor(Theme.getColor(null, Theme.key_actionBarActionModeDefault, false));
        if (fMax == 1.0f) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.currentTop, (int) (fMax * 255.0f), 31);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.currentTop, this.actionModePaint);
        canvas.translate(this.currentActionBarView.getX(), this.currentActionBarView.getY());
        canvas.save();
        canvas.translate(this.currentActionBarView.getBackButton().getX(), this.currentActionBarView.getBackButton().getY());
        this.currentActionBarView.getBackButton().draw(canvas);
        canvas.restore();
        if (this.currentActionBarView.getActionMode() != null) {
            if (fMax != this.currentActionBarView.getActionMode().getAlpha() * this.openedProgress) {
                this.currentActionBarView.draw(canvas);
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.currentTop, (int) (this.currentActionBarView.getActionMode().getAlpha() * 255.0f), 31);
                this.currentActionBarView.getActionMode().draw(canvas);
                canvas.restore();
            } else {
                this.currentActionBarView.getActionMode().draw(canvas);
            }
        } else {
            this.currentActionBarView.draw(canvas);
        }
        canvas.restore();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ActionBar actionBar = this.currentActionBarView;
        if (view == actionBar && actionBar.getActionMode() != null && this.currentActionBarView.getActionMode().getAlpha() == 1.0f) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void finishPreview() {
        if (this.isOpenned) {
            openAnimationStarted(false);
            finishPreviewInernal();
        }
    }

    public final void finishPreviewInernal() {
        int i = 0;
        this.isOpenned = false;
        if (SharedConfig.animationsEnabled()) {
            this.notificationsLocker.lock();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openedProgress, 0.0f);
            this.openAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new RightSlidingDialogContainer$$ExternalSyntheticLambda0(this, 0));
            this.openAnimator.addListener(new AnonymousClass2(this, i));
            this.openAnimator.setDuration(250L);
            this.openAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.openAnimator.start();
            return;
        }
        this.openedProgress = 0.0f;
        updateOpenAnimationProgress();
        DialogsActivity.AnonymousClass33 anonymousClass33 = this.currentFragment;
        if (anonymousClass33 != null) {
            anonymousClass33.onPause();
            this.currentFragment.onFragmentDestroy();
            removeAllViews();
            this.currentFragment = null;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        openAnimationFinished(false);
    }

    public long getCurrentFragmetDialogId() {
        return fragmentDialogId;
    }

    public BaseFragment getFragment() {
        return this.currentFragment;
    }

    public View getFragmentView() {
        return this.currentFragmentView;
    }

    public abstract boolean getOccupyStatusbar();

    public final boolean hasFragment() {
        return this.currentFragment != null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = getOccupyStatusbar() ? AndroidUtilities.statusBarHeight : 0;
        View view = this.currentFragmentView;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(getRightPaddingSize());
            layoutParams.topMargin = ActionBar.getCurrentActionBarHeight() + i3 + this.fragmentViewPadding;
        }
        ActionBar actionBar = this.currentActionBarView;
        if (actionBar != null) {
            ((FrameLayout.LayoutParams) actionBar.getLayoutParams()).topMargin = i3;
        }
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (this.lastSize != measuredWidth) {
            this.lastSize = measuredWidth;
            updateOpenAnimationProgress();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 1;
        INavigationLayout iNavigationLayout = this.navigationLayout;
        if ((iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isInPreviewMode()) || !hasFragment() || !this.enabled) {
            return false;
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.startedTrackingPointerId = motionEvent.getPointerId(0);
            this.maybeStartTracking = true;
            this.startedTrackingX = (int) motionEvent.getX();
            this.startedTrackingY = (int) motionEvent.getY();
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            int iMax = Math.max(0, (int) (motionEvent.getX() - this.startedTrackingX));
            int iAbs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
            this.velocityTracker.addMovement(motionEvent);
            if (!this.maybeStartTracking || this.startedTracking || iMax < AndroidUtilities.getPixelsInCM(0.4f, true) || Math.abs(iMax) / 3 <= iAbs) {
                if (this.startedTracking) {
                    float f = iMax;
                    this.swipeBackX = f;
                    this.openedProgress = Utilities.clamp(1.0f - (f / getMeasuredWidth()), 1.0f, 0.0f);
                    updateOpenAnimationProgress();
                }
            } else if (ActionBarLayout.findScrollingChild$1(this, motionEvent.getX(), motionEvent.getY()) == null) {
                this.maybeStartTracking = false;
                this.startedTracking = true;
                this.startedTrackingX = (int) motionEvent.getX();
                openAnimationStarted(false);
            } else {
                this.maybeStartTracking = false;
            }
        } else if (motionEvent != null && motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.computeCurrentVelocity(1000);
            if (this.startedTracking) {
                float f2 = this.swipeBackX;
                float xVelocity = this.velocityTracker.getXVelocity();
                float yVelocity = this.velocityTracker.getYVelocity();
                if (f2 >= getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                    finishPreviewInernal();
                } else {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openedProgress, 1.0f);
                    this.openAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new RightSlidingDialogContainer$$ExternalSyntheticLambda0(this, 2));
                    this.openAnimator.addListener(new AnonymousClass2(this, i));
                    this.openAnimator.setDuration(250L);
                    this.openAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    this.openAnimator.start();
                }
            }
            this.maybeStartTracking = false;
            this.startedTracking = false;
            VelocityTracker velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.velocityTracker = null;
            }
        } else if (motionEvent == null) {
            this.maybeStartTracking = false;
            this.startedTracking = false;
            VelocityTracker velocityTracker3 = this.velocityTracker;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.velocityTracker = null;
            }
        }
        return this.startedTracking;
    }

    public abstract void openAnimationFinished(boolean z);

    public abstract void openAnimationStarted(boolean z);

    @Override
    public final void removeView(View view) {
        super.removeView(view);
        if (view == this.currentFragmentView) {
            finishPreview();
        }
    }

    @Override
    public final void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.currentFragmentView) {
            finishPreview();
        }
    }

    public void setCurrentTop(int i) {
        this.currentTop = i;
        View view = this.currentFragmentView;
        if (view != null) {
            view.setTranslationY((i - view.getTop()) + this.fragmentViewPadding);
        }
        LoginActivity.AnonymousClass4 anonymousClass4 = this.currentFragmentFullscreenView;
        if (anonymousClass4 != null) {
            anonymousClass4.setTranslationY(i - anonymousClass4.getTop());
        }
    }

    public void setFragmentViewPadding(int i) {
        this.fragmentViewPadding = i;
    }

    public void setOpenProgress(float f) {
    }

    public void setTransitionPaddingBottom(int i) {
        DialogsActivity.AnonymousClass33 anonymousClass33 = this.currentFragment;
        if (anonymousClass33 != null) {
            float f = i;
            anonymousClass33.transitionPadding = f;
            anonymousClass33.floatingButton.setTranslationY(((-f) - anonymousClass33.navigationBarHeight) - anonymousClass33.additionFloatingButtonOffset);
        }
    }

    public final void updateOpenAnimationProgress() {
        if (this.replaceAnimationInProgress || !hasFragment()) {
            return;
        }
        setOpenProgress(this.openedProgress);
        View view = this.currentFragmentView;
        if (view != null) {
            view.setTranslationX((1.0f - this.openedProgress) * (getMeasuredWidth() - AndroidUtilities.dp(getRightPaddingSize())));
        }
        ActionBar actionBar = this.currentActionBarView;
        if (actionBar != null) {
            actionBar.setTranslationX((1.0f - this.openedProgress) * AndroidUtilities.dp(48.0f));
        }
        DialogsActivity.AnonymousClass33 anonymousClass33 = this.currentFragment;
        if (anonymousClass33 != null) {
            anonymousClass33.setPreviewOpenedProgress(this.openedProgress);
        }
        invalidate();
    }
}
