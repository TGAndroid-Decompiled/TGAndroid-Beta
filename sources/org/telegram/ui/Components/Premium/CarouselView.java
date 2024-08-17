package org.telegram.ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Premium.CarouselView;

public class CarouselView extends View implements PagerHeaderView {
    static final Interpolator sQuinticInterpolator = new Interpolator() {
        @Override
        public final float getInterpolation(float f) {
            float lambda$static$0;
            lambda$static$0 = CarouselView.lambda$static$0(f);
            return lambda$static$0;
        }
    };
    boolean autoPlayEnabled;
    ValueAnimator autoScrollAnimation;
    private Runnable autoScrollRunnable;
    int cX;
    int cY;
    Comparator<DrawingObject> comparator;
    private final ArrayList<? extends DrawingObject> drawingObjects;
    private final ArrayList<? extends DrawingObject> drawingObjectsSorted;
    boolean firstScroll;
    boolean firstScroll1;
    boolean firstScrollEnabled;
    GestureDetector gestureDetector;
    float lastFlingX;
    int lastSelected;
    float offsetAngle;
    OverScroller overScroller;
    boolean scrolled;

    public static class DrawingObject {
        public double angle;
        public float x;
        public float y;
        float yRelative;

        public void draw(Canvas canvas, float f, float f2, float f3) {
        }

        public void onAttachToWindow(View view, int i) {
        }

        public void onDetachFromWindow() {
        }

        public void select() {
        }
    }

    public static float lambda$static$0(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    private void checkSelectedHaptic() {
        int size = (int) (this.offsetAngle / (360.0f / this.drawingObjects.size()));
        if (this.lastSelected != size) {
            this.lastSelected = size;
            performHapticFeedback(3);
        }
    }

    private void scrollToInternal(final float f) {
        if (Math.abs(f - this.offsetAngle) >= 1.0f || this.autoScrollAnimation != null) {
            AndroidUtilities.cancelRunOnUIThread(this.autoScrollRunnable);
            ValueAnimator valueAnimator = this.autoScrollAnimation;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.autoScrollAnimation.cancel();
                this.autoScrollAnimation = null;
            }
            final float f2 = this.offsetAngle;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.autoScrollAnimation = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    CarouselView.this.lambda$scrollToInternal$2(f2, f, valueAnimator2);
                }
            });
            this.autoScrollAnimation.addListener(new AnonymousClass3(f));
            this.autoScrollAnimation.setInterpolator(new OvershootInterpolator());
            this.autoScrollAnimation.setDuration(600L);
            this.autoScrollAnimation.start();
        }
    }

    public void lambda$scrollToInternal$2(float f, float f2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.offsetAngle = (f * (1.0f - floatValue)) + (f2 * floatValue);
        invalidate();
    }

    public class AnonymousClass3 extends AnimatorListenerAdapter {
        final float val$scrollTo;

        AnonymousClass3(float f) {
            this.val$scrollTo = f;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            CarouselView carouselView = CarouselView.this;
            carouselView.offsetAngle = this.val$scrollTo;
            carouselView.autoScrollAnimation = null;
            carouselView.invalidate();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    CarouselView.AnonymousClass3.this.lambda$onAnimationEnd$0();
                }
            });
        }

        public void lambda$onAnimationEnd$0() {
            if (!CarouselView.this.drawingObjectsSorted.isEmpty()) {
                ((DrawingObject) CarouselView.this.drawingObjectsSorted.get(CarouselView.this.drawingObjectsSorted.size() - 1)).select();
            }
            CarouselView.this.scheduleAutoscroll();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.scrolled = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.scrolled = false;
            getParent().requestDisallowInterceptTouchEvent(false);
            invalidate();
        }
        return this.gestureDetector.onTouchEvent(motionEvent);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.cX = getMeasuredWidth() >> 1;
        this.cY = getMeasuredHeight() >> 1;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < this.drawingObjectsSorted.size(); i2++) {
                this.drawingObjectsSorted.get(i2).onAttachToWindow(this, i);
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            this.drawingObjects.get(i).onDetachFromWindow();
        }
    }

    @Override
    protected void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.CarouselView.onDraw(android.graphics.Canvas):void");
    }

    void scheduleAutoscroll() {
        AndroidUtilities.cancelRunOnUIThread(this.autoScrollRunnable);
        if (this.autoPlayEnabled) {
            AndroidUtilities.runOnUIThread(this.autoScrollRunnable, 3000L);
        }
    }

    @Override
    public void setOffset(float f) {
        if (f >= getMeasuredWidth() || f <= (-getMeasuredWidth())) {
            this.overScroller.abortAnimation();
            ValueAnimator valueAnimator = this.autoScrollAnimation;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.autoScrollAnimation.cancel();
                this.autoScrollAnimation = null;
            }
            this.firstScroll = true;
            this.firstScroll1 = true;
            this.offsetAngle = 0.0f;
        }
        setAutoPlayEnabled(f == 0.0f);
        setFirstScrollEnabled(Math.abs(f) < ((float) getMeasuredWidth()) * 0.2f);
        float clamp = 1.0f - Utilities.clamp(Math.abs(f) / getMeasuredWidth(), 1.0f, 0.0f);
        setScaleX(clamp);
        setScaleY(clamp);
    }

    void setAutoPlayEnabled(boolean z) {
        if (this.autoPlayEnabled != z) {
            this.autoPlayEnabled = z;
            if (z) {
                scheduleAutoscroll();
            } else {
                AndroidUtilities.cancelRunOnUIThread(this.autoScrollRunnable);
            }
            invalidate();
        }
    }

    void setFirstScrollEnabled(boolean z) {
        if (this.firstScrollEnabled != z) {
            this.firstScrollEnabled = z;
            invalidate();
        }
    }
}
