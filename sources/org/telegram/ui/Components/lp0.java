package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class lp0 extends rl0 {
    public final int U2;
    public final lq0 V2;

    public lp0(lq0 lq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
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
                if (lq0Var.f26838e0 && lq0Var.f26846l0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f10 >= AndroidUtilities.dp(f11) + lq0Var.D0.f7197b) {
                    return true;
                }
                return false;
            default:
                lq0 lq0Var2 = this.V2;
                if (lq0Var2.f26838e0 && lq0Var2.f26846l0[1] != null) {
                    f12 = 111.0f;
                } else {
                    f12 = 58.0f;
                }
                if (f10 >= AndroidUtilities.dp(f12) + lq0Var2.D0.f7197b) {
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
                rl0 rl0Var = lq0Var.B;
                if (rl0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = lq0Var.m0;
                    if (lq0Var.f26838e0 && lq0Var.f26846l0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (rl0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                lq0 lq0Var2 = this.V2;
                rl0 rl0Var2 = lq0Var2.B;
                if (rl0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = lq0Var2.m0;
                    if (lq0Var2.f26838e0 && lq0Var2.f26846l0[1] != null) {
                        f11 = 111.0f;
                    } else {
                        f11 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f11) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (rl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
