package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.eq;
public final class g6 extends eq {
    public final h6 M;

    public g6(h6 h6Var) {
        super(2131232818, 0);
        this.M = h6Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        h6 h6Var = this.M;
        FrameLayout.LayoutParams layoutParams = h6Var.Q;
        if (!h6Var.f43930j0) {
            this.f34418x = 1.0f;
            if (h6Var.f43916a) {
                float max = Math.max(0.0f, Math.min(1.0f, h6Var.U));
                int i14 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i14 == 0) {
                    float intrinsicWidth = this.f34411c.getIntrinsicWidth() * h6Var.f43918b;
                    float f11 = h6Var.f43918b;
                    float intrinsicHeight = this.f34411c.getIntrinsicHeight() * f11;
                    float f12 = (f11 * f10) + layoutParams.leftMargin;
                    float height = ((h6Var.O.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    h6Var.f43925f.set(f12, height, intrinsicWidth + f12, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (h6Var.f43929i0 == null) {
                        h6Var.f43929i0 = new p6(this.f34411c.getIntrinsicWidth(), this.f34411c.getIntrinsicHeight());
                        h6Var.m();
                    }
                    Drawable drawable = this.f34411c;
                    h6Var.f43929i0.setBounds(drawable.getBounds());
                    p6 p6Var = h6Var.f43929i0;
                    p6Var.f44327i = h6Var.f43927g0.f39903c;
                    this.f34411c = p6Var;
                    this.d = false;
                    this.f34418x = 1.0f - max;
                    super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
                    this.f34411c = drawable;
                    this.d = true;
                }
                this.f34418x = max;
                if (i14 == 0) {
                    return;
                }
            }
            super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
        }
    }
}
