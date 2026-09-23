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
import org.telegram.ui.Components.rr;
public abstract class d3 extends FrameLayout {
    public boolean E;
    public final Paint F;
    public final f3 G;
    public VelocityTracker f18548a;
    public int f18549b;
    public int f18550c;
    public int d;
    public boolean e;
    public boolean f18551f;
    public AnimatorSet h;
    public final b2.q0 f18552n;
    public final Rect f18553r;
    public final Paint f18554s;
    public boolean v;
    public int f18555w;
    public float f18556x;
    public float f18557y;

    public d3(f3 f3Var, Context context) {
        super(context);
        this.G = f3Var;
        this.f18548a = null;
        this.d = -1;
        this.e = false;
        this.f18551f = false;
        this.h = null;
        this.f18553r = new Rect();
        this.f18554s = new Paint();
        this.f18556x = 0.0f;
        this.f18557y = 0.0f;
        this.F = new Paint(1);
        this.f18552n = new Object();
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
        f3 f3Var = this.G;
        float translationY = f3Var.containerView.getTranslationY();
        if ((translationY >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f10 >= 3500.0f && Math.abs(f10) >= Math.abs(f7))) && (f10 >= 0.0f || Math.abs(f10) < 3500.0f)) {
            z10 = f3Var.allowCustomAnimation;
            f3Var.allowCustomAnimation = false;
            f3Var.useFastDismiss = true;
            f3Var.dismiss();
            f3Var.allowCustomAnimation = z10;
            return;
        }
        this.e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b3(this, 4));
        this.h.playTogether(ObjectAnimator.ofFloat(f3Var.containerView, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
        this.h.setInterpolator(rr.f27701f);
        this.h.addListener(new c3(this, 3));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.h.start();
    }

    public final void c(android.graphics.Canvas r14, float r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.d3.c(android.graphics.Canvas, float):void");
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        f3 f3Var = this.G;
        z11 = f3Var.dismissed;
        if (!z11) {
            if (!f3Var.onContainerTouchEvent(motionEvent)) {
                if (!f3Var.canSwipeToBack(motionEvent) && !this.E) {
                    if (f3Var.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f18551f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.f18549b = (int) motionEvent.getX();
                        int y3 = (int) motionEvent.getY();
                        this.f18550c = y3;
                        if (f3Var.isTouchOutside(this.f18549b, y3)) {
                            f3Var.onDismissWithTouchOutside();
                            return true;
                        }
                        f3Var.onScrollUpBegin(this.f18556x);
                        this.d = motionEvent.getPointerId(0);
                        this.e = true;
                        a();
                        VelocityTracker velocityTracker = this.f18548a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (f3Var.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f18548a == null) {
                            this.f18548a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f18549b));
                        float y10 = ((int) motionEvent.getY()) - this.f18550c;
                        boolean onScrollUp = f3Var.onScrollUp(this.f18556x + y10);
                        this.f18548a.addMovement(motionEvent);
                        z13 = f3Var.disableScroll;
                        if (!z13 && this.e && !this.f18551f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs)) {
                            float abs2 = Math.abs(y10);
                            i11 = f3Var.touchSlop;
                            if (abs2 >= i11) {
                                this.f18550c = (int) motionEvent.getY();
                                this.e = false;
                                this.f18551f = true;
                                requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.f18551f) {
                            float f7 = this.f18556x + y10;
                            this.f18556x = f7;
                            if (!onScrollUp) {
                                this.f18556x = Math.max(f7, 0.0f);
                            }
                            f3Var.containerView.setTranslationY(Math.max(this.f18556x, 0.0f));
                            f3Var.onContainerViewTranslation();
                            this.f18550c = (int) motionEvent.getY();
                            f3Var.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f18548a == null) {
                            this.f18548a = VelocityTracker.obtain();
                        }
                        this.f18548a.computeCurrentVelocity(1000);
                        f3Var.onScrollUpEnd(this.f18556x);
                        if (!this.f18551f && this.f18556x <= 0.0f) {
                            this.e = false;
                        } else {
                            b(this.f18548a.getXVelocity(), this.f18548a.getYVelocity());
                        }
                        this.f18551f = false;
                        VelocityTracker velocityTracker2 = this.f18548a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f18548a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f18551f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.E = true;
                    this.f18549b = (int) motionEvent.getX();
                    this.f18550c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x10 = motionEvent.getX() - this.f18549b;
                    float y11 = motionEvent.getY() - this.f18550c;
                    if (this.f18548a == null) {
                        this.f18548a = VelocityTracker.obtain();
                    }
                    this.f18548a.addMovement(motionEvent);
                    z12 = f3Var.disableScroll;
                    if (!z12 && this.e && !this.f18551f && x10 > 0.0f && x10 / 3.0f > Math.abs(y11)) {
                        float abs3 = Math.abs(x10);
                        i10 = f3Var.touchSlop;
                        if (abs3 >= i10) {
                            this.f18549b = (int) motionEvent.getX();
                            this.e = false;
                            this.f18551f = true;
                        }
                    }
                    if (this.f18551f) {
                        float f10 = this.f18557y + x10;
                        this.f18557y = f10;
                        f3Var.containerView.setTranslationX(Math.max(f10, 0.0f));
                        this.f18549b = (int) motionEvent.getX();
                        f3Var.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f18548a == null) {
                        this.f18548a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f18548a.getXVelocity();
                    float yVelocity = this.f18548a.getYVelocity();
                    if (this.f18557y < f3Var.containerView.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max = Math.max(this.f18557y, 0.0f);
                        this.f18557y = max;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max, 0.0f);
                        ofFloat.addUpdateListener(new b3(this, 1));
                        ofFloat.addListener(new c3(this, 0));
                        ofFloat.setInterpolator(rr.f27701f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f18557y, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new b3(this, 2));
                        ofFloat2.addListener(new c3(this, 1));
                        rr rrVar = rr.h;
                        ofFloat2.setInterpolator(rrVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new b3(this, 3));
                        ofFloat3.setInterpolator(rrVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.e = false;
                    this.f18551f = false;
                    this.d = -1;
                    this.E = false;
                }
                if ((z10 || !this.e) && !this.f18551f && (f3Var.canDismissWithSwipe() || f3Var.canSwipeToBack(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.d3.dispatchDraw(android.graphics.Canvas):void");
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
        b2.q0 q0Var = this.f18552n;
        return q0Var.f3196b | q0Var.f3195a;
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
        Paint paint = this.f18554s;
        int alpha = paint.getAlpha();
        f3 f3Var = this.G;
        int i13 = 0;
        if (alpha < 255 && f3Var.drawNavigationBar) {
            float f10 = 0.0f;
            if (f3Var.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && f3.access$1400(f3Var) > 0)) {
                f10 = Math.max(0.0f, f3Var.getBottomInset() - (f3Var.containerView.getMeasuredHeight() - f3Var.containerView.getTranslationY()));
            }
            if (f3Var.drawNavigationBar) {
                i12 = f3Var.getBottomInset();
            } else {
                i12 = 0;
            }
            canvas.save();
            float left = f3Var.containerView.getLeft() + f3Var.backgroundPaddingLeft;
            f7 = f3Var.currentPanTranslationY;
            canvas.clipRect(left, ((getMeasuredHeight() - i12) + f10) - f7, f3Var.containerView.getRight() - f3Var.backgroundPaddingLeft, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        } else {
            canvas2 = canvas;
            z10 = false;
        }
        super.onDraw(canvas2);
        if (f3Var.drawNavigationBar) {
            windowInsets = f3Var.lastInsets;
            if (windowInsets != null && f3Var.keyboardHeight != 0) {
                int i14 = f3Var.behindKeyboardColorKey;
                if (i14 >= 0) {
                    i10 = f3Var.getThemedColor(i14);
                } else {
                    i10 = f3Var.behindKeyboardColor;
                }
                paint.setColor(i10);
                float left2 = f3Var.containerView.getLeft() + f3Var.backgroundPaddingLeft;
                int measuredHeight = getMeasuredHeight() - f3Var.keyboardHeight;
                if (f3Var.drawNavigationBar) {
                    i11 = f3Var.getBottomInset();
                } else {
                    i11 = 0;
                }
                float f11 = measuredHeight - i11;
                float right = f3Var.containerView.getRight() - f3Var.backgroundPaddingLeft;
                int measuredHeight2 = getMeasuredHeight();
                if (f3Var.drawNavigationBar) {
                    i13 = f3Var.getBottomInset();
                }
                canvas2.drawRect(left2, f11, right, measuredHeight2 - i13, paint);
            }
        }
        f3Var.onContainerDraw(canvas2);
        if (z10) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.G;
        if (!f3Var.canDismissWithSwipe() && !f3Var.canSwipeToBack(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.d3.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.d3.onMeasure(int, int):void");
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
        f3 f3Var = this.G;
        z10 = f3Var.dismissed;
        if (!z10 && f3Var.allowNestedScroll) {
            a();
            float translationY = f3Var.containerView.getTranslationY();
            float f7 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                f3Var.containerView.setTranslationY(f7);
                f3Var.onContainerViewTranslation();
                f3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        f3 f3Var = this.G;
        z10 = f3Var.dismissed;
        if (!z10 && f3Var.allowNestedScroll) {
            a();
            if (i13 != 0) {
                float translationY = f3Var.containerView.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                f3Var.containerView.setTranslationY(translationY);
                f3Var.onContainerViewTranslation();
                f3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        boolean z10;
        this.f18552n.f3195a = i10;
        f3 f3Var = this.G;
        z10 = f3Var.dismissed;
        if (!z10 && f3Var.allowNestedScroll) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        boolean z10;
        f3 f3Var = this.G;
        View view3 = f3Var.nestedScrollChild;
        if (view3 == null || view == view3) {
            z10 = f3Var.dismissed;
            if (!z10 && f3Var.allowNestedScroll && i10 == 2 && !f3Var.canDismissWithSwipe()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f18552n.f3195a = 0;
        f3 f3Var = this.G;
        z10 = f3Var.dismissed;
        if (!z10 && f3Var.allowNestedScroll) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f18551f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
