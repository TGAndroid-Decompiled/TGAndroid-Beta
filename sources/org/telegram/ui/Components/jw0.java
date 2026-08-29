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
public final class jw0 extends aj0 {
    public float A;
    public ValueAnimator B;
    public ValueAnimator C;
    public final ow0 D;
    public int f29835r;
    public float f29836s;
    public ValueAnimator v;
    public boolean f29837w;
    public long f29838x;
    public float f29839y;

    public jw0(ow0 ow0Var, Context context) {
        super(context);
        int v02;
        org.telegram.ui.ActionBar.c6 c6Var = ow0Var.f29709l2;
        this.D = ow0Var;
        this.f29837w = false;
        this.f29839y = 1.0f;
        if (ow0Var.f31507s3) {
            v02 = i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) 102.0f);
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var);
        }
        k(v02);
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override
    public final void c() {
        this.f29837w = true;
        if (this.f29839y < 1.0f) {
            ValueAnimator valueAnimator = this.C;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.C = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29839y, 1.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new gw0(this, 2));
            this.C.addListener(new iw0(this, 0));
            this.C.setDuration(320L);
            this.C.setInterpolator(jr.h);
            this.C.start();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f9 = this.A;
            if (f9 != 1.0f) {
                this.A = Utilities.clamp(((1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f9, 1.0f, 0.0f);
                invalidate();
                this.D.invalidate();
            }
        }
        float z10 = com.google.android.recaptcha.internal.a.z(1.0f, this.A, 0.15f, 0.85f) * this.f29839y;
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
        if (System.currentTimeMillis() - this.f29838x > 250) {
            this.f29838x = System.currentTimeMillis();
            xi0 animatedDrawable = getAnimatedDrawable();
            if (animatedDrawable == null && getImageReceiver() != null) {
                animatedDrawable = getImageReceiver().getLottieAnimation();
            }
            if (animatedDrawable != null) {
                animatedDrawable.stop();
                animatedDrawable.K(0);
                animatedDrawable.F(true);
            } else if (animatedDrawable == null) {
                setProgress(0.0f);
                d();
            }
        }
    }

    public final void k(int i10) {
        if (this.f29835r != i10) {
            this.f29835r = i10;
            setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z10, boolean z11) {
        if (Math.abs(this.f29836s - (z10 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            float f9 = 0.0f;
            if (z11) {
                float f10 = this.f29836s;
                if (z10) {
                    f9 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new gw0(this, 1));
                this.v.addListener(new iw0(this, 1));
                this.v.setDuration(350L);
                this.v.setInterpolator(jr.h);
                this.v.start();
                return;
            }
            if (z10) {
                f9 = 1.0f;
            }
            m(f9);
        }
    }

    public final void m(float f9) {
        this.f29836s = f9;
        ow0 ow0Var = this.D;
        org.telegram.ui.ActionBar.c6 c6Var = ow0Var.f29709l2;
        if (ow0Var.f31507s3) {
            k(i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, f9) * 255.0f)));
        } else {
            k(i0.a.d(this.f29836s, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oe, c6Var)));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(org.telegram.ui.b.d(4.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            this.D.invalidate();
            if (z10 && (valueAnimator = this.B) != null) {
                valueAnimator.removeAllListeners();
                this.B.cancel();
            }
            if (!z10) {
                float f9 = this.A;
                if (f9 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 0.0f);
                    this.B = ofFloat;
                    ofFloat.addUpdateListener(new gw0(this, 0));
                    this.B.addListener(new iw0(this, 2));
                    this.B.setInterpolator(new OvershootInterpolator(3.0f));
                    this.B.setDuration(350L);
                    this.B.start();
                }
            }
        }
    }
}
