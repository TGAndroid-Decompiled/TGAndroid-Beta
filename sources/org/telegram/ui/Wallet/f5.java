package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class f5 extends org.telegram.ui.Components.r6 {
    public final int f34899s;
    public final h5 v;

    public f5(h5 h5Var, Context context, int i10) {
        super(context, false, true, true, true, true);
        this.v = h5Var;
        this.f34899s = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float c10 = getDrawable().c();
        h5 h5Var = this.v;
        float max = Math.max(0.0f, (((((336.0f - this.f34899s) - 50.0f) * h5Var.F.getWidth()) / 336.0f) - h5Var.N.leftMargin) - AndroidUtilities.dp(8.0f));
        int i10 = (c10 > 0.0f ? 1 : (c10 == 0.0f ? 0 : -1));
        float f10 = 1.0f;
        if (i10 > 0) {
            f7 = Math.min(1.0f, max / c10);
        } else {
            f7 = 1.0f;
        }
        if (i10 > 0) {
            f10 = Math.min(1.0f, h5Var.S / c10);
        }
        float f11 = ((f10 - f7) * h5Var.R) + f7;
        h5Var.f34968b = f11;
        int save = canvas.save();
        canvas.scale(f11, f11, 0.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }
}
