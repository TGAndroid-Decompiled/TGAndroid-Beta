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
import ei.n4;
import gi.j3;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ib1;
public final class c1 extends FrameLayout {
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
    public float f39250a;
    public float f39251a0;
    public float f39252b;
    public float f39253b0;
    public float f39254c;
    public boolean f39255c0;
    public float d;
    public boolean f39256d0;
    public boolean f39257e;
    public ValueAnimator f39258e0;
    public int f39259f;
    public final n4 f39260f0;
    public ValueAnimator f39261g0;
    public int h;
    public final j3 f39262h0;
    public View.OnClickListener f39263i0;
    public b1 f39264j0;
    public long f39265k0;
    public WindowInsets f39266n;
    public final float f39267r;
    public final Path f39268s;
    public final RectF f39269w;
    public final Paint f39270x;
    public final Drawable f39271y;

    public c1(Activity activity) {
        super(activity);
        this.f39268s = new Path();
        this.f39269w = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.f39270x = paint;
        this.E = -1.0f;
        this.F = -1.0f;
        this.K = 0.0f;
        this.L = 0.0f;
        this.R = -1.0f;
        this.S = true;
        this.f39260f0 = new n4(this, 11);
        this.f39262h0 = new j3(this, 20);
        this.f39267r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new gh.a(this, 6));
        setClipToOutline(true);
        paint.setColor(i0.a.o(-16777216, 102));
        this.f39271y = activity.getDrawable(2131230922);
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
            if (this.f39266n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.I;
            }
            if (this.f39266n == null) {
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
        c1 c1Var;
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
                c1Var = this;
                c1Var.e(f11, this.F, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
            } else {
                c1Var = this;
            }
            c1Var.N = false;
            c1Var.P = true;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            setTranslationX(0.0f);
            setTranslationY(0.0f);
            invalidate();
            ValueAnimator valueAnimator = c1Var.f39258e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(c1Var.K, 1.0f);
            c1Var.f39258e0 = ofFloat;
            ofFloat.addUpdateListener(c1Var.f39260f0);
            c1Var.f39258e0.setDuration(300L);
            c1Var.f39258e0.start();
            animate().setListener(null).cancel();
            ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
            xq xqVar = xq.f40452f;
            duration.setInterpolator(xqVar).setListener(new z0(this, translationX, translationY, 0)).setInterpolator(xqVar).start();
        } else if (!z10 && this.N) {
            this.O = z10;
            float translationX2 = getTranslationX();
            float translationY2 = getTranslationY();
            f();
            this.N = false;
            this.P = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new a1(this, translationX2, translationY2));
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
        c1 c1Var;
        if (this.f39251a0 >= 0.0f) {
            if (!this.f39256d0) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.f39251a0);
            setTranslationY(this.f39253b0);
            if (!this.f39256d0) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.f39251a0 = -1.0f;
            this.f39253b0 = -1.0f;
        }
        if (this.E >= 0.0f && this.N && getMeasuredWidth() > 0) {
            c1Var = this;
            c1Var.e(this.E, this.F, getMeasuredWidth(), getMeasuredHeight(), false);
            c1Var.E = -1.0f;
            c1Var.F = -1.0f;
        } else {
            c1Var = this;
        }
        super.dispatchDraw(canvas);
        if (!c1Var.P) {
            boolean z10 = c1Var.N;
            boolean z11 = c1Var.O;
            if (z10 != z11) {
                c(z11, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((org.telegram.messenger.g0.L(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * c1Var.K * c1Var.L, (1.0f / getScaleY()) * c1Var.K * c1Var.L, f10, f11);
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(14.0f), c1Var.f39270x);
        Drawable drawable = c1Var.f39271y;
        drawable.setBounds(org.telegram.ui.Cells.f1.C(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.B(2, measuredHeight, drawable), org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.i(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (c1Var.P) {
            invalidate();
        }
    }

    public final void e(float f10, float f11, int i3, int i10, boolean z10) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        long j10;
        ViewParent parent = getParent();
        if (parent != null && this.N && !this.P && this.S) {
            float f12 = 0.0f;
            if (this.f39266n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.I;
            }
            if (this.f39266n != null) {
                f12 = windowInsets2.getSystemWindowInsetBottom() + this.J;
            }
            View view = (View) parent;
            float y9 = com.google.android.recaptcha.internal.a.y((view.getMeasuredWidth() - this.G) - this.H, i3, f10, this.G);
            float y10 = com.google.android.recaptcha.internal.a.y((view.getMeasuredHeight() - f12) - systemWindowInsetTop, i10, f11, systemWindowInsetTop);
            if (z10) {
                animate().setListener(null).cancel();
                ViewPropertyAnimator alpha = animate().scaleX(1.0f).scaleY(1.0f).translationX(y9).translationY(y10).alpha(1.0f);
                if (this.M) {
                    j10 = 0;
                } else {
                    j10 = 150;
                }
                alpha.setStartDelay(j10).setDuration(150L).setInterpolator(xq.f40452f).start();
                return;
            }
            if (!this.T) {
                animate().setListener(null).cancel();
                setScaleX(1.0f);
                setScaleY(1.0f);
                animate().alpha(1.0f).setDuration(150L).start();
            }
            setTranslationX(y9);
            setTranslationY(y10);
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
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        this.Q = false;
        if (this.N) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.Q = true;
        } else if (!this.f39255c0) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        b1 b1Var = this.f39264j0;
        if (b1Var != null) {
            float f10 = this.K;
            ((ib1) b1Var).f46232b.f52616e0.d(this.Q, f10);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (getMeasuredHeight() != this.f39259f && getMeasuredWidth() != this.h) {
            Path path = this.f39268s;
            path.reset();
            RectF rectF = this.f39269w;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.f39259f = getMeasuredHeight();
        this.h = getMeasuredWidth();
        f();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.c1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCornerRadius(float f10) {
        this.R = f10;
        invalidateOutline();
    }

    public void setDelegate(b1 b1Var) {
        this.f39264j0 = b1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.f39266n = windowInsets;
    }

    public void setIsActive(boolean z10) {
        this.S = z10;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.f39263i0 = onClickListener;
    }

    public void setRelativePosition(c1 c1Var) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        float systemWindowInsetBottom;
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        if (this.f39266n == null) {
            systemWindowInsetTop = 0.0f;
        } else {
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.I;
        }
        if (this.f39266n == null) {
            systemWindowInsetBottom = 0.0f;
        } else {
            systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.J;
        }
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (c1Var.getTranslationX() - this.G) / (((view.getMeasuredWidth() - this.G) - this.H) - c1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (c1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - c1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z10) {
        if (getParent() == null) {
            this.M = z10;
        } else {
            this.M = z10;
        }
    }
}
