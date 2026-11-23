package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.kq;
public final class x6 extends kq {
    public final y6 M;

    public x6(y6 y6Var) {
        super(2131232823, 0);
        this.M = y6Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        y6 y6Var = this.M;
        FrameLayout.LayoutParams layoutParams = y6Var.Q;
        if (!y6Var.f45442j0) {
            this.f36856x = 1.0f;
            if (y6Var.f45428a) {
                float max = Math.max(0.0f, Math.min(1.0f, y6Var.U));
                int i14 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i14 == 0) {
                    float intrinsicWidth = this.f36849c.getIntrinsicWidth() * y6Var.f45430b;
                    float f11 = y6Var.f45430b;
                    float intrinsicHeight = this.f36849c.getIntrinsicHeight() * f11;
                    float f12 = (f11 * f10) + layoutParams.leftMargin;
                    float height = ((y6Var.O.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    y6Var.f45437f.set(f12, height, intrinsicWidth + f12, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (y6Var.f45441i0 == null) {
                        y6Var.f45441i0 = new g7(this.f36849c.getIntrinsicWidth(), this.f36849c.getIntrinsicHeight());
                        y6Var.m();
                    }
                    Drawable drawable = this.f36849c;
                    y6Var.f45441i0.setBounds(drawable.getBounds());
                    g7 g7Var = y6Var.f45441i0;
                    g7Var.f44387i = y6Var.f45439g0.f33931c;
                    this.f36849c = g7Var;
                    this.d = false;
                    this.f36856x = 1.0f - max;
                    super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
                    this.f36849c = drawable;
                    this.d = true;
                }
                this.f36856x = max;
                if (i14 == 0) {
                    return;
                }
            }
            super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
        }
    }
}
