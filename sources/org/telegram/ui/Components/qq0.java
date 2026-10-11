package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class qq0 extends sm0 {
    public final int V2;
    public final or0 W2;

    public qq0(or0 or0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.V2 = i10;
        this.W2 = or0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.V2) {
            case 0:
                or0 or0Var = this.W2;
                if (or0Var.f29486h0 && or0Var.f29493o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + or0Var.G0.f11576b) {
                    return true;
                }
                return false;
            default:
                or0 or0Var2 = this.W2;
                if (or0Var2.f29486h0 && or0Var2.f29493o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + or0Var2.G0.f11576b) {
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
                or0 or0Var = this.W2;
                sm0 sm0Var = or0Var.E;
                if (sm0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = or0Var.f29494p0;
                    if (or0Var.f29486h0 && or0Var.f29493o0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (sm0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                or0 or0Var2 = this.W2;
                sm0 sm0Var2 = or0Var2.E;
                if (sm0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = or0Var2.f29494p0;
                    if (or0Var2.f29486h0 && or0Var2.f29493o0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (sm0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
