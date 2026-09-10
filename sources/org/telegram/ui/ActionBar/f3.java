package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.wr;
public abstract class f3 extends FrameLayout {
    public boolean E;
    public final Paint F;
    public final h3 G;
    public VelocityTracker f17704a;
    public int f17705b;
    public int f17706c;
    public int d;
    public boolean e;
    public boolean f17707f;
    public AnimatorSet h;
    public final b2.q0 f17708n;
    public final Rect f17709r;
    public final Paint f17710s;
    public boolean v;
    public int f17711w;
    public float f17712x;
    public float f17713y;

    public f3(h3 h3Var, Context context) {
        super(context);
        this.G = h3Var;
        this.f17704a = null;
        this.d = -1;
        this.e = false;
        this.f17707f = false;
        this.h = null;
        this.f17709r = new Rect();
        this.f17710s = new Paint();
        this.f17712x = 0.0f;
        this.f17713y = 0.0f;
        this.F = new Paint(1);
        this.f17708n = new Object();
        setWillNotDraw(false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        this.G.onSwipeStarts();
    }

    public final void b(float f7, float f10) {
        boolean z10;
        h3 h3Var = this.G;
        float translationY = h3Var.containerView.getTranslationY();
        if ((translationY >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f10 >= 3500.0f && Math.abs(f10) >= Math.abs(f7))) && (f10 >= 0.0f || Math.abs(f10) < 3500.0f)) {
            z10 = h3Var.allowCustomAnimation;
            h3Var.allowCustomAnimation = false;
            h3Var.useFastDismiss = true;
            h3Var.dismiss();
            h3Var.allowCustomAnimation = z10;
            return;
        }
        this.e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d3(this, 4));
        this.h.playTogether(ObjectAnimator.ofFloat(h3Var.containerView, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
        this.h.setInterpolator(wr.f28819f);
        this.h.addListener(new e3(this, 3));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.h.start();
    }

    public final void c(android.graphics.Canvas r14, float r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.f3.c(android.graphics.Canvas, float):void");
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        h3 h3Var = this.G;
        z11 = h3Var.dismissed;
        if (!z11) {
            if (!h3Var.onContainerTouchEvent(motionEvent)) {
                if (!h3Var.canSwipeToBack(motionEvent) && !this.E) {
                    if (h3Var.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f17707f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.f17705b = (int) motionEvent.getX();
                        int y3 = (int) motionEvent.getY();
                        this.f17706c = y3;
                        if (h3Var.isTouchOutside(this.f17705b, y3)) {
                            h3Var.onDismissWithTouchOutside();
                            return true;
                        }
                        h3Var.onScrollUpBegin(this.f17712x);
                        this.d = motionEvent.getPointerId(0);
                        this.e = true;
                        a();
                        VelocityTracker velocityTracker = this.f17704a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (h3Var.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f17704a == null) {
                            this.f17704a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f17705b));
                        float y10 = ((int) motionEvent.getY()) - this.f17706c;
                        boolean onScrollUp = h3Var.onScrollUp(this.f17712x + y10);
                        this.f17704a.addMovement(motionEvent);
                        z13 = h3Var.disableScroll;
                        if (!z13 && this.e && !this.f17707f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs)) {
                            float abs2 = Math.abs(y10);
                            i11 = h3Var.touchSlop;
                            if (abs2 >= i11) {
                                this.f17706c = (int) motionEvent.getY();
                                this.e = false;
                                this.f17707f = true;
                                requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.f17707f) {
                            float f7 = this.f17712x + y10;
                            this.f17712x = f7;
                            if (!onScrollUp) {
                                this.f17712x = Math.max(f7, 0.0f);
                            }
                            h3Var.containerView.setTranslationY(Math.max(this.f17712x, 0.0f));
                            h3Var.onContainerViewTranslation();
                            this.f17706c = (int) motionEvent.getY();
                            h3Var.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f17704a == null) {
                            this.f17704a = VelocityTracker.obtain();
                        }
                        this.f17704a.computeCurrentVelocity(1000);
                        h3Var.onScrollUpEnd(this.f17712x);
                        if (!this.f17707f && this.f17712x <= 0.0f) {
                            this.e = false;
                        } else {
                            b(this.f17704a.getXVelocity(), this.f17704a.getYVelocity());
                        }
                        this.f17707f = false;
                        VelocityTracker velocityTracker2 = this.f17704a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f17704a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f17707f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.E = true;
                    this.f17705b = (int) motionEvent.getX();
                    this.f17706c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x10 = motionEvent.getX() - this.f17705b;
                    float y11 = motionEvent.getY() - this.f17706c;
                    if (this.f17704a == null) {
                        this.f17704a = VelocityTracker.obtain();
                    }
                    this.f17704a.addMovement(motionEvent);
                    z12 = h3Var.disableScroll;
                    if (!z12 && this.e && !this.f17707f && x10 > 0.0f && x10 / 3.0f > Math.abs(y11)) {
                        float abs3 = Math.abs(x10);
                        i10 = h3Var.touchSlop;
                        if (abs3 >= i10) {
                            this.f17705b = (int) motionEvent.getX();
                            this.e = false;
                            this.f17707f = true;
                        }
                    }
                    if (this.f17707f) {
                        float f10 = this.f17713y + x10;
                        this.f17713y = f10;
                        h3Var.containerView.setTranslationX(Math.max(f10, 0.0f));
                        this.f17705b = (int) motionEvent.getX();
                        h3Var.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f17704a == null) {
                        this.f17704a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f17704a.getXVelocity();
                    float yVelocity = this.f17704a.getYVelocity();
                    if (this.f17713y < h3Var.containerView.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max = Math.max(this.f17713y, 0.0f);
                        this.f17713y = max;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max, 0.0f);
                        ofFloat.addUpdateListener(new d3(this, 1));
                        ofFloat.addListener(new e3(this, 0));
                        ofFloat.setInterpolator(wr.f28819f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f17713y, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new d3(this, 2));
                        ofFloat2.addListener(new e3(this, 1));
                        wr wrVar = wr.h;
                        ofFloat2.setInterpolator(wrVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new d3(this, 3));
                        ofFloat3.setInterpolator(wrVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.e = false;
                    this.f17707f = false;
                    this.d = -1;
                    this.E = false;
                }
                if ((z10 || !this.e) && !this.f17707f && (h3Var.canDismissWithSwipe() || h3Var.canSwipeToBack(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.f3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof CameraView) {
            if (this.G.shouldOverlayCameraViewOverNavBar()) {
                c(canvas, 1.0f);
            }
            return super.drawChild(canvas, view, j3);
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public int getNestedScrollAxes() {
        b2.q0 q0Var = this.f17708n;
        return q0Var.f1897b | q0Var.f1896a;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        WindowInsets windowInsets;
        int i10;
        int i11;
        int i12;
        float f7;
        Paint paint = this.f17710s;
        int alpha = paint.getAlpha();
        h3 h3Var = this.G;
        int i13 = 0;
        if (alpha < 255 && h3Var.drawNavigationBar) {
            float f10 = 0.0f;
            if (h3Var.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && h3.access$1400(h3Var) > 0)) {
                f10 = Math.max(0.0f, h3Var.getBottomInset() - (h3Var.containerView.getMeasuredHeight() - h3Var.containerView.getTranslationY()));
            }
            if (h3Var.drawNavigationBar) {
                i12 = h3Var.getBottomInset();
            } else {
                i12 = 0;
            }
            canvas.save();
            float left = h3Var.containerView.getLeft() + h3Var.backgroundPaddingLeft;
            f7 = h3Var.currentPanTranslationY;
            canvas.clipRect(left, ((getMeasuredHeight() - i12) + f10) - f7, h3Var.containerView.getRight() - h3Var.backgroundPaddingLeft, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        } else {
            canvas2 = canvas;
            z10 = false;
        }
        super.onDraw(canvas2);
        if (h3Var.drawNavigationBar) {
            windowInsets = h3Var.lastInsets;
            if (windowInsets != null && h3Var.keyboardHeight != 0) {
                int i14 = h3Var.behindKeyboardColorKey;
                if (i14 >= 0) {
                    i10 = h3Var.getThemedColor(i14);
                } else {
                    i10 = h3Var.behindKeyboardColor;
                }
                paint.setColor(i10);
                float left2 = h3Var.containerView.getLeft() + h3Var.backgroundPaddingLeft;
                int measuredHeight = getMeasuredHeight() - h3Var.keyboardHeight;
                if (h3Var.drawNavigationBar) {
                    i11 = h3Var.getBottomInset();
                } else {
                    i11 = 0;
                }
                float f11 = measuredHeight - i11;
                float right = h3Var.containerView.getRight() - h3Var.backgroundPaddingLeft;
                int measuredHeight2 = getMeasuredHeight();
                if (h3Var.drawNavigationBar) {
                    i13 = h3Var.getBottomInset();
                }
                canvas2.drawRect(left2, f11, right, measuredHeight2 - i13, paint);
            }
        }
        h3Var.onContainerDraw(canvas2);
        if (z10) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h3 h3Var = this.G;
        if (!h3Var.canDismissWithSwipe() && !h3Var.canSwipeToBack(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.f3.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.f3.onMeasure(int, int):void");
    }

    @Override
    public final boolean onNestedFling(View view, float f7, float f10, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z10;
        h3 h3Var = this.G;
        z10 = h3Var.dismissed;
        if (!z10 && h3Var.allowNestedScroll) {
            a();
            float translationY = h3Var.containerView.getTranslationY();
            float f7 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                h3Var.containerView.setTranslationY(f7);
                h3Var.onContainerViewTranslation();
                h3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        h3 h3Var = this.G;
        z10 = h3Var.dismissed;
        if (!z10 && h3Var.allowNestedScroll) {
            a();
            if (i13 != 0) {
                float translationY = h3Var.containerView.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                h3Var.containerView.setTranslationY(translationY);
                h3Var.onContainerViewTranslation();
                h3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        boolean z10;
        this.f17708n.f1896a = i10;
        h3 h3Var = this.G;
        z10 = h3Var.dismissed;
        if (!z10 && h3Var.allowNestedScroll) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        boolean z10;
        h3 h3Var = this.G;
        View view3 = h3Var.nestedScrollChild;
        if (view3 == null || view == view3) {
            z10 = h3Var.dismissed;
            if (!z10 && h3Var.allowNestedScroll && i10 == 2 && !h3Var.canDismissWithSwipe()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f17708n.f1896a = 0;
        h3 h3Var = this.G;
        z10 = h3Var.dismissed;
        if (!z10 && h3Var.allowNestedScroll) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f17707f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
