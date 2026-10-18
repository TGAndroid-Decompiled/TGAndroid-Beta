package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.yq;
public final class w5 extends yq {
    public final x5 f35036a;

    public w5(x5 x5Var, int i10) {
        super(i10, 0);
        this.f35036a = x5Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10;
        x5 x5Var = this.f35036a;
        v5 v5Var = x5Var.R;
        RectF rectF = x5Var.f35077f;
        if (!x5Var.f35087o0) {
            setAlpha(1.0f);
            if (x5Var.f35069a && (x5Var.G instanceof f6) && x5Var.H.getWidth() > 0) {
                f6 f6Var = (f6) x5Var.G;
                float intrinsicWidth = this.drawable.getIntrinsicWidth() * x5Var.f35071b;
                float f11 = x5Var.f35071b;
                float intrinsicHeight = this.drawable.getIntrinsicHeight() * f11;
                float f12 = f11 * f7;
                float height = (v5Var.getHeight() / 2.0f) - (intrinsicHeight / 2.0f);
                rectF.set(f12, height, intrinsicWidth + f12, intrinsicHeight + height);
                if (x5Var.f35088r && x5Var.f35070a0 > 0.0f) {
                    x5Var.f35073c.mapRect(rectF);
                } else {
                    FrameLayout.LayoutParams layoutParams = x5Var.T;
                    rectF.offset(layoutParams.leftMargin, layoutParams.topMargin);
                    x5Var.h.set(rectF);
                }
                f6Var.c(rectF.left / x5Var.H.getWidth(), rectF.top / x5Var.H.getHeight(), rectF.width() / x5Var.H.getWidth(), rectF.height() / x5Var.H.getHeight());
                if (!f6Var.f34236c) {
                    float max = Math.max(0.0f, Math.min(1.0f, x5Var.f35070a0));
                    x5Var.m0 = x5Var.f35084l0.d(x5Var.f35085n, false);
                    f6Var.setDiamondAlpha(x5Var.c());
                    float f13 = (1.0f - max) * x5Var.m0;
                    if (f13 > 0.0f) {
                        if (x5Var.f35086n0 == null) {
                            x5Var.f35086n0 = new l6(this.drawable.getIntrinsicWidth(), this.drawable.getIntrinsicHeight());
                            x5Var.o();
                        }
                        Drawable drawable = this.drawable;
                        x5Var.f35086n0.setBounds(drawable.getBounds());
                        l6 l6Var = x5Var.f35086n0;
                        float f14 = x5Var.m0;
                        if (f14 > 0.0f) {
                            f10 = Math.min(1.0f, x5Var.f35082j0.f26100c / f14);
                        } else {
                            f10 = 0.0f;
                        }
                        l6Var.f34511j = f10;
                        this.drawable = x5Var.f35086n0;
                        this.recolorDrawable = false;
                        setAlpha(f13);
                        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
                        this.drawable = drawable;
                        this.recolorDrawable = true;
                    }
                    setAlpha(max);
                    if (max == 0.0f) {
                        return;
                    }
                } else {
                    v5Var.postInvalidateOnAnimation();
                }
            }
            super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
        }
    }
}
