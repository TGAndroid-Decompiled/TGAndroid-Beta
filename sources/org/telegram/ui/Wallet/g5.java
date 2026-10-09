package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
public final class g5 extends er {
    public final h5 f34932a;

    public g5(l4 l4Var, int i10) {
        super(i10, 0);
        this.f34932a = l4Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        setAlpha(1.0f);
        h5 h5Var = this.f34932a;
        boolean z10 = h5Var.f34967a;
        f5 f5Var = h5Var.L;
        RectF rectF = h5Var.f34971f;
        if (z10 && (h5Var.E instanceof p5) && h5Var.F.getWidth() > 0) {
            p5 p5Var = (p5) h5Var.E;
            float intrinsicWidth = this.drawable.getIntrinsicWidth() * h5Var.f34968b;
            float f10 = h5Var.f34968b;
            float intrinsicHeight = this.drawable.getIntrinsicHeight() * f10;
            float f11 = f10 * f7;
            float height = (f5Var.getHeight() / 2.0f) - (intrinsicHeight / 2.0f);
            rectF.set(f11, height, intrinsicWidth + f11, intrinsicHeight + height);
            if (h5Var.h && h5Var.R > 0.0f) {
                h5Var.f34969c.mapRect(rectF);
            } else {
                rectF.offset(h5Var.N.leftMargin, (h5Var.F.getHeight() / 2.0f) - AndroidUtilities.dp(22.0f));
            }
            p5Var.c(rectF.left / h5Var.F.getWidth(), rectF.top / h5Var.F.getHeight(), rectF.width() / h5Var.F.getWidth(), rectF.height() / h5Var.F.getHeight());
            if (!p5Var.d && p5Var.f35357c) {
                f5Var.postInvalidateOnAnimation();
            } else {
                float max = Math.max(0.0f, Math.min(1.0f, h5Var.R));
                setAlpha(max);
                if (max == 0.0f) {
                    return;
                }
            }
        }
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
    }
}
