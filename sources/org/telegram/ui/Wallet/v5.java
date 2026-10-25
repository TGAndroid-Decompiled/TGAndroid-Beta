package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.zq;
public final class v5 extends zq {
    public final w5 f37376a;

    public v5(w5 w5Var, int i10) {
        super(i10, 0);
        this.f37376a = w5Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        w5 w5Var = this.f37376a;
        FrameLayout.LayoutParams layoutParams = w5Var.P;
        if (!w5Var.f37429i0) {
            setAlpha(1.0f);
            if (w5Var.f37417a) {
                float max = Math.max(0.0f, Math.min(1.0f, w5Var.T));
                int i15 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i15 == 0) {
                    float intrinsicWidth = this.drawable.getIntrinsicWidth() * w5Var.f37419b;
                    float f10 = w5Var.f37419b;
                    float intrinsicHeight = this.drawable.getIntrinsicHeight() * f10;
                    float f11 = (f10 * f7) + layoutParams.leftMargin;
                    float height = ((w5Var.N.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    w5Var.f37425f.set(f11, height, intrinsicWidth + f11, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (w5Var.f37428h0 == null) {
                        w5Var.f37428h0 = new e6(this.drawable.getIntrinsicWidth(), this.drawable.getIntrinsicHeight());
                        w5Var.m();
                    }
                    Drawable drawable = this.drawable;
                    w5Var.f37428h0.setBounds(drawable.getBounds());
                    e6 e6Var = w5Var.f37428h0;
                    e6Var.f36525i = w5Var.f37426f0.f28809c;
                    this.drawable = e6Var;
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
