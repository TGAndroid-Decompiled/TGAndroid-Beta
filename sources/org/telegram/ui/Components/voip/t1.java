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
import lh.d5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jr;
import org.telegram.ui.wg1;
public final class t1 extends FrameLayout {
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
    public float f33996a;
    public final cg.c1 f33997a0;
    public float f33998b;
    public ValueAnimator f33999b0;
    public float f34000c;
    public final d5 f34001c0;
    public float d;
    public View.OnClickListener f34002d0;
    public boolean f34003e;
    public s1 f34004e0;
    public int f34005f;
    public long f34006f0;
    public int h;
    public WindowInsets f34007n;
    public final float f34008r;
    public final Path f34009s;
    public final RectF v;
    public final Paint f34010w;
    public final Drawable f34011x;
    public float f34012y;

    public t1(Activity activity) {
        super(activity);
        this.f34009s = new Path();
        this.v = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.f34010w = paint;
        this.f34012y = -1.0f;
        this.A = -1.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        this.M = -1.0f;
        this.N = true;
        this.f33997a0 = new cg.c1(this, 10);
        this.f34001c0 = new d5(this, 19);
        this.f34008r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new ng.b(this, 4));
        setClipToOutline(true);
        paint.setColor(i0.a.k(-16777216, 102));
        this.f34011x = activity.getDrawable(R.drawable.calls_mute_mini);
    }

    public final void a() {
        f();
        float f9 = this.Q;
        if (f9 >= 0.0f && !this.K) {
            e(f9, this.R, getMeasuredWidth(), getMeasuredHeight(), true);
            this.Q = -1.0f;
            this.R = -1.0f;
        }
    }

    public final void b() {
        float systemWindowInsetTop;
        float systemWindowInsetBottom;
        if (getMeasuredWidth() > 0 && this.f34012y < 0.0f) {
            ViewParent parent = getParent();
            if (parent == null) {
                return;
            }
            WindowInsets windowInsets = this.f34007n;
            if (windowInsets == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.D;
            }
            WindowInsets windowInsets2 = this.f34007n;
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
        t1 t1Var;
        float f9 = 1.0f;
        if (!((getMeasuredWidth() <= 0 || getVisibility() != 0) ? false : false)) {
            if (this.I != z10) {
                this.I = z10;
                this.J = z10;
                if (!z10) {
                    f9 = 0.0f;
                }
                this.F = f9;
                requestLayout();
                invalidateOutline();
            }
        } else if (this.K) {
            this.J = z10;
        } else if (z10 && !this.I) {
            this.I = true;
            this.J = z10;
            f();
            float f10 = this.f34012y;
            if (f10 >= 0.0f) {
                t1Var = this;
                t1Var.e(f10, this.A, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
            } else {
                t1Var = this;
            }
            t1Var.I = false;
            t1Var.K = true;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            setTranslationX(0.0f);
            setTranslationY(0.0f);
            invalidate();
            ValueAnimator valueAnimator = t1Var.W;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(t1Var.F, 1.0f);
            t1Var.W = ofFloat;
            ofFloat.addUpdateListener(t1Var.f33997a0);
            t1Var.W.setDuration(300L);
            t1Var.W.start();
            animate().setListener(null).cancel();
            ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
            jr jrVar = jr.f29800f;
            duration.setInterpolator(jrVar).setListener(new q1(this, translationX, translationY, 0)).setInterpolator(jrVar).start();
        } else if (!z10 && this.I) {
            this.J = z10;
            float translationX2 = getTranslationX();
            float translationY2 = getTranslationY();
            f();
            this.I = false;
            this.K = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new r1(this, translationX2, translationY2));
        } else {
            if (!this.I) {
                f9 = 0.0f;
            }
            this.F = f9;
            this.I = z10;
            this.J = z10;
            requestLayout();
        }
    }

    public final void d(float f9, float f10) {
        ViewParent parent = getParent();
        if (this.I && parent != null && ((View) parent).getMeasuredWidth() <= 0 && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            e(f9, f10, getMeasuredWidth(), getMeasuredHeight(), true);
            return;
        }
        this.f34012y = f9;
        this.A = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        t1 t1Var;
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
        if (this.f34012y >= 0.0f && this.I && getMeasuredWidth() > 0) {
            t1Var = this;
            t1Var.e(this.f34012y, this.A, getMeasuredWidth(), getMeasuredHeight(), false);
            t1Var.f34012y = -1.0f;
            t1Var.A = -1.0f;
        } else {
            t1Var = this;
        }
        super.dispatchDraw(canvas);
        if (!t1Var.K) {
            boolean z10 = t1Var.I;
            boolean z11 = t1Var.J;
            if (z10 != z11) {
                c(z11, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((AndroidUtilities.dp(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f9 = measuredWidth;
        float f10 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * t1Var.F * t1Var.G, (1.0f / getScaleY()) * t1Var.F * t1Var.G, f9, f10);
        canvas.drawCircle(f9, f10, AndroidUtilities.dp(14.0f), t1Var.f34010w);
        Drawable drawable = t1Var.f34011x;
        drawable.setBounds(org.telegram.ui.b.v(2, measuredWidth, drawable), org.telegram.ui.b.f(2, measuredHeight, drawable), org.telegram.ui.b.A(2, measuredWidth, drawable), org.telegram.ui.b.y(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (t1Var.K) {
            invalidate();
        }
    }

    public final void e(float f9, float f10, int i10, int i11, boolean z10) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        long j10;
        ViewParent parent = getParent();
        if (parent != null && this.I && !this.K && this.N) {
            float f11 = 0.0f;
            if (this.f34007n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.D;
            }
            if (this.f34007n != null) {
                f11 = windowInsets2.getSystemWindowInsetBottom() + this.E;
            }
            View view = (View) parent;
            float z11 = com.google.android.recaptcha.internal.a.z((view.getMeasuredWidth() - this.B) - this.C, i10, f9, this.B);
            float z12 = com.google.android.recaptcha.internal.a.z((view.getMeasuredHeight() - f11) - systemWindowInsetTop, i11, f10, systemWindowInsetTop);
            if (z10) {
                animate().setListener(null).cancel();
                ViewPropertyAnimator alpha = animate().scaleX(1.0f).scaleY(1.0f).translationX(z11).translationY(z12).alpha(1.0f);
                if (this.H) {
                    j10 = 0;
                } else {
                    j10 = 150;
                }
                alpha.setStartDelay(j10).setDuration(150L).setInterpolator(jr.f29800f).start();
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
        float f9 = 16.0f;
        this.B = AndroidUtilities.dp(16.0f);
        this.C = AndroidUtilities.dp(16.0f);
        if (this.H) {
            dp = AndroidUtilities.dp(60.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        this.D = dp;
        if (this.H) {
            f9 = 100.0f;
        }
        this.E = AndroidUtilities.dp(f9) + this.P;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.L = false;
        if (this.I) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.L = true;
        } else if (!this.U) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        s1 s1Var = this.f34004e0;
        if (s1Var != null) {
            ((wg1) s1Var).f44308b.Z.d(this.F, this.L);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (getMeasuredHeight() != this.f34005f && getMeasuredWidth() != this.h) {
            Path path = this.f34009s;
            path.reset();
            RectF rectF = this.v;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.f34005f = getMeasuredHeight();
        this.h = getMeasuredWidth();
        f();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCornerRadius(float f9) {
        this.M = f9;
        invalidateOutline();
    }

    public void setDelegate(s1 s1Var) {
        this.f34004e0 = s1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.f34007n = windowInsets;
    }

    public void setIsActive(boolean z10) {
        this.N = z10;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.f34002d0 = onClickListener;
    }

    public void setRelativePosition(t1 t1Var) {
        float systemWindowInsetTop;
        float systemWindowInsetBottom;
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        WindowInsets windowInsets = this.f34007n;
        if (windowInsets == null) {
            systemWindowInsetTop = 0.0f;
        } else {
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.D;
        }
        WindowInsets windowInsets2 = this.f34007n;
        if (windowInsets2 == null) {
            systemWindowInsetBottom = 0.0f;
        } else {
            systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.E;
        }
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (t1Var.getTranslationX() - this.B) / (((view.getMeasuredWidth() - this.B) - this.C) - t1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (t1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - t1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z10) {
        if (getParent() == null) {
            this.H = z10;
        } else {
            this.H = z10;
        }
    }
}
