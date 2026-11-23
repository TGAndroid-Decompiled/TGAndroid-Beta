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
public final class fv0 extends qh0 implements org.telegram.ui.ActionBar.c6 {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public final kv0 I;
    public int f35204r;
    public float f35205s;
    public ValueAnimator f35206w;
    public boolean f35207x;
    public long f35208y;

    public fv0(kv0 kv0Var, Context context) {
        super(context);
        int w02;
        org.telegram.ui.ActionBar.i6 i6Var = kv0Var.f34767o2;
        this.I = kv0Var;
        this.f35207x = false;
        this.E = 1.0f;
        if (kv0Var.E3) {
            w02 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nl, i6Var), (int) 102.0f);
        } else {
            w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ef, i6Var);
        }
        k(w02);
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override
    public final void c() {
        this.f35207x = true;
        if (this.E < 1.0f) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new cv0(this, 2));
            this.H.addListener(new ev0(this, 0));
            this.H.setDuration(320L);
            this.H.setInterpolator(kr.h);
            this.H.start();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.F;
            if (f10 != 1.0f) {
                this.F = Utilities.i(((1000.0f / org.telegram.messenger.g0.f24227r) / 100.0f) + f10, 1.0f, 0.0f);
                invalidate();
                this.I.invalidate();
            }
        }
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.F, 0.15f, 0.85f) * this.E;
        int i7 = (z10 > 1.0f ? 1 : (z10 == 1.0f ? 0 : -1));
        if (i7 != 0) {
            canvas.save();
            canvas.scale(z10, z10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.draw(canvas);
        if (i7 != 0) {
            canvas.restore();
        }
    }

    public final void j() {
        if (System.currentTimeMillis() - this.f35208y > 250) {
            this.f35208y = System.currentTimeMillis();
            nh0 animatedDrawable = getAnimatedDrawable();
            if (animatedDrawable == null && getImageReceiver() != null) {
                animatedDrawable = getImageReceiver().C();
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
        if (this.f35204r != i7) {
            this.f35204r = i7;
            setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z10, boolean z11) {
        if (Math.abs(this.f35205s - (z10 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.f35206w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f35206w = null;
            }
            float f10 = 0.0f;
            if (z11) {
                float f11 = this.f35205s;
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f35206w = ofFloat;
                ofFloat.addUpdateListener(new cv0(this, 1));
                this.f35206w.addListener(new ev0(this, 1));
                this.f35206w.setDuration(350L);
                this.f35206w.setInterpolator(kr.h);
                this.f35206w.start();
                return;
            }
            if (z10) {
                f10 = 1.0f;
            }
            m(f10);
        }
    }

    public final void m(float f10) {
        this.f35205s = f10;
        kv0 kv0Var = this.I;
        org.telegram.ui.ActionBar.i6 i6Var = kv0Var.f34767o2;
        if (kv0Var.E3) {
            k(i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nl, i6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, f10) * 255.0f)));
        } else {
            k(i0.a.f(this.f35205s, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ef, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Gf, i6Var)));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(org.telegram.messenger.m10.c(4.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
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
                    ofFloat.addUpdateListener(new cv0(this, 0));
                    this.G.addListener(new ev0(this, 2));
                    org.telegram.ui.Cells.c0.q(3.0f, this.G);
                    this.G.setDuration(350L);
                    this.G.start();
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f35206w == null) {
                m(this.f35205s);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
