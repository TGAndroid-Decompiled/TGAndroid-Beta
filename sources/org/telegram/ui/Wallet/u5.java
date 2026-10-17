package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.yq;
public final class u5 extends yq {
    public final v5 f34933a;

    public u5(v5 v5Var, int i10) {
        super(i10, 0);
        this.f34933a = v5Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10;
        v5 v5Var = this.f34933a;
        t5 t5Var = v5Var.R;
        RectF rectF = v5Var.f34975f;
        if (!v5Var.f34985o0) {
            setAlpha(1.0f);
            if (v5Var.f34967a && (v5Var.G instanceof c6) && v5Var.H.getWidth() > 0) {
                c6 c6Var = (c6) v5Var.G;
                float intrinsicWidth = this.drawable.getIntrinsicWidth() * v5Var.f34969b;
                float f11 = v5Var.f34969b;
                float intrinsicHeight = this.drawable.getIntrinsicHeight() * f11;
                float f12 = f11 * f7;
                float height = (t5Var.getHeight() / 2.0f) - (intrinsicHeight / 2.0f);
                rectF.set(f12, height, intrinsicWidth + f12, intrinsicHeight + height);
                if (v5Var.f34986r && v5Var.f34968a0 > 0.0f) {
                    v5Var.f34971c.mapRect(rectF);
                } else {
                    FrameLayout.LayoutParams layoutParams = v5Var.T;
                    rectF.offset(layoutParams.leftMargin, layoutParams.topMargin);
                    v5Var.h.set(rectF);
                }
                c6Var.c(rectF.left / v5Var.H.getWidth(), rectF.top / v5Var.H.getHeight(), rectF.width() / v5Var.H.getWidth(), rectF.height() / v5Var.H.getHeight());
                if (!c6Var.f34082c) {
                    float max = Math.max(0.0f, Math.min(1.0f, v5Var.f34968a0));
                    v5Var.m0 = v5Var.f34982l0.d(v5Var.f34983n, false);
                    c6Var.setDiamondAlpha(v5Var.c());
                    float f13 = (1.0f - max) * v5Var.m0;
                    if (f13 > 0.0f) {
                        if (v5Var.f34984n0 == null) {
                            v5Var.f34984n0 = new i6(this.drawable.getIntrinsicWidth(), this.drawable.getIntrinsicHeight());
                            v5Var.o();
                        }
                        Drawable drawable = this.drawable;
                        v5Var.f34984n0.setBounds(drawable.getBounds());
                        i6 i6Var = v5Var.f34984n0;
                        float f14 = v5Var.m0;
                        if (f14 > 0.0f) {
                            f10 = Math.min(1.0f, v5Var.f34980j0.f26093c / f14);
                        } else {
                            f10 = 0.0f;
                        }
                        i6Var.f34324j = f10;
                        this.drawable = v5Var.f34984n0;
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
                    t5Var.postInvalidateOnAnimation();
                }
            }
            super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
        }
    }
}
