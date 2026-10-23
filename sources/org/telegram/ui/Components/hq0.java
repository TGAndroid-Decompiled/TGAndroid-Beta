package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class hq0 extends jm0 {
    public final int V2;
    public final fr0 W2;

    public hq0(fr0 fr0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.V2 = i10;
        this.W2 = fr0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.V2) {
            case 0:
                fr0 fr0Var = this.W2;
                if (fr0Var.f26379i0 && fr0Var.f26386p0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + fr0Var.H0.f12284b) {
                    return true;
                }
                return false;
            default:
                fr0 fr0Var2 = this.W2;
                if (fr0Var2.f26379i0 && fr0Var2.f26386p0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + fr0Var2.H0.f12284b) {
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
                fr0 fr0Var = this.W2;
                jm0 jm0Var = fr0Var.F;
                if (jm0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = fr0Var.f26387q0;
                    if (fr0Var.f26379i0 && fr0Var.f26386p0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (jm0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                fr0 fr0Var2 = this.W2;
                jm0 jm0Var2 = fr0Var2.F;
                if (jm0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = fr0Var2.f26387q0;
                    if (fr0Var2.f26379i0 && fr0Var2.f26386p0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (jm0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
