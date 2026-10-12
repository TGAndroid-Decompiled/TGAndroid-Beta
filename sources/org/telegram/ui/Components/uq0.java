package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class uq0 extends wm0 {
    public final int V2;
    public final sr0 W2;

    public uq0(sr0 sr0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.V2 = i10;
        this.W2 = sr0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.V2) {
            case 0:
                sr0 sr0Var = this.W2;
                if (sr0Var.f30641h0 && sr0Var.f30648o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + sr0Var.G0.f11575b) {
                    return true;
                }
                return false;
            default:
                sr0 sr0Var2 = this.W2;
                if (sr0Var2.f30641h0 && sr0Var2.f30648o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + sr0Var2.G0.f11575b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        switch (this.V2) {
            case 0:
                sr0 sr0Var = this.W2;
                wm0 wm0Var = sr0Var.E;
                if (wm0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = sr0Var.f30649p0;
                    if (sr0Var.f30641h0 && sr0Var.f30648o0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (wm0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                sr0 sr0Var2 = this.W2;
                wm0 wm0Var2 = sr0Var2.E;
                if (wm0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = sr0Var2.f30649p0;
                    if (sr0Var2.f30641h0 && sr0Var2.f30648o0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (wm0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
