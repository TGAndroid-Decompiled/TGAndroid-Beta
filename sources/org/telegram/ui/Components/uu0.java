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
public final class uu0 extends ch0 implements org.telegram.ui.ActionBar.c6 {
    public float D;
    public float E;
    public ValueAnimator F;
    public ValueAnimator G;
    public final zu0 H;
    public int f38746r;
    public float f38747s;
    public ValueAnimator f38748w;
    public boolean f38749x;
    public long f38750y;

    public uu0(zu0 zu0Var, Context context) {
        super(context);
        int w02;
        org.telegram.ui.ActionBar.h6 h6Var = zu0Var.f36980n2;
        this.H = zu0Var;
        this.f38749x = false;
        this.D = 1.0f;
        if (zu0Var.D3) {
            w02 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Kl, h6Var), (int) 102.0f);
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, h6Var);
        }
        k(w02);
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override
    public final void c() {
        this.f38749x = true;
        if (this.D < 1.0f) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new ru0(this, 2));
            this.G.addListener(new tu0(this, 0));
            this.G.setDuration(320L);
            this.G.setInterpolator(wq.h);
            this.G.start();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.E;
            if (f10 != 1.0f) {
                this.E = Utilities.i(((1000.0f / org.telegram.messenger.g0.f22568r) / 100.0f) + f10, 1.0f, 0.0f);
                invalidate();
                this.H.invalidate();
            }
        }
        float z9 = com.google.android.recaptcha.internal.a.z(1.0f, this.E, 0.15f, 0.85f) * this.D;
        int i7 = (z9 > 1.0f ? 1 : (z9 == 1.0f ? 0 : -1));
        if (i7 != 0) {
            canvas.save();
            canvas.scale(z9, z9, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.draw(canvas);
        if (i7 != 0) {
            canvas.restore();
        }
    }

    public final void j() {
        if (System.currentTimeMillis() - this.f38750y > 250) {
            this.f38750y = System.currentTimeMillis();
            zg0 animatedDrawable = getAnimatedDrawable();
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

    public final void k(int i7) {
        if (this.f38746r != i7) {
            this.f38746r = i7;
            setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z9, boolean z10) {
        if (Math.abs(this.f38747s - (z9 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.f38748w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f38748w = null;
            }
            float f10 = 0.0f;
            if (z10) {
                float f11 = this.f38747s;
                if (z9) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f38748w = ofFloat;
                ofFloat.addUpdateListener(new ru0(this, 1));
                this.f38748w.addListener(new tu0(this, 1));
                this.f38748w.setDuration(350L);
                this.f38748w.setInterpolator(wq.h);
                this.f38748w.start();
                return;
            }
            if (z9) {
                f10 = 1.0f;
            }
            m(f10);
        }
    }

    public final void m(float f10) {
        this.f38747s = f10;
        zu0 zu0Var = this.H;
        org.telegram.ui.ActionBar.h6 h6Var = zu0Var.f36980n2;
        if (zu0Var.D3) {
            k(i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Kl, h6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, f10) * 255.0f)));
        } else {
            k(i0.a.f(this.f38747s, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Df, h6Var)));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(org.telegram.messenger.camera.q.c(4.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final void setPressed(boolean z9) {
        ValueAnimator valueAnimator;
        if (isPressed() != z9) {
            super.setPressed(z9);
            invalidate();
            this.H.invalidate();
            if (z9 && (valueAnimator = this.F) != null) {
                valueAnimator.removeAllListeners();
                this.F.cancel();
            }
            if (!z9) {
                float f10 = this.E;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.F = ofFloat;
                    ofFloat.addUpdateListener(new ru0(this, 0));
                    this.F.addListener(new tu0(this, 2));
                    org.telegram.messenger.camera.q.i(3.0f, this.F);
                    this.F.setDuration(350L);
                    this.F.start();
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f38748w == null) {
                m(this.f38747s);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
