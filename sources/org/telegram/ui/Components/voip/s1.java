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
import kh.g4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ug1;
public final class s1 extends FrameLayout {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public float M;
    public boolean N;
    public boolean O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public boolean U;
    public boolean V;
    public ValueAnimator W;
    public float f33796a;
    public final f2.f0 f33797a0;
    public float f33798b;
    public ValueAnimator f33799b0;
    public float f33800c;
    public final g4 f33801c0;
    public float d;
    public View.OnClickListener f33802d0;
    public boolean f33803e;
    public r1 f33804e0;
    public int f33805f;
    public long f33806f0;
    public int h;
    public WindowInsets f33807n;
    public final float f33808r;
    public final Path f33809s;
    public final RectF v;
    public final Paint f33810w;
    public final Drawable f33811x;
    public float f33812y;

    public s1(Activity activity) {
        super(activity);
        this.f33809s = new Path();
        this.v = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.f33810w = paint;
        this.f33812y = -1.0f;
        this.A = -1.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        this.M = -1.0f;
        this.N = true;
        this.f33797a0 = new f2.f0(this, 9);
        this.f33801c0 = new g4(this, 10);
        this.f33808r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new kg.b(this, 4));
        setClipToOutline(true);
        paint.setColor(i0.a.k(-16777216, 102));
        this.f33811x = activity.getDrawable(R.drawable.calls_mute_mini);
    }

    public final void a() {
        f();
        float f10 = this.Q;
        if (f10 >= 0.0f && !this.K) {
            e(f10, this.R, getMeasuredWidth(), getMeasuredHeight(), true);
            this.Q = -1.0f;
            this.R = -1.0f;
        }
    }

    public final void b() {
        float systemWindowInsetTop;
        float systemWindowInsetBottom;
        if (getMeasuredWidth() > 0 && this.f33812y < 0.0f) {
            ViewParent parent = getParent();
            if (parent == null) {
                return;
            }
            WindowInsets windowInsets = this.f33807n;
            if (windowInsets == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.D;
            }
            WindowInsets windowInsets2 = this.f33807n;
            if (windowInsets2 == null) {
                systemWindowInsetBottom = 0.0f;
            } else {
                systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.E;
            }
            View view = (View) parent;
            this.Q = (getTranslationX() - this.B) / (((view.getMeasuredWidth() - this.B) - this.C) - getMeasuredWidth());
            this.R = (getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - getMeasuredHeight());
            this.Q = Math.max(0.0f, Math.min(1.0f, this.Q));
            this.R = Math.max(0.0f, Math.min(1.0f, this.R));
            return;
        }
        this.Q = -1.0f;
        this.R = -1.0f;
    }

    public final void c(boolean z10, boolean z11) {
        s1 s1Var;
        float f10 = 1.0f;
        if (!((getMeasuredWidth() <= 0 || getVisibility() != 0) ? false : false)) {
            if (this.I != z10) {
                this.I = z10;
                this.J = z10;
                if (!z10) {
                    f10 = 0.0f;
                }
                this.F = f10;
                requestLayout();
                invalidateOutline();
            }
        } else if (this.K) {
            this.J = z10;
        } else if (z10 && !this.I) {
            this.I = true;
            this.J = z10;
            f();
            float f11 = this.f33812y;
            if (f11 >= 0.0f) {
                s1Var = this;
                s1Var.e(f11, this.A, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
            } else {
                s1Var = this;
            }
            s1Var.I = false;
            s1Var.K = true;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            setTranslationX(0.0f);
            setTranslationY(0.0f);
            invalidate();
            ValueAnimator valueAnimator = s1Var.W;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.F, 1.0f);
            s1Var.W = ofFloat;
            ofFloat.addUpdateListener(s1Var.f33797a0);
            s1Var.W.setDuration(300L);
            s1Var.W.start();
            animate().setListener(null).cancel();
            ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
            gr grVar = gr.f28844f;
            duration.setInterpolator(grVar).setListener(new p1(this, translationX, translationY, 0)).setInterpolator(grVar).start();
        } else if (!z10 && this.I) {
            this.J = z10;
            float translationX2 = getTranslationX();
            float translationY2 = getTranslationY();
            f();
            this.I = false;
            this.K = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new q1(this, translationX2, translationY2));
        } else {
            if (!this.I) {
                f10 = 0.0f;
            }
            this.F = f10;
            this.I = z10;
            this.J = z10;
            requestLayout();
        }
    }

    public final void d(float f10, float f11) {
        ViewParent parent = getParent();
        if (this.I && parent != null && ((View) parent).getMeasuredWidth() <= 0 && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            e(f10, f11, getMeasuredWidth(), getMeasuredHeight(), true);
            return;
        }
        this.f33812y = f10;
        this.A = f11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s1 s1Var;
        if (this.S >= 0.0f) {
            if (!this.V) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.S);
            setTranslationY(this.T);
            if (!this.V) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.S = -1.0f;
            this.T = -1.0f;
        }
        if (this.f33812y >= 0.0f && this.I && getMeasuredWidth() > 0) {
            s1Var = this;
            s1Var.e(this.f33812y, this.A, getMeasuredWidth(), getMeasuredHeight(), false);
            s1Var.f33812y = -1.0f;
            s1Var.A = -1.0f;
        } else {
            s1Var = this;
        }
        super.dispatchDraw(canvas);
        if (!s1Var.K) {
            boolean z10 = s1Var.I;
            boolean z11 = s1Var.J;
            if (z10 != z11) {
                c(z11, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((AndroidUtilities.dp(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * s1Var.F * s1Var.G, (1.0f / getScaleY()) * s1Var.F * s1Var.G, f10, f11);
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(14.0f), s1Var.f33810w);
        Drawable drawable = s1Var.f33811x;
        drawable.setBounds(ll.x(2, measuredWidth, drawable), ll.e(2, measuredHeight, drawable), ll.B(2, measuredWidth, drawable), ll.z(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (s1Var.K) {
            invalidate();
        }
    }

    public final void e(float f10, float f11, int i9, int i10, boolean z10) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        long j10;
        ViewParent parent = getParent();
        if (parent != null && this.I && !this.K && this.N) {
            float f12 = 0.0f;
            if (this.f33807n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.D;
            }
            if (this.f33807n != null) {
                f12 = windowInsets2.getSystemWindowInsetBottom() + this.E;
            }
            View view = (View) parent;
            float z11 = e2.c.z((view.getMeasuredWidth() - this.B) - this.C, i9, f10, this.B);
            float z12 = e2.c.z((view.getMeasuredHeight() - f12) - systemWindowInsetTop, i10, f11, systemWindowInsetTop);
            if (z10) {
                animate().setListener(null).cancel();
                ViewPropertyAnimator alpha = animate().scaleX(1.0f).scaleY(1.0f).translationX(z11).translationY(z12).alpha(1.0f);
                if (this.H) {
                    j10 = 0;
                } else {
                    j10 = 150;
                }
                alpha.setStartDelay(j10).setDuration(150L).setInterpolator(gr.f28844f).start();
                return;
            }
            if (!this.O) {
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
        int dp;
        float f10 = 16.0f;
        this.B = AndroidUtilities.dp(16.0f);
        this.C = AndroidUtilities.dp(16.0f);
        if (this.H) {
            dp = AndroidUtilities.dp(60.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        this.D = dp;
        if (this.H) {
            f10 = 100.0f;
        }
        this.E = AndroidUtilities.dp(f10) + this.P;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        this.L = false;
        if (this.I) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.L = true;
        } else if (!this.U) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        r1 r1Var = this.f33804e0;
        if (r1Var != null) {
            ((ug1) r1Var).f43258b.Z.d(this.F, this.L);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (getMeasuredHeight() != this.f33805f && getMeasuredWidth() != this.h) {
            Path path = this.f33809s;
            path.reset();
            RectF rectF = this.v;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.f33805f = getMeasuredHeight();
        this.h = getMeasuredWidth();
        f();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.s1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCornerRadius(float f10) {
        this.M = f10;
        invalidateOutline();
    }

    public void setDelegate(r1 r1Var) {
        this.f33804e0 = r1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.f33807n = windowInsets;
    }

    public void setIsActive(boolean z10) {
        this.N = z10;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.f33802d0 = onClickListener;
    }

    public void setRelativePosition(s1 s1Var) {
        float systemWindowInsetTop;
        float systemWindowInsetBottom;
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        WindowInsets windowInsets = this.f33807n;
        if (windowInsets == null) {
            systemWindowInsetTop = 0.0f;
        } else {
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.D;
        }
        WindowInsets windowInsets2 = this.f33807n;
        if (windowInsets2 == null) {
            systemWindowInsetBottom = 0.0f;
        } else {
            systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.E;
        }
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (s1Var.getTranslationX() - this.B) / (((view.getMeasuredWidth() - this.B) - this.C) - s1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (s1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - s1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z10) {
        if (getParent() == null) {
            this.H = z10;
        } else {
            this.H = z10;
        }
    }
}
