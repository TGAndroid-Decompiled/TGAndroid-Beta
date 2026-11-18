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
import org.telegram.messenger.ks;
import org.telegram.ui.Components.lr;
public abstract class u2 extends FrameLayout implements c6 {
    public float E;
    public boolean F;
    public final Paint G;
    public final x2 H;
    public VelocityTracker f30070a;
    public int f30071b;
    public int f30072c;
    public int d;
    public boolean f30073e;
    public boolean f30074f;
    public AnimatorSet h;
    public final e2.r0 f30075n;
    public final Rect f30076r;
    public final Paint f30077s;
    public boolean f30078w;
    public int f30079x;
    public float f30080y;

    public u2(x2 x2Var, Context context) {
        super(context);
        this.H = x2Var;
        this.f30070a = null;
        this.d = -1;
        this.f30073e = false;
        this.f30074f = false;
        this.h = null;
        this.f30076r = new Rect();
        this.f30077s = new Paint();
        this.f30080y = 0.0f;
        this.E = 0.0f;
        this.G = new Paint(1);
        this.f30075n = new Object();
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
        this.H.E(hashSet);
    }

    public final void b(float f10, float f11) {
        x2 x2Var = this.H;
        float translationY = x2Var.f30190b.getTranslationY();
        if ((translationY < org.telegram.messenger.g0.a1(false, 0.8f) && (f11 < 3500.0f || Math.abs(f11) < Math.abs(f10))) || (f11 < 0.0f && Math.abs(f11) >= 3500.0f)) {
            this.f30073e = false;
            this.h = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new s2(this, 1));
            this.h.playTogether(ObjectAnimator.ofFloat(x2Var.f30190b, "translationY", 0.0f), ofFloat);
            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.g0.a1(false, 0.8f)) * 250.0f));
            this.h.setInterpolator(lr.f37208f);
            this.h.addListener(new t2(this, 0));
            ks.e().k(ks.f25135j1, 512);
            this.h.start();
            return;
        }
        boolean z10 = x2Var.f30199e0;
        x2Var.f30199e0 = false;
        x2Var.dismiss();
        x2Var.f30199e0 = z10;
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        float max;
        int left;
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.f30077s;
        x2 x2Var = this.H;
        if (i10 >= 26) {
            int i11 = x2Var.G0;
            if (i11 >= 0) {
                paint.setColor(n6.w0(i11, x2Var.J0));
            } else {
                paint.setColor(x2Var.H0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!x2Var.W0 || x2Var.f30190b.getVisibility() == 0) {
            boolean z10 = x2Var.f30215n;
            float f11 = 0.0f;
            if ((z10 && x2Var.S != 0) || x2Var.F0 != 0.0f) {
                if (z10) {
                    i7 = x2Var.R();
                } else {
                    i7 = 0;
                }
                if (!x2Var.f30227w && (i10 < 29 || x2.B(x2Var) <= 0)) {
                    max = 0.0f;
                } else if (x2Var.f30222s) {
                    max = Math.max(0.0f, Math.min(i7 - x2Var.F0, x2Var.f30190b.getTranslationY()));
                } else {
                    max = Math.max(0.0f, x2Var.R() - (x2Var.f30190b.getMeasuredHeight() - x2Var.f30190b.getTranslationY()));
                }
                int alpha = paint.getAlpha();
                if (x2Var.W0) {
                    f10 *= x2Var.f30190b.getAlpha();
                }
                if (x2Var.W0) {
                    left = (int) x2Var.f30190b.getX();
                } else {
                    left = x2Var.f30190b.getLeft();
                }
                int i12 = left;
                int i13 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i13 < 0) {
                    paint.setAlpha((int) (alpha * f10));
                }
                canvas.drawRect(x2Var.f30225u0 + i12, ((getMeasuredHeight() - i7) + max) - x2Var.F0, x2Var.f30190b.getRight() - x2Var.f30225u0, getMeasuredHeight() + max, paint);
                paint.setAlpha(alpha);
                int i14 = x2Var.f30207h1;
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
                        canvas.drawRect(i12 + x2Var.f30225u0, ((getMeasuredHeight() - i7) + f11) - x2Var.F0, x2Var.f30190b.getRight() - x2Var.f30225u0, getMeasuredHeight() + f11, paint);
                    }
                    paint.setAlpha(alpha2);
                }
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        x2 x2Var = this.H;
        n2 n2Var = x2Var.f30193c;
        int i7 = x2Var.f30210j0;
        if (!x2Var.J) {
            if (!x2Var.f0(motionEvent)) {
                if (!x2Var.J(motionEvent) && !this.F) {
                    if (x2Var.I() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f30074f && !this.f30073e && motionEvent.getPointerCount() == 1)) {
                        this.f30071b = (int) motionEvent.getX();
                        int y10 = (int) motionEvent.getY();
                        this.f30072c = y10;
                        if (x2Var.Y(this.f30071b, y10)) {
                            x2Var.o0();
                            return true;
                        }
                        this.d = motionEvent.getPointerId(0);
                        this.f30073e = true;
                        a();
                        VelocityTracker velocityTracker = this.f30070a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (x2Var.G() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f30070a == null) {
                            this.f30070a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f30071b));
                        float y11 = ((int) motionEvent.getY()) - this.f30072c;
                        this.f30070a.addMovement(motionEvent);
                        if (!x2Var.E0 && this.f30073e && !this.f30074f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= i7) {
                            this.f30072c = (int) motionEvent.getY();
                            this.f30073e = false;
                            this.f30074f = true;
                            requestDisallowInterceptTouchEvent(true);
                        } else if (this.f30074f) {
                            float f10 = this.f30080y + y11;
                            this.f30080y = f10;
                            float max = Math.max(f10, 0.0f);
                            this.f30080y = max;
                            x2Var.f30190b.setTranslationY(Math.max(max, 0.0f));
                            x2Var.h0();
                            this.f30072c = (int) motionEvent.getY();
                            n2Var.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f30070a == null) {
                            this.f30070a = VelocityTracker.obtain();
                        }
                        this.f30070a.computeCurrentVelocity(1000);
                        if (!this.f30074f && this.f30080y <= 0.0f) {
                            this.f30073e = false;
                        } else {
                            b(this.f30070a.getXVelocity(), this.f30070a.getYVelocity());
                        }
                        this.f30074f = false;
                        VelocityTracker velocityTracker2 = this.f30070a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f30070a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f30074f && !this.f30073e && motionEvent.getPointerCount() == 1)) {
                    this.F = true;
                    this.f30071b = (int) motionEvent.getX();
                    this.f30072c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.f30073e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x10 = motionEvent.getX() - this.f30071b;
                    float y12 = motionEvent.getY() - this.f30072c;
                    if (this.f30070a == null) {
                        this.f30070a = VelocityTracker.obtain();
                    }
                    this.f30070a.addMovement(motionEvent);
                    if (!x2Var.E0 && this.f30073e && !this.f30074f && x10 > 0.0f && x10 / 3.0f > Math.abs(y12) && Math.abs(x10) >= i7) {
                        this.f30071b = (int) motionEvent.getX();
                        this.f30073e = false;
                        this.f30074f = true;
                    } else if (this.f30074f) {
                        float f11 = this.E + x10;
                        this.E = f11;
                        x2Var.f30190b.setTranslationX(Math.max(f11, 0.0f));
                        this.f30071b = (int) motionEvent.getX();
                        n2Var.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f30070a == null) {
                        this.f30070a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f30070a.getXVelocity();
                    float yVelocity = this.f30070a.getYVelocity();
                    if (this.E < x2Var.f30190b.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max2 = Math.max(this.E, 0.0f);
                        this.E = max2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 0.0f);
                        ofFloat.addUpdateListener(new s2(this, 2));
                        ofFloat.addListener(new t2(this, 1));
                        ofFloat.setInterpolator(lr.f37208f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new s2(this, 3));
                        ofFloat2.addListener(new t2(this, 2));
                        lr lrVar = lr.h;
                        ofFloat2.setInterpolator(lrVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new s2(this, 4));
                        ofFloat3.setInterpolator(lrVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.f30073e = false;
                    this.f30074f = false;
                    this.d = -1;
                    this.F = false;
                }
                if ((z10 || !this.f30073e) && !this.f30074f && (x2Var.G() || x2Var.J(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.u2.dispatchDraw(android.graphics.Canvas):void");
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
        return this.f30075n.b();
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
        Paint paint = this.f30077s;
        int alpha = paint.getAlpha();
        x2 x2Var = this.H;
        int i12 = 0;
        if (alpha < 255 && x2Var.f30215n) {
            float f10 = 0.0f;
            if (x2Var.f30227w || (Build.VERSION.SDK_INT >= 29 && x2.B(x2Var) > 0)) {
                f10 = Math.max(0.0f, x2Var.R() - (x2Var.f30190b.getMeasuredHeight() - x2Var.f30190b.getTranslationY()));
            }
            if (x2Var.f30215n) {
                i11 = x2Var.R();
            } else {
                i11 = 0;
            }
            canvas.save();
            canvas.clipRect(x2Var.f30190b.getLeft() + x2Var.f30225u0, ((getMeasuredHeight() - i11) + f10) - x2Var.F0, x2Var.f30190b.getRight() - x2Var.f30225u0, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        } else {
            canvas2 = canvas;
            z10 = false;
        }
        super.onDraw(canvas2);
        if (x2Var.f30215n && x2Var.h != null && x2Var.f30201f != 0) {
            int i13 = x2Var.f30191b0;
            if (i13 >= 0) {
                i7 = n6.w0(i13, x2Var.J0);
            } else {
                i7 = 0;
            }
            paint.setColor(i7);
            float left = x2Var.f30190b.getLeft() + x2Var.f30225u0;
            int measuredHeight = getMeasuredHeight() - x2Var.f30201f;
            if (x2Var.f30215n) {
                i10 = x2Var.R();
            } else {
                i10 = 0;
            }
            float f11 = measuredHeight - i10;
            float right = x2Var.f30190b.getRight() - x2Var.f30225u0;
            int measuredHeight2 = getMeasuredHeight();
            if (x2Var.f30215n) {
                i12 = x2Var.R();
            }
            canvas2.drawRect(left, f11, right, measuredHeight2 - i12, paint);
        }
        x2Var.d0();
        if (z10) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        x2 x2Var = this.H;
        if (!x2Var.G() && !x2Var.J(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.u2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.u2.onMeasure(int, int):void");
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
        x2 x2Var = this.H;
        if (!x2Var.J && x2Var.f30221r0) {
            a();
            float translationY = x2Var.f30190b.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i10 > 0) {
                float f11 = translationY - i10;
                iArr[1] = i10;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                x2Var.f30190b.setTranslationY(f10);
                x2Var.h0();
                x2Var.f30193c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        x2 x2Var = this.H;
        if (!x2Var.J && x2Var.f30221r0) {
            a();
            if (i12 != 0) {
                float translationY = x2Var.f30190b.getTranslationY() - i12;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                x2Var.f30190b.setTranslationY(translationY);
                x2Var.h0();
                x2Var.f30193c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f30075n.f10684a = i7;
        x2 x2Var = this.H;
        if (!x2Var.J && x2Var.f30221r0) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        x2 x2Var = this.H;
        if (!x2Var.J && x2Var.f30221r0 && i7 == 2 && !x2Var.G()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f30075n.f10684a = 0;
        x2 x2Var = this.H;
        if (!x2Var.J && x2Var.f30221r0) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f30073e && !this.f30074f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override
    public final void updateColors() {
        x2 x2Var = this.H;
        try {
            x2.A(x2Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        x2Var.s0();
    }
}
