package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class cx0 extends kj0 {
    public float E;
    public ValueAnimator F;
    public ValueAnimator G;
    public final hx0 H;
    public int f22242r;
    public float f22243s;
    public ValueAnimator v;
    public boolean f22244w;
    public long f22245x;
    public float f22246y;

    public cx0(hx0 hx0Var, Context context) {
        super(context);
        int v02;
        org.telegram.ui.ActionBar.f6 f6Var = hx0Var.f27987p2;
        this.H = hx0Var;
        this.f22244w = false;
        this.f22246y = 1.0f;
        if (hx0Var.f23798w3) {
            v02 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) 102.0f);
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var);
        }
        k(v02);
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override
    public final void c() {
        this.f22244w = true;
        if (this.f22246y < 1.0f) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f22246y, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new zw0(this, 2));
            this.G.addListener(new bx0(this, 0));
            this.G.setDuration(320L);
            this.G.setInterpolator(wr.h);
            this.G.start();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f7 = this.E;
            if (f7 != 1.0f) {
                this.E = Utilities.clamp(((1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7, 1.0f, 0.0f);
                invalidate();
                this.H.invalidate();
            }
        }
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.E, 0.15f, 0.85f) * this.f22246y;
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
        if (System.currentTimeMillis() - this.f22245x > 250) {
            this.f22245x = System.currentTimeMillis();
            hj0 animatedDrawable = getAnimatedDrawable();
            if (animatedDrawable == null && getImageReceiver() != null) {
                animatedDrawable = getImageReceiver().getLottieAnimation();
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
        if (this.f22242r != i10) {
            this.f22242r = i10;
            setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z10, boolean z11) {
        if (Math.abs(this.f22243s - (z10 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            float f7 = 0.0f;
            if (z11) {
                float f10 = this.f22243s;
                if (z10) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new zw0(this, 1));
                this.v.addListener(new bx0(this, 1));
                this.v.setDuration(350L);
                this.v.setInterpolator(wr.h);
                this.v.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            }
            m(f7);
        }
    }

    public final void m(float f7) {
        this.f22243s = f7;
        hx0 hx0Var = this.H;
        org.telegram.ui.ActionBar.f6 f6Var = hx0Var.f27987p2;
        if (hx0Var.f23798w3) {
            k(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, f7) * 255.0f)));
        } else {
            k(i0.a.d(this.f22243s, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oe, f6Var)));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(org.telegram.messenger.em.d(4.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
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
                    ofFloat.addUpdateListener(new zw0(this, 0));
                    this.F.addListener(new bx0(this, 2));
                    this.F.setInterpolator(new OvershootInterpolator(3.0f));
                    this.F.setDuration(350L);
                    this.F.start();
                }
            }
        }
    }
}
