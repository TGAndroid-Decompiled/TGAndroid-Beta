package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class rn0 extends uj0 {
    public final int f39012f3;
    public final po0 f39013g3;

    public rn0(po0 po0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.f39012f3 = i7;
        this.f39013g3 = po0Var;
    }

    @Override
    public final boolean E0(float f10) {
        float f11;
        float f12;
        switch (this.f39012f3) {
            case 0:
                po0 po0Var = this.f39013g3;
                if (po0Var.d2 && po0Var.f38349k2[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f10 >= org.telegram.messenger.g0.L(f11) + po0Var.C2.f15575b) {
                    return true;
                }
                return false;
            default:
                po0 po0Var2 = this.f39013g3;
                if (po0Var2.d2 && po0Var2.f38349k2[1] != null) {
                    f12 = 111.0f;
                } else {
                    f12 = 58.0f;
                }
                if (f10 >= org.telegram.messenger.g0.L(f12) + po0Var2.C2.f15575b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        switch (this.f39012f3) {
            case 0:
                po0 po0Var = this.f39013g3;
                uj0 uj0Var = po0Var.A1;
                if (uj0Var.getVisibility() != 8) {
                    canvas.save();
                    int i7 = po0Var.f38350l2;
                    if (po0Var.d2 && po0Var.f38349k2[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.g0.L(f10) + i7, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (uj0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                po0 po0Var2 = this.f39013g3;
                uj0 uj0Var2 = po0Var2.A1;
                if (uj0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i10 = po0Var2.f38350l2;
                    if (po0Var2.d2 && po0Var2.f38349k2[1] != null) {
                        f11 = 111.0f;
                    } else {
                        f11 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.g0.L(f11) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (uj0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
