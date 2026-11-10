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
import org.telegram.messenger.qs;
import org.telegram.ui.Components.wq;
public abstract class t2 extends FrameLayout implements c6 {
    public float D;
    public boolean E;
    public final Paint F;
    public final w2 G;
    public VelocityTracker f28518a;
    public int f28519b;
    public int f28520c;
    public int d;
    public boolean f28521e;
    public boolean f28522f;
    public AnimatorSet h;
    public final e2.r0 f28523n;
    public final Rect f28524r;
    public final Paint f28525s;
    public boolean f28526w;
    public int f28527x;
    public float f28528y;

    public t2(w2 w2Var, Context context) {
        super(context);
        this.G = w2Var;
        this.f28518a = null;
        this.d = -1;
        this.f28521e = false;
        this.f28522f = false;
        this.h = null;
        this.f28524r = new Rect();
        this.f28525s = new Paint();
        this.f28528y = 0.0f;
        this.D = 0.0f;
        this.F = new Paint(1);
        this.f28523n = new Object();
        setWillNotDraw(false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        this.G.r0();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        this.G.D(hashSet);
    }

    public final void b(float f10, float f11) {
        w2 w2Var = this.G;
        float translationY = w2Var.f28672b.getTranslationY();
        if ((translationY < org.telegram.messenger.g0.a1(false, 0.8f) && (f11 < 3500.0f || Math.abs(f11) < Math.abs(f10))) || (f11 < 0.0f && Math.abs(f11) >= 3500.0f)) {
            this.f28521e = false;
            this.h = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new r2(this, 1));
            this.h.playTogether(ObjectAnimator.ofFloat(w2Var.f28672b, "translationY", 0.0f), ofFloat);
            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.g0.a1(false, 0.8f)) * 250.0f));
            this.h.setInterpolator(wq.f40046f);
            this.h.addListener(new s2(this, 0));
            qs.e().k(qs.f25025j1, 512);
            this.h.start();
            return;
        }
        boolean z9 = w2Var.f28678d0;
        w2Var.f28678d0 = false;
        w2Var.dismiss();
        w2Var.f28678d0 = z9;
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        float max;
        int left;
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.f28525s;
        w2 w2Var = this.G;
        if (i10 >= 26) {
            int i11 = w2Var.F0;
            if (i11 >= 0) {
                paint.setColor(m6.w0(i11, w2Var.I0));
            } else {
                paint.setColor(w2Var.G0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!w2Var.V0 || w2Var.f28672b.getVisibility() == 0) {
            boolean z9 = w2Var.f28696n;
            float f11 = 0.0f;
            if ((z9 && w2Var.R != 0) || w2Var.E0 != 0.0f) {
                if (z9) {
                    i7 = w2Var.Q();
                } else {
                    i7 = 0;
                }
                if (!w2Var.f28708w && (i10 < 29 || w2.B(w2Var) <= 0)) {
                    max = 0.0f;
                } else if (w2Var.f28703s) {
                    max = Math.max(0.0f, Math.min(i7 - w2Var.E0, w2Var.f28672b.getTranslationY()));
                } else {
                    max = Math.max(0.0f, w2Var.Q() - (w2Var.f28672b.getMeasuredHeight() - w2Var.f28672b.getTranslationY()));
                }
                int alpha = paint.getAlpha();
                if (w2Var.V0) {
                    f10 *= w2Var.f28672b.getAlpha();
                }
                if (w2Var.V0) {
                    left = (int) w2Var.f28672b.getX();
                } else {
                    left = w2Var.f28672b.getLeft();
                }
                int i12 = left;
                int i13 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i13 < 0) {
                    paint.setAlpha((int) (alpha * f10));
                }
                canvas.drawRect(w2Var.f28705t0 + i12, ((getMeasuredHeight() - i7) + max) - w2Var.E0, w2Var.f28672b.getRight() - w2Var.f28705t0, getMeasuredHeight() + max, paint);
                paint.setAlpha(alpha);
                int i14 = w2Var.f28687g1;
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
                        canvas.drawRect(i12 + w2Var.f28705t0, ((getMeasuredHeight() - i7) + f11) - w2Var.E0, w2Var.f28672b.getRight() - w2Var.f28705t0, getMeasuredHeight() + f11, paint);
                    }
                    paint.setAlpha(alpha2);
                }
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z9) {
        w2 w2Var = this.G;
        m2 m2Var = w2Var.f28675c;
        int i7 = w2Var.f28690i0;
        if (!w2Var.I) {
            if (!w2Var.f0(motionEvent)) {
                if (!w2Var.I(motionEvent) && !this.E) {
                    if (w2Var.H() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f28522f && !this.f28521e && motionEvent.getPointerCount() == 1)) {
                        this.f28519b = (int) motionEvent.getX();
                        int y10 = (int) motionEvent.getY();
                        this.f28520c = y10;
                        if (w2Var.X(this.f28519b, y10)) {
                            w2Var.o0();
                            return true;
                        }
                        this.d = motionEvent.getPointerId(0);
                        this.f28521e = true;
                        a();
                        VelocityTracker velocityTracker = this.f28518a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (w2Var.G() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f28518a == null) {
                            this.f28518a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f28519b));
                        float y11 = ((int) motionEvent.getY()) - this.f28520c;
                        this.f28518a.addMovement(motionEvent);
                        if (!w2Var.D0 && this.f28521e && !this.f28522f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= i7) {
                            this.f28520c = (int) motionEvent.getY();
                            this.f28521e = false;
                            this.f28522f = true;
                            requestDisallowInterceptTouchEvent(true);
                        } else if (this.f28522f) {
                            float f10 = this.f28528y + y11;
                            this.f28528y = f10;
                            float max = Math.max(f10, 0.0f);
                            this.f28528y = max;
                            w2Var.f28672b.setTranslationY(Math.max(max, 0.0f));
                            w2Var.h0();
                            this.f28520c = (int) motionEvent.getY();
                            m2Var.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f28518a == null) {
                            this.f28518a = VelocityTracker.obtain();
                        }
                        this.f28518a.computeCurrentVelocity(1000);
                        if (!this.f28522f && this.f28528y <= 0.0f) {
                            this.f28521e = false;
                        } else {
                            b(this.f28518a.getXVelocity(), this.f28518a.getYVelocity());
                        }
                        this.f28522f = false;
                        VelocityTracker velocityTracker2 = this.f28518a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f28518a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f28522f && !this.f28521e && motionEvent.getPointerCount() == 1)) {
                    this.E = true;
                    this.f28519b = (int) motionEvent.getX();
                    this.f28520c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.f28521e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x10 = motionEvent.getX() - this.f28519b;
                    float y12 = motionEvent.getY() - this.f28520c;
                    if (this.f28518a == null) {
                        this.f28518a = VelocityTracker.obtain();
                    }
                    this.f28518a.addMovement(motionEvent);
                    if (!w2Var.D0 && this.f28521e && !this.f28522f && x10 > 0.0f && x10 / 3.0f > Math.abs(y12) && Math.abs(x10) >= i7) {
                        this.f28519b = (int) motionEvent.getX();
                        this.f28521e = false;
                        this.f28522f = true;
                    } else if (this.f28522f) {
                        float f11 = this.D + x10;
                        this.D = f11;
                        w2Var.f28672b.setTranslationX(Math.max(f11, 0.0f));
                        this.f28519b = (int) motionEvent.getX();
                        m2Var.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f28518a == null) {
                        this.f28518a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f28518a.getXVelocity();
                    float yVelocity = this.f28518a.getYVelocity();
                    if (this.D < w2Var.f28672b.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max2 = Math.max(this.D, 0.0f);
                        this.D = max2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 0.0f);
                        ofFloat.addUpdateListener(new r2(this, 2));
                        ofFloat.addListener(new s2(this, 1));
                        ofFloat.setInterpolator(wq.f40046f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.D, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new r2(this, 3));
                        ofFloat2.addListener(new s2(this, 2));
                        wq wqVar = wq.h;
                        ofFloat2.setInterpolator(wqVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new r2(this, 4));
                        ofFloat3.setInterpolator(wqVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.f28521e = false;
                    this.f28522f = false;
                    this.d = -1;
                    this.E = false;
                }
                if ((z9 || !this.f28521e) && !this.f28522f && (w2Var.G() || w2Var.I(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t2.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof CameraView) {
            if (this.G.H0()) {
                c(canvas, 1.0f);
            }
            return super.drawChild(canvas, view, j3);
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f28523n.b();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z9;
        int i7;
        int i10;
        int i11;
        Paint paint = this.f28525s;
        int alpha = paint.getAlpha();
        w2 w2Var = this.G;
        int i12 = 0;
        if (alpha < 255 && w2Var.f28696n) {
            float f10 = 0.0f;
            if (w2Var.f28708w || (Build.VERSION.SDK_INT >= 29 && w2.B(w2Var) > 0)) {
                f10 = Math.max(0.0f, w2Var.Q() - (w2Var.f28672b.getMeasuredHeight() - w2Var.f28672b.getTranslationY()));
            }
            if (w2Var.f28696n) {
                i11 = w2Var.Q();
            } else {
                i11 = 0;
            }
            canvas.save();
            canvas.clipRect(w2Var.f28672b.getLeft() + w2Var.f28705t0, ((getMeasuredHeight() - i11) + f10) - w2Var.E0, w2Var.f28672b.getRight() - w2Var.f28705t0, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z9 = true;
        } else {
            canvas2 = canvas;
            z9 = false;
        }
        super.onDraw(canvas2);
        if (w2Var.f28696n && w2Var.h != null && w2Var.f28683f != 0) {
            int i13 = w2Var.f28670a0;
            if (i13 >= 0) {
                i7 = m6.w0(i13, w2Var.I0);
            } else {
                i7 = 0;
            }
            paint.setColor(i7);
            float left = w2Var.f28672b.getLeft() + w2Var.f28705t0;
            int measuredHeight = getMeasuredHeight() - w2Var.f28683f;
            if (w2Var.f28696n) {
                i10 = w2Var.Q();
            } else {
                i10 = 0;
            }
            float f11 = measuredHeight - i10;
            float right = w2Var.f28672b.getRight() - w2Var.f28705t0;
            int measuredHeight2 = getMeasuredHeight();
            if (w2Var.f28696n) {
                i12 = w2Var.Q();
            }
            canvas2.drawRect(left, f11, right, measuredHeight2 - i12, paint);
        }
        w2Var.d0();
        if (z9) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        w2 w2Var = this.G;
        if (!w2Var.G() && !w2Var.I(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        w2 w2Var = this.G;
        if (!w2Var.I && w2Var.f28700q0) {
            a();
            float translationY = w2Var.f28672b.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i10 > 0) {
                float f11 = translationY - i10;
                iArr[1] = i10;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                w2Var.f28672b.setTranslationY(f10);
                w2Var.h0();
                w2Var.f28675c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        w2 w2Var = this.G;
        if (!w2Var.I && w2Var.f28700q0) {
            a();
            if (i12 != 0) {
                float translationY = w2Var.f28672b.getTranslationY() - i12;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                w2Var.f28672b.setTranslationY(translationY);
                w2Var.h0();
                w2Var.f28675c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f28523n.f10538a = i7;
        w2 w2Var = this.G;
        if (!w2Var.I && w2Var.f28700q0) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        w2 w2Var = this.G;
        if (!w2Var.I && w2Var.f28700q0 && i7 == 2 && !w2Var.G()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f28523n.f10538a = 0;
        w2 w2Var = this.G;
        if (!w2Var.I && w2Var.f28700q0) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        if (this.f28521e && !this.f28522f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override
    public final void updateColors() {
        w2 w2Var = this.G;
        try {
            w2.A(w2Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        w2Var.s0();
    }
}
