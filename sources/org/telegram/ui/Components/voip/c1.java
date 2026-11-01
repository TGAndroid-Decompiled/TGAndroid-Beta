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
import org.telegram.ui.Components.gr;
import org.telegram.ui.id1;
import org.telegram.ui.ol;
public final class c1 extends FrameLayout {
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
    public float f31402a;
    public float f31403a0;
    public float f31404b;
    public boolean f31405b0;
    public float f31406c;
    public boolean f31407c0;
    public float d;
    public ValueAnimator f31408d0;
    public boolean e;
    public final bg.o f31409e0;
    public int f31410f;
    public ValueAnimator f31411f0;
    public final bg.k f31412g0;
    public int h;
    public View.OnClickListener f31413h0;
    public b1 f31414i0;
    public long f31415j0;
    public WindowInsets f31416n;
    public final float f31417r;
    public final Path f31418s;
    public final RectF f31419w;
    public final Paint f31420x;
    public final Drawable f31421y;

    public c1(Activity activity) {
        super(activity);
        this.f31418s = new Path();
        this.f31419w = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.f31420x = paint;
        this.D = -1.0f;
        this.E = -1.0f;
        this.J = 0.0f;
        this.K = 0.0f;
        this.Q = -1.0f;
        this.R = true;
        this.f31409e0 = new bg.o(this, 9);
        this.f31412g0 = new bg.k(this, 23);
        this.f31417r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new ol(this, 5));
        setClipToOutline(true);
        paint.setColor(i0.b.o(-16777216, 102));
        this.f31421y = activity.getDrawable(2131230922);
    }

    public final void a() {
        f();
        float f7 = this.U;
        if (f7 >= 0.0f && !this.O) {
            e(f7, this.V, getMeasuredWidth(), getMeasuredHeight(), true);
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
            if (this.f31416n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.H;
            }
            if (this.f31416n == null) {
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

    public final void c(boolean z10, boolean z11) {
        c1 c1Var;
        if (getMeasuredWidth() <= 0 || getVisibility() != 0) {
            z11 = false;
        }
        float f7 = 1.0f;
        if (!z11) {
            if (this.M != z10) {
                this.M = z10;
                this.N = z10;
                if (!z10) {
                    f7 = 0.0f;
                }
                this.J = f7;
                requestLayout();
                invalidateOutline();
            }
        } else if (this.O) {
            this.N = z10;
        } else if (z10 && !this.M) {
            this.M = true;
            this.N = z10;
            f();
            float f10 = this.D;
            if (f10 >= 0.0f) {
                c1Var = this;
                c1Var.e(f10, this.E, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
            } else {
                c1Var = this;
            }
            c1Var.M = false;
            c1Var.O = true;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            setTranslationX(0.0f);
            setTranslationY(0.0f);
            invalidate();
            ValueAnimator valueAnimator = c1Var.f31408d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(c1Var.J, 1.0f);
            c1Var.f31408d0 = ofFloat;
            ofFloat.addUpdateListener(c1Var.f31409e0);
            c1Var.f31408d0.setDuration(300L);
            c1Var.f31408d0.start();
            animate().setListener(null).cancel();
            ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
            gr grVar = gr.f26523f;
            duration.setInterpolator(grVar).setListener(new fe.d(this, translationX, translationY, 1)).setInterpolator(grVar).start();
        } else if (!z10 && this.M) {
            this.N = z10;
            float translationX2 = getTranslationX();
            float translationY2 = getTranslationY();
            f();
            this.M = false;
            this.O = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new a1(this, translationX2, translationY2));
        } else {
            if (!this.M) {
                f7 = 0.0f;
            }
            this.J = f7;
            this.M = z10;
            this.N = z10;
            requestLayout();
        }
    }

    public final void d(float f7, float f10) {
        ViewParent parent = getParent();
        if (this.M && parent != null && ((View) parent).getMeasuredWidth() <= 0 && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            e(f7, f10, getMeasuredWidth(), getMeasuredHeight(), true);
            return;
        }
        this.D = f7;
        this.E = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c1 c1Var;
        if (this.W >= 0.0f) {
            if (!this.f31407c0) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.W);
            setTranslationY(this.f31403a0);
            if (!this.f31407c0) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.W = -1.0f;
            this.f31403a0 = -1.0f;
        }
        if (this.D >= 0.0f && this.M && getMeasuredWidth() > 0) {
            c1Var = this;
            c1Var.e(this.D, this.E, getMeasuredWidth(), getMeasuredHeight(), false);
            c1Var.D = -1.0f;
            c1Var.E = -1.0f;
        } else {
            c1Var = this;
        }
        super.dispatchDraw(canvas);
        if (!c1Var.O) {
            boolean z10 = c1Var.M;
            boolean z11 = c1Var.N;
            if (z10 != z11) {
                c(z11, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((org.telegram.messenger.i0.L(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f7 = measuredWidth;
        float f10 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * c1Var.J * c1Var.K, (1.0f / getScaleY()) * c1Var.J * c1Var.K, f7, f10);
        canvas.drawCircle(f7, f10, org.telegram.messenger.i0.L(14.0f), c1Var.f31420x);
        Drawable drawable = c1Var.f31421y;
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, drawable), org.telegram.ui.Cells.f1.w(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.f(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (c1Var.O) {
            invalidate();
        }
    }

    public final void e(float f7, float f10, int i10, int i11, boolean z10) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        long j10;
        ViewParent parent = getParent();
        if (parent != null && this.M && !this.O && this.R) {
            float f11 = 0.0f;
            if (this.f31416n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.H;
            }
            if (this.f31416n != null) {
                f11 = windowInsets2.getSystemWindowInsetBottom() + this.I;
            }
            View view = (View) parent;
            float z11 = c3.i0.z((view.getMeasuredWidth() - this.F) - this.G, i10, f7, this.F);
            float z12 = c3.i0.z((view.getMeasuredHeight() - f11) - systemWindowInsetTop, i11, f10, systemWindowInsetTop);
            if (z10) {
                animate().setListener(null).cancel();
                ViewPropertyAnimator alpha = animate().scaleX(1.0f).scaleY(1.0f).translationX(z11).translationY(z12).alpha(1.0f);
                if (this.L) {
                    j10 = 0;
                } else {
                    j10 = 150;
                }
                alpha.setStartDelay(j10).setDuration(150L).setInterpolator(gr.f26523f).start();
                return;
            }
            if (!this.S) {
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
        float f7 = 16.0f;
        this.F = org.telegram.messenger.i0.L(16.0f);
        this.G = org.telegram.messenger.i0.L(16.0f);
        if (this.L) {
            L = org.telegram.messenger.i0.L(60.0f);
        } else {
            L = org.telegram.messenger.i0.L(16.0f);
        }
        this.H = L;
        if (this.L) {
            f7 = 100.0f;
        }
        this.I = org.telegram.messenger.i0.L(f7) + this.T;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.P = false;
        if (this.M) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.P = true;
        } else if (!this.f31405b0) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        b1 b1Var = this.f31414i0;
        if (b1Var != null) {
            float f7 = this.J;
            ((id1) b1Var).f38008b.f43944d0.d(this.P, f7);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (getMeasuredHeight() != this.f31410f && getMeasuredWidth() != this.h) {
            Path path = this.f31418s;
            path.reset();
            RectF rectF = this.f31419w;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.f31410f = getMeasuredHeight();
        this.h = getMeasuredWidth();
        f();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.c1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCornerRadius(float f7) {
        this.Q = f7;
        invalidateOutline();
    }

    public void setDelegate(b1 b1Var) {
        this.f31414i0 = b1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.f31416n = windowInsets;
    }

    public void setIsActive(boolean z10) {
        this.R = z10;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.f31413h0 = onClickListener;
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
        if (this.f31416n == null) {
            systemWindowInsetTop = 0.0f;
        } else {
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.H;
        }
        if (this.f31416n == null) {
            systemWindowInsetBottom = 0.0f;
        } else {
            systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.I;
        }
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (c1Var.getTranslationX() - this.F) / (((view.getMeasuredWidth() - this.F) - this.G) - c1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (c1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - c1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z10) {
        if (getParent() == null) {
            this.L = z10;
        } else {
            this.L = z10;
        }
    }
}
