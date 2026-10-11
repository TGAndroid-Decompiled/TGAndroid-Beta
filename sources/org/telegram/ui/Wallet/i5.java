package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class i5 extends org.telegram.ui.Components.r6 {
    public final int f35116s;
    public final k5 v;

    public i5(k5 k5Var, Context context, int i10) {
        super(context, false, true, true, true, true);
        this.v = k5Var;
        this.f35116s = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float c10 = getDrawable().c();
        k5 k5Var = this.v;
        float max = Math.max(0.0f, (((((336.0f - this.f35116s) - 50.0f) * k5Var.F.getWidth()) / 336.0f) - k5Var.N.leftMargin) - AndroidUtilities.dp(8.0f));
        int i10 = (c10 > 0.0f ? 1 : (c10 == 0.0f ? 0 : -1));
        float f10 = 1.0f;
        if (i10 > 0) {
            f7 = Math.min(1.0f, max / c10);
        } else {
            f7 = 1.0f;
        }
        if (i10 > 0) {
            f10 = Math.min(1.0f, k5Var.S / c10);
        }
        float f11 = ((f10 - f7) * k5Var.R) + f7;
        k5Var.f35191b = f11;
        int save = canvas.save();
        canvas.scale(f11, f11, 0.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }
}
