package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.wp;
public final class e6 extends wp {
    public final f6 L;

    public e6(f6 f6Var) {
        super(2131232817, 0);
        this.L = f6Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        f6 f6Var = this.L;
        FrameLayout.LayoutParams layoutParams = f6Var.P;
        if (!f6Var.f42467i0) {
            this.f40123x = 1.0f;
            if (f6Var.f42454a) {
                float max = Math.max(0.0f, Math.min(1.0f, f6Var.T));
                int i14 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i14 == 0) {
                    float intrinsicWidth = this.f40116c.getIntrinsicWidth() * f6Var.f42456b;
                    float f11 = f6Var.f42456b;
                    float intrinsicHeight = this.f40116c.getIntrinsicHeight() * f11;
                    float f12 = (f11 * f10) + layoutParams.leftMargin;
                    float height = ((f6Var.N.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    f6Var.f42463f.set(f12, height, intrinsicWidth + f12, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (f6Var.f42466h0 == null) {
                        f6Var.f42466h0 = new n6(this.f40116c.getIntrinsicWidth(), this.f40116c.getIntrinsicHeight());
                        f6Var.m();
                    }
                    Drawable drawable = this.f40116c;
                    f6Var.f42466h0.setBounds(drawable.getBounds());
                    n6 n6Var = f6Var.f42466h0;
                    n6Var.f42893i = f6Var.f42464f0.f39910c;
                    this.f40116c = n6Var;
                    this.d = false;
                    this.f40123x = 1.0f - max;
                    super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
                    this.f40116c = drawable;
                    this.d = true;
                }
                this.f40123x = max;
                if (i14 == 0) {
                    return;
                }
            }
            super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
        }
    }
}
