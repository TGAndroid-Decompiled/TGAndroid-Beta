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
import bi.u5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ci1;
public final class s1 extends FrameLayout {
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
    public float f31781a;
    public float f31782a0;
    public float f31783b;
    public boolean f31784b0;
    public float f31785c;
    public boolean f31786c0;
    public float d;
    public ValueAnimator f31787d0;
    public boolean f31788e;
    public final u5 f31789e0;
    public int f31790f;
    public ValueAnimator f31791f0;
    public final ki.a f31792g0;
    public int h;
    public View.OnClickListener f31793h0;
    public r1 f31794i0;
    public long f31795j0;
    public WindowInsets f31796n;
    public final float f31797r;
    public final Path f31798s;
    public final RectF v;
    public final Paint f31799w;
    public final Drawable f31800x;
    public float f31801y;

    public s1(Activity activity) {
        super(activity);
        this.f31798s = new Path();
        this.v = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.f31799w = paint;
        this.f31801y = -1.0f;
        this.E = -1.0f;
        this.J = 0.0f;
        this.K = 0.0f;
        this.Q = -1.0f;
        this.R = true;
        this.f31789e0 = new u5(this, 10);
        this.f31792g0 = new ki.a(this, 4);
        this.f31797r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new dh.b(this, 4));
        setClipToOutline(true);
        paint.setColor(i0.a.k(-16777216, 102));
        this.f31800x = activity.getDrawable(R.drawable.calls_mute_mini);
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
        float systemWindowInsetTop;
        float systemWindowInsetBottom;
        if (getMeasuredWidth() > 0 && this.f31801y < 0.0f) {
            ViewParent parent = getParent();
            if (parent == null) {
                return;
            }
            WindowInsets windowInsets = this.f31796n;
            if (windowInsets == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.H;
            }
            WindowInsets windowInsets2 = this.f31796n;
            if (windowInsets2 == null) {
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
        s1 s1Var;
        float f7 = 1.0f;
        if (!((getMeasuredWidth() <= 0 || getVisibility() != 0) ? false : false)) {
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
            float f10 = this.f31801y;
            if (f10 >= 0.0f) {
                s1Var = this;
                s1Var.e(f10, this.E, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
            } else {
                s1Var = this;
            }
            s1Var.M = false;
            s1Var.O = true;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            setTranslationX(0.0f);
            setTranslationY(0.0f);
            invalidate();
            ValueAnimator valueAnimator = s1Var.f31787d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.J, 1.0f);
            s1Var.f31787d0 = ofFloat;
            ofFloat.addUpdateListener(s1Var.f31789e0);
            s1Var.f31787d0.setDuration(300L);
            s1Var.f31787d0.start();
            animate().setListener(null).cancel();
            ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
            pr prVar = pr.f29466f;
            duration.setInterpolator(prVar).setListener(new le.c(this, translationX, translationY, 1)).setInterpolator(prVar).start();
        } else if (!z10 && this.M) {
            this.N = z10;
            float translationX2 = getTranslationX();
            float translationY2 = getTranslationY();
            f();
            this.M = false;
            this.O = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new q1(this, translationX2, translationY2));
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
        this.f31801y = f7;
        this.E = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s1 s1Var;
        if (this.W >= 0.0f) {
            if (!this.f31786c0) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.W);
            setTranslationY(this.f31782a0);
            if (!this.f31786c0) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.W = -1.0f;
            this.f31782a0 = -1.0f;
        }
        if (this.f31801y >= 0.0f && this.M && getMeasuredWidth() > 0) {
            s1Var = this;
            s1Var.e(this.f31801y, this.E, getMeasuredWidth(), getMeasuredHeight(), false);
            s1Var.f31801y = -1.0f;
            s1Var.E = -1.0f;
        } else {
            s1Var = this;
        }
        super.dispatchDraw(canvas);
        if (!s1Var.O) {
            boolean z10 = s1Var.M;
            boolean z11 = s1Var.N;
            if (z10 != z11) {
                c(z11, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((AndroidUtilities.dp(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f7 = measuredWidth;
        float f10 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * s1Var.J * s1Var.K, (1.0f / getScaleY()) * s1Var.J * s1Var.K, f7, f10);
        canvas.drawCircle(f7, f10, AndroidUtilities.dp(14.0f), s1Var.f31799w);
        Drawable drawable = s1Var.f31800x;
        drawable.setBounds(wl.w(2, measuredWidth, drawable), wl.e(2, measuredHeight, drawable), wl.B(2, measuredWidth, drawable), wl.z(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (s1Var.O) {
            invalidate();
        }
    }

    public final void e(float f7, float f10, int i10, int i11, boolean z10) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        long j3;
        ViewParent parent = getParent();
        if (parent != null && this.M && !this.O && this.R) {
            float f11 = 0.0f;
            if (this.f31796n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.H;
            }
            if (this.f31796n != null) {
                f11 = windowInsets2.getSystemWindowInsetBottom() + this.I;
            }
            View view = (View) parent;
            float z11 = com.google.android.gms.internal.vision.e2.z((view.getMeasuredWidth() - this.F) - this.G, i10, f7, this.F);
            float z12 = com.google.android.gms.internal.vision.e2.z((view.getMeasuredHeight() - f11) - systemWindowInsetTop, i11, f10, systemWindowInsetTop);
            if (z10) {
                animate().setListener(null).cancel();
                ViewPropertyAnimator alpha = animate().scaleX(1.0f).scaleY(1.0f).translationX(z11).translationY(z12).alpha(1.0f);
                if (this.L) {
                    j3 = 0;
                } else {
                    j3 = 150;
                }
                alpha.setStartDelay(j3).setDuration(150L).setInterpolator(pr.f29466f).start();
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
        int dp;
        float f7 = 16.0f;
        this.F = AndroidUtilities.dp(16.0f);
        this.G = AndroidUtilities.dp(16.0f);
        if (this.L) {
            dp = AndroidUtilities.dp(60.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        this.H = dp;
        if (this.L) {
            f7 = 100.0f;
        }
        this.I = AndroidUtilities.dp(f7) + this.T;
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
        } else if (!this.f31784b0) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        r1 r1Var = this.f31794i0;
        if (r1Var != null) {
            ((ci1) r1Var).f35124b.f41116d0.d(this.J, this.P);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (getMeasuredHeight() != this.f31790f && getMeasuredWidth() != this.h) {
            Path path = this.f31798s;
            path.reset();
            RectF rectF = this.v;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.f31790f = getMeasuredHeight();
        this.h = getMeasuredWidth();
        f();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.s1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCornerRadius(float f7) {
        this.Q = f7;
        invalidateOutline();
    }

    public void setDelegate(r1 r1Var) {
        this.f31794i0 = r1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.f31796n = windowInsets;
    }

    public void setIsActive(boolean z10) {
        this.R = z10;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.f31793h0 = onClickListener;
    }

    public void setRelativePosition(s1 s1Var) {
        float systemWindowInsetTop;
        float systemWindowInsetBottom;
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        WindowInsets windowInsets = this.f31796n;
        if (windowInsets == null) {
            systemWindowInsetTop = 0.0f;
        } else {
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.H;
        }
        WindowInsets windowInsets2 = this.f31796n;
        if (windowInsets2 == null) {
            systemWindowInsetBottom = 0.0f;
        } else {
            systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.I;
        }
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (s1Var.getTranslationX() - this.F) / (((view.getMeasuredWidth() - this.F) - this.G) - s1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (s1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - s1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z10) {
        if (getParent() == null) {
            this.L = z10;
        } else {
            this.L = z10;
        }
    }
}
