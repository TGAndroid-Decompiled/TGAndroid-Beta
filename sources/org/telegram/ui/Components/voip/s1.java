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
import nh.e5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sl;
import org.telegram.ui.ih1;
public final class s1 extends FrameLayout {
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
    public float f29889a;
    public ValueAnimator f29890a0;
    public float f29891b;
    public final eg.b1 f29892b0;
    public float f29893c;
    public ValueAnimator f29894c0;
    public float d;
    public final e5 f29895d0;
    public boolean e;
    public View.OnClickListener f29896e0;
    public int f29897f;
    public r1 f29898f0;
    public long f29899g0;
    public int h;
    public WindowInsets f29900n;
    public final float f29901r;
    public final Path f29902s;
    public final RectF v;
    public final Paint f29903w;
    public final Drawable f29904x;
    public float f29905y;

    public s1(Activity activity) {
        super(activity);
        this.f29902s = new Path();
        this.v = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.f29903w = paint;
        this.f29905y = -1.0f;
        this.B = -1.0f;
        this.G = 0.0f;
        this.H = 0.0f;
        this.N = -1.0f;
        this.O = true;
        this.f29892b0 = new eg.b1(this, 9);
        this.f29895d0 = new e5(this, 7);
        this.f29901r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new sl(this, 3));
        setClipToOutline(true);
        paint.setColor(i0.a.k(-16777216, 102));
        this.f29904x = activity.getDrawable(R.drawable.calls_mute_mini);
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
        if (getMeasuredWidth() > 0 && this.f29905y < 0.0f) {
            ViewParent parent = getParent();
            if (parent == null) {
                return;
            }
            WindowInsets windowInsets = this.f29900n;
            if (windowInsets == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.E;
            }
            WindowInsets windowInsets2 = this.f29900n;
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
        s1 s1Var;
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
            float f11 = this.f29905y;
            if (f11 >= 0.0f) {
                s1Var = this;
                s1Var.e(f11, this.B, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
            } else {
                s1Var = this;
            }
            s1Var.J = false;
            s1Var.L = true;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            setTranslationX(0.0f);
            setTranslationY(0.0f);
            invalidate();
            ValueAnimator valueAnimator = s1Var.f29890a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.G, 1.0f);
            s1Var.f29890a0 = ofFloat;
            ofFloat.addUpdateListener(s1Var.f29892b0);
            s1Var.f29890a0.setDuration(300L);
            s1Var.f29890a0.start();
            animate().setListener(null).cancel();
            ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
            nr nrVar = nr.f27346f;
            duration.setInterpolator(nrVar).setListener(new p1(this, translationX, translationY, 0)).setInterpolator(nrVar).start();
        } else if (!z4 && this.J) {
            this.K = z4;
            float translationX2 = getTranslationX();
            float translationY2 = getTranslationY();
            f();
            this.J = false;
            this.L = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new q1(this, translationX2, translationY2));
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
        this.f29905y = f10;
        this.B = f11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s1 s1Var;
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
        if (this.f29905y >= 0.0f && this.J && getMeasuredWidth() > 0) {
            s1Var = this;
            s1Var.e(this.f29905y, this.B, getMeasuredWidth(), getMeasuredHeight(), false);
            s1Var.f29905y = -1.0f;
            s1Var.B = -1.0f;
        } else {
            s1Var = this;
        }
        super.dispatchDraw(canvas);
        if (!s1Var.L) {
            boolean z4 = s1Var.J;
            boolean z10 = s1Var.K;
            if (z4 != z10) {
                c(z10, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((AndroidUtilities.dp(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * s1Var.G * s1Var.H, (1.0f / getScaleY()) * s1Var.G * s1Var.H, f10, f11);
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(14.0f), s1Var.f29903w);
        Drawable drawable = s1Var.f29904x;
        drawable.setBounds(org.telegram.ui.b.u(2, measuredWidth, drawable), org.telegram.ui.b.f(2, measuredHeight, drawable), org.telegram.ui.b.A(2, measuredWidth, drawable), org.telegram.ui.b.y(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (s1Var.L) {
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
            if (this.f29900n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.E;
            }
            if (this.f29900n != null) {
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
                alpha.setStartDelay(j10).setDuration(150L).setInterpolator(nr.f27346f).start();
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
        r1 r1Var = this.f29898f0;
        if (r1Var != null) {
            ((ih1) r1Var).f35125b.f32599a0.d(this.G, this.M);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (getMeasuredHeight() != this.f29897f && getMeasuredWidth() != this.h) {
            Path path = this.f29902s;
            path.reset();
            RectF rectF = this.v;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.f29897f = getMeasuredHeight();
        this.h = getMeasuredWidth();
        f();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.s1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCornerRadius(float f10) {
        this.N = f10;
        invalidateOutline();
    }

    public void setDelegate(r1 r1Var) {
        this.f29898f0 = r1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.f29900n = windowInsets;
    }

    public void setIsActive(boolean z4) {
        this.O = z4;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.f29896e0 = onClickListener;
    }

    public void setRelativePosition(s1 s1Var) {
        float systemWindowInsetTop;
        float systemWindowInsetBottom;
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        WindowInsets windowInsets = this.f29900n;
        if (windowInsets == null) {
            systemWindowInsetTop = 0.0f;
        } else {
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.E;
        }
        WindowInsets windowInsets2 = this.f29900n;
        if (windowInsets2 == null) {
            systemWindowInsetBottom = 0.0f;
        } else {
            systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.F;
        }
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (s1Var.getTranslationX() - this.C) / (((view.getMeasuredWidth() - this.C) - this.D) - s1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (s1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - s1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z4) {
        if (getParent() == null) {
            this.I = z4;
        } else {
            this.I = z4;
        }
    }
}
