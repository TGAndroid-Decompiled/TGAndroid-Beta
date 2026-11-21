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
public final class gv0 extends rh0 implements org.telegram.ui.ActionBar.b6 {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public final lv0 I;
    public int f35664r;
    public float f35665s;
    public ValueAnimator f35666w;
    public boolean f35667x;
    public long f35668y;

    public gv0(lv0 lv0Var, Context context) {
        super(context);
        int w02;
        org.telegram.ui.ActionBar.h6 h6Var = lv0Var.f34875o2;
        this.I = lv0Var;
        this.f35667x = false;
        this.E = 1.0f;
        if (lv0Var.E3) {
            w02 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nl, h6Var), (int) 102.0f);
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ef, h6Var);
        }
        k(w02);
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override
    public final void c() {
        this.f35667x = true;
        if (this.E < 1.0f) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new dv0(this, 2));
            this.H.addListener(new fv0(this, 0));
            this.H.setDuration(320L);
            this.H.setInterpolator(nr.h);
            this.H.start();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.F;
            if (f10 != 1.0f) {
                this.F = Utilities.i(((1000.0f / org.telegram.messenger.g0.f24147r) / 100.0f) + f10, 1.0f, 0.0f);
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
        if (System.currentTimeMillis() - this.f35668y > 250) {
            this.f35668y = System.currentTimeMillis();
            oh0 animatedDrawable = getAnimatedDrawable();
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
        if (this.f35664r != i7) {
            this.f35664r = i7;
            setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z10, boolean z11) {
        if (Math.abs(this.f35665s - (z10 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.f35666w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f35666w = null;
            }
            float f10 = 0.0f;
            if (z11) {
                float f11 = this.f35665s;
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f35666w = ofFloat;
                ofFloat.addUpdateListener(new dv0(this, 1));
                this.f35666w.addListener(new fv0(this, 1));
                this.f35666w.setDuration(350L);
                this.f35666w.setInterpolator(nr.h);
                this.f35666w.start();
                return;
            }
            if (z10) {
                f10 = 1.0f;
            }
            m(f10);
        }
    }

    public final void m(float f10) {
        this.f35665s = f10;
        lv0 lv0Var = this.I;
        org.telegram.ui.ActionBar.h6 h6Var = lv0Var.f34875o2;
        if (lv0Var.E3) {
            k(i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nl, h6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, f10) * 255.0f)));
        } else {
            k(i0.a.f(this.f35665s, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ef, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gf, h6Var)));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(org.telegram.messenger.n10.c(4.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
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
                    ofFloat.addUpdateListener(new dv0(this, 0));
                    this.G.addListener(new fv0(this, 2));
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
            if (this.f35666w == null) {
                m(this.f35665s);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
