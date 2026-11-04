package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
public final class su0 extends fh0 implements org.telegram.ui.ActionBar.z5 {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public final xu0 I;
    public int f38119r;
    public float f38120s;
    public ValueAnimator f38121w;
    public boolean f38122x;
    public long f38123y;

    public su0(xu0 xu0Var, Context context) {
        super(context);
        int w02;
        org.telegram.ui.ActionBar.e6 e6Var = xu0Var.f38460o2;
        this.I = xu0Var;
        this.f38122x = false;
        this.E = 1.0f;
        if (xu0Var.E3) {
            w02 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, e6Var), (int) 102.0f);
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, e6Var);
        }
        k(w02);
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override
    public final void c() {
        this.f38122x = true;
        if (this.E < 1.0f) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new pu0(this, 2));
            this.H.addListener(new ru0(this, 0));
            this.H.setDuration(320L);
            this.H.setInterpolator(xq.h);
            this.H.start();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.F;
            if (f10 != 1.0f) {
                this.F = Utilities.i(((1000.0f / org.telegram.messenger.g0.f22609r) / 100.0f) + f10, 1.0f, 0.0f);
                invalidate();
                this.I.invalidate();
            }
        }
        float y9 = com.google.android.recaptcha.internal.a.y(1.0f, this.F, 0.15f, 0.85f) * this.E;
        int i3 = (y9 > 1.0f ? 1 : (y9 == 1.0f ? 0 : -1));
        if (i3 != 0) {
            canvas.save();
            canvas.scale(y9, y9, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.draw(canvas);
        if (i3 != 0) {
            canvas.restore();
        }
    }

    public final void j() {
        if (System.currentTimeMillis() - this.f38123y > 250) {
            this.f38123y = System.currentTimeMillis();
            ch0 animatedDrawable = getAnimatedDrawable();
            if (animatedDrawable == null && getImageReceiver() != null) {
                animatedDrawable = getImageReceiver().B();
            }
            if (animatedDrawable != null) {
                animatedDrawable.stop();
                animatedDrawable.M(0);
                animatedDrawable.H(true);
            } else if (animatedDrawable == null) {
                setProgress(0.0f);
                d();
            }
        }
    }

    public final void k(int i3) {
        if (this.f38119r != i3) {
            this.f38119r = i3;
            setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z10, boolean z11) {
        if (Math.abs(this.f38120s - (z10 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.f38121w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f38121w = null;
            }
            float f10 = 0.0f;
            if (z11) {
                float f11 = this.f38120s;
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f38121w = ofFloat;
                ofFloat.addUpdateListener(new pu0(this, 1));
                this.f38121w.addListener(new ru0(this, 1));
                this.f38121w.setDuration(350L);
                this.f38121w.setInterpolator(xq.h);
                this.f38121w.start();
                return;
            }
            if (z10) {
                f10 = 1.0f;
            }
            m(f10);
        }
    }

    public final void m(float f10) {
        this.f38120s = f10;
        xu0 xu0Var = this.I;
        org.telegram.ui.ActionBar.e6 e6Var = xu0Var.f38460o2;
        if (xu0Var.E3) {
            k(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, e6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, f10) * 255.0f)));
        } else {
            k(i0.a.f(this.f38120s, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Df, e6Var)));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(org.telegram.messenger.camera.q.c(4.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            this.I.invalidate();
            if (z10 && (valueAnimator = this.G) != null) {
                valueAnimator.removeAllListeners();
                this.G.cancel();
            }
            if (!z10) {
                float f10 = this.F;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.G = ofFloat;
                    ofFloat.addUpdateListener(new pu0(this, 0));
                    this.G.addListener(new ru0(this, 2));
                    org.telegram.messenger.camera.q.i(3.0f, this.G);
                    this.G.setDuration(350L);
                    this.G.start();
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f38121w == null) {
                m(this.f38120s);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
