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
public final class vu0 extends dh0 implements org.telegram.ui.ActionBar.b6 {
    public float D;
    public float E;
    public ValueAnimator F;
    public ValueAnimator G;
    public final av0 H;
    public int f39805r;
    public float f39806s;
    public ValueAnimator f39807w;
    public boolean f39808x;
    public long f39809y;

    public vu0(av0 av0Var, Context context) {
        super(context);
        int w02;
        org.telegram.ui.ActionBar.g6 g6Var = av0Var.f37381n2;
        this.H = av0Var;
        this.f39808x = false;
        this.D = 1.0f;
        if (av0Var.D3) {
            w02 = i0.a.o(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Kl, g6Var), (int) 102.0f);
        } else {
            w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Bf, g6Var);
        }
        k(w02);
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override
    public final void c() {
        this.f39808x = true;
        if (this.D < 1.0f) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new su0(this, 2));
            this.G.addListener(new uu0(this, 0));
            this.G.setDuration(320L);
            this.G.setInterpolator(xq.h);
            this.G.start();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.E;
            if (f10 != 1.0f) {
                this.E = Utilities.i(((1000.0f / org.telegram.messenger.g0.f22564r) / 100.0f) + f10, 1.0f, 0.0f);
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
        if (System.currentTimeMillis() - this.f39809y > 250) {
            this.f39809y = System.currentTimeMillis();
            ah0 animatedDrawable = getAnimatedDrawable();
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
        if (this.f39805r != i7) {
            this.f39805r = i7;
            setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z9, boolean z10) {
        if (Math.abs(this.f39806s - (z9 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.f39807w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f39807w = null;
            }
            float f10 = 0.0f;
            if (z10) {
                float f11 = this.f39806s;
                if (z9) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f39807w = ofFloat;
                ofFloat.addUpdateListener(new su0(this, 1));
                this.f39807w.addListener(new uu0(this, 1));
                this.f39807w.setDuration(350L);
                this.f39807w.setInterpolator(xq.h);
                this.f39807w.start();
                return;
            }
            if (z9) {
                f10 = 1.0f;
            }
            m(f10);
        }
    }

    public final void m(float f10) {
        this.f39806s = f10;
        av0 av0Var = this.H;
        org.telegram.ui.ActionBar.g6 g6Var = av0Var.f37381n2;
        if (av0Var.D3) {
            k(i0.a.o(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Kl, g6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, f10) * 255.0f)));
        } else {
            k(i0.a.f(this.f39806s, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Bf, g6Var), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Df, g6Var)));
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
                    ofFloat.addUpdateListener(new su0(this, 0));
                    this.F.addListener(new uu0(this, 2));
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
            if (this.f39807w == null) {
                m(this.f39806s);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
