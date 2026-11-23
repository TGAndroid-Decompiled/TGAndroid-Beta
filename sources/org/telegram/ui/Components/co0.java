package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class co0 extends ek0 {
    public final int f34231f3;
    public final ap0 f34232g3;

    public co0(ap0 ap0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.f34231f3 = i7;
        this.f34232g3 = ap0Var;
    }

    @Override
    public final boolean E0(float f10) {
        float f11;
        float f12;
        switch (this.f34231f3) {
            case 0:
                ap0 ap0Var = this.f34232g3;
                if (ap0Var.d2 && ap0Var.f33555k2[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f10 >= org.telegram.messenger.g0.L(f11) + ap0Var.C2.f15884b) {
                    return true;
                }
                return false;
            default:
                ap0 ap0Var2 = this.f34232g3;
                if (ap0Var2.d2 && ap0Var2.f33555k2[1] != null) {
                    f12 = 111.0f;
                } else {
                    f12 = 58.0f;
                }
                if (f10 >= org.telegram.messenger.g0.L(f12) + ap0Var2.C2.f15884b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        switch (this.f34231f3) {
            case 0:
                ap0 ap0Var = this.f34232g3;
                ek0 ek0Var = ap0Var.A1;
                if (ek0Var.getVisibility() != 8) {
                    canvas.save();
                    int i7 = ap0Var.f33556l2;
                    if (ap0Var.d2 && ap0Var.f33555k2[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.g0.L(f10) + i7, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ek0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                ap0 ap0Var2 = this.f34232g3;
                ek0 ek0Var2 = ap0Var2.A1;
                if (ek0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i10 = ap0Var2.f33556l2;
                    if (ap0Var2.d2 && ap0Var2.f33555k2[1] != null) {
                        f11 = 111.0f;
                    } else {
                        f11 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.g0.L(f11) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ek0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
