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
import bi.w5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.es;
import org.telegram.ui.ki1;
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
    public float f30118a;
    public float f30119a0;
    public float f30120b;
    public boolean f30121b0;
    public float f30122c;
    public boolean f30123c0;
    public float d;
    public ValueAnimator f30124d0;
    public boolean e;
    public final w5 f30125e0;
    public int f30126f;
    public ValueAnimator f30127f0;
    public final ki.a f30128g0;
    public int h;
    public View.OnClickListener f30129h0;
    public r1 f30130i0;
    public long f30131j0;
    public WindowInsets f30132n;
    public final float f30133r;
    public final Path f30134s;
    public final RectF v;
    public final Paint f30135w;
    public final Drawable f30136x;
    public float f30137y;

    public s1(Activity activity) {
        super(activity);
        this.f30134s = new Path();
        this.v = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.f30135w = paint;
        this.f30137y = -1.0f;
        this.E = -1.0f;
        this.J = 0.0f;
        this.K = 0.0f;
        this.Q = -1.0f;
        this.R = true;
        this.f30125e0 = new w5(this, 10);
        this.f30128g0 = new ki.a(this, 4);
        this.f30133r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new dh.b(this, 4));
        setClipToOutline(true);
        paint.setColor(i0.a.k(-16777216, 102));
        this.f30136x = activity.getDrawable(R.drawable.calls_mute_mini);
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
        if (getMeasuredWidth() > 0 && this.f30137y < 0.0f) {
            ViewParent parent = getParent();
            if (parent == null) {
                return;
            }
            if (this.f30132n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.H;
            }
            if (this.f30132n == null) {
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
            float f10 = this.f30137y;
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
            ValueAnimator valueAnimator = s1Var.f30124d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.J, 1.0f);
            s1Var.f30124d0 = ofFloat;
            ofFloat.addUpdateListener(s1Var.f30125e0);
            s1Var.f30124d0.setDuration(300L);
            s1Var.f30124d0.start();
            animate().setListener(null).cancel();
            ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
            es esVar = es.f24465f;
            duration.setInterpolator(esVar).setListener(new ne.c(this, translationX, translationY, 1)).setInterpolator(esVar).start();
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
        this.f30137y = f7;
        this.E = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s1 s1Var;
        if (this.W >= 0.0f) {
            if (!this.f30123c0) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.W);
            setTranslationY(this.f30119a0);
            if (!this.f30123c0) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.W = -1.0f;
            this.f30119a0 = -1.0f;
        }
        if (this.f30137y >= 0.0f && this.M && getMeasuredWidth() > 0) {
            s1Var = this;
            s1Var.e(this.f30137y, this.E, getMeasuredWidth(), getMeasuredHeight(), false);
            s1Var.f30137y = -1.0f;
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
        canvas.drawCircle(f7, f10, AndroidUtilities.dp(14.0f), s1Var.f30135w);
        Drawable drawable = s1Var.f30136x;
        drawable.setBounds(org.telegram.ui.Cells.c1.r(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.c(2, measuredHeight, drawable), org.telegram.ui.Cells.c1.v(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.u(2, measuredHeight, drawable));
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
        long j10;
        ViewParent parent = getParent();
        if (parent != null && this.M && !this.O && this.R) {
            float f11 = 0.0f;
            if (this.f30132n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.H;
            }
            if (this.f30132n != null) {
                f11 = windowInsets2.getSystemWindowInsetBottom() + this.I;
            }
            View view = (View) parent;
            float y3 = com.google.android.gms.internal.play_billing.k3.y((view.getMeasuredWidth() - this.F) - this.G, i10, f7, this.F);
            float y10 = com.google.android.gms.internal.play_billing.k3.y((view.getMeasuredHeight() - f11) - systemWindowInsetTop, i11, f10, systemWindowInsetTop);
            if (z10) {
                animate().setListener(null).cancel();
                ViewPropertyAnimator alpha = animate().scaleX(1.0f).scaleY(1.0f).translationX(y3).translationY(y10).alpha(1.0f);
                if (this.L) {
                    j10 = 0;
                } else {
                    j10 = 150;
                }
                alpha.setStartDelay(j10).setDuration(150L).setInterpolator(es.f24465f).start();
                return;
            }
            if (!this.S) {
                animate().setListener(null).cancel();
                setScaleX(1.0f);
                setScaleY(1.0f);
                animate().alpha(1.0f).setDuration(150L).start();
            }
            setTranslationX(y3);
            setTranslationY(y10);
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
        } else if (!this.f30121b0) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        r1 r1Var = this.f30130i0;
        if (r1Var != null) {
            ((ki1) r1Var).f37441b.f34685d0.d(this.J, this.P);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (getMeasuredHeight() != this.f30126f && getMeasuredWidth() != this.h) {
            Path path = this.f30134s;
            path.reset();
            RectF rectF = this.v;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.f30126f = getMeasuredHeight();
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
        this.f30130i0 = r1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.f30132n = windowInsets;
    }

    public void setIsActive(boolean z10) {
        this.R = z10;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.f30129h0 = onClickListener;
    }

    public void setRelativePosition(s1 s1Var) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        float systemWindowInsetBottom;
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        if (this.f30132n == null) {
            systemWindowInsetTop = 0.0f;
        } else {
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.H;
        }
        if (this.f30132n == null) {
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
