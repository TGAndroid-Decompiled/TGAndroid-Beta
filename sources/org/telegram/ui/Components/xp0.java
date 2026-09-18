package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class xp0 extends wl0 {
    public final int X2;
    public final vq0 Y2;

    public xp0(vq0 vq0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.X2 = i10;
        this.Y2 = vq0Var;
    }

    @Override
    public final boolean F0(float f7) {
        float f10;
        float f11;
        switch (this.X2) {
            case 0:
                vq0 vq0Var = this.Y2;
                if (vq0Var.f29722h0 && vq0Var.f29729o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + vq0Var.G0.f10592b) {
                    return true;
                }
                return false;
            default:
                vq0 vq0Var2 = this.Y2;
                if (vq0Var2.f29722h0 && vq0Var2.f29729o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + vq0Var2.G0.f10592b) {
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
                vq0 vq0Var = this.Y2;
                wl0 wl0Var = vq0Var.E;
                if (wl0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = vq0Var.f29730p0;
                    if (vq0Var.f29722h0 && vq0Var.f29729o0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (wl0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                vq0 vq0Var2 = this.Y2;
                wl0 wl0Var2 = vq0Var2.E;
                if (wl0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = vq0Var2.f29730p0;
                    if (vq0Var2.f29722h0 && vq0Var2.f29729o0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (wl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
