package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class np0 extends tl0 {
    public final int U2;
    public final mq0 V2;

    public np0(mq0 mq0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.U2 = i10;
        this.V2 = mq0Var;
    }

    @Override
    public final boolean E0(float f10) {
        float f11;
        float f12;
        switch (this.U2) {
            case 0:
                mq0 mq0Var = this.V2;
                if (mq0Var.f29203e0 && mq0Var.f29211l0[1] != null) {
                    f11 = 111.0f;
                } else {
                    f11 = 58.0f;
                }
                if (f10 >= AndroidUtilities.dp(f11) + mq0Var.D0.f7758b) {
                    return true;
                }
                return false;
            default:
                mq0 mq0Var2 = this.V2;
                if (mq0Var2.f29203e0 && mq0Var2.f29211l0[1] != null) {
                    f12 = 111.0f;
                } else {
                    f12 = 58.0f;
                }
                if (f10 >= AndroidUtilities.dp(f12) + mq0Var2.D0.f7758b) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        switch (this.U2) {
            case 0:
                mq0 mq0Var = this.V2;
                tl0 tl0Var = mq0Var.B;
                if (tl0Var.getVisibility() != 8) {
                    canvas.save();
                    int i10 = mq0Var.m0;
                    if (mq0Var.f29203e0 && mq0Var.f29211l0[1] != null) {
                        f10 = 111.0f;
                    } else {
                        f10 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f10) + i10, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (tl0Var.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                mq0 mq0Var2 = this.V2;
                tl0 tl0Var2 = mq0Var2.B;
                if (tl0Var2.getVisibility() != 8) {
                    canvas.save();
                    int i11 = mq0Var2.m0;
                    if (mq0Var2.f29203e0 && mq0Var2.f29211l0[1] != null) {
                        f11 = 111.0f;
                    } else {
                        f11 = 58.0f;
                    }
                    canvas.clipRect(0, AndroidUtilities.dp(f11) + i11, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (tl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
