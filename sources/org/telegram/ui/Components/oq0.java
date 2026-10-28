package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class oq0 extends nm0 {
    public final int f31373f3;
    public final nr0 f31374g3;

    public oq0(nr0 nr0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f31373f3 = i10;
        this.f31374g3 = nr0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.f31373f3) {
            case 0:
                nr0 nr0Var = this.f31374g3;
                if (nr0Var.f31041i0 && nr0Var.f31048p0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + nr0Var.H0.f13450b) {
                    return true;
                }
                return false;
            default:
                nr0 nr0Var2 = this.f31374g3;
                if (nr0Var2.f31041i0 && nr0Var2.f31048p0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + nr0Var2.H0.f13450b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        switch (this.f31373f3) {
            case 0:
                nr0 nr0Var = this.f31374g3;
                nm0 nm0Var = nr0Var.F;
                if (nm0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = nr0Var.f31049q0;
                    if (nr0Var.f31041i0 && nr0Var.f31048p0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (nm0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                nr0 nr0Var2 = this.f31374g3;
                nm0 nm0Var2 = nr0Var2.F;
                if (nm0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = nr0Var2.f31049q0;
                    if (nr0Var2.f31041i0 && nr0Var2.f31048p0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (nm0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
