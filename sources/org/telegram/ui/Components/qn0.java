package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class qn0 extends tj0 {
    public final int f37505f3;
    public final oo0 f37506g3;

    public qn0(oo0 oo0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.f37505f3 = i3;
        this.f37506g3 = oo0Var;
    }

    @Override
    public final boolean E0(float f10) {
        float f11;
        float f12;
        switch (this.f37505f3) {
            case 0:
                oo0 oo0Var = this.f37506g3;
                if (oo0Var.f36875a2 && oo0Var.f36881h2[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f10 >= org.telegram.messenger.g0.L(f11) + oo0Var.f36914z2.f14496b) {
                    return true;
                }
                return false;
            default:
                oo0 oo0Var2 = this.f37506g3;
                if (oo0Var2.f36875a2 && oo0Var2.f36881h2[1] != null) {
                    f12 = 111.0f;
                } else {
                    f12 = 58.0f;
                }
                if (f10 >= org.telegram.messenger.g0.L(f12) + oo0Var2.f36914z2.f14496b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        switch (this.f37505f3) {
            case 0:
                oo0 oo0Var = this.f37506g3;
                tj0 tj0Var = oo0Var.f36909x1;
                if (tj0Var.getVisibility() != 8) {
                    canvas.save();
                    int i3 = oo0Var.f36882i2;
                    if (oo0Var.f36875a2 && oo0Var.f36881h2[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.g0.L(f10) + i3, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (tj0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                oo0 oo0Var2 = this.f37506g3;
                tj0 tj0Var2 = oo0Var2.f36909x1;
                if (tj0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i10 = oo0Var2.f36882i2;
                    if (oo0Var2.f36875a2 && oo0Var2.f36881h2[1] != null) {
                        f11 = 111.0f;
                    } else {
                        f11 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.g0.L(f11) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (tj0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
