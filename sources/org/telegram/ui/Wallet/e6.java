package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.wp;
public final class e6 extends wp {
    public final f6 M;

    public e6(f6 f6Var) {
        super(2131232815, 0);
        this.M = f6Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        f6 f6Var = this.M;
        FrameLayout.LayoutParams layoutParams = f6Var.Q;
        if (!f6Var.f42536j0) {
            this.f40048x = 1.0f;
            if (f6Var.f42522a) {
                float max = Math.max(0.0f, Math.min(1.0f, f6Var.U));
                int i14 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i14 == 0) {
                    float intrinsicWidth = this.f40041c.getIntrinsicWidth() * f6Var.f42524b;
                    float f11 = f6Var.f42524b;
                    float intrinsicHeight = this.f40041c.getIntrinsicHeight() * f11;
                    float f12 = (f11 * f10) + layoutParams.leftMargin;
                    float height = ((f6Var.O.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    f6Var.f42531f.set(f12, height, intrinsicWidth + f12, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (f6Var.f42535i0 == null) {
                        f6Var.f42535i0 = new n6(this.f40041c.getIntrinsicWidth(), this.f40041c.getIntrinsicHeight());
                        f6Var.m();
                    }
                    Drawable drawable = this.f40041c;
                    f6Var.f42535i0.setBounds(drawable.getBounds());
                    n6 n6Var = f6Var.f42535i0;
                    n6Var.f42946i = f6Var.f42533g0.f38645c;
                    this.f40041c = n6Var;
                    this.d = false;
                    this.f40048x = 1.0f - max;
                    super.draw(canvas, charSequence, i3, i10, f10, i11, i12, i13, paint);
                    this.f40041c = drawable;
                    this.d = true;
                }
                this.f40048x = max;
                if (i14 == 0) {
                    return;
                }
            }
            super.draw(canvas, charSequence, i3, i10, f10, i11, i12, i13, paint);
        }
    }
}
