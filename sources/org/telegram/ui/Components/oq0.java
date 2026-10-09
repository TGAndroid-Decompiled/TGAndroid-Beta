package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class oq0 extends qm0 {
    public final int V2;
    public final mr0 W2;

    public oq0(mr0 mr0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.V2 = i10;
        this.W2 = mr0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.V2) {
            case 0:
                mr0 mr0Var = this.W2;
                if (mr0Var.f28904h0 && mr0Var.f28911o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + mr0Var.G0.f11577b) {
                    return true;
                }
                return false;
            default:
                mr0 mr0Var2 = this.W2;
                if (mr0Var2.f28904h0 && mr0Var2.f28911o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + mr0Var2.G0.f11577b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        switch (this.V2) {
            case 0:
                mr0 mr0Var = this.W2;
                qm0 qm0Var = mr0Var.E;
                if (qm0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = mr0Var.f28912p0;
                    if (mr0Var.f28904h0 && mr0Var.f28911o0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (qm0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                mr0 mr0Var2 = this.W2;
                qm0 qm0Var2 = mr0Var2.E;
                if (qm0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = mr0Var2.f28912p0;
                    if (mr0Var2.f28904h0 && mr0Var2.f28911o0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (qm0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
