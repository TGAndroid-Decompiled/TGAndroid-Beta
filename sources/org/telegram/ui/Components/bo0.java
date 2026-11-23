package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class bo0 extends ek0 {
    public final int f33782f3;
    public final zo0 f33783g3;

    public bo0(zo0 zo0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.f33782f3 = i7;
        this.f33783g3 = zo0Var;
    }

    @Override
    public final boolean E0(float f10) {
        float f11;
        float f12;
        switch (this.f33782f3) {
            case 0:
                zo0 zo0Var = this.f33783g3;
                if (zo0Var.d2 && zo0Var.f42979k2[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f10 >= org.telegram.messenger.g0.L(f11) + zo0Var.C2.f15979b) {
                    return true;
                }
                return false;
            default:
                zo0 zo0Var2 = this.f33783g3;
                if (zo0Var2.d2 && zo0Var2.f42979k2[1] != null) {
                    f12 = 111.0f;
                } else {
                    f12 = 58.0f;
                }
                if (f10 >= org.telegram.messenger.g0.L(f12) + zo0Var2.C2.f15979b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        switch (this.f33782f3) {
            case 0:
                zo0 zo0Var = this.f33783g3;
                ek0 ek0Var = zo0Var.A1;
                if (ek0Var.getVisibility() != 8) {
                    canvas.save();
                    int i7 = zo0Var.f42980l2;
                    if (zo0Var.d2 && zo0Var.f42979k2[1] != null) {
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
                zo0 zo0Var2 = this.f33783g3;
                ek0 ek0Var2 = zo0Var2.A1;
                if (ek0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i10 = zo0Var2.f42980l2;
                    if (zo0Var2.d2 && zo0Var2.f42979k2[1] != null) {
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
