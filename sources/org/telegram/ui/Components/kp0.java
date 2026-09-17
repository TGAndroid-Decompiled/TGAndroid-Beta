package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class kp0 extends ml0 {
    public final int X2;
    public final iq0 Y2;

    public kp0(iq0 iq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = iq0Var;
    }

    @Override
    public final boolean F0(float f7) {
        float f10;
        float f11;
        switch (this.X2) {
            case 0:
                iq0 iq0Var = this.Y2;
                if (iq0Var.f24994h0 && iq0Var.f25001o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + iq0Var.G0.f10592b) {
                    return true;
                }
                return false;
            default:
                iq0 iq0Var2 = this.Y2;
                if (iq0Var2.f24994h0 && iq0Var2.f25001o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + iq0Var2.G0.f10592b) {
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
                iq0 iq0Var = this.Y2;
                ml0 ml0Var = iq0Var.E;
                if (ml0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = iq0Var.f25002p0;
                    if (iq0Var.f24994h0 && iq0Var.f25001o0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ml0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                iq0 iq0Var2 = this.Y2;
                ml0 ml0Var2 = iq0Var2.E;
                if (ml0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = iq0Var2.f25002p0;
                    if (iq0Var2.f24994h0 && iq0Var2.f25001o0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ml0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
