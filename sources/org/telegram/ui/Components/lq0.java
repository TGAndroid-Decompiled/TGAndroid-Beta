package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class lq0 extends mm0 {
    public final int Y2;
    public final ir0 Z2;

    public lq0(ir0 ir0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.Y2 = i10;
        this.Z2 = ir0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.Y2) {
            case 0:
                ir0 ir0Var = this.Z2;
                if (ir0Var.f27420i0 && ir0Var.f27427p0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + ir0Var.H0.f12316b) {
                    return true;
                }
                return false;
            default:
                ir0 ir0Var2 = this.Z2;
                if (ir0Var2.f27420i0 && ir0Var2.f27427p0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + ir0Var2.H0.f12316b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        switch (this.Y2) {
            case 0:
                ir0 ir0Var = this.Z2;
                mm0 mm0Var = ir0Var.F;
                if (mm0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = ir0Var.f27428q0;
                    if (ir0Var.f27420i0 && ir0Var.f27427p0[1] != null) {
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
                ir0 ir0Var2 = this.Z2;
                mm0 mm0Var2 = ir0Var2.F;
                if (mm0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = ir0Var2.f27428q0;
                    if (ir0Var2.f27420i0 && ir0Var2.f27427p0[1] != null) {
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
