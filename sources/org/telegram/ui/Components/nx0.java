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
public final class nx0 extends nj0 {
    public float E;
    public ValueAnimator F;
    public ValueAnimator G;
    public final sx0 H;
    public int f29166r;
    public float f29167s;
    public ValueAnimator v;
    public boolean f29168w;
    public long f29169x;
    public float f29170y;

    public nx0(sx0 sx0Var, Context context) {
        super(context);
        int v02;
        org.telegram.ui.ActionBar.d6 d6Var = sx0Var.f33560p2;
        this.H = sx0Var;
        this.f29168w = false;
        this.f29170y = 1.0f;
        if (sx0Var.D3) {
            v02 = i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Wk, d6Var), (int) 102.0f);
        } else {
            v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Me, d6Var);
        }
        k(v02);
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override
    public final void c() {
        this.f29168w = true;
        if (this.f29170y < 1.0f) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29170y, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new kx0(this, 2));
            this.G.addListener(new mx0(this, 0));
            this.G.setDuration(320L);
            this.G.setInterpolator(tr.h);
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
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.E, 0.15f, 0.85f) * this.f29170y;
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
        if (System.currentTimeMillis() - this.f29169x > 250) {
            this.f29169x = System.currentTimeMillis();
            kj0 animatedDrawable = getAnimatedDrawable();
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
        if (this.f29166r != i10) {
            this.f29166r = i10;
            setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z10, boolean z11) {
        if (Math.abs(this.f29167s - (z10 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            float f7 = 0.0f;
            if (z11) {
                float f10 = this.f29167s;
                if (z10) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new kx0(this, 1));
                this.v.addListener(new mx0(this, 1));
                this.v.setDuration(350L);
                this.v.setInterpolator(tr.h);
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
        this.f29167s = f7;
        sx0 sx0Var = this.H;
        org.telegram.ui.ActionBar.d6 d6Var = sx0Var.f33560p2;
        if (sx0Var.D3) {
            k(i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Wk, d6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, f7) * 255.0f)));
        } else {
            k(i0.a.d(this.f29167s, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Me, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oe, d6Var)));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(org.telegram.messenger.bi.c(4.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
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
                    ofFloat.addUpdateListener(new kx0(this, 0));
                    this.F.addListener(new mx0(this, 2));
                    this.F.setInterpolator(new OvershootInterpolator(3.0f));
                    this.F.setDuration(350L);
                    this.F.start();
                }
            }
        }
    }
}
