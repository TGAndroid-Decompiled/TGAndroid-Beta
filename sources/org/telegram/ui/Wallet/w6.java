package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.lq;
public final class w6 extends lq {
    public final x6 M;

    public w6(x6 x6Var) {
        super(2131232820, 0);
        this.M = x6Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        x6 x6Var = this.M;
        FrameLayout.LayoutParams layoutParams = x6Var.Q;
        if (!x6Var.f45270j0) {
            this.f37201x = 1.0f;
            if (x6Var.f45256a) {
                float max = Math.max(0.0f, Math.min(1.0f, x6Var.U));
                int i14 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i14 == 0) {
                    float intrinsicWidth = this.f37194c.getIntrinsicWidth() * x6Var.f45258b;
                    float f11 = x6Var.f45258b;
                    float intrinsicHeight = this.f37194c.getIntrinsicHeight() * f11;
                    float f12 = (f11 * f10) + layoutParams.leftMargin;
                    float height = ((x6Var.O.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    x6Var.f45265f.set(f12, height, intrinsicWidth + f12, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (x6Var.f45269i0 == null) {
                        x6Var.f45269i0 = new f7(this.f37194c.getIntrinsicWidth(), this.f37194c.getIntrinsicHeight());
                        x6Var.m();
                    }
                    Drawable drawable = this.f37194c;
                    x6Var.f45269i0.setBounds(drawable.getBounds());
                    f7 f7Var = x6Var.f45269i0;
                    f7Var.f44212i = x6Var.f45267g0.f33892c;
                    this.f37194c = f7Var;
                    this.d = false;
                    this.f37201x = 1.0f - max;
                    super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
                    this.f37194c = drawable;
                    this.d = true;
                }
                this.f37201x = max;
                if (i14 == 0) {
                    return;
                }
            }
            super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
        }
    }
}
