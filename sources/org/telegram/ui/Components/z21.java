package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class z21 implements Runnable {
    public final int f32823a;
    public final r31 f32824b;

    public z21(r31 r31Var, int i10) {
        this.f32823a = i10;
        this.f32824b = r31Var;
    }

    @Override
    public final void run() {
        switch (this.f32823a) {
            case 0:
                r31 r31Var = this.f32824b;
                g31 g31Var = r31Var.G;
                g31Var.x1(true);
                e31 e31Var = r31Var.f29825s;
                e31Var.x1(true);
                r31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(e31Var);
                AndroidUtilities.updateVisibleRows(g31Var);
                return;
            default:
                r31 r31Var2 = this.f32824b;
                if (r31Var2.k()) {
                    r31Var2.l();
                    return;
                }
                return;
        }
    }
}
