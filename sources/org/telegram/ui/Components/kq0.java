package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class kq0 extends lm0 {
    public final int Y2;
    public final hr0 Z2;

    public kq0(hr0 hr0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.Y2 = i10;
        this.Z2 = hr0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.Y2) {
            case 0:
                hr0 hr0Var = this.Z2;
                if (hr0Var.f27132i0 && hr0Var.f27139p0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + hr0Var.H0.f12316b) {
                    return true;
                }
                return false;
            default:
                hr0 hr0Var2 = this.Z2;
                if (hr0Var2.f27132i0 && hr0Var2.f27139p0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + hr0Var2.H0.f12316b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        switch (this.Y2) {
            case 0:
                hr0 hr0Var = this.Z2;
                lm0 lm0Var = hr0Var.F;
                if (lm0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = hr0Var.f27140q0;
                    if (hr0Var.f27132i0 && hr0Var.f27139p0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (lm0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                hr0 hr0Var2 = this.Z2;
                lm0 lm0Var2 = hr0Var2.F;
                if (lm0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = hr0Var2.f27140q0;
                    if (hr0Var2.f27132i0 && hr0Var2.f27139p0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (lm0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
