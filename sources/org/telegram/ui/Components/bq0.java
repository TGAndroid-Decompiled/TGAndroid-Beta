package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class bq0 extends zl0 {
    public final int f25046e3;
    public final br0 f25047f3;

    public bq0(br0 br0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f25046e3 = i10;
        this.f25047f3 = br0Var;
    }

    @Override
    public final boolean F0(float f7) {
        float f10;
        float f11;
        switch (this.f25046e3) {
            case 0:
                br0 br0Var = this.f25047f3;
                if (br0Var.f25062h0 && br0Var.f25069o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + br0Var.G0.f11527b) {
                    return true;
                }
                return false;
            default:
                br0 br0Var2 = this.f25047f3;
                if (br0Var2.f25062h0 && br0Var2.f25069o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + br0Var2.G0.f11527b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        switch (this.f25046e3) {
            case 0:
                br0 br0Var = this.f25047f3;
                zl0 zl0Var = br0Var.E;
                if (zl0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = br0Var.f25070p0;
                    if (br0Var.f25062h0 && br0Var.f25069o0[1] != null) {
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
                br0 br0Var2 = this.f25047f3;
                zl0 zl0Var2 = br0Var2.E;
                if (zl0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = br0Var2.f25070p0;
                    if (br0Var2.f25062h0 && br0Var2.f25069o0[1] != null) {
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
