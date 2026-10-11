package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class pq0 extends rm0 {
    public final int V2;
    public final nr0 W2;

    public pq0(nr0 nr0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.V2 = i10;
        this.W2 = nr0Var;
    }

    @Override
    public final boolean E0(float f7) {
        float f10;
        float f11;
        switch (this.V2) {
            case 0:
                nr0 nr0Var = this.W2;
                if (nr0Var.f29243h0 && nr0Var.f29250o0[1] != null) {
                    f10 = 111.0f;
                } else {
                    f10 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f10) + nr0Var.G0.f11576b) {
                    return true;
                }
                return false;
            default:
                nr0 nr0Var2 = this.W2;
                if (nr0Var2.f29243h0 && nr0Var2.f29250o0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f7 >= AndroidUtilities.dp(f11) + nr0Var2.G0.f11576b) {
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
                nr0 nr0Var = this.W2;
                rm0 rm0Var = nr0Var.E;
                if (rm0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = nr0Var.f29251p0;
                    if (nr0Var.f29243h0 && nr0Var.f29250o0[1] != null) {
                        f7 = 111.0f;
                    } else {
                        f7 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f7) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (rm0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                nr0 nr0Var2 = this.W2;
                rm0 rm0Var2 = nr0Var2.E;
                if (rm0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = nr0Var2.f29251p0;
                    if (nr0Var2.f29243h0 && nr0Var2.f29250o0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (rm0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
