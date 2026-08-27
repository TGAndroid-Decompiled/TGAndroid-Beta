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

public final class bw0 extends ri0 {
    public float A;
    public ValueAnimator B;
    public ValueAnimator C;
    public final gw0 D;

    public int f27216r;

    public float f27217s;
    public ValueAnimator v;

    public boolean f27218w;

    public long f27219x;

    public float f27220y;

    public bw0(gw0 gw0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var = gw0Var.f35277l2;
        this.D = gw0Var;
        this.f27218w = false;
        this.f27220y = 1.0f;
        k(gw0Var.f28854s3 ? i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) 102.0f) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var));
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override
    public final void c() {
        this.f27218w = true;
        if (this.f27220y < 1.0f) {
            ValueAnimator valueAnimator = this.C;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.C = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f27220y, 1.0f);
            this.C = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new yv0(this, 2));
            this.C.addListener(new aw0(this, 0));
            this.C.setDuration(320L);
            this.C.setInterpolator(er.h);
            this.C.start();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.A;
            if (f10 != 1.0f) {
                this.A = Utilities.clamp(((1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f10, 1.0f, 0.0f);
                invalidate();
                this.D.invalidate();
            }
        }
        float fZ = com.google.android.recaptcha.internal.a.z(1.0f, this.A, 0.15f, 0.85f) * this.f27220y;
        if (fZ != 1.0f) {
            canvas.save();
            canvas.scale(fZ, fZ, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.draw(canvas);
        if (fZ != 1.0f) {
            canvas.restore();
        }
    }

    public final void j() {
        if (System.currentTimeMillis() - this.f27219x <= 250) {
            return;
        }
        this.f27219x = System.currentTimeMillis();
        oi0 animatedDrawable = getAnimatedDrawable();
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

    public final void k(int i10) {
        if (this.f27216r != i10) {
            this.f27216r = i10;
            setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z10, boolean z11) {
        if (Math.abs(this.f27217s - (z10 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            if (!z11) {
                m(z10 ? 1.0f : 0.0f);
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f27217s, z10 ? 1.0f : 0.0f);
            this.v = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new yv0(this, 1));
            this.v.addListener(new aw0(this, 1));
            this.v.setDuration(350L);
            this.v.setInterpolator(er.h);
            this.v.start();
        }
    }

    public final void m(float f10) {
        this.f27217s = f10;
        gw0 gw0Var = this.D;
        org.telegram.ui.ActionBar.c6 c6Var = gw0Var.f35277l2;
        if (gw0Var.f28854s3) {
            k(i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, f10) * 255.0f)));
        } else {
            k(i0.b.d(this.f27217s, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oe, c6Var)));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(org.telegram.messenger.rl.d(4.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
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
            if (z10) {
                return;
            }
            float f10 = this.A;
            if (f10 != 0.0f) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.B = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new yv0(this, 0));
                this.B.addListener(new aw0(this, 2));
                this.B.setInterpolator(new OvershootInterpolator(3.0f));
                this.B.setDuration(350L);
                this.B.start();
            }
        }
    }
}
