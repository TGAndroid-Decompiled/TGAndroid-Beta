package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class zp0 extends zl0 {
    public final int f31048e3;
    public final xq0 f31049f3;

    public zp0(xq0 xq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f31048e3 = i10;
        this.f31049f3 = xq0Var;
    }

    @Override
    public final boolean F0(float f7) {
        float f10;
        float f11;
        switch (this.f31048e3) {
            case 0:
                xq0 xq0Var = this.f31049f3;
                if (xq0Var.f30464h0 && xq0Var.f30471o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + xq0Var.G0.f10591b) {
                    return true;
                }
                return false;
            default:
                xq0 xq0Var2 = this.f31049f3;
                if (xq0Var2.f30464h0 && xq0Var2.f30471o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + xq0Var2.G0.f10591b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        switch (this.f31048e3) {
            case 0:
                xq0 xq0Var = this.f31049f3;
                zl0 zl0Var = xq0Var.E;
                if (zl0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = xq0Var.f30472p0;
                    if (xq0Var.f30464h0 && xq0Var.f30471o0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (zl0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                xq0 xq0Var2 = this.f31049f3;
                zl0 zl0Var2 = xq0Var2.E;
                if (zl0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = xq0Var2.f30472p0;
                    if (xq0Var2.f30464h0 && xq0Var2.f30471o0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (zl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
