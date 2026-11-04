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
import org.telegram.messenger.hs;
import org.telegram.ui.Components.xq;
public abstract class q2 extends FrameLayout implements z5 {
    public float E;
    public boolean F;
    public final Paint G;
    public final t2 H;
    public VelocityTracker f28476a;
    public int f28477b;
    public int f28478c;
    public int d;
    public boolean f28479e;
    public boolean f28480f;
    public AnimatorSet h;
    public final d2.t0 f28481n;
    public final Rect f28482r;
    public final Paint f28483s;
    public boolean f28484w;
    public int f28485x;
    public float f28486y;

    public q2(t2 t2Var, Context context) {
        super(context);
        this.H = t2Var;
        this.f28476a = null;
        this.d = -1;
        this.f28479e = false;
        this.f28480f = false;
        this.h = null;
        this.f28482r = new Rect();
        this.f28483s = new Paint();
        this.f28486y = 0.0f;
        this.E = 0.0f;
        this.G = new Paint(1);
        this.f28481n = new Object();
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
        t2 t2Var = this.H;
        float translationY = t2Var.f28586b.getTranslationY();
        if ((translationY < org.telegram.messenger.g0.a1(false, 0.8f) && (f11 < 3500.0f || Math.abs(f11) < Math.abs(f10))) || (f11 < 0.0f && Math.abs(f11) >= 3500.0f)) {
            this.f28479e = false;
            this.h = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new o2(this, 1));
            this.h.playTogether(ObjectAnimator.ofFloat(t2Var.f28586b, "translationY", 0.0f), ofFloat);
            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.g0.a1(false, 0.8f)) * 250.0f));
            this.h.setInterpolator(xq.f40452f);
            this.h.addListener(new p2(this, 0));
            hs.e().k(hs.f23249j1, 512);
            this.h.start();
            return;
        }
        boolean z10 = t2Var.f28595e0;
        t2Var.f28595e0 = false;
        t2Var.dismiss();
        t2Var.f28595e0 = z10;
    }

    public final void c(Canvas canvas, float f10) {
        int i3;
        float max;
        int left;
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.f28483s;
        t2 t2Var = this.H;
        if (i10 >= 26) {
            int i11 = t2Var.G0;
            if (i11 >= 0) {
                paint.setColor(k6.w0(i11, t2Var.J0));
            } else {
                paint.setColor(t2Var.H0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!t2Var.W0 || t2Var.f28586b.getVisibility() == 0) {
            boolean z10 = t2Var.f28608n;
            float f11 = 0.0f;
            if ((z10 && t2Var.S != 0) || t2Var.F0 != 0.0f) {
                if (z10) {
                    i3 = t2Var.Q();
                } else {
                    i3 = 0;
                }
                if (!t2Var.f28620w && (i10 < 29 || t2.B(t2Var) <= 0)) {
                    max = 0.0f;
                } else if (t2Var.f28615s) {
                    max = Math.max(0.0f, Math.min(i3 - t2Var.F0, t2Var.f28586b.getTranslationY()));
                } else {
                    max = Math.max(0.0f, t2Var.Q() - (t2Var.f28586b.getMeasuredHeight() - t2Var.f28586b.getTranslationY()));
                }
                int alpha = paint.getAlpha();
                if (t2Var.W0) {
                    f10 *= t2Var.f28586b.getAlpha();
                }
                if (t2Var.W0) {
                    left = (int) t2Var.f28586b.getX();
                } else {
                    left = t2Var.f28586b.getLeft();
                }
                int i12 = left;
                int i13 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i13 < 0) {
                    paint.setAlpha((int) (alpha * f10));
                }
                canvas.drawRect(t2Var.f28618u0 + i12, ((getMeasuredHeight() - i3) + max) - t2Var.F0, t2Var.f28586b.getRight() - t2Var.f28618u0, getMeasuredHeight() + max, paint);
                paint.setAlpha(alpha);
                int i14 = t2Var.f28596e1;
                if (i14 != 0) {
                    paint.setColor(i14);
                    int alpha2 = paint.getAlpha();
                    float R0 = org.telegram.messenger.g0.R0(i3);
                    if (i13 < 0) {
                        paint.setAlpha((int) (alpha2 * f10 * R0));
                    } else {
                        f11 = max;
                    }
                    if (paint.getAlpha() > 0) {
                        canvas.drawRect(i12 + t2Var.f28618u0, ((getMeasuredHeight() - i3) + f11) - t2Var.F0, t2Var.f28586b.getRight() - t2Var.f28618u0, getMeasuredHeight() + f11, paint);
                    }
                    paint.setAlpha(alpha2);
                }
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        t2 t2Var = this.H;
        j2 j2Var = t2Var.f28589c;
        int i3 = t2Var.f28605j0;
        if (!t2Var.J) {
            if (!t2Var.f0(motionEvent)) {
                if (!t2Var.I(motionEvent) && !this.F) {
                    if (t2Var.H() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f28480f && !this.f28479e && motionEvent.getPointerCount() == 1)) {
                        this.f28477b = (int) motionEvent.getX();
                        int y9 = (int) motionEvent.getY();
                        this.f28478c = y9;
                        if (t2Var.X(this.f28477b, y9)) {
                            t2Var.o0();
                            return true;
                        }
                        this.d = motionEvent.getPointerId(0);
                        this.f28479e = true;
                        a();
                        VelocityTracker velocityTracker = this.f28476a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (t2Var.G() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f28476a == null) {
                            this.f28476a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f28477b));
                        float y10 = ((int) motionEvent.getY()) - this.f28478c;
                        this.f28476a.addMovement(motionEvent);
                        if (!t2Var.E0 && this.f28479e && !this.f28480f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= i3) {
                            this.f28478c = (int) motionEvent.getY();
                            this.f28479e = false;
                            this.f28480f = true;
                            requestDisallowInterceptTouchEvent(true);
                        } else if (this.f28480f) {
                            float f10 = this.f28486y + y10;
                            this.f28486y = f10;
                            float max = Math.max(f10, 0.0f);
                            this.f28486y = max;
                            t2Var.f28586b.setTranslationY(Math.max(max, 0.0f));
                            t2Var.h0();
                            this.f28478c = (int) motionEvent.getY();
                            j2Var.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f28476a == null) {
                            this.f28476a = VelocityTracker.obtain();
                        }
                        this.f28476a.computeCurrentVelocity(1000);
                        if (!this.f28480f && this.f28486y <= 0.0f) {
                            this.f28479e = false;
                        } else {
                            b(this.f28476a.getXVelocity(), this.f28476a.getYVelocity());
                        }
                        this.f28480f = false;
                        VelocityTracker velocityTracker2 = this.f28476a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f28476a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f28480f && !this.f28479e && motionEvent.getPointerCount() == 1)) {
                    this.F = true;
                    this.f28477b = (int) motionEvent.getX();
                    this.f28478c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.f28479e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x10 = motionEvent.getX() - this.f28477b;
                    float y11 = motionEvent.getY() - this.f28478c;
                    if (this.f28476a == null) {
                        this.f28476a = VelocityTracker.obtain();
                    }
                    this.f28476a.addMovement(motionEvent);
                    if (!t2Var.E0 && this.f28479e && !this.f28480f && x10 > 0.0f && x10 / 3.0f > Math.abs(y11) && Math.abs(x10) >= i3) {
                        this.f28477b = (int) motionEvent.getX();
                        this.f28479e = false;
                        this.f28480f = true;
                    } else if (this.f28480f) {
                        float f11 = this.E + x10;
                        this.E = f11;
                        t2Var.f28586b.setTranslationX(Math.max(f11, 0.0f));
                        this.f28477b = (int) motionEvent.getX();
                        j2Var.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f28476a == null) {
                        this.f28476a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f28476a.getXVelocity();
                    float yVelocity = this.f28476a.getYVelocity();
                    if (this.E < t2Var.f28586b.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max2 = Math.max(this.E, 0.0f);
                        this.E = max2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 0.0f);
                        ofFloat.addUpdateListener(new o2(this, 2));
                        ofFloat.addListener(new p2(this, 1));
                        ofFloat.setInterpolator(xq.f40452f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new o2(this, 3));
                        ofFloat2.addListener(new p2(this, 2));
                        xq xqVar = xq.h;
                        ofFloat2.setInterpolator(xqVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new o2(this, 4));
                        ofFloat3.setInterpolator(xqVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.f28479e = false;
                    this.f28480f = false;
                    this.d = -1;
                    this.F = false;
                }
                if ((z10 || !this.f28479e) && !this.f28480f && (t2Var.G() || t2Var.I(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.q2.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof CameraView) {
            if (this.H.H0()) {
                c(canvas, 1.0f);
            }
            return super.drawChild(canvas, view, j10);
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f28481n.b();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        int i3;
        int i10;
        int i11;
        Paint paint = this.f28483s;
        int alpha = paint.getAlpha();
        t2 t2Var = this.H;
        int i12 = 0;
        if (alpha < 255 && t2Var.f28608n) {
            float f10 = 0.0f;
            if (t2Var.f28620w || (Build.VERSION.SDK_INT >= 29 && t2.B(t2Var) > 0)) {
                f10 = Math.max(0.0f, t2Var.Q() - (t2Var.f28586b.getMeasuredHeight() - t2Var.f28586b.getTranslationY()));
            }
            if (t2Var.f28608n) {
                i11 = t2Var.Q();
            } else {
                i11 = 0;
            }
            canvas.save();
            canvas.clipRect(t2Var.f28586b.getLeft() + t2Var.f28618u0, ((getMeasuredHeight() - i11) + f10) - t2Var.F0, t2Var.f28586b.getRight() - t2Var.f28618u0, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        } else {
            canvas2 = canvas;
            z10 = false;
        }
        super.onDraw(canvas2);
        if (t2Var.f28608n && t2Var.h != null && t2Var.f28597f != 0) {
            int i13 = t2Var.f28587b0;
            if (i13 >= 0) {
                i3 = k6.w0(i13, t2Var.J0);
            } else {
                i3 = 0;
            }
            paint.setColor(i3);
            float left = t2Var.f28586b.getLeft() + t2Var.f28618u0;
            int measuredHeight = getMeasuredHeight() - t2Var.f28597f;
            if (t2Var.f28608n) {
                i10 = t2Var.Q();
            } else {
                i10 = 0;
            }
            float f11 = measuredHeight - i10;
            float right = t2Var.f28586b.getRight() - t2Var.f28618u0;
            int measuredHeight2 = getMeasuredHeight();
            if (t2Var.f28608n) {
                i12 = t2Var.Q();
            }
            canvas2.drawRect(left, f11, right, measuredHeight2 - i12, paint);
        }
        t2Var.d0();
        if (z10) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        t2 t2Var = this.H;
        if (!t2Var.G() && !t2Var.I(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.q2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.q2.onMeasure(int, int):void");
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
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
        t2 t2Var = this.H;
        if (!t2Var.J && t2Var.f28614r0) {
            a();
            float translationY = t2Var.f28586b.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i10 > 0) {
                float f11 = translationY - i10;
                iArr[1] = i10;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                t2Var.f28586b.setTranslationY(f10);
                t2Var.h0();
                t2Var.f28589c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        t2 t2Var = this.H;
        if (!t2Var.J && t2Var.f28614r0) {
            a();
            if (i12 != 0) {
                float translationY = t2Var.f28586b.getTranslationY() - i12;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                t2Var.f28586b.setTranslationY(translationY);
                t2Var.h0();
                t2Var.f28589c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        this.f28481n.f8413a = i3;
        t2 t2Var = this.H;
        if (!t2Var.J && t2Var.f28614r0) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        t2 t2Var = this.H;
        if (!t2Var.J && t2Var.f28614r0 && i3 == 2 && !t2Var.G()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f28481n.f8413a = 0;
        t2 t2Var = this.H;
        if (!t2Var.J && t2Var.f28614r0) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f28479e && !this.f28480f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override
    public final void updateColors() {
        t2 t2Var = this.H;
        try {
            t2.A(t2Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        t2Var.s0();
    }
}
