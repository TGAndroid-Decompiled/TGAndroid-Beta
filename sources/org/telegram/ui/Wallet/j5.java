package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
public final class j5 extends er {
    public final k5 f35113a;

    public j5(o4 o4Var, int i10) {
        super(i10, 0);
        this.f35113a = o4Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        setAlpha(1.0f);
        k5 k5Var = this.f35113a;
        boolean z10 = k5Var.f35156a;
        i5 i5Var = k5Var.L;
        RectF rectF = k5Var.f35160f;
        if (z10 && (k5Var.E instanceof s5) && k5Var.F.getWidth() > 0) {
            s5 s5Var = (s5) k5Var.E;
            float intrinsicWidth = this.drawable.getIntrinsicWidth() * k5Var.f35157b;
            float f10 = k5Var.f35157b;
            float intrinsicHeight = this.drawable.getIntrinsicHeight() * f10;
            float f11 = f10 * f7;
            float height = (i5Var.getHeight() / 2.0f) - (intrinsicHeight / 2.0f);
            rectF.set(f11, height, intrinsicWidth + f11, intrinsicHeight + height);
            if (k5Var.h && k5Var.R > 0.0f) {
                k5Var.f35158c.mapRect(rectF);
            } else {
                rectF.offset(k5Var.N.leftMargin, (k5Var.F.getHeight() / 2.0f) - AndroidUtilities.dp(22.0f));
            }
            s5Var.c(rectF.left / k5Var.F.getWidth(), rectF.top / k5Var.F.getHeight(), rectF.width() / k5Var.F.getWidth(), rectF.height() / k5Var.F.getHeight());
            if (!s5Var.d && s5Var.f35537c) {
                i5Var.postInvalidateOnAnimation();
            } else {
                float max = Math.max(0.0f, Math.min(1.0f, k5Var.R));
                setAlpha(max);
                if (max == 0.0f) {
                    return;
                }
            }
        }
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
    }
}
