package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class po0 extends uk0 {
    public final int f29465e3;
    public final pp0 f29466f3;

    public po0(pp0 pp0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.f29465e3 = i10;
        this.f29466f3 = pp0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.f29465e3) {
            case 0:
                pp0 pp0Var = this.f29466f3;
                if (pp0Var.Z1 && pp0Var.f29473g2[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= org.telegram.messenger.i0.L(f10) + pp0Var.f29507y2.f7767b) {
                    return true;
                }
                return false;
            default:
                pp0 pp0Var2 = this.f29466f3;
                if (pp0Var2.Z1 && pp0Var2.f29473g2[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= org.telegram.messenger.i0.L(f11) + pp0Var2.f29507y2.f7767b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        switch (this.f29465e3) {
            case 0:
                pp0 pp0Var = this.f29466f3;
                uk0 uk0Var = pp0Var.f29502w1;
                if (uk0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = pp0Var.f29474h2;
                    if (pp0Var.Z1 && pp0Var.f29473g2[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.i0.L(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (uk0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                pp0 pp0Var2 = this.f29466f3;
                uk0 uk0Var2 = pp0Var2.f29502w1;
                if (uk0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = pp0Var2.f29474h2;
                    if (pp0Var2.Z1 && pp0Var2.f29473g2[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, org.telegram.messenger.i0.L(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (uk0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
