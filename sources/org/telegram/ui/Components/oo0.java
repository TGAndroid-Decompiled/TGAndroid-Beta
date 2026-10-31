package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class oo0 extends tk0 {
    public final int f29110e3;
    public final op0 f29111f3;

    public oo0(op0 op0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.f29110e3 = i10;
        this.f29111f3 = op0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.f29110e3) {
            case 0:
                op0 op0Var = this.f29111f3;
                if (op0Var.Z1 && op0Var.f29118g2[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= org.telegram.messenger.i0.L(f10) + op0Var.f29152y2.f7766b) {
                    return true;
                }
                return false;
            default:
                op0 op0Var2 = this.f29111f3;
                if (op0Var2.Z1 && op0Var2.f29118g2[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= org.telegram.messenger.i0.L(f11) + op0Var2.f29152y2.f7766b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        switch (this.f29110e3) {
            case 0:
                op0 op0Var = this.f29111f3;
                tk0 tk0Var = op0Var.f29147w1;
                if (tk0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = op0Var.f29119h2;
                    if (op0Var.Z1 && op0Var.f29118g2[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.i0.L(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (tk0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                op0 op0Var2 = this.f29111f3;
                tk0 tk0Var2 = op0Var2.f29147w1;
                if (tk0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = op0Var2.f29119h2;
                    if (op0Var2.Z1 && op0Var2.f29118g2[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.i0.L(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (tk0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
