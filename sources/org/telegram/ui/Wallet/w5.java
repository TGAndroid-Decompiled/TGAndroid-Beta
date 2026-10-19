package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.yq;
public final class w5 extends yq {
    public final x5 f35057a;

    public w5(x5 x5Var, int i10) {
        super(i10, 0);
        this.f35057a = x5Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        x5 x5Var = this.f35057a;
        FrameLayout.LayoutParams layoutParams = x5Var.P;
        if (!x5Var.f35100i0) {
            setAlpha(1.0f);
            if (x5Var.f35088a) {
                float max = Math.max(0.0f, Math.min(1.0f, x5Var.T));
                int i15 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i15 == 0) {
                    float intrinsicWidth = this.drawable.getIntrinsicWidth() * x5Var.f35090b;
                    float f10 = x5Var.f35090b;
                    float intrinsicHeight = this.drawable.getIntrinsicHeight() * f10;
                    float f11 = (f10 * f7) + layoutParams.leftMargin;
                    float height = ((x5Var.N.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    x5Var.f35096f.set(f11, height, intrinsicWidth + f11, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (x5Var.f35099h0 == null) {
                        x5Var.f35099h0 = new f6(this.drawable.getIntrinsicWidth(), this.drawable.getIntrinsicHeight());
                        x5Var.m();
                    }
                    Drawable drawable = this.drawable;
                    x5Var.f35099h0.setBounds(drawable.getBounds());
                    f6 f6Var = x5Var.f35099h0;
                    f6Var.f34208i = x5Var.f35097f0.f26110c;
                    this.drawable = f6Var;
                    this.recolorDrawable = false;
                    setAlpha(1.0f - max);
                    super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
                    this.drawable = drawable;
                    this.recolorDrawable = true;
                }
                setAlpha(max);
                if (i15 == 0) {
                    return;
                }
            }
            super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
        }
    }
}
