package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class nq0 extends mm0 {
    public final int f31064f3;
    public final mr0 f31065g3;

    public nq0(mr0 mr0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f31064f3 = i10;
        this.f31065g3 = mr0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.f31064f3) {
            case 0:
                mr0 mr0Var = this.f31065g3;
                if (mr0Var.f30710i0 && mr0Var.f30717p0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + mr0Var.H0.f13451b) {
                    return true;
                }
                return false;
            default:
                mr0 mr0Var2 = this.f31065g3;
                if (mr0Var2.f30710i0 && mr0Var2.f30717p0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + mr0Var2.H0.f13451b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        switch (this.f31064f3) {
            case 0:
                mr0 mr0Var = this.f31065g3;
                mm0 mm0Var = mr0Var.F;
                if (mm0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = mr0Var.f30718q0;
                    if (mr0Var.f30710i0 && mr0Var.f30717p0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (mm0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                mr0 mr0Var2 = this.f31065g3;
                mm0 mm0Var2 = mr0Var2.F;
                if (mm0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = mr0Var2.f30718q0;
                    if (mr0Var2.f30710i0 && mr0Var2.f30717p0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (mm0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
