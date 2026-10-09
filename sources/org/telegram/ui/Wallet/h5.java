package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
public final class h5 extends er {
    public final i5 f34992a;

    public h5(m4 m4Var, int i10) {
        super(i10, 0);
        this.f34992a = m4Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        setAlpha(1.0f);
        i5 i5Var = this.f34992a;
        boolean z10 = i5Var.f35030a;
        g5 g5Var = i5Var.L;
        RectF rectF = i5Var.f35034f;
        if (z10 && (i5Var.E instanceof q5) && i5Var.F.getWidth() > 0) {
            q5 q5Var = (q5) i5Var.E;
            float intrinsicWidth = this.drawable.getIntrinsicWidth() * i5Var.f35031b;
            float f10 = i5Var.f35031b;
            float intrinsicHeight = this.drawable.getIntrinsicHeight() * f10;
            float f11 = f10 * f7;
            float height = (g5Var.getHeight() / 2.0f) - (intrinsicHeight / 2.0f);
            rectF.set(f11, height, intrinsicWidth + f11, intrinsicHeight + height);
            if (i5Var.h && i5Var.R > 0.0f) {
                i5Var.f35032c.mapRect(rectF);
            } else {
                rectF.offset(i5Var.N.leftMargin, (i5Var.F.getHeight() / 2.0f) - AndroidUtilities.dp(22.0f));
            }
            q5Var.c(rectF.left / i5Var.F.getWidth(), rectF.top / i5Var.F.getHeight(), rectF.width() / i5Var.F.getWidth(), rectF.height() / i5Var.F.getHeight());
            if (!q5Var.d && q5Var.f35417c) {
                g5Var.postInvalidateOnAnimation();
            } else {
                float max = Math.max(0.0f, Math.min(1.0f, i5Var.R));
                setAlpha(max);
                if (max == 0.0f) {
                    return;
                }
            }
        }
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
    }
}
