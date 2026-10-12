package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class lq0 extends mm0 {
    public final int V2;
    public final jr0 W2;

    public lq0(jr0 jr0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.V2 = i10;
        this.W2 = jr0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.V2) {
            case 0:
                jr0 jr0Var = this.W2;
                if (jr0Var.f26467h0 && jr0Var.f26474o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + jr0Var.G0.f10889b) {
                    return true;
                }
                return false;
            default:
                jr0 jr0Var2 = this.W2;
                if (jr0Var2.f26467h0 && jr0Var2.f26474o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + jr0Var2.G0.f10889b) {
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
                jr0 jr0Var = this.W2;
                mm0 mm0Var = jr0Var.E;
                if (mm0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = jr0Var.f26475p0;
                    if (jr0Var.f26467h0 && jr0Var.f26474o0[1] != null) {
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
                jr0 jr0Var2 = this.W2;
                mm0 mm0Var2 = jr0Var2.E;
                if (mm0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = jr0Var2.f26475p0;
                    if (jr0Var2.f26467h0 && jr0Var2.f26474o0[1] != null) {
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
