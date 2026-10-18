package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class y21 implements Runnable {
    public final int f32527a;
    public final q31 f32528b;

    public y21(q31 q31Var, int i10) {
        this.f32527a = i10;
        this.f32528b = q31Var;
    }

    @Override
    public final void run() {
        switch (this.f32527a) {
            case 0:
                q31 q31Var = this.f32528b;
                f31 f31Var = q31Var.G;
                f31Var.x1(true);
                d31 d31Var = q31Var.f29574s;
                d31Var.x1(true);
                q31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(d31Var);
                AndroidUtilities.updateVisibleRows(f31Var);
                return;
            default:
                q31 q31Var2 = this.f32528b;
                if (q31Var2.k()) {
                    q31Var2.l();
                    return;
                }
                return;
        }
    }
}
