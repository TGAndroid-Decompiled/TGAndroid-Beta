package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class aq0 extends zl0 {
    public final int f24636e3;
    public final zq0 f24637f3;

    public aq0(zq0 zq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f24636e3 = i10;
        this.f24637f3 = zq0Var;
    }

    @Override
    public final boolean F0(float f7) {
        float f10;
        float f11;
        switch (this.f24636e3) {
            case 0:
                zq0 zq0Var = this.f24637f3;
                if (zq0Var.f33613h0 && zq0Var.f33620o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + zq0Var.G0.f11527b) {
                    return true;
                }
                return false;
            default:
                zq0 zq0Var2 = this.f24637f3;
                if (zq0Var2.f33613h0 && zq0Var2.f33620o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + zq0Var2.G0.f11527b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        switch (this.f24636e3) {
            case 0:
                zq0 zq0Var = this.f24637f3;
                zl0 zl0Var = zq0Var.E;
                if (zl0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = zq0Var.f33621p0;
                    if (zq0Var.f33613h0 && zq0Var.f33620o0[1] != null) {
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
                zq0 zq0Var2 = this.f24637f3;
                zl0 zl0Var2 = zq0Var2.E;
                if (zl0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = zq0Var2.f33621p0;
                    if (zq0Var2.f33613h0 && zq0Var2.f33620o0[1] != null) {
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
