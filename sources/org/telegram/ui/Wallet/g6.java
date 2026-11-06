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
        if (!h6Var.f42578i0) {
            this.f40073x = 1.0f;
            if (h6Var.f42565a) {
                float max = Math.max(0.0f, Math.min(1.0f, h6Var.T));
                int i14 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i14 == 0) {
                    float intrinsicWidth = this.f40066c.getIntrinsicWidth() * h6Var.f42567b;
                    float f11 = h6Var.f42567b;
                    float intrinsicHeight = this.f40066c.getIntrinsicHeight() * f11;
                    float f12 = (f11 * f10) + layoutParams.leftMargin;
                    float height = ((h6Var.N.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    h6Var.f42574f.set(f12, height, intrinsicWidth + f12, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (h6Var.f42577h0 == null) {
                        h6Var.f42577h0 = new p6(this.f40066c.getIntrinsicWidth(), this.f40066c.getIntrinsicHeight());
                        h6Var.m();
                    }
                    Drawable drawable = this.f40066c;
                    h6Var.f42577h0.setBounds(drawable.getBounds());
                    p6 p6Var = h6Var.f42577h0;
                    p6Var.f43013i = h6Var.f42575f0.f39855c;
                    this.f40066c = p6Var;
                    this.d = false;
                    this.f40073x = 1.0f - max;
                    super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
                    this.f40066c = drawable;
                    this.d = true;
                }
                this.f40073x = max;
                if (i14 == 0) {
                    return;
                }
            }
            super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
        }
    }
}
