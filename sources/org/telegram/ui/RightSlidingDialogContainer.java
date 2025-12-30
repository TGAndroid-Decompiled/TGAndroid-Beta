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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;

public abstract class RightSlidingDialogContainer extends FrameLayout {
    public static long fragmentDialogId;
    private Paint actionModePaint;
    private int currentAccount;
    ActionBar currentActionBarView;
    BaseFragment currentFragment;
    View currentFragmentFullscreenView;
    View currentFragmentView;
    float currentTop;
    public boolean enabled;
    public int fragmentViewPadding;
    boolean isOpenned;
    boolean isPaused;
    int lastSize;
    private boolean maybeStartTracking;
    INavigationLayout navigationLayout;
    private AnimationNotificationsLocker notificationsLocker;
    ValueAnimator openAnimator;
    float openedProgress;
    private boolean replaceAnimationInProgress;
    float replaceProgress;
    BaseFragment replacingFragment;
    protected boolean startedTracking;
    private int startedTrackingPointerId;
    private int startedTrackingX;
    private int startedTrackingY;
    float swipeBackX;
    private VelocityTracker velocityTracker;

    abstract boolean getOccupyStatusbar();

    public abstract void openAnimationFinished(boolean z);

    public abstract void openAnimationStarted(boolean z);

    void setOpenProgress(float f) {
    }

    public RightSlidingDialogContainer(Context context) {
        super(context);
        this.openedProgress = 0.0f;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.currentAccount = UserConfig.selectedAccount;
        this.enabled = true;
    }

    private void setReplaceProgress(BaseFragment baseFragment, BaseFragment baseFragment2, float f) {
        int measuredWidth;
        if (baseFragment == null && baseFragment2 == null) {
            return;
        }
        if (baseFragment != null) {
            measuredWidth = baseFragment.getFragmentView().getMeasuredWidth();
        } else {
            measuredWidth = baseFragment2.getFragmentView().getMeasuredWidth();
        }
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
                baseFragment2.getFragmentView().setTranslationX(measuredWidth * (1.0f - f));
            }
            baseFragment2.setPreviewReplaceProgress(f);
        }
    }

    protected void updateOpenAnimationProgress() {
        if (this.replaceAnimationInProgress || !hasFragment()) {
            return;
        }
        setOpenProgress(this.openedProgress);
        View view = this.currentFragmentView;
        if (view != null) {
            view.setTranslationX((getMeasuredWidth() - AndroidUtilities.dp(getRightPaddingSize())) * (1.0f - this.openedProgress));
        }
        ActionBar actionBar = this.currentActionBarView;
        if (actionBar != null) {
            actionBar.setTranslationX(AndroidUtilities.dp(48.0f) * (1.0f - this.openedProgress));
        }
        BaseFragment baseFragment = this.currentFragment;
        if (baseFragment != null) {
            baseFragment.setPreviewOpenedProgress(this.openedProgress);
        }
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
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
        int measuredHeight = (getMeasuredHeight() + getMeasuredWidth()) << 16;
        if (this.lastSize != measuredHeight) {
            this.lastSize = measuredHeight;
            updateOpenAnimationProgress();
        }
    }

    public boolean hasFragment() {
        return this.currentFragment != null;
    }

    public void finishPreview() {
        if (this.isOpenned) {
            openAnimationStarted(false);
            finishPreviewInernal();
        }
    }

    public void finishPreviewInernal() {
        this.isOpenned = false;
        if (!SharedConfig.animationsEnabled()) {
            this.openedProgress = 0.0f;
            updateOpenAnimationProgress();
            BaseFragment baseFragment = this.currentFragment;
            if (baseFragment != null) {
                baseFragment.onPause();
                this.currentFragment.onFragmentDestroy();
                removeAllViews();
                this.currentFragment = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            openAnimationFinished(false);
            return;
        }
        this.notificationsLocker.lock();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openedProgress, 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$finishPreviewInernal$4(valueAnimator);
            }
        });
        this.openAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                RightSlidingDialogContainer rightSlidingDialogContainer = RightSlidingDialogContainer.this;
                if (rightSlidingDialogContainer.openAnimator == null) {
                    return;
                }
                rightSlidingDialogContainer.openAnimator = null;
                rightSlidingDialogContainer.openedProgress = 0.0f;
                rightSlidingDialogContainer.updateOpenAnimationProgress();
                RightSlidingDialogContainer.this.notificationsLocker.unlock();
                BaseFragment baseFragment2 = RightSlidingDialogContainer.this.currentFragment;
                if (baseFragment2 != null) {
                    baseFragment2.onPause();
                    RightSlidingDialogContainer.this.currentFragment.onFragmentDestroy();
                    RightSlidingDialogContainer.this.removeAllViews();
                    RightSlidingDialogContainer.this.currentFragment = null;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                }
                RightSlidingDialogContainer.this.openAnimationFinished(false);
            }
        });
        this.openAnimator.setDuration(250L);
        this.openAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.openAnimator.start();
    }

    public void lambda$finishPreviewInernal$4(ValueAnimator valueAnimator) {
        this.openedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateOpenAnimationProgress();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        INavigationLayout iNavigationLayout = this.navigationLayout;
        if ((iNavigationLayout != null && iNavigationLayout.isInPreviewMode()) || !hasFragment() || !this.enabled) {
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
            if (this.maybeStartTracking && !this.startedTracking && iMax >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(iMax) / 3 > iAbs) {
                if (ActionBarLayout.findScrollingChild(this, motionEvent.getX(), motionEvent.getY()) == null) {
                    prepareForMoving(motionEvent);
                } else {
                    this.maybeStartTracking = false;
                }
            } else if (this.startedTracking) {
                float f = iMax;
                this.swipeBackX = f;
                this.openedProgress = Utilities.clamp(1.0f - (f / getMeasuredWidth()), 1.0f, 0.0f);
                updateOpenAnimationProgress();
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
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            this.f$0.lambda$onTouchEvent$5(valueAnimator);
                        }
                    });
                    this.openAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            RightSlidingDialogContainer rightSlidingDialogContainer = RightSlidingDialogContainer.this;
                            if (rightSlidingDialogContainer.openAnimator == null) {
                                return;
                            }
                            rightSlidingDialogContainer.openAnimator = null;
                            rightSlidingDialogContainer.openAnimationFinished(true);
                        }
                    });
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

    public void lambda$onTouchEvent$5(ValueAnimator valueAnimator) {
        this.openedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateOpenAnimationProgress();
    }

    private void prepareForMoving(MotionEvent motionEvent) {
        this.maybeStartTracking = false;
        this.startedTracking = true;
        this.startedTrackingX = (int) motionEvent.getX();
        openAnimationStarted(false);
    }

    public void setCurrentTop(int i) {
        this.currentTop = i;
        View view = this.currentFragmentView;
        if (view != null) {
            view.setTranslationY((i - view.getTop()) + this.fragmentViewPadding);
        }
        View view2 = this.currentFragmentFullscreenView;
        if (view2 != null) {
            view2.setTranslationY(i - view2.getTop());
        }
    }

    public long getCurrentFragmetDialogId() {
        return fragmentDialogId;
    }

    public static int getRightPaddingSize() {
        return SharedConfig.useThreeLinesLayout ? 74 : 76;
    }

    public View getFragmentView() {
        return this.currentFragmentView;
    }

    public void onPause() {
        this.isPaused = true;
        BaseFragment baseFragment = this.currentFragment;
        if (baseFragment != null) {
            baseFragment.onPause();
        }
    }

    public void onResume() {
        this.isPaused = false;
        BaseFragment baseFragment = this.currentFragment;
        if (baseFragment != null) {
            baseFragment.onResume();
        }
    }

    public BaseFragment getFragment() {
        return this.currentFragment;
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        ActionBar actionBar = this.currentActionBarView;
        if (view == actionBar && actionBar.getActionMode() != null && this.currentActionBarView.getActionMode().getAlpha() == 1.0f) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.replaceAnimationInProgress) {
            setReplaceProgress(this.replacingFragment, this.currentFragment, this.replaceProgress);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f = this.openedProgress;
        ActionBar actionBar = this.currentActionBarView;
        float alpha = (actionBar == null || actionBar.getActionMode() == null) ? 0.0f : this.currentActionBarView.getActionMode().getAlpha();
        ActionBar actionBar2 = this.currentActionBarView;
        float fMax = f * Math.max(alpha, actionBar2 == null ? 0.0f : actionBar2.searchFieldVisibleAlpha);
        if (this.currentFragment == null || this.currentActionBarView == null || fMax <= 0.0f) {
            return;
        }
        if (this.actionModePaint == null) {
            this.actionModePaint = new Paint();
        }
        this.actionModePaint.setColor(Theme.getColor(Theme.key_actionBarActionModeDefault));
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
        if (this.currentActionBarView.getActionMode() == null) {
            this.currentActionBarView.draw(canvas);
        } else if (fMax != this.openedProgress * this.currentActionBarView.getActionMode().getAlpha()) {
            this.currentActionBarView.draw(canvas);
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.currentTop, (int) (this.currentActionBarView.getActionMode().getAlpha() * 255.0f), 31);
            this.currentActionBarView.getActionMode().draw(canvas);
            canvas.restore();
        } else {
            this.currentActionBarView.getActionMode().draw(canvas);
        }
        canvas.restore();
        invalidate();
    }

    public void setFragmentViewPadding(int i) {
        this.fragmentViewPadding = i;
    }

    public void setTransitionPaddingBottom(int i) {
        BaseFragment baseFragment = this.currentFragment;
        if (baseFragment instanceof TopicsFragment) {
            ((TopicsFragment) baseFragment).setTransitionPadding(i);
        }
    }

    @Override
    public void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.currentFragmentView) {
            finishPreview();
        }
    }

    @Override
    public void removeView(View view) {
        super.removeView(view);
        if (view == this.currentFragmentView) {
            finishPreview();
        }
    }
}
