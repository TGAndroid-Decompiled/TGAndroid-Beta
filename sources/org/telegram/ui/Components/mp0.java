package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class mp0 extends sl0 {
    public final int U2;
    public final lq0 V2;

    public mp0(lq0 lq0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.U2 = i10;
        this.V2 = lq0Var;
    }

    @Override
    public final boolean E0(float f10) {
        float f11;
        float f12;
        switch (this.U2) {
            case 0:
                lq0 lq0Var = this.V2;
                if (lq0Var.f28832e0 && lq0Var.f28840l0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f10 >= AndroidUtilities.dp(f11) + lq0Var.D0.f7758b) {
                    return true;
                }
                return false;
            default:
                lq0 lq0Var2 = this.V2;
                if (lq0Var2.f28832e0 && lq0Var2.f28840l0[1] != null) {
                    f12 = 111.0f;
                } else {
                    f12 = 58.0f;
                }
                if (f10 >= AndroidUtilities.dp(f12) + lq0Var2.D0.f7758b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        switch (this.U2) {
            case 0:
                lq0 lq0Var = this.V2;
                sl0 sl0Var = lq0Var.B;
                if (sl0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = lq0Var.m0;
                    if (lq0Var.f28832e0 && lq0Var.f28840l0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (sl0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                lq0 lq0Var2 = this.V2;
                sl0 sl0Var2 = lq0Var2.B;
                if (sl0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = lq0Var2.m0;
                    if (lq0Var2.f28832e0 && lq0Var2.f28840l0[1] != null) {
                        f11 = 111.0f;
                    } else {
                        f11 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f11) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (sl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
