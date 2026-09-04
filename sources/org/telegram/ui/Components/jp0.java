package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class jp0 extends ll0 {
    public final int X2;
    public final hq0 Y2;

    public jp0(hq0 hq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = hq0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.X2) {
            case 0:
                hq0 hq0Var = this.Y2;
                if (hq0Var.f26798h0 && hq0Var.f26805o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + hq0Var.G0.f11426b) {
                    return true;
                }
                return false;
            default:
                hq0 hq0Var2 = this.Y2;
                if (hq0Var2.f26798h0 && hq0Var2.f26805o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + hq0Var2.G0.f11426b) {
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
                hq0 hq0Var = this.Y2;
                ll0 ll0Var = hq0Var.E;
                if (ll0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = hq0Var.f26806p0;
                    if (hq0Var.f26798h0 && hq0Var.f26805o0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ll0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                hq0 hq0Var2 = this.Y2;
                ll0 ll0Var2 = hq0Var2.E;
                if (ll0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = hq0Var2.f26806p0;
                    if (hq0Var2.f26798h0 && hq0Var2.f26805o0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ll0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
