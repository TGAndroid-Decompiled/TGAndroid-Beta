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
import fi.f4;
import org.telegram.ui.Components.er;
import org.telegram.ui.pb1;
public final class r1 extends FrameLayout {
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
    public float f40894a;
    public float f40895a0;
    public float f40896b;
    public float f40897b0;
    public float f40898c;
    public boolean f40899c0;
    public float d;
    public boolean f40900d0;
    public boolean f40901e;
    public ValueAnimator f40902e0;
    public int f40903f;
    public final f4 f40904f0;
    public ValueAnimator f40905g0;
    public int h;
    public final hi.j3 f40906h0;
    public View.OnClickListener f40907i0;
    public q1 f40908j0;
    public long f40909k0;
    public WindowInsets f40910n;
    public final float f40911r;
    public final Path f40912s;
    public final RectF f40913w;
    public final Paint f40914x;
    public final Drawable f40915y;

    public r1(Activity activity) {
        super(activity);
        this.f40912s = new Path();
        this.f40913w = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.f40914x = paint;
        this.E = -1.0f;
        this.F = -1.0f;
        this.K = 0.0f;
        this.L = 0.0f;
        this.R = -1.0f;
        this.S = true;
        this.f40904f0 = new f4(this, 11);
        this.f40906h0 = new hi.j3(this, 20);
        this.f40911r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new fh.a(this, 7));
        setClipToOutline(true);
        paint.setColor(i0.a.o(-16777216, 102));
        this.f40915y = activity.getDrawable(2131230922);
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
            if (this.f40910n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.I;
            }
            if (this.f40910n == null) {
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
        r1 r1Var;
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
                r1Var = this;
                r1Var.e(f11, this.F, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
            } else {
                r1Var = this;
            }
            r1Var.N = false;
            r1Var.P = true;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            setTranslationX(0.0f);
            setTranslationY(0.0f);
            invalidate();
            ValueAnimator valueAnimator = r1Var.f40902e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(r1Var.K, 1.0f);
            r1Var.f40902e0 = ofFloat;
            ofFloat.addUpdateListener(r1Var.f40904f0);
            r1Var.f40902e0.setDuration(300L);
            r1Var.f40902e0.start();
            animate().setListener(null).cancel();
            ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
            er erVar = er.f34420f;
            duration.setInterpolator(erVar).setListener(new o1(this, translationX, translationY, 0)).setInterpolator(erVar).start();
        } else if (!z10 && this.N) {
            this.O = z10;
            float translationX2 = getTranslationX();
            float translationY2 = getTranslationY();
            f();
            this.N = false;
            this.P = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new p1(this, translationX2, translationY2));
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
        r1 r1Var;
        if (this.f40895a0 >= 0.0f) {
            if (!this.f40900d0) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.f40895a0);
            setTranslationY(this.f40897b0);
            if (!this.f40900d0) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.f40895a0 = -1.0f;
            this.f40897b0 = -1.0f;
        }
        if (this.E >= 0.0f && this.N && getMeasuredWidth() > 0) {
            r1Var = this;
            r1Var.e(this.E, this.F, getMeasuredWidth(), getMeasuredHeight(), false);
            r1Var.E = -1.0f;
            r1Var.F = -1.0f;
        } else {
            r1Var = this;
        }
        super.dispatchDraw(canvas);
        if (!r1Var.P) {
            boolean z10 = r1Var.N;
            boolean z11 = r1Var.O;
            if (z10 != z11) {
                c(z11, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((org.telegram.messenger.g0.L(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * r1Var.K * r1Var.L, (1.0f / getScaleY()) * r1Var.K * r1Var.L, f10, f11);
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(14.0f), r1Var.f40914x);
        Drawable drawable = r1Var.f40915y;
        drawable.setBounds(org.telegram.ui.Cells.y0.A(2, measuredWidth, drawable), org.telegram.ui.Cells.y0.y(2, measuredHeight, drawable), org.telegram.ui.Cells.y0.w(2, measuredWidth, drawable), org.telegram.ui.Cells.y0.h(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (r1Var.P) {
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
            if (this.f40910n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.I;
            }
            if (this.f40910n != null) {
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
                alpha.setStartDelay(j3).setDuration(150L).setInterpolator(er.f34420f).start();
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
        } else if (!this.f40899c0) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        q1 q1Var = this.f40908j0;
        if (q1Var != null) {
            float f10 = this.K;
            ((pb1) q1Var).f50239b.f46693e0.d(this.Q, f10);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (getMeasuredHeight() != this.f40903f && getMeasuredWidth() != this.h) {
            Path path = this.f40912s;
            path.reset();
            RectF rectF = this.f40913w;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.f40903f = getMeasuredHeight();
        this.h = getMeasuredWidth();
        f();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.r1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCornerRadius(float f10) {
        this.R = f10;
        invalidateOutline();
    }

    public void setDelegate(q1 q1Var) {
        this.f40908j0 = q1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.f40910n = windowInsets;
    }

    public void setIsActive(boolean z10) {
        this.S = z10;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.f40907i0 = onClickListener;
    }

    public void setRelativePosition(r1 r1Var) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        float systemWindowInsetBottom;
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        if (this.f40910n == null) {
            systemWindowInsetTop = 0.0f;
        } else {
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.I;
        }
        if (this.f40910n == null) {
            systemWindowInsetBottom = 0.0f;
        } else {
            systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.J;
        }
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (r1Var.getTranslationX() - this.G) / (((view.getMeasuredWidth() - this.G) - this.H) - r1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (r1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - r1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z10) {
        if (getParent() == null) {
            this.M = z10;
        } else {
            this.M = z10;
        }
    }
}
