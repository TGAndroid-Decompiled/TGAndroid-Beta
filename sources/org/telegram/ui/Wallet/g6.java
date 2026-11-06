package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.wp;
public final class g6 extends wp {
    public final h6 L;

    public g6(h6 h6Var) {
        super(2131232817, 0);
        this.L = h6Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        h6 h6Var = this.L;
        FrameLayout.LayoutParams layoutParams = h6Var.P;
        if (!h6Var.f42554i0) {
            this.f40058x = 1.0f;
            if (h6Var.f42541a) {
                float max = Math.max(0.0f, Math.min(1.0f, h6Var.T));
                int i14 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i14 == 0) {
                    float intrinsicWidth = this.f40051c.getIntrinsicWidth() * h6Var.f42543b;
                    float f11 = h6Var.f42543b;
                    float intrinsicHeight = this.f40051c.getIntrinsicHeight() * f11;
                    float f12 = (f11 * f10) + layoutParams.leftMargin;
                    float height = ((h6Var.N.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    h6Var.f42550f.set(f12, height, intrinsicWidth + f12, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (h6Var.f42553h0 == null) {
                        h6Var.f42553h0 = new p6(this.f40051c.getIntrinsicWidth(), this.f40051c.getIntrinsicHeight());
                        h6Var.m();
                    }
                    Drawable drawable = this.f40051c;
                    h6Var.f42553h0.setBounds(drawable.getBounds());
                    p6 p6Var = h6Var.f42553h0;
                    p6Var.f42989i = h6Var.f42551f0.f39849c;
                    this.f40051c = p6Var;
                    this.d = false;
                    this.f40058x = 1.0f - max;
                    super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
                    this.f40051c = drawable;
                    this.d = true;
                }
                this.f40058x = max;
                if (i14 == 0) {
                    return;
                }
            }
            super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
        }
    }
}
