package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import fi.d4;
import hi.j3;
import org.telegram.ui.Components.nr;
import org.telegram.ui.sb1;
public final class q1 extends FrameLayout {
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public float W;
    public float f41237a;
    public float f41238a0;
    public float f41239b;
    public float f41240b0;
    public float f41241c;
    public boolean f41242c0;
    public float d;
    public boolean f41243d0;
    public boolean f41244e;
    public ValueAnimator f41245e0;
    public int f41246f;
    public final d4 f41247f0;
    public ValueAnimator f41248g0;
    public int h;
    public final j3 f41249h0;
    public View.OnClickListener f41250i0;
    public p1 f41251j0;
    public long f41252k0;
    public WindowInsets f41253n;
    public final float f41254r;
    public final Path f41255s;
    public final RectF f41256w;
    public final Paint f41257x;
    public final Drawable f41258y;

    public q1(Activity activity) {
        super(activity);
        this.f41255s = new Path();
        this.f41256w = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.f41257x = paint;
        this.E = -1.0f;
        this.F = -1.0f;
        this.K = 0.0f;
        this.L = 0.0f;
        this.R = -1.0f;
        this.S = true;
        this.f41247f0 = new d4(this, 11);
        this.f41249h0 = new j3(this, 20);
        this.f41254r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new fh.a(this, 7));
        setClipToOutline(true);
        paint.setColor(i0.a.o(-16777216, 102));
        this.f41258y = activity.getDrawable(2131230922);
    }

    public final void a() {
        f();
        float f10 = this.V;
        if (f10 >= 0.0f && !this.P) {
            e(f10, this.W, getMeasuredWidth(), getMeasuredHeight(), true);
            this.V = -1.0f;
            this.W = -1.0f;
        }
    }

    public final void b() {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        float systemWindowInsetBottom;
        if (getMeasuredWidth() > 0 && this.E < 0.0f) {
            ViewParent parent = getParent();
            if (parent == null) {
                return;
            }
            if (this.f41253n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.I;
            }
            if (this.f41253n == null) {
                systemWindowInsetBottom = 0.0f;
            } else {
                systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.J;
            }
            View view = (View) parent;
            this.V = (getTranslationX() - this.G) / (((view.getMeasuredWidth() - this.G) - this.H) - getMeasuredWidth());
            this.W = (getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - getMeasuredHeight());
            this.V = Math.max(0.0f, Math.min(1.0f, this.V));
            this.W = Math.max(0.0f, Math.min(1.0f, this.W));
            return;
        }
        this.V = -1.0f;
        this.W = -1.0f;
    }

    public final void c(boolean z10, boolean z11) {
        q1 q1Var;
        if (getMeasuredWidth() <= 0 || getVisibility() != 0) {
            z11 = false;
        }
        float f10 = 1.0f;
        if (!z11) {
            if (this.N != z10) {
                this.N = z10;
                this.O = z10;
                if (!z10) {
                    f10 = 0.0f;
                }
                this.K = f10;
                requestLayout();
                invalidateOutline();
            }
        } else if (this.P) {
            this.O = z10;
        } else if (z10 && !this.N) {
            this.N = true;
            this.O = z10;
            f();
            float f11 = this.E;
            if (f11 >= 0.0f) {
                q1Var = this;
                q1Var.e(f11, this.F, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
            } else {
                q1Var = this;
            }
            q1Var.N = false;
            q1Var.P = true;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            setTranslationX(0.0f);
            setTranslationY(0.0f);
            invalidate();
            ValueAnimator valueAnimator = q1Var.f41245e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(q1Var.K, 1.0f);
            q1Var.f41245e0 = ofFloat;
            ofFloat.addUpdateListener(q1Var.f41247f0);
            q1Var.f41245e0.setDuration(300L);
            q1Var.f41245e0.start();
            animate().setListener(null).cancel();
            ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
            nr nrVar = nr.f37917f;
            duration.setInterpolator(nrVar).setListener(new n1(this, translationX, translationY, 0)).setInterpolator(nrVar).start();
        } else if (!z10 && this.N) {
            this.O = z10;
            float translationX2 = getTranslationX();
            float translationY2 = getTranslationY();
            f();
            this.N = false;
            this.P = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new o1(this, translationX2, translationY2));
        } else {
            if (!this.N) {
                f10 = 0.0f;
            }
            this.K = f10;
            this.N = z10;
            this.O = z10;
            requestLayout();
        }
    }

    public final void d(float f10, float f11) {
        ViewParent parent = getParent();
        if (this.N && parent != null && ((View) parent).getMeasuredWidth() <= 0 && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            e(f10, f11, getMeasuredWidth(), getMeasuredHeight(), true);
            return;
        }
        this.E = f10;
        this.F = f11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q1 q1Var;
        if (this.f41238a0 >= 0.0f) {
            if (!this.f41243d0) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.f41238a0);
            setTranslationY(this.f41240b0);
            if (!this.f41243d0) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.f41238a0 = -1.0f;
            this.f41240b0 = -1.0f;
        }
        if (this.E >= 0.0f && this.N && getMeasuredWidth() > 0) {
            q1Var = this;
            q1Var.e(this.E, this.F, getMeasuredWidth(), getMeasuredHeight(), false);
            q1Var.E = -1.0f;
            q1Var.F = -1.0f;
        } else {
            q1Var = this;
        }
        super.dispatchDraw(canvas);
        if (!q1Var.P) {
            boolean z10 = q1Var.N;
            boolean z11 = q1Var.O;
            if (z10 != z11) {
                c(z11, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((org.telegram.messenger.g0.L(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * q1Var.K * q1Var.L, (1.0f / getScaleY()) * q1Var.K * q1Var.L, f10, f11);
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(14.0f), q1Var.f41257x);
        Drawable drawable = q1Var.f41258y;
        drawable.setBounds(org.telegram.ui.Cells.c0.C(2, measuredWidth, drawable), org.telegram.ui.Cells.c0.A(2, measuredHeight, drawable), org.telegram.ui.Cells.c0.y(2, measuredWidth, drawable), org.telegram.ui.Cells.c0.j(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (q1Var.P) {
            invalidate();
        }
    }

    public final void e(float f10, float f11, int i7, int i10, boolean z10) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        long j3;
        ViewParent parent = getParent();
        if (parent != null && this.N && !this.P && this.S) {
            float f12 = 0.0f;
            if (this.f41253n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.I;
            }
            if (this.f41253n != null) {
                f12 = windowInsets2.getSystemWindowInsetBottom() + this.J;
            }
            View view = (View) parent;
            float z11 = com.google.android.gms.internal.vision.e2.z((view.getMeasuredWidth() - this.G) - this.H, i7, f10, this.G);
            float z12 = com.google.android.gms.internal.vision.e2.z((view.getMeasuredHeight() - f12) - systemWindowInsetTop, i10, f11, systemWindowInsetTop);
            if (z10) {
                animate().setListener(null).cancel();
                ViewPropertyAnimator alpha = animate().scaleX(1.0f).scaleY(1.0f).translationX(z11).translationY(z12).alpha(1.0f);
                if (this.M) {
                    j3 = 0;
                } else {
                    j3 = 150;
                }
                alpha.setStartDelay(j3).setDuration(150L).setInterpolator(nr.f37917f).start();
                return;
            }
            if (!this.T) {
                animate().setListener(null).cancel();
                setScaleX(1.0f);
                setScaleY(1.0f);
                animate().alpha(1.0f).setDuration(150L).start();
            }
            setTranslationX(z11);
            setTranslationY(z12);
        }
    }

    public final void f() {
        int L;
        float f10 = 16.0f;
        this.G = org.telegram.messenger.g0.L(16.0f);
        this.H = org.telegram.messenger.g0.L(16.0f);
        if (this.M) {
            L = org.telegram.messenger.g0.L(60.0f);
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        this.I = L;
        if (this.M) {
            f10 = 100.0f;
        }
        this.J = org.telegram.messenger.g0.L(f10) + this.U;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        this.Q = false;
        if (this.N) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.Q = true;
        } else if (!this.f41242c0) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        p1 p1Var = this.f41251j0;
        if (p1Var != null) {
            float f10 = this.K;
            ((sb1) p1Var).f51975b.f48307e0.d(this.Q, f10);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (getMeasuredHeight() != this.f41246f && getMeasuredWidth() != this.h) {
            Path path = this.f41255s;
            path.reset();
            RectF rectF = this.f41256w;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.f41246f = getMeasuredHeight();
        this.h = getMeasuredWidth();
        f();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.q1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCornerRadius(float f10) {
        this.R = f10;
        invalidateOutline();
    }

    public void setDelegate(p1 p1Var) {
        this.f41251j0 = p1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.f41253n = windowInsets;
    }

    public void setIsActive(boolean z10) {
        this.S = z10;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.f41250i0 = onClickListener;
    }

    public void setRelativePosition(q1 q1Var) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        float systemWindowInsetBottom;
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        if (this.f41253n == null) {
            systemWindowInsetTop = 0.0f;
        } else {
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.I;
        }
        if (this.f41253n == null) {
            systemWindowInsetBottom = 0.0f;
        } else {
            systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.J;
        }
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (q1Var.getTranslationX() - this.G) / (((view.getMeasuredWidth() - this.G) - this.H) - q1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (q1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - q1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z10) {
        if (getParent() == null) {
            this.M = z10;
        } else {
            this.M = z10;
        }
    }
}
