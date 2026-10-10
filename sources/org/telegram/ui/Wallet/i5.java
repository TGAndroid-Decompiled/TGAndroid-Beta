package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
public final class i5 extends er {
    public final j5 f35083a;

    public i5(n4 n4Var, int i10) {
        super(i10, 0);
        this.f35083a = n4Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        setAlpha(1.0f);
        j5 j5Var = this.f35083a;
        boolean z10 = j5Var.f35126a;
        h5 h5Var = j5Var.L;
        RectF rectF = j5Var.f35130f;
        if (z10 && (j5Var.E instanceof r5) && j5Var.F.getWidth() > 0) {
            r5 r5Var = (r5) j5Var.E;
            float intrinsicWidth = this.drawable.getIntrinsicWidth() * j5Var.f35127b;
            float f10 = j5Var.f35127b;
            float intrinsicHeight = this.drawable.getIntrinsicHeight() * f10;
            float f11 = f10 * f7;
            float height = (h5Var.getHeight() / 2.0f) - (intrinsicHeight / 2.0f);
            rectF.set(f11, height, intrinsicWidth + f11, intrinsicHeight + height);
            if (j5Var.h && j5Var.R > 0.0f) {
                j5Var.f35128c.mapRect(rectF);
            } else {
                rectF.offset(j5Var.N.leftMargin, (j5Var.F.getHeight() / 2.0f) - AndroidUtilities.dp(22.0f));
            }
            r5Var.c(rectF.left / j5Var.F.getWidth(), rectF.top / j5Var.F.getHeight(), rectF.width() / j5Var.F.getWidth(), rectF.height() / j5Var.F.getHeight());
            if (!r5Var.d && r5Var.f35507c) {
                h5Var.postInvalidateOnAnimation();
            } else {
                float max = Math.max(0.0f, Math.min(1.0f, j5Var.R));
                setAlpha(max);
                if (max == 0.0f) {
                    return;
                }
            }
        }
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
    }
}
