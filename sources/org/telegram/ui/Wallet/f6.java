package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.wp;
public final class f6 extends wp {
    public final g6 L;

    public f6(g6 g6Var) {
        super(2131232817, 0);
        this.L = g6Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        g6 g6Var = this.L;
        FrameLayout.LayoutParams layoutParams = g6Var.P;
        if (!g6Var.f42549i0) {
            this.f40023x = 1.0f;
            if (g6Var.f42536a) {
                float max = Math.max(0.0f, Math.min(1.0f, g6Var.T));
                int i14 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i14 == 0) {
                    float intrinsicWidth = this.f40016c.getIntrinsicWidth() * g6Var.f42538b;
                    float f11 = g6Var.f42538b;
                    float intrinsicHeight = this.f40016c.getIntrinsicHeight() * f11;
                    float f12 = (f11 * f10) + layoutParams.leftMargin;
                    float height = ((g6Var.N.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    g6Var.f42545f.set(f12, height, intrinsicWidth + f12, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (g6Var.f42548h0 == null) {
                        g6Var.f42548h0 = new o6(this.f40016c.getIntrinsicWidth(), this.f40016c.getIntrinsicHeight());
                        g6Var.m();
                    }
                    Drawable drawable = this.f40016c;
                    g6Var.f42548h0.setBounds(drawable.getBounds());
                    o6 o6Var = g6Var.f42548h0;
                    o6Var.f42975i = g6Var.f42546f0.f39805c;
                    this.f40016c = o6Var;
                    this.d = false;
                    this.f40023x = 1.0f - max;
                    super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
                    this.f40016c = drawable;
                    this.d = true;
                }
                this.f40023x = max;
                if (i14 == 0) {
                    return;
                }
            }
            super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
        }
    }
}
