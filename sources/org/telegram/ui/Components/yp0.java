package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class yp0 extends yl0 {
    public final int X2;
    public final wq0 Y2;

    public yp0(wq0 wq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = wq0Var;
    }

    @Override
    public final boolean F0(float f7) {
        float f10;
        float f11;
        switch (this.X2) {
            case 0:
                wq0 wq0Var = this.Y2;
                if (wq0Var.f30107h0 && wq0Var.f30114o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + wq0Var.G0.f10593b) {
                    return true;
                }
                return false;
            default:
                wq0 wq0Var2 = this.Y2;
                if (wq0Var2.f30107h0 && wq0Var2.f30114o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + wq0Var2.G0.f10593b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        switch (this.X2) {
            case 0:
                wq0 wq0Var = this.Y2;
                yl0 yl0Var = wq0Var.E;
                if (yl0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = wq0Var.f30115p0;
                    if (wq0Var.f30107h0 && wq0Var.f30114o0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (yl0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                wq0 wq0Var2 = this.Y2;
                yl0 yl0Var2 = wq0Var2.E;
                if (yl0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = wq0Var2.f30115p0;
                    if (wq0Var2.f30107h0 && wq0Var2.f30114o0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (yl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
