package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.dq;
public final class k6 extends dq {
    public final l6 L;

    public k6(l6 l6Var) {
        super(2131232815, 0);
        this.L = l6Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        l6 l6Var = this.L;
        FrameLayout.LayoutParams layoutParams = l6Var.P;
        if (!l6Var.f34860i0) {
            this.f25571x = 1.0f;
            if (l6Var.f34848a) {
                float max = Math.max(0.0f, Math.min(1.0f, l6Var.T));
                int i15 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i15 == 0) {
                    float intrinsicWidth = this.f25565c.getIntrinsicWidth() * l6Var.f34850b;
                    float f10 = l6Var.f34850b;
                    float intrinsicHeight = this.f25565c.getIntrinsicHeight() * f10;
                    float f11 = (f10 * f7) + layoutParams.leftMargin;
                    float height = ((l6Var.N.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    l6Var.f34856f.set(f11, height, intrinsicWidth + f11, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (l6Var.f34859h0 == null) {
                        l6Var.f34859h0 = new t6(this.f25565c.getIntrinsicWidth(), this.f25565c.getIntrinsicHeight());
                        l6Var.m();
                    }
                    Drawable drawable = this.f25565c;
                    l6Var.f34859h0.setBounds(drawable.getBounds());
                    t6 t6Var = l6Var.f34859h0;
                    t6Var.f35251i = l6Var.f34857f0.f30530c;
                    this.f25565c = t6Var;
                    this.d = false;
                    this.f25571x = 1.0f - max;
                    super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
                    this.f25565c = drawable;
                    this.d = true;
                }
                this.f25571x = max;
                if (i15 == 0) {
                    return;
                }
            }
            super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
        }
    }
}
