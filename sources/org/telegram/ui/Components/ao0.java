package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class ao0 extends ck0 {
    public final int f33410f3;
    public final yo0 f33411g3;

    public ao0(yo0 yo0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.f33410f3 = i7;
        this.f33411g3 = yo0Var;
    }

    @Override
    public final boolean E0(float f10) {
        float f11;
        float f12;
        switch (this.f33410f3) {
            case 0:
                yo0 yo0Var = this.f33411g3;
                if (yo0Var.d2 && yo0Var.f42562k2[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f10 >= org.telegram.messenger.g0.L(f11) + yo0Var.C2.f15890b) {
                    return true;
                }
                return false;
            default:
                yo0 yo0Var2 = this.f33411g3;
                if (yo0Var2.d2 && yo0Var2.f42562k2[1] != null) {
                    f12 = 111.0f;
                } else {
                    f12 = 58.0f;
                }
                if (f10 >= org.telegram.messenger.g0.L(f12) + yo0Var2.C2.f15890b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        switch (this.f33410f3) {
            case 0:
                yo0 yo0Var = this.f33411g3;
                ck0 ck0Var = yo0Var.A1;
                if (ck0Var.getVisibility() != 8) {
                    canvas.save();
                    int i7 = yo0Var.f42563l2;
                    if (yo0Var.d2 && yo0Var.f42562k2[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.g0.L(f10) + i7, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ck0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                yo0 yo0Var2 = this.f33411g3;
                ck0 ck0Var2 = yo0Var2.A1;
                if (ck0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i10 = yo0Var2.f42563l2;
                    if (yo0Var2.d2 && yo0Var2.f42562k2[1] != null) {
                        f11 = 111.0f;
                    } else {
                        f11 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.g0.L(f11) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ck0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
