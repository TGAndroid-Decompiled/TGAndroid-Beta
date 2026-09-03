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
public final class sw0 extends kj0 {
    public float B;
    public ValueAnimator C;
    public ValueAnimator D;
    public final xw0 E;
    public int f31191r;
    public float f31192s;
    public ValueAnimator v;
    public boolean f31193w;
    public long f31194x;
    public float f31195y;

    public sw0(xw0 xw0Var, Context context) {
        super(context);
        int v02;
        org.telegram.ui.ActionBar.g6 g6Var = xw0Var.f31106m2;
        this.E = xw0Var;
        this.f31193w = false;
        this.f31195y = 1.0f;
        if (xw0Var.f33210t3) {
            v02 = i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Wk, g6Var), (int) 102.0f);
        } else {
            v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Me, g6Var);
        }
        k(v02);
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override
    public final void c() {
        this.f31193w = true;
        if (this.f31195y < 1.0f) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.D = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31195y, 1.0f);
            this.D = ofFloat;
            ofFloat.addUpdateListener(new pw0(this, 2));
            this.D.addListener(new rw0(this, 0));
            this.D.setDuration(320L);
            this.D.setInterpolator(pr.h);
            this.D.start();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.B;
            if (f10 != 1.0f) {
                this.B = Utilities.clamp(((1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f10, 1.0f, 0.0f);
                invalidate();
                this.E.invalidate();
            }
        }
        float w10 = e2.c.w(1.0f, this.B, 0.15f, 0.85f) * this.f31195y;
        int i10 = (w10 > 1.0f ? 1 : (w10 == 1.0f ? 0 : -1));
        if (i10 != 0) {
            canvas.save();
            canvas.scale(w10, w10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.draw(canvas);
        if (i10 != 0) {
            canvas.restore();
        }
    }

    public final void j() {
        if (System.currentTimeMillis() - this.f31194x > 250) {
            this.f31194x = System.currentTimeMillis();
            hj0 animatedDrawable = getAnimatedDrawable();
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
        if (this.f31191r != i10) {
            this.f31191r = i10;
            setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z4, boolean z10) {
        if (Math.abs(this.f31192s - (z4 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            float f10 = 0.0f;
            if (z10) {
                float f11 = this.f31192s;
                if (z4) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new pw0(this, 1));
                this.v.addListener(new rw0(this, 1));
                this.v.setDuration(350L);
                this.v.setInterpolator(pr.h);
                this.v.start();
                return;
            }
            if (z4) {
                f10 = 1.0f;
            }
            m(f10);
        }
    }

    public final void m(float f10) {
        this.f31192s = f10;
        xw0 xw0Var = this.E;
        org.telegram.ui.ActionBar.g6 g6Var = xw0Var.f31106m2;
        if (xw0Var.f33210t3) {
            k(i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Wk, g6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, f10) * 255.0f)));
        } else {
            k(i0.a.d(this.f31192s, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Me, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oe, g6Var)));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(org.telegram.ui.b.d(4.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final void setPressed(boolean z4) {
        ValueAnimator valueAnimator;
        if (isPressed() != z4) {
            super.setPressed(z4);
            invalidate();
            this.E.invalidate();
            if (z4 && (valueAnimator = this.C) != null) {
                valueAnimator.removeAllListeners();
                this.C.cancel();
            }
            if (!z4) {
                float f10 = this.B;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.C = ofFloat;
                    ofFloat.addUpdateListener(new pw0(this, 0));
                    this.C.addListener(new rw0(this, 2));
                    this.C.setInterpolator(new OvershootInterpolator(3.0f));
                    this.C.setDuration(350L);
                    this.C.start();
                }
            }
        }
    }
}
