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
import di.m4;
import fi.v3;
import org.telegram.ui.Components.xq;
import org.telegram.ui.pb1;
public final class n1 extends FrameLayout {
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public float Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public float V;
    public float W;
    public float f39342a;
    public float f39343a0;
    public float f39344b;
    public boolean f39345b0;
    public float f39346c;
    public boolean f39347c0;
    public float d;
    public ValueAnimator f39348d0;
    public boolean f39349e;
    public final m4 f39350e0;
    public int f39351f;
    public ValueAnimator f39352f0;
    public final v3 f39353g0;
    public int h;
    public View.OnClickListener f39354h0;
    public m1 f39355i0;
    public long f39356j0;
    public WindowInsets f39357n;
    public final float f39358r;
    public final Path f39359s;
    public final RectF f39360w;
    public final Paint f39361x;
    public final Drawable f39362y;

    public n1(Activity activity) {
        super(activity);
        this.f39359s = new Path();
        this.f39360w = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.f39361x = paint;
        this.D = -1.0f;
        this.E = -1.0f;
        this.J = 0.0f;
        this.K = 0.0f;
        this.Q = -1.0f;
        this.R = true;
        this.f39350e0 = new m4(this, 11);
        this.f39353g0 = new v3(this, 19);
        this.f39358r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new fh.a(this, 7));
        setClipToOutline(true);
        paint.setColor(i0.a.o(-16777216, 102));
        this.f39362y = activity.getDrawable(2131230922);
    }

    public final void a() {
        f();
        float f10 = this.U;
        if (f10 >= 0.0f && !this.O) {
            e(f10, this.V, getMeasuredWidth(), getMeasuredHeight(), true);
            this.U = -1.0f;
            this.V = -1.0f;
        }
    }

    public final void b() {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        float systemWindowInsetBottom;
        if (getMeasuredWidth() > 0 && this.D < 0.0f) {
            ViewParent parent = getParent();
            if (parent == null) {
                return;
            }
            if (this.f39357n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.H;
            }
            if (this.f39357n == null) {
                systemWindowInsetBottom = 0.0f;
            } else {
                systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.I;
            }
            View view = (View) parent;
            this.U = (getTranslationX() - this.F) / (((view.getMeasuredWidth() - this.F) - this.G) - getMeasuredWidth());
            this.V = (getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - getMeasuredHeight());
            this.U = Math.max(0.0f, Math.min(1.0f, this.U));
            this.V = Math.max(0.0f, Math.min(1.0f, this.V));
            return;
        }
        this.U = -1.0f;
        this.V = -1.0f;
    }

    public final void c(boolean z9, boolean z10) {
        n1 n1Var;
        if (getMeasuredWidth() <= 0 || getVisibility() != 0) {
            z10 = false;
        }
        float f10 = 1.0f;
        if (!z10) {
            if (this.M != z9) {
                this.M = z9;
                this.N = z9;
                if (!z9) {
                    f10 = 0.0f;
                }
                this.J = f10;
                requestLayout();
                invalidateOutline();
            }
        } else if (this.O) {
            this.N = z9;
        } else if (z9 && !this.M) {
            this.M = true;
            this.N = z9;
            f();
            float f11 = this.D;
            if (f11 >= 0.0f) {
                n1Var = this;
                n1Var.e(f11, this.E, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
            } else {
                n1Var = this;
            }
            n1Var.M = false;
            n1Var.O = true;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            setTranslationX(0.0f);
            setTranslationY(0.0f);
            invalidate();
            ValueAnimator valueAnimator = n1Var.f39348d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(n1Var.J, 1.0f);
            n1Var.f39348d0 = ofFloat;
            ofFloat.addUpdateListener(n1Var.f39350e0);
            n1Var.f39348d0.setDuration(300L);
            n1Var.f39348d0.start();
            animate().setListener(null).cancel();
            ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
            xq xqVar = xq.f40310f;
            duration.setInterpolator(xqVar).setListener(new k1(this, translationX, translationY, 0)).setInterpolator(xqVar).start();
        } else if (!z9 && this.M) {
            this.N = z9;
            float translationX2 = getTranslationX();
            float translationY2 = getTranslationY();
            f();
            this.M = false;
            this.O = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new l1(this, translationX2, translationY2));
        } else {
            if (!this.M) {
                f10 = 0.0f;
            }
            this.J = f10;
            this.M = z9;
            this.N = z9;
            requestLayout();
        }
    }

    public final void d(float f10, float f11) {
        ViewParent parent = getParent();
        if (this.M && parent != null && ((View) parent).getMeasuredWidth() <= 0 && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            e(f10, f11, getMeasuredWidth(), getMeasuredHeight(), true);
            return;
        }
        this.D = f10;
        this.E = f11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n1 n1Var;
        if (this.W >= 0.0f) {
            if (!this.f39347c0) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.W);
            setTranslationY(this.f39343a0);
            if (!this.f39347c0) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.W = -1.0f;
            this.f39343a0 = -1.0f;
        }
        if (this.D >= 0.0f && this.M && getMeasuredWidth() > 0) {
            n1Var = this;
            n1Var.e(this.D, this.E, getMeasuredWidth(), getMeasuredHeight(), false);
            n1Var.D = -1.0f;
            n1Var.E = -1.0f;
        } else {
            n1Var = this;
        }
        super.dispatchDraw(canvas);
        if (!n1Var.O) {
            boolean z9 = n1Var.M;
            boolean z10 = n1Var.N;
            if (z9 != z10) {
                c(z10, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((org.telegram.messenger.g0.L(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * n1Var.J * n1Var.K, (1.0f / getScaleY()) * n1Var.J * n1Var.K, f10, f11);
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(14.0f), n1Var.f39361x);
        Drawable drawable = n1Var.f39362y;
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, drawable), org.telegram.ui.Cells.f1.w(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.f(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (n1Var.O) {
            invalidate();
        }
    }

    public final void e(float f10, float f11, int i7, int i10, boolean z9) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        long j3;
        ViewParent parent = getParent();
        if (parent != null && this.M && !this.O && this.R) {
            float f12 = 0.0f;
            if (this.f39357n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.H;
            }
            if (this.f39357n != null) {
                f12 = windowInsets2.getSystemWindowInsetBottom() + this.I;
            }
            View view = (View) parent;
            float z10 = com.google.android.recaptcha.internal.a.z((view.getMeasuredWidth() - this.F) - this.G, i7, f10, this.F);
            float z11 = com.google.android.recaptcha.internal.a.z((view.getMeasuredHeight() - f12) - systemWindowInsetTop, i10, f11, systemWindowInsetTop);
            if (z9) {
                animate().setListener(null).cancel();
                ViewPropertyAnimator alpha = animate().scaleX(1.0f).scaleY(1.0f).translationX(z10).translationY(z11).alpha(1.0f);
                if (this.L) {
                    j3 = 0;
                } else {
                    j3 = 150;
                }
                alpha.setStartDelay(j3).setDuration(150L).setInterpolator(xq.f40310f).start();
                return;
            }
            if (!this.S) {
                animate().setListener(null).cancel();
                setScaleX(1.0f);
                setScaleY(1.0f);
                animate().alpha(1.0f).setDuration(150L).start();
            }
            setTranslationX(z10);
            setTranslationY(z11);
        }
    }

    public final void f() {
        int L;
        float f10 = 16.0f;
        this.F = org.telegram.messenger.g0.L(16.0f);
        this.G = org.telegram.messenger.g0.L(16.0f);
        if (this.L) {
            L = org.telegram.messenger.g0.L(60.0f);
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        this.H = L;
        if (this.L) {
            f10 = 100.0f;
        }
        this.I = org.telegram.messenger.g0.L(f10) + this.T;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        this.P = false;
        if (this.M) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.P = true;
        } else if (!this.f39345b0) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        m1 m1Var = this.f39355i0;
        if (m1Var != null) {
            float f10 = this.J;
            ((pb1) m1Var).f48780b.f45251d0.d(this.P, f10);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (getMeasuredHeight() != this.f39351f && getMeasuredWidth() != this.h) {
            Path path = this.f39359s;
            path.reset();
            RectF rectF = this.f39360w;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.f39351f = getMeasuredHeight();
        this.h = getMeasuredWidth();
        f();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.n1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCornerRadius(float f10) {
        this.Q = f10;
        invalidateOutline();
    }

    public void setDelegate(m1 m1Var) {
        this.f39355i0 = m1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.f39357n = windowInsets;
    }

    public void setIsActive(boolean z9) {
        this.R = z9;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.f39354h0 = onClickListener;
    }

    public void setRelativePosition(n1 n1Var) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        float systemWindowInsetBottom;
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        if (this.f39357n == null) {
            systemWindowInsetTop = 0.0f;
        } else {
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.H;
        }
        if (this.f39357n == null) {
            systemWindowInsetBottom = 0.0f;
        } else {
            systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.I;
        }
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (n1Var.getTranslationX() - this.F) / (((view.getMeasuredWidth() - this.F) - this.G) - n1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (n1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - n1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z9) {
        if (getParent() == null) {
            this.L = z9;
        } else {
            this.L = z9;
        }
    }
}
