package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class wp0 extends vl0 {
    public final int X2;
    public final uq0 Y2;

    public wp0(uq0 uq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = uq0Var;
    }

    @Override
    public final boolean F0(float f7) {
        float f10;
        float f11;
        switch (this.X2) {
            case 0:
                uq0 uq0Var = this.Y2;
                if (uq0Var.f28814h0 && uq0Var.f28821o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + uq0Var.G0.f10593b) {
                    return true;
                }
                return false;
            default:
                uq0 uq0Var2 = this.Y2;
                if (uq0Var2.f28814h0 && uq0Var2.f28821o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + uq0Var2.G0.f10593b) {
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
                vl0 vl0Var = uq0Var.E;
                if (vl0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = uq0Var.f28822p0;
                    if (uq0Var.f28814h0 && uq0Var.f28821o0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (vl0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                uq0 uq0Var2 = this.Y2;
                vl0 vl0Var2 = uq0Var2.E;
                if (vl0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = uq0Var2.f28822p0;
                    if (uq0Var2.f28814h0 && uq0Var2.f28821o0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (vl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
