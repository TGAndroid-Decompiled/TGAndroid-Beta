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
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.er;
public abstract class r2 extends FrameLayout implements z5 {
    public float E;
    public boolean F;
    public final Paint G;
    public final u2 H;
    public VelocityTracker f29542a;
    public int f29543b;
    public int f29544c;
    public int d;
    public boolean f29545e;
    public boolean f29546f;
    public AnimatorSet h;
    public final e2.r0 f29547n;
    public final Rect f29548r;
    public final Paint f29549s;
    public boolean f29550w;
    public int f29551x;
    public float f29552y;

    public r2(u2 u2Var, Context context) {
        super(context);
        this.H = u2Var;
        this.f29542a = null;
        this.d = -1;
        this.f29545e = false;
        this.f29546f = false;
        this.h = null;
        this.f29548r = new Rect();
        this.f29549s = new Paint();
        this.f29552y = 0.0f;
        this.E = 0.0f;
        this.G = new Paint(1);
        this.f29547n = new Object();
        setWillNotDraw(false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        this.H.r0();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        this.H.D(hashSet);
    }

    public final void b(float f10, float f11) {
        u2 u2Var = this.H;
        float translationY = u2Var.f29682b.getTranslationY();
        if ((translationY < org.telegram.messenger.g0.a1(false, 0.8f) && (f11 < 3500.0f || Math.abs(f11) < Math.abs(f10))) || (f11 < 0.0f && Math.abs(f11) >= 3500.0f)) {
            this.f29545e = false;
            this.h = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new p2(this, 1));
            this.h.playTogether(ObjectAnimator.ofFloat(u2Var.f29682b, "translationY", 0.0f), ofFloat);
            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.g0.a1(false, 0.8f)) * 250.0f));
            this.h.setInterpolator(er.f34419f);
            this.h.addListener(new q2(this, 0));
            ns.e().k(ns.f25518j1, 512);
            this.h.start();
            return;
        }
        boolean z10 = u2Var.f29691e0;
        u2Var.f29691e0 = false;
        u2Var.dismiss();
        u2Var.f29691e0 = z10;
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        float max;
        int left;
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.f29549s;
        u2 u2Var = this.H;
        if (i10 >= 26) {
            int i11 = u2Var.G0;
            if (i11 >= 0) {
                paint.setColor(j6.w0(i11, u2Var.J0));
            } else {
                paint.setColor(u2Var.H0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!u2Var.W0 || u2Var.f29682b.getVisibility() == 0) {
            boolean z10 = u2Var.f29707n;
            float f11 = 0.0f;
            if ((z10 && u2Var.S != 0) || u2Var.F0 != 0.0f) {
                if (z10) {
                    i7 = u2Var.R();
                } else {
                    i7 = 0;
                }
                if (!u2Var.f29719w && (i10 < 29 || u2.B(u2Var) <= 0)) {
                    max = 0.0f;
                } else if (u2Var.f29714s) {
                    max = Math.max(0.0f, Math.min(i7 - u2Var.F0, u2Var.f29682b.getTranslationY()));
                } else {
                    max = Math.max(0.0f, u2Var.R() - (u2Var.f29682b.getMeasuredHeight() - u2Var.f29682b.getTranslationY()));
                }
                int alpha = paint.getAlpha();
                if (u2Var.W0) {
                    f10 *= u2Var.f29682b.getAlpha();
                }
                if (u2Var.W0) {
                    left = (int) u2Var.f29682b.getX();
                } else {
                    left = u2Var.f29682b.getLeft();
                }
                int i12 = left;
                int i13 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i13 < 0) {
                    paint.setAlpha((int) (alpha * f10));
                }
                canvas.drawRect(u2Var.f29717u0 + i12, ((getMeasuredHeight() - i7) + max) - u2Var.F0, u2Var.f29682b.getRight() - u2Var.f29717u0, getMeasuredHeight() + max, paint);
                paint.setAlpha(alpha);
                int i14 = u2Var.f29699h1;
                if (i14 != 0) {
                    paint.setColor(i14);
                    int alpha2 = paint.getAlpha();
                    float R0 = org.telegram.messenger.g0.R0(i7);
                    if (i13 < 0) {
                        paint.setAlpha((int) (alpha2 * f10 * R0));
                    } else {
                        f11 = max;
                    }
                    if (paint.getAlpha() > 0) {
                        canvas.drawRect(i12 + u2Var.f29717u0, ((getMeasuredHeight() - i7) + f11) - u2Var.F0, u2Var.f29682b.getRight() - u2Var.f29717u0, getMeasuredHeight() + f11, paint);
                    }
                    paint.setAlpha(alpha2);
                }
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        u2 u2Var = this.H;
        k2 k2Var = u2Var.f29685c;
        int i7 = u2Var.f29702j0;
        if (!u2Var.J) {
            if (!u2Var.f0(motionEvent)) {
                if (!u2Var.J(motionEvent) && !this.F) {
                    if (u2Var.I() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f29546f && !this.f29545e && motionEvent.getPointerCount() == 1)) {
                        this.f29543b = (int) motionEvent.getX();
                        int y10 = (int) motionEvent.getY();
                        this.f29544c = y10;
                        if (u2Var.Y(this.f29543b, y10)) {
                            u2Var.o0();
                            return true;
                        }
                        this.d = motionEvent.getPointerId(0);
                        this.f29545e = true;
                        a();
                        VelocityTracker velocityTracker = this.f29542a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (u2Var.H() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f29542a == null) {
                            this.f29542a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f29543b));
                        float y11 = ((int) motionEvent.getY()) - this.f29544c;
                        this.f29542a.addMovement(motionEvent);
                        if (!u2Var.E0 && this.f29545e && !this.f29546f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= i7) {
                            this.f29544c = (int) motionEvent.getY();
                            this.f29545e = false;
                            this.f29546f = true;
                            requestDisallowInterceptTouchEvent(true);
                        } else if (this.f29546f) {
                            float f10 = this.f29552y + y11;
                            this.f29552y = f10;
                            float max = Math.max(f10, 0.0f);
                            this.f29552y = max;
                            u2Var.f29682b.setTranslationY(Math.max(max, 0.0f));
                            u2Var.h0();
                            this.f29544c = (int) motionEvent.getY();
                            k2Var.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f29542a == null) {
                            this.f29542a = VelocityTracker.obtain();
                        }
                        this.f29542a.computeCurrentVelocity(1000);
                        if (!this.f29546f && this.f29552y <= 0.0f) {
                            this.f29545e = false;
                        } else {
                            b(this.f29542a.getXVelocity(), this.f29542a.getYVelocity());
                        }
                        this.f29546f = false;
                        VelocityTracker velocityTracker2 = this.f29542a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f29542a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f29546f && !this.f29545e && motionEvent.getPointerCount() == 1)) {
                    this.F = true;
                    this.f29543b = (int) motionEvent.getX();
                    this.f29544c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.f29545e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x10 = motionEvent.getX() - this.f29543b;
                    float y12 = motionEvent.getY() - this.f29544c;
                    if (this.f29542a == null) {
                        this.f29542a = VelocityTracker.obtain();
                    }
                    this.f29542a.addMovement(motionEvent);
                    if (!u2Var.E0 && this.f29545e && !this.f29546f && x10 > 0.0f && x10 / 3.0f > Math.abs(y12) && Math.abs(x10) >= i7) {
                        this.f29543b = (int) motionEvent.getX();
                        this.f29545e = false;
                        this.f29546f = true;
                    } else if (this.f29546f) {
                        float f11 = this.E + x10;
                        this.E = f11;
                        u2Var.f29682b.setTranslationX(Math.max(f11, 0.0f));
                        this.f29543b = (int) motionEvent.getX();
                        k2Var.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f29542a == null) {
                        this.f29542a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f29542a.getXVelocity();
                    float yVelocity = this.f29542a.getYVelocity();
                    if (this.E < u2Var.f29682b.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max2 = Math.max(this.E, 0.0f);
                        this.E = max2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 0.0f);
                        ofFloat.addUpdateListener(new p2(this, 2));
                        ofFloat.addListener(new q2(this, 1));
                        ofFloat.setInterpolator(er.f34419f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new p2(this, 3));
                        ofFloat2.addListener(new q2(this, 2));
                        er erVar = er.h;
                        ofFloat2.setInterpolator(erVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new p2(this, 4));
                        ofFloat3.setInterpolator(erVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.f29545e = false;
                    this.f29546f = false;
                    this.d = -1;
                    this.F = false;
                }
                if ((z10 || !this.f29545e) && !this.f29546f && (u2Var.H() || u2Var.J(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.r2.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof CameraView) {
            if (this.H.H0()) {
                c(canvas, 1.0f);
            }
            return super.drawChild(canvas, view, j3);
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f29547n.b();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        int i7;
        int i10;
        int i11;
        Paint paint = this.f29549s;
        int alpha = paint.getAlpha();
        u2 u2Var = this.H;
        int i12 = 0;
        if (alpha < 255 && u2Var.f29707n) {
            float f10 = 0.0f;
            if (u2Var.f29719w || (Build.VERSION.SDK_INT >= 29 && u2.B(u2Var) > 0)) {
                f10 = Math.max(0.0f, u2Var.R() - (u2Var.f29682b.getMeasuredHeight() - u2Var.f29682b.getTranslationY()));
            }
            if (u2Var.f29707n) {
                i11 = u2Var.R();
            } else {
                i11 = 0;
            }
            canvas.save();
            canvas.clipRect(u2Var.f29682b.getLeft() + u2Var.f29717u0, ((getMeasuredHeight() - i11) + f10) - u2Var.F0, u2Var.f29682b.getRight() - u2Var.f29717u0, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        } else {
            canvas2 = canvas;
            z10 = false;
        }
        super.onDraw(canvas2);
        if (u2Var.f29707n && u2Var.h != null && u2Var.f29693f != 0) {
            int i13 = u2Var.f29683b0;
            if (i13 >= 0) {
                i7 = j6.w0(i13, u2Var.J0);
            } else {
                i7 = 0;
            }
            paint.setColor(i7);
            float left = u2Var.f29682b.getLeft() + u2Var.f29717u0;
            int measuredHeight = getMeasuredHeight() - u2Var.f29693f;
            if (u2Var.f29707n) {
                i10 = u2Var.R();
            } else {
                i10 = 0;
            }
            float f11 = measuredHeight - i10;
            float right = u2Var.f29682b.getRight() - u2Var.f29717u0;
            int measuredHeight2 = getMeasuredHeight();
            if (u2Var.f29707n) {
                i12 = u2Var.R();
            }
            canvas2.drawRect(left, f11, right, measuredHeight2 - i12, paint);
        }
        u2Var.d0();
        if (z10) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        u2 u2Var = this.H;
        if (!u2Var.H() && !u2Var.J(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.r2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.r2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        u2 u2Var = this.H;
        if (!u2Var.J && u2Var.f29713r0) {
            a();
            float translationY = u2Var.f29682b.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i10 > 0) {
                float f11 = translationY - i10;
                iArr[1] = i10;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                u2Var.f29682b.setTranslationY(f10);
                u2Var.h0();
                u2Var.f29685c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        u2 u2Var = this.H;
        if (!u2Var.J && u2Var.f29713r0) {
            a();
            if (i12 != 0) {
                float translationY = u2Var.f29682b.getTranslationY() - i12;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                u2Var.f29682b.setTranslationY(translationY);
                u2Var.h0();
                u2Var.f29685c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f29547n.f10369a = i7;
        u2 u2Var = this.H;
        if (!u2Var.J && u2Var.f29713r0) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        u2 u2Var = this.H;
        if (!u2Var.J && u2Var.f29713r0 && i7 == 2 && !u2Var.H()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f29547n.f10369a = 0;
        u2 u2Var = this.H;
        if (!u2Var.J && u2Var.f29713r0) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f29545e && !this.f29546f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override
    public final void updateColors() {
        u2 u2Var = this.H;
        try {
            u2.A(u2Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        u2Var.s0();
    }
}
