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
public final class xv0 extends fi0 implements org.telegram.ui.ActionBar.k6 {
    public float D;
    public float E;
    public ValueAnimator F;
    public ValueAnimator G;
    public final cw0 H;
    public int f32640r;
    public float f32641s;
    public ValueAnimator f32642w;
    public boolean f32643x;
    public long f32644y;

    public xv0(cw0 cw0Var, Context context) {
        super(context);
        int w02;
        org.telegram.ui.ActionBar.p6 p6Var = cw0Var.f31008n2;
        this.H = cw0Var;
        this.f32643x = false;
        this.D = 1.0f;
        if (cw0Var.D3) {
            w02 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var), (int) 102.0f);
        } else {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bf, p6Var);
        }
        k(w02);
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override
    public final void c() {
        this.f32643x = true;
        if (this.D < 1.0f) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new uv0(this, 2));
            this.G.addListener(new wv0(this, 0));
            this.G.setDuration(320L);
            this.G.setInterpolator(gr.h);
            this.G.start();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f7 = this.E;
            if (f7 != 1.0f) {
                this.E = Utilities.i(((1000.0f / org.telegram.messenger.i0.f16173r) / 100.0f) + f7, 1.0f, 0.0f);
                invalidate();
                this.H.invalidate();
            }
        }
        float z10 = c3.i0.z(1.0f, this.E, 0.15f, 0.85f) * this.D;
        int i10 = (z10 > 1.0f ? 1 : (z10 == 1.0f ? 0 : -1));
        if (i10 != 0) {
            canvas.save();
            canvas.scale(z10, z10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.draw(canvas);
        if (i10 != 0) {
            canvas.restore();
        }
    }

    public final void j() {
        if (System.currentTimeMillis() - this.f32644y > 250) {
            this.f32644y = System.currentTimeMillis();
            ci0 animatedDrawable = getAnimatedDrawable();
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

    public final void k(int i10) {
        if (this.f32640r != i10) {
            this.f32640r = i10;
            setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z10, boolean z11) {
        if (Math.abs(this.f32641s - (z10 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.f32642w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f32642w = null;
            }
            float f7 = 0.0f;
            if (z11) {
                float f10 = this.f32641s;
                if (z10) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f32642w = ofFloat;
                ofFloat.addUpdateListener(new uv0(this, 1));
                this.f32642w.addListener(new wv0(this, 1));
                this.f32642w.setDuration(350L);
                this.f32642w.setInterpolator(gr.h);
                this.f32642w.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            }
            m(f7);
        }
    }

    public final void m(float f7) {
        this.f32641s = f7;
        cw0 cw0Var = this.H;
        org.telegram.ui.ActionBar.p6 p6Var = cw0Var.f31008n2;
        if (cw0Var.D3) {
            k(i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var), (int) (org.telegram.messenger.i0.T1(0.4f, 0.8f, f7) * 255.0f)));
        } else {
            k(i0.b.f(this.f32641s, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bf, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Df, p6Var)));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(org.telegram.messenger.a30.c(4.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            this.H.invalidate();
            if (z10 && (valueAnimator = this.F) != null) {
                valueAnimator.removeAllListeners();
                this.F.cancel();
            }
            if (!z10) {
                float f7 = this.E;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.F = ofFloat;
                    ofFloat.addUpdateListener(new uv0(this, 0));
                    this.F.addListener(new wv0(this, 2));
                    org.telegram.messenger.a30.j(3.0f, this.F);
                    this.F.setDuration(350L);
                    this.F.start();
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f32642w == null) {
                m(this.f32641s);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
