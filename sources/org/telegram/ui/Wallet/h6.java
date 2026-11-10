package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.wp;
public final class h6 extends wp {
    public final i6 L;

    public h6(i6 i6Var) {
        super(2131232817, 0);
        this.L = i6Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        i6 i6Var = this.L;
        FrameLayout.LayoutParams layoutParams = i6Var.P;
        if (!i6Var.f42633i0) {
            this.f40041x = 1.0f;
            if (i6Var.f42620a) {
                float max = Math.max(0.0f, Math.min(1.0f, i6Var.T));
                int i14 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i14 == 0) {
                    float intrinsicWidth = this.f40034c.getIntrinsicWidth() * i6Var.f42622b;
                    float f11 = i6Var.f42622b;
                    float intrinsicHeight = this.f40034c.getIntrinsicHeight() * f11;
                    float f12 = (f11 * f10) + layoutParams.leftMargin;
                    float height = ((i6Var.N.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    i6Var.f42629f.set(f12, height, intrinsicWidth + f12, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (i6Var.f42632h0 == null) {
                        i6Var.f42632h0 = new q6(this.f40034c.getIntrinsicWidth(), this.f40034c.getIntrinsicHeight());
                        i6Var.m();
                    }
                    Drawable drawable = this.f40034c;
                    i6Var.f42632h0.setBounds(drawable.getBounds());
                    q6 q6Var = i6Var.f42632h0;
                    q6Var.f43069i = i6Var.f42630f0.f38854c;
                    this.f40034c = q6Var;
                    this.d = false;
                    this.f40041x = 1.0f - max;
                    super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
                    this.f40034c = drawable;
                    this.d = true;
                }
                this.f40041x = max;
                if (i14 == 0) {
                    return;
                }
            }
            super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
        }
    }
}
