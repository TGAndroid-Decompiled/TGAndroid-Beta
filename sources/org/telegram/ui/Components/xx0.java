package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class xx0 extends bk0 implements org.telegram.ui.ActionBar.p6 {
    public float E;
    public ValueAnimator F;
    public ValueAnimator G;
    public final cy0 H;
    public int f34870r;
    public float f34871s;
    public ValueAnimator v;
    public boolean f34872w;
    public long f34873x;
    public float f34874y;

    public xx0(cy0 cy0Var, Context context) {
        super(context);
        int w02;
        org.telegram.ui.ActionBar.u6 u6Var = cy0Var.f30988n2;
        this.H = cy0Var;
        this.f34872w = false;
        this.f34874y = 1.0f;
        if (cy0Var.E3) {
            w02 = i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wk, u6Var), (int) 102.0f);
        } else {
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Me, u6Var);
        }
        k(w02);
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override
    public final void c() {
        this.f34872w = true;
        if (this.f34874y < 1.0f) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f34874y, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new ux0(this, 2));
            this.G.addListener(new wx0(this, 0));
            this.G.setDuration(320L);
            this.G.setInterpolator(ds.h);
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
        float z10 = c3.h0.z(1.0f, this.E, 0.15f, 0.85f) * this.f34874y;
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
        if (System.currentTimeMillis() - this.f34873x > 250) {
            this.f34873x = System.currentTimeMillis();
            yj0 animatedDrawable = getAnimatedDrawable();
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
        if (this.f34870r != i10) {
            this.f34870r = i10;
            setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z10, boolean z11) {
        if (Math.abs(this.f34871s - (z10 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            float f7 = 0.0f;
            if (z11) {
                float f10 = this.f34871s;
                if (z10) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new ux0(this, 1));
                this.v.addListener(new wx0(this, 1));
                this.v.setDuration(350L);
                this.v.setInterpolator(ds.h);
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
        this.f34871s = f7;
        cy0 cy0Var = this.H;
        org.telegram.ui.ActionBar.u6 u6Var = cy0Var.f30988n2;
        if (cy0Var.E3) {
            k(i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wk, u6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, f7) * 255.0f)));
        } else {
            k(i0.a.f(this.f34871s, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Me, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oe, u6Var)));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(org.telegram.messenger.wh.x(4.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
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
                    ofFloat.addUpdateListener(new ux0(this, 0));
                    this.F.addListener(new wx0(this, 2));
                    org.telegram.ui.d3.m(3.0f, this.F);
                    this.F.setDuration(350L);
                    this.F.start();
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.v == null) {
                m(this.f34871s);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
