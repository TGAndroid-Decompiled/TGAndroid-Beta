package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class fq0 extends im0 {
    public final int V2;
    public final dr0 W2;

    public fq0(dr0 dr0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.V2 = i10;
        this.W2 = dr0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.V2) {
            case 0:
                dr0 dr0Var = this.W2;
                if (dr0Var.f25662h0 && dr0Var.f25669o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + dr0Var.G0.f12285b) {
                    return true;
                }
                return false;
            default:
                dr0 dr0Var2 = this.W2;
                if (dr0Var2.f25662h0 && dr0Var2.f25669o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + dr0Var2.G0.f12285b) {
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
                dr0 dr0Var = this.W2;
                im0 im0Var = dr0Var.E;
                if (im0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = dr0Var.f25670p0;
                    if (dr0Var.f25662h0 && dr0Var.f25669o0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (im0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                dr0 dr0Var2 = this.W2;
                im0 im0Var2 = dr0Var2.E;
                if (im0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = dr0Var2.f25670p0;
                    if (dr0Var2.f25662h0 && dr0Var2.f25669o0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (im0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
