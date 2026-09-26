package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class wp0 extends wl0 {
    public final int X2;
    public final uq0 Y2;

    public wp0(uq0 uq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.X2 = i10;
        this.Y2 = uq0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.X2) {
            case 0:
                uq0 uq0Var = this.Y2;
                if (uq0Var.f28883h0 && uq0Var.f28890o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + uq0Var.G0.f10577b) {
                    return true;
                }
                return false;
            default:
                uq0 uq0Var2 = this.Y2;
                if (uq0Var2.f28883h0 && uq0Var2.f28890o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + uq0Var2.G0.f10577b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        switch (this.X2) {
            case 0:
                uq0 uq0Var = this.Y2;
                wl0 wl0Var = uq0Var.E;
                if (wl0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = uq0Var.f28891p0;
                    if (uq0Var.f28883h0 && uq0Var.f28890o0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (wl0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                uq0 uq0Var2 = this.Y2;
                wl0 wl0Var2 = uq0Var2.E;
                if (wl0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = uq0Var2.f28891p0;
                    if (uq0Var2.f28883h0 && uq0Var2.f28890o0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (wl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
