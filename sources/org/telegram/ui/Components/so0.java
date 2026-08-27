package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

public final class so0 extends zk0 {
    public final int T2;
    public final sp0 U2;

    public so0(sp0 sp0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.T2 = i10;
        this.U2 = sp0Var;
    }

    @Override
    public final boolean E0(float f10) {
        switch (this.T2) {
            case 0:
                sp0 sp0Var = this.U2;
                return f10 >= ((float) (AndroidUtilities.dp((!sp0Var.f32524d0 || sp0Var.f32533k0[1] == null) ? 58.0f : 111.0f) + sp0Var.C0.f10490b));
            default:
                sp0 sp0Var2 = this.U2;
                return f10 >= ((float) (AndroidUtilities.dp((!sp0Var2.f32524d0 || sp0Var2.f32533k0[1] == null) ? 58.0f : 111.0f) + sp0Var2.C0.f10490b));
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.T2) {
            case 0:
                sp0 sp0Var = this.U2;
                zk0 zk0Var = sp0Var.A;
                if (zk0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!sp0Var.f32524d0 || sp0Var.f32533k0[1] == null) ? 58.0f : 111.0f) + sp0Var.f32534l0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (zk0Var.getVisibility() != 8) {
                    canvas.restore();
                }
                break;
            default:
                sp0 sp0Var2 = this.U2;
                zk0 zk0Var2 = sp0Var2.A;
                if (zk0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!sp0Var2.f32524d0 || sp0Var2.f32533k0[1] == null) ? 58.0f : 111.0f) + sp0Var2.f32534l0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (zk0Var2.getVisibility() != 8) {
                    canvas.restore();
                }
                break;
        }
    }
}
