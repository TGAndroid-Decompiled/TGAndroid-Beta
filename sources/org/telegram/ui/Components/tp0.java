package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class tp0 extends vl0 {
    public final int X2;
    public final sq0 Y2;

    public tp0(sq0 sq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = sq0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.X2) {
            case 0:
                sq0 sq0Var = this.Y2;
                if (sq0Var.f27176h0 && sq0Var.f27183o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + sq0Var.G0.f10075b) {
                    return true;
                }
                return false;
            default:
                sq0 sq0Var2 = this.Y2;
                if (sq0Var2.f27176h0 && sq0Var2.f27183o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + sq0Var2.G0.f10075b) {
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
                sq0 sq0Var = this.Y2;
                vl0 vl0Var = sq0Var.E;
                if (vl0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = sq0Var.f27184p0;
                    if (sq0Var.f27176h0 && sq0Var.f27183o0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (vl0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                sq0 sq0Var2 = this.Y2;
                vl0 vl0Var2 = sq0Var2.E;
                if (vl0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = sq0Var2.f27184p0;
                    if (sq0Var2.f27176h0 && sq0Var2.f27183o0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (vl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
