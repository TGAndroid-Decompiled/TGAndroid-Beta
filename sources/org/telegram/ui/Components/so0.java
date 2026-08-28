package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class so0 extends wk0 {
    public final int T2;
    public final rp0 U2;

    public so0(rp0 rp0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.T2 = i9;
        this.U2 = rp0Var;
    }

    @Override
    public final boolean E0(float f10) {
        float f11;
        float f12;
        switch (this.T2) {
            case 0:
                rp0 rp0Var = this.U2;
                if (rp0Var.f32246d0 && rp0Var.f32255k0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f10 >= AndroidUtilities.dp(f11) + rp0Var.C0.f10849b) {
                    return true;
                }
                return false;
            default:
                rp0 rp0Var2 = this.U2;
                if (rp0Var2.f32246d0 && rp0Var2.f32255k0[1] != null) {
                    f12 = 111.0f;
                } else {
                    f12 = 58.0f;
                }
                if (f10 >= AndroidUtilities.dp(f12) + rp0Var2.C0.f10849b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        switch (this.T2) {
            case 0:
                rp0 rp0Var = this.U2;
                wk0 wk0Var = rp0Var.A;
                if (wk0Var.getVisibility() != 8) {
                    canvas.save();
                    int i9 = rp0Var.f32256l0;
                    if (rp0Var.f32246d0 && rp0Var.f32255k0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i9, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (wk0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                rp0 rp0Var2 = this.U2;
                wk0 wk0Var2 = rp0Var2.A;
                if (wk0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i10 = rp0Var2.f32256l0;
                    if (rp0Var2.f32246d0 && rp0Var2.f32255k0[1] != null) {
                        f11 = 111.0f;
                    } else {
                        f11 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f11) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (wk0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
