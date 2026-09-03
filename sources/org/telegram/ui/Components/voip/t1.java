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
import oh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tl;
import org.telegram.ui.qh1;
public final class t1 extends FrameLayout {
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public float N;
    public boolean O;
    public boolean P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    public boolean W;
    public float f32333a;
    public ValueAnimator f32334a0;
    public float f32335b;
    public final f2.d0 f32336b0;
    public float f32337c;
    public ValueAnimator f32338c0;
    public float d;
    public final f5 f32339d0;
    public boolean f32340e;
    public View.OnClickListener f32341e0;
    public int f32342f;
    public s1 f32343f0;
    public long f32344g0;
    public int h;
    public WindowInsets f32345n;
    public final float f32346r;
    public final Path f32347s;
    public final RectF v;
    public final Paint f32348w;
    public final Drawable f32349x;
    public float f32350y;

    public t1(Activity activity) {
        super(activity);
        this.f32347s = new Path();
        this.v = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.f32348w = paint;
        this.f32350y = -1.0f;
        this.B = -1.0f;
        this.G = 0.0f;
        this.H = 0.0f;
        this.N = -1.0f;
        this.O = true;
        this.f32336b0 = new f2.d0(this, 8);
        this.f32339d0 = new f5(this, 6);
        this.f32346r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new tl(this, 3));
        setClipToOutline(true);
        paint.setColor(i0.a.k(-16777216, 102));
        this.f32349x = activity.getDrawable(R.drawable.calls_mute_mini);
    }

    public final void a() {
        f();
        float f10 = this.R;
        if (f10 >= 0.0f && !this.L) {
            e(f10, this.S, getMeasuredWidth(), getMeasuredHeight(), true);
            this.R = -1.0f;
            this.S = -1.0f;
        }
    }

    public final void b() {
        float systemWindowInsetTop;
        float systemWindowInsetBottom;
        if (getMeasuredWidth() > 0 && this.f32350y < 0.0f) {
            ViewParent parent = getParent();
            if (parent == null) {
                return;
            }
            WindowInsets windowInsets = this.f32345n;
            if (windowInsets == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.E;
            }
            WindowInsets windowInsets2 = this.f32345n;
            if (windowInsets2 == null) {
                systemWindowInsetBottom = 0.0f;
            } else {
                systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.F;
            }
            View view = (View) parent;
            this.R = (getTranslationX() - this.C) / (((view.getMeasuredWidth() - this.C) - this.D) - getMeasuredWidth());
            this.S = (getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - getMeasuredHeight());
            this.R = Math.max(0.0f, Math.min(1.0f, this.R));
            this.S = Math.max(0.0f, Math.min(1.0f, this.S));
            return;
        }
        this.R = -1.0f;
        this.S = -1.0f;
    }

    public final void c(boolean z4, boolean z10) {
        t1 t1Var;
        float f10 = 1.0f;
        if (!((getMeasuredWidth() <= 0 || getVisibility() != 0) ? false : false)) {
            if (this.J != z4) {
                this.J = z4;
                this.K = z4;
                if (!z4) {
                    f10 = 0.0f;
                }
                this.G = f10;
                requestLayout();
                invalidateOutline();
            }
        } else if (this.L) {
            this.K = z4;
        } else if (z4 && !this.J) {
            this.J = true;
            this.K = z4;
            f();
            float f11 = this.f32350y;
            if (f11 >= 0.0f) {
                t1Var = this;
                t1Var.e(f11, this.B, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
            } else {
                t1Var = this;
            }
            t1Var.J = false;
            t1Var.L = true;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            setTranslationX(0.0f);
            setTranslationY(0.0f);
            invalidate();
            ValueAnimator valueAnimator = t1Var.f32334a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(t1Var.G, 1.0f);
            t1Var.f32334a0 = ofFloat;
            ofFloat.addUpdateListener(t1Var.f32336b0);
            t1Var.f32334a0.setDuration(300L);
            t1Var.f32334a0.start();
            animate().setListener(null).cancel();
            ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
            pr prVar = pr.f30168f;
            duration.setInterpolator(prVar).setListener(new q1(this, translationX, translationY, 0)).setInterpolator(prVar).start();
        } else if (!z4 && this.J) {
            this.K = z4;
            float translationX2 = getTranslationX();
            float translationY2 = getTranslationY();
            f();
            this.J = false;
            this.L = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new r1(this, translationX2, translationY2));
        } else {
            if (!this.J) {
                f10 = 0.0f;
            }
            this.G = f10;
            this.J = z4;
            this.K = z4;
            requestLayout();
        }
    }

    public final void d(float f10, float f11) {
        ViewParent parent = getParent();
        if (this.J && parent != null && ((View) parent).getMeasuredWidth() <= 0 && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            e(f10, f11, getMeasuredWidth(), getMeasuredHeight(), true);
            return;
        }
        this.f32350y = f10;
        this.B = f11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        t1 t1Var;
        if (this.T >= 0.0f) {
            if (!this.W) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.T);
            setTranslationY(this.U);
            if (!this.W) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.T = -1.0f;
            this.U = -1.0f;
        }
        if (this.f32350y >= 0.0f && this.J && getMeasuredWidth() > 0) {
            t1Var = this;
            t1Var.e(this.f32350y, this.B, getMeasuredWidth(), getMeasuredHeight(), false);
            t1Var.f32350y = -1.0f;
            t1Var.B = -1.0f;
        } else {
            t1Var = this;
        }
        super.dispatchDraw(canvas);
        if (!t1Var.L) {
            boolean z4 = t1Var.J;
            boolean z10 = t1Var.K;
            if (z4 != z10) {
                c(z10, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((AndroidUtilities.dp(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * t1Var.G * t1Var.H, (1.0f / getScaleY()) * t1Var.G * t1Var.H, f10, f11);
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(14.0f), t1Var.f32348w);
        Drawable drawable = t1Var.f32349x;
        drawable.setBounds(org.telegram.ui.b.u(2, measuredWidth, drawable), org.telegram.ui.b.f(2, measuredHeight, drawable), org.telegram.ui.b.A(2, measuredWidth, drawable), org.telegram.ui.b.y(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (t1Var.L) {
            invalidate();
        }
    }

    public final void e(float f10, float f11, int i10, int i11, boolean z4) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        long j10;
        ViewParent parent = getParent();
        if (parent != null && this.J && !this.L && this.O) {
            float f12 = 0.0f;
            if (this.f32345n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.E;
            }
            if (this.f32345n != null) {
                f12 = windowInsets2.getSystemWindowInsetBottom() + this.F;
            }
            View view = (View) parent;
            float w10 = e2.c.w((view.getMeasuredWidth() - this.C) - this.D, i10, f10, this.C);
            float w11 = e2.c.w((view.getMeasuredHeight() - f12) - systemWindowInsetTop, i11, f11, systemWindowInsetTop);
            if (z4) {
                animate().setListener(null).cancel();
                ViewPropertyAnimator alpha = animate().scaleX(1.0f).scaleY(1.0f).translationX(w10).translationY(w11).alpha(1.0f);
                if (this.I) {
                    j10 = 0;
                } else {
                    j10 = 150;
                }
                alpha.setStartDelay(j10).setDuration(150L).setInterpolator(pr.f30168f).start();
                return;
            }
            if (!this.P) {
                animate().setListener(null).cancel();
                setScaleX(1.0f);
                setScaleY(1.0f);
                animate().alpha(1.0f).setDuration(150L).start();
            }
            setTranslationX(w10);
            setTranslationY(w11);
        }
    }

    public final void f() {
        int dp;
        float f10 = 16.0f;
        this.C = AndroidUtilities.dp(16.0f);
        this.D = AndroidUtilities.dp(16.0f);
        if (this.I) {
            dp = AndroidUtilities.dp(60.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        this.E = dp;
        if (this.I) {
            f10 = 100.0f;
        }
        this.F = AndroidUtilities.dp(f10) + this.Q;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.M = false;
        if (this.J) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.M = true;
        } else if (!this.V) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        s1 s1Var = this.f32343f0;
        if (s1Var != null) {
            ((qh1) s1Var).f40509b.f37671a0.d(this.G, this.M);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (getMeasuredHeight() != this.f32342f && getMeasuredWidth() != this.h) {
            Path path = this.f32347s;
            path.reset();
            RectF rectF = this.v;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.f32342f = getMeasuredHeight();
        this.h = getMeasuredWidth();
        f();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCornerRadius(float f10) {
        this.N = f10;
        invalidateOutline();
    }

    public void setDelegate(s1 s1Var) {
        this.f32343f0 = s1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.f32345n = windowInsets;
    }

    public void setIsActive(boolean z4) {
        this.O = z4;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.f32341e0 = onClickListener;
    }

    public void setRelativePosition(t1 t1Var) {
        float systemWindowInsetTop;
        float systemWindowInsetBottom;
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        WindowInsets windowInsets = this.f32345n;
        if (windowInsets == null) {
            systemWindowInsetTop = 0.0f;
        } else {
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.E;
        }
        WindowInsets windowInsets2 = this.f32345n;
        if (windowInsets2 == null) {
            systemWindowInsetBottom = 0.0f;
        } else {
            systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.F;
        }
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (t1Var.getTranslationX() - this.C) / (((view.getMeasuredWidth() - this.C) - this.D) - t1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (t1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - t1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z4) {
        if (getParent() == null) {
            this.I = z4;
        } else {
            this.I = z4;
        }
    }
}
