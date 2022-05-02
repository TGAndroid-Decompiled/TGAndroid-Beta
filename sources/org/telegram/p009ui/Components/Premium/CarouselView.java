package org.telegram.p009ui.Components.Premium;

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
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
import p008j$.util.Comparator$CC;

public class CarouselView extends View {
    static final Interpolator sQuinticInterpolator = CarouselView$$ExternalSyntheticLambda1.INSTANCE;
    ValueAnimator autoScrollAnimation;
    int f1074cX;
    int f1075cY;
    private final ArrayList<DrawingObject> drawingObjects;
    private final ArrayList<DrawingObject> drawingObjectsSorted;
    GestureDetector gestureDetector;
    float lastFlingX;
    float lastFlingY;
    boolean scrolled;
    float offsetAngle = 0.0f;
    boolean firstScroll = true;
    Comparator<DrawingObject> comparator = Comparator$CC.comparingInt(CarouselView$$ExternalSyntheticLambda2.INSTANCE);
    OverScroller overScroller = new OverScroller(getContext(), sQuinticInterpolator);

    public static class DrawingObject {
        public double angle;
        public float f1076x;
        public float f1077y;
        float yRelative;

        public boolean checkTap(float f, float f2) {
            return false;
        }

        public void draw(Canvas canvas, float f, float f2) {
        }

        public void onAttachToWindow(View view) {
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

    public CarouselView(Context context, ArrayList<DrawingObject> arrayList) {
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
                ValueAnimator valueAnimator = CarouselView.this.autoScrollAnimation;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                CarouselView.this.overScroller.abortAnimation();
                this.lastAngle = Math.atan2(motionEvent.getX() - CarouselView.this.f1074cX, motionEvent.getY() - CarouselView.this.f1075cY);
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
                        }
                        return true;
                    }
                }
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                double atan2 = Math.atan2(motionEvent2.getX() - CarouselView.this.f1074cX, motionEvent2.getY() - CarouselView.this.f1075cY);
                double d = this.lastAngle - atan2;
                this.lastAngle = atan2;
                CarouselView carouselView = CarouselView.this;
                double d2 = carouselView.offsetAngle;
                double degrees = Math.toDegrees(d);
                Double.isNaN(d2);
                carouselView.offsetAngle = (float) (d2 + degrees);
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
                double atan2 = Math.atan2(motionEvent2.getX() - CarouselView.this.f1074cX, motionEvent2.getY() - CarouselView.this.f1075cY);
                double cos = Math.cos(atan2);
                Double.isNaN(f);
                double sin = Math.sin(atan2);
                Double.isNaN(f2);
                CarouselView.this.overScroller.fling(0, 0, (int) ((cos * d) - (sin * d2)), 0, Integer.MIN_VALUE, ConnectionsManager.DEFAULT_DATACENTER_ID, Integer.MIN_VALUE, ConnectionsManager.DEFAULT_DATACENTER_ID);
                CarouselView.this.invalidate();
                return true;
            }
        });
        this.drawingObjects = arrayList;
        this.drawingObjectsSorted = new ArrayList<>(arrayList);
    }

    public void scrollToInternal(final float f) {
        ValueAnimator valueAnimator = this.autoScrollAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final float f2 = this.offsetAngle;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.autoScrollAnimation = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                CarouselView.this.lambda$scrollToInternal$1(f2, f, valueAnimator2);
            }
        });
        this.autoScrollAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                CarouselView carouselView;
                CarouselView.this.autoScrollAnimation = null;
                CarouselView carouselView2 = CarouselView.this;
                int size = (int) (((90.0f - carouselView2.offsetAngle) % 360.0f) / (360.0f / carouselView.drawingObjects.size()));
                if (size < 0) {
                    size += carouselView2.drawingObjects.size();
                }
                if (size > CarouselView.this.drawingObjects.size() - 1) {
                    size = CarouselView.this.drawingObjects.size() - 1;
                }
                ((DrawingObject) CarouselView.this.drawingObjects.get(size)).select();
                CarouselView.this.invalidate();
            }
        });
        this.autoScrollAnimation.setInterpolator(new OvershootInterpolator());
        this.autoScrollAnimation.setDuration(600L);
        this.autoScrollAnimation.start();
    }

    public void lambda$scrollToInternal$1(float f, float f2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.offsetAngle = (f * (1.0f - floatValue)) + (f2 * floatValue);
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.scrolled = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.scrolled = false;
            invalidate();
        }
        return this.gestureDetector.onTouchEvent(motionEvent);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f1074cX = getMeasuredWidth() >> 1;
        this.f1075cY = getMeasuredHeight() >> 1;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            this.drawingObjects.get(i).onAttachToWindow(this);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            this.drawingObjects.get(i).onDetachFromWindow();
        }
    }

    public static int lambda$new$2(DrawingObject drawingObject) {
        return (int) (drawingObject.yRelative * 100.0f);
    }

    @Override
    protected void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.Premium.CarouselView.onDraw(android.graphics.Canvas):void");
    }
}
