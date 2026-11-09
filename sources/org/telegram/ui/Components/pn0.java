package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class pn0 extends qj0 {
    public final int f37058e3;
    public final no0 f37059f3;

    public pn0(no0 no0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, g6Var);
        this.f37058e3 = i7;
        this.f37059f3 = no0Var;
    }

    @Override
    public final boolean E0(float f10) {
        float f11;
        float f12;
        switch (this.f37058e3) {
            case 0:
                no0 no0Var = this.f37059f3;
                if (no0Var.Z1 && no0Var.f36435g2[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f10 >= org.telegram.messenger.g0.L(f11) + no0Var.f36468y2.f15121b) {
                    return true;
                }
                return false;
            default:
                no0 no0Var2 = this.f37059f3;
                if (no0Var2.Z1 && no0Var2.f36435g2[1] != null) {
                    f12 = 111.0f;
                } else {
                    f12 = 58.0f;
                }
                if (f10 >= org.telegram.messenger.g0.L(f12) + no0Var2.f36468y2.f15121b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        switch (this.f37058e3) {
            case 0:
                no0 no0Var = this.f37059f3;
                qj0 qj0Var = no0Var.f36463w1;
                if (qj0Var.getVisibility() != 8) {
                    canvas.save();
                    int i7 = no0Var.f36436h2;
                    if (no0Var.Z1 && no0Var.f36435g2[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.g0.L(f10) + i7, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (qj0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                no0 no0Var2 = this.f37059f3;
                qj0 qj0Var2 = no0Var2.f36463w1;
                if (qj0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i10 = no0Var2.f36436h2;
                    if (no0Var2.Z1 && no0Var2.f36435g2[1] != null) {
                        f11 = 111.0f;
                    } else {
                        f11 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.g0.L(f11) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (qj0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
