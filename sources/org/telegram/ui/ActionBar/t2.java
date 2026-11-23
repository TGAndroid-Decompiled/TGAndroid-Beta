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
import org.telegram.messenger.ls;
import org.telegram.ui.Components.nr;
public abstract class t2 extends FrameLayout implements b6 {
    public float E;
    public boolean F;
    public final Paint G;
    public final w2 H;
    public VelocityTracker f30022a;
    public int f30023b;
    public int f30024c;
    public int d;
    public boolean f30025e;
    public boolean f30026f;
    public AnimatorSet h;
    public final e2.r0 f30027n;
    public final Rect f30028r;
    public final Paint f30029s;
    public boolean f30030w;
    public int f30031x;
    public float f30032y;

    public t2(w2 w2Var, Context context) {
        super(context);
        this.H = w2Var;
        this.f30022a = null;
        this.d = -1;
        this.f30025e = false;
        this.f30026f = false;
        this.h = null;
        this.f30028r = new Rect();
        this.f30029s = new Paint();
        this.f30032y = 0.0f;
        this.E = 0.0f;
        this.G = new Paint(1);
        this.f30027n = new Object();
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
        w2 w2Var = this.H;
        float translationY = w2Var.f30142b.getTranslationY();
        if ((translationY < org.telegram.messenger.g0.a1(false, 0.8f) && (f11 < 3500.0f || Math.abs(f11) < Math.abs(f10))) || (f11 < 0.0f && Math.abs(f11) >= 3500.0f)) {
            this.f30025e = false;
            this.h = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new r2(this, 1));
            this.h.playTogether(ObjectAnimator.ofFloat(w2Var.f30142b, "translationY", 0.0f), ofFloat);
            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.g0.a1(false, 0.8f)) * 250.0f));
            this.h.setInterpolator(nr.f37917f);
            this.h.addListener(new s2(this, 0));
            ls.e().k(ls.f25293j1, 512);
            this.h.start();
            return;
        }
        boolean z10 = w2Var.f30151e0;
        w2Var.f30151e0 = false;
        w2Var.dismiss();
        w2Var.f30151e0 = z10;
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        float max;
        int left;
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.f30029s;
        w2 w2Var = this.H;
        if (i10 >= 26) {
            int i11 = w2Var.G0;
            if (i11 >= 0) {
                paint.setColor(m6.w0(i11, w2Var.J0));
            } else {
                paint.setColor(w2Var.H0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!w2Var.W0 || w2Var.f30142b.getVisibility() == 0) {
            boolean z10 = w2Var.f30167n;
            float f11 = 0.0f;
            if ((z10 && w2Var.S != 0) || w2Var.F0 != 0.0f) {
                if (z10) {
                    i7 = w2Var.R();
                } else {
                    i7 = 0;
                }
                if (!w2Var.f30179w && (i10 < 29 || w2.B(w2Var) <= 0)) {
                    max = 0.0f;
                } else if (w2Var.f30174s) {
                    max = Math.max(0.0f, Math.min(i7 - w2Var.F0, w2Var.f30142b.getTranslationY()));
                } else {
                    max = Math.max(0.0f, w2Var.R() - (w2Var.f30142b.getMeasuredHeight() - w2Var.f30142b.getTranslationY()));
                }
                int alpha = paint.getAlpha();
                if (w2Var.W0) {
                    f10 *= w2Var.f30142b.getAlpha();
                }
                if (w2Var.W0) {
                    left = (int) w2Var.f30142b.getX();
                } else {
                    left = w2Var.f30142b.getLeft();
                }
                int i12 = left;
                int i13 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i13 < 0) {
                    paint.setAlpha((int) (alpha * f10));
                }
                canvas.drawRect(w2Var.f30177u0 + i12, ((getMeasuredHeight() - i7) + max) - w2Var.F0, w2Var.f30142b.getRight() - w2Var.f30177u0, getMeasuredHeight() + max, paint);
                paint.setAlpha(alpha);
                int i14 = w2Var.f30159h1;
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
                        canvas.drawRect(i12 + w2Var.f30177u0, ((getMeasuredHeight() - i7) + f11) - w2Var.F0, w2Var.f30142b.getRight() - w2Var.f30177u0, getMeasuredHeight() + f11, paint);
                    }
                    paint.setAlpha(alpha2);
                }
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        w2 w2Var = this.H;
        m2 m2Var = w2Var.f30145c;
        int i7 = w2Var.f30162j0;
        if (!w2Var.J) {
            if (!w2Var.f0(motionEvent)) {
                if (!w2Var.J(motionEvent) && !this.F) {
                    if (w2Var.I() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f30026f && !this.f30025e && motionEvent.getPointerCount() == 1)) {
                        this.f30023b = (int) motionEvent.getX();
                        int y10 = (int) motionEvent.getY();
                        this.f30024c = y10;
                        if (w2Var.Y(this.f30023b, y10)) {
                            w2Var.o0();
                            return true;
                        }
                        this.d = motionEvent.getPointerId(0);
                        this.f30025e = true;
                        a();
                        VelocityTracker velocityTracker = this.f30022a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (w2Var.G() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f30022a == null) {
                            this.f30022a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f30023b));
                        float y11 = ((int) motionEvent.getY()) - this.f30024c;
                        this.f30022a.addMovement(motionEvent);
                        if (!w2Var.E0 && this.f30025e && !this.f30026f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= i7) {
                            this.f30024c = (int) motionEvent.getY();
                            this.f30025e = false;
                            this.f30026f = true;
                            requestDisallowInterceptTouchEvent(true);
                        } else if (this.f30026f) {
                            float f10 = this.f30032y + y11;
                            this.f30032y = f10;
                            float max = Math.max(f10, 0.0f);
                            this.f30032y = max;
                            w2Var.f30142b.setTranslationY(Math.max(max, 0.0f));
                            w2Var.h0();
                            this.f30024c = (int) motionEvent.getY();
                            m2Var.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f30022a == null) {
                            this.f30022a = VelocityTracker.obtain();
                        }
                        this.f30022a.computeCurrentVelocity(1000);
                        if (!this.f30026f && this.f30032y <= 0.0f) {
                            this.f30025e = false;
                        } else {
                            b(this.f30022a.getXVelocity(), this.f30022a.getYVelocity());
                        }
                        this.f30026f = false;
                        VelocityTracker velocityTracker2 = this.f30022a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f30022a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f30026f && !this.f30025e && motionEvent.getPointerCount() == 1)) {
                    this.F = true;
                    this.f30023b = (int) motionEvent.getX();
                    this.f30024c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.f30025e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x10 = motionEvent.getX() - this.f30023b;
                    float y12 = motionEvent.getY() - this.f30024c;
                    if (this.f30022a == null) {
                        this.f30022a = VelocityTracker.obtain();
                    }
                    this.f30022a.addMovement(motionEvent);
                    if (!w2Var.E0 && this.f30025e && !this.f30026f && x10 > 0.0f && x10 / 3.0f > Math.abs(y12) && Math.abs(x10) >= i7) {
                        this.f30023b = (int) motionEvent.getX();
                        this.f30025e = false;
                        this.f30026f = true;
                    } else if (this.f30026f) {
                        float f11 = this.E + x10;
                        this.E = f11;
                        w2Var.f30142b.setTranslationX(Math.max(f11, 0.0f));
                        this.f30023b = (int) motionEvent.getX();
                        m2Var.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f30022a == null) {
                        this.f30022a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f30022a.getXVelocity();
                    float yVelocity = this.f30022a.getYVelocity();
                    if (this.E < w2Var.f30142b.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max2 = Math.max(this.E, 0.0f);
                        this.E = max2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 0.0f);
                        ofFloat.addUpdateListener(new r2(this, 2));
                        ofFloat.addListener(new s2(this, 1));
                        ofFloat.setInterpolator(nr.f37917f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new r2(this, 3));
                        ofFloat2.addListener(new s2(this, 2));
                        nr nrVar = nr.h;
                        ofFloat2.setInterpolator(nrVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new r2(this, 4));
                        ofFloat3.setInterpolator(nrVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.f30025e = false;
                    this.f30026f = false;
                    this.d = -1;
                    this.F = false;
                }
                if ((z10 || !this.f30025e) && !this.f30026f && (w2Var.G() || w2Var.J(motionEvent))) {
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
            if (this.H.H0()) {
                c(canvas, 1.0f);
            }
            return super.drawChild(canvas, view, j3);
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f30027n.b();
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
        Paint paint = this.f30029s;
        int alpha = paint.getAlpha();
        w2 w2Var = this.H;
        int i12 = 0;
        if (alpha < 255 && w2Var.f30167n) {
            float f10 = 0.0f;
            if (w2Var.f30179w || (Build.VERSION.SDK_INT >= 29 && w2.B(w2Var) > 0)) {
                f10 = Math.max(0.0f, w2Var.R() - (w2Var.f30142b.getMeasuredHeight() - w2Var.f30142b.getTranslationY()));
            }
            if (w2Var.f30167n) {
                i11 = w2Var.R();
            } else {
                i11 = 0;
            }
            canvas.save();
            canvas.clipRect(w2Var.f30142b.getLeft() + w2Var.f30177u0, ((getMeasuredHeight() - i11) + f10) - w2Var.F0, w2Var.f30142b.getRight() - w2Var.f30177u0, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        } else {
            canvas2 = canvas;
            z10 = false;
        }
        super.onDraw(canvas2);
        if (w2Var.f30167n && w2Var.h != null && w2Var.f30153f != 0) {
            int i13 = w2Var.f30143b0;
            if (i13 >= 0) {
                i7 = m6.w0(i13, w2Var.J0);
            } else {
                i7 = 0;
            }
            paint.setColor(i7);
            float left = w2Var.f30142b.getLeft() + w2Var.f30177u0;
            int measuredHeight = getMeasuredHeight() - w2Var.f30153f;
            if (w2Var.f30167n) {
                i10 = w2Var.R();
            } else {
                i10 = 0;
            }
            float f11 = measuredHeight - i10;
            float right = w2Var.f30142b.getRight() - w2Var.f30177u0;
            int measuredHeight2 = getMeasuredHeight();
            if (w2Var.f30167n) {
                i12 = w2Var.R();
            }
            canvas2.drawRect(left, f11, right, measuredHeight2 - i12, paint);
        }
        w2Var.d0();
        if (z10) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        w2 w2Var = this.H;
        if (!w2Var.G() && !w2Var.J(motionEvent)) {
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
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        w2 w2Var = this.H;
        if (!w2Var.J && w2Var.f30173r0) {
            a();
            float translationY = w2Var.f30142b.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i10 > 0) {
                float f11 = translationY - i10;
                iArr[1] = i10;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                w2Var.f30142b.setTranslationY(f10);
                w2Var.h0();
                w2Var.f30145c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        w2 w2Var = this.H;
        if (!w2Var.J && w2Var.f30173r0) {
            a();
            if (i12 != 0) {
                float translationY = w2Var.f30142b.getTranslationY() - i12;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                w2Var.f30142b.setTranslationY(translationY);
                w2Var.h0();
                w2Var.f30145c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f30027n.f10679a = i7;
        w2 w2Var = this.H;
        if (!w2Var.J && w2Var.f30173r0) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        w2 w2Var = this.H;
        if (!w2Var.J && w2Var.f30173r0 && i7 == 2 && !w2Var.G()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f30027n.f10679a = 0;
        w2 w2Var = this.H;
        if (!w2Var.J && w2Var.f30173r0) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f30025e && !this.f30026f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override
    public final void updateColors() {
        w2 w2Var = this.H;
        try {
            w2.A(w2Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        w2Var.s0();
    }
}
