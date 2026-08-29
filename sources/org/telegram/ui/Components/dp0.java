package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class dp0 extends jl0 {
    public final int T2;
    public final dq0 U2;

    public dp0(dq0 dq0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.T2 = i10;
        this.U2 = dq0Var;
    }

    @Override
    public final boolean E0(float f9) {
        float f10;
        float f11;
        switch (this.T2) {
            case 0:
                dq0 dq0Var = this.U2;
                if (dq0Var.f27832d0 && dq0Var.f27841k0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f9 >= AndroidUtilities.dp(f10) + dq0Var.C0.f8187b) {
                    return true;
                }
                return false;
            default:
                dq0 dq0Var2 = this.U2;
                if (dq0Var2.f27832d0 && dq0Var2.f27841k0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f9 >= AndroidUtilities.dp(f11) + dq0Var2.C0.f8187b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f9;
        float f10;
        switch (this.T2) {
            case 0:
                dq0 dq0Var = this.U2;
                jl0 jl0Var = dq0Var.A;
                if (jl0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = dq0Var.f27842l0;
                    if (dq0Var.f27832d0 && dq0Var.f27841k0[1] != null) {
                        f9 = 111.0f;
                    } else {
                        f9 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f9) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (jl0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                dq0 dq0Var2 = this.U2;
                jl0 jl0Var2 = dq0Var2.A;
                if (jl0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = dq0Var2.f27842l0;
                    if (dq0Var2.f27832d0 && dq0Var2.f27841k0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (jl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
