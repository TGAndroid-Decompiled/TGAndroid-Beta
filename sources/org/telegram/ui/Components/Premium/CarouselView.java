package org.telegram.ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.OverScroller;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.Premium.CarouselView;

public class CarouselView extends View implements PagerHeaderView {
    static final Interpolator sQuinticInterpolator = CarouselView$$ExternalSyntheticLambda1.INSTANCE;
    ValueAnimator autoScrollAnimation;
    int cX;
    int cY;
    private final ArrayList<? extends DrawingObject> drawingObjects;
    private final ArrayList<? extends DrawingObject> drawingObjectsSorted;
    GestureDetector gestureDetector;
    float lastFlingX;
    float lastFlingY;
    int lastSelected;
    boolean scrolled;
    float offsetAngle = 0.0f;
    boolean firstScroll = true;
    boolean firstScroll1 = true;
    boolean firstScrollEnabled = true;
    boolean autoPlayEnabled = true;
    Comparator<DrawingObject> comparator = Comparator$CC.comparingInt(CarouselView$$ExternalSyntheticLambda2.INSTANCE);
    private Runnable autoScrollRunnable = new Runnable() {
        @Override
        public void run() {
            CarouselView carouselView = CarouselView.this;
            if (carouselView.autoPlayEnabled) {
                carouselView.scrollToInternal(carouselView.offsetAngle + (360.0f / carouselView.drawingObjects.size()));
            }
        }
    };
    OverScroller overScroller = new OverScroller(getContext(), sQuinticInterpolator);

    public static class DrawingObject {
        public double angle;
        public float x;
        public float y;
        float yRelative;

        public boolean checkTap(float f, float f2) {
            return false;
        }

        public void draw(Canvas canvas, float f, float f2, float f3) {
        }

        public void hideAnimation() {
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

    public static int lambda$new$1(DrawingObject drawingObject) {
        return (int) (drawingObject.yRelative * 100.0f);
    }

    public CarouselView(Context context, final ArrayList<? extends DrawingObject> arrayList) {
        super(context);
        this.gestureDetector = new GestureDetector(context, new GestureDetector.OnGestureListener() {
            double lastAngle;

            @Override
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                double measuredHeight = CarouselView.this.getMeasuredHeight();
                Double.isNaN(measuredHeight);
                if (motionEvent.getY() > measuredHeight * 0.2d) {
                    double measuredHeight2 = CarouselView.this.getMeasuredHeight();
                    Double.isNaN(measuredHeight2);
                    if (motionEvent.getY() < measuredHeight2 * 0.9d) {
                        CarouselView.this.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
                ValueAnimator valueAnimator = CarouselView.this.autoScrollAnimation;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    CarouselView.this.autoScrollAnimation.cancel();
                    CarouselView.this.autoScrollAnimation = null;
                }
                AndroidUtilities.cancelRunOnUIThread(CarouselView.this.autoScrollRunnable);
                CarouselView.this.overScroller.abortAnimation();
                this.lastAngle = Math.atan2(motionEvent.getX() - CarouselView.this.cX, motionEvent.getY() - CarouselView.this.cY);
                CarouselView carouselView = CarouselView.this;
                carouselView.lastSelected = (int) (carouselView.offsetAngle / (360.0f / arrayList.size()));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((DrawingObject) arrayList.get(i)).hideAnimation();
                }
                return true;
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                for (int size = CarouselView.this.drawingObjectsSorted.size() - 1; size >= 0; size--) {
                    if (((DrawingObject) CarouselView.this.drawingObjectsSorted.get(size)).checkTap(x, y)) {
                        if (((DrawingObject) CarouselView.this.drawingObjectsSorted.get(size)).angle % 360.0d != 270.0d) {
                            double d = ((270.0d - (((DrawingObject) CarouselView.this.drawingObjectsSorted.get(size)).angle % 360.0d)) + 180.0d) % 360.0d;
                            if (d > 180.0d) {
                                d = -(360.0d - d);
                            }
                            CarouselView carouselView = CarouselView.this;
                            carouselView.scrollToInternal(carouselView.offsetAngle + ((float) d));
                            CarouselView.this.performHapticFeedback(3);
                        }
                        return true;
                    }
                }
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                double atan2 = Math.atan2(motionEvent2.getX() - CarouselView.this.cX, motionEvent2.getY() - CarouselView.this.cY);
                double d = this.lastAngle - atan2;
                this.lastAngle = atan2;
                CarouselView carouselView = CarouselView.this;
                double d2 = carouselView.offsetAngle;
                double degrees = Math.toDegrees(d);
                Double.isNaN(d2);
                carouselView.offsetAngle = (float) (d2 + degrees);
                CarouselView.this.checkSelectedHaptic();
                CarouselView.this.invalidate();
                return true;
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                double d;
                double d2;
                CarouselView carouselView = CarouselView.this;
                carouselView.lastFlingY = 0.0f;
                carouselView.lastFlingX = 0.0f;
                double atan2 = Math.atan2(motionEvent2.getX() - CarouselView.this.cX, motionEvent2.getY() - CarouselView.this.cY);
                double cos = Math.cos(atan2);
                Double.isNaN(f);
                double sin = Math.sin(atan2);
                Double.isNaN(f2);
                CarouselView.this.overScroller.fling(0, 0, (int) ((cos * d) - (sin * d2)), 0, Integer.MIN_VALUE, ConnectionsManager.DEFAULT_DATACENTER_ID, Integer.MIN_VALUE, ConnectionsManager.DEFAULT_DATACENTER_ID);
                if (CarouselView.this.overScroller.isFinished()) {
                    CarouselView.this.scheduleAutoscroll();
                }
                CarouselView.this.invalidate();
                return true;
            }
        });
        this.drawingObjects = arrayList;
        this.drawingObjectsSorted = new ArrayList<>(arrayList);
    }

    public void checkSelectedHaptic() {
        int size = (int) (this.offsetAngle / (360.0f / this.drawingObjects.size()));
        if (this.lastSelected != size) {
            this.lastSelected = size;
            performHapticFeedback(3);
        }
    }

    public void scrollToInternal(final float f) {
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
            for (int i2 = 0; i2 < this.drawingObjects.size(); i2++) {
                this.drawingObjects.get(i2).onAttachToWindow(this, i);
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
        boolean z = true;
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
        if (Math.abs(f) >= getMeasuredWidth() * 0.2f) {
            z = false;
        }
        setFirstScrollEnabled(z);
        float abs = 1.0f - (Math.abs(f) / getMeasuredWidth());
        setScaleX(abs);
        setScaleY(abs);
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
