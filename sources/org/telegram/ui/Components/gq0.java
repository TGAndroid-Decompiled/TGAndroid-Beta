package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class gq0 extends im0 {
    public final int V2;
    public final er0 W2;

    public gq0(er0 er0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.V2 = i10;
        this.W2 = er0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.V2) {
            case 0:
                er0 er0Var = this.W2;
                if (er0Var.f25989i0 && er0Var.f25996p0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + er0Var.H0.f12286b) {
                    return true;
                }
                return false;
            default:
                er0 er0Var2 = this.W2;
                if (er0Var2.f25989i0 && er0Var2.f25996p0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + er0Var2.H0.f12286b) {
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
                er0 er0Var = this.W2;
                im0 im0Var = er0Var.F;
                if (im0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = er0Var.f25997q0;
                    if (er0Var.f25989i0 && er0Var.f25996p0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (im0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                er0 er0Var2 = this.W2;
                im0 im0Var2 = er0Var2.F;
                if (im0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = er0Var2.f25997q0;
                    if (er0Var2.f25989i0 && er0Var2.f25996p0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (im0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
