package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s21 implements Runnable {
    public final int f26923a;
    public final k31 f26924b;

    public s21(k31 k31Var, int i10) {
        this.f26923a = i10;
        this.f26924b = k31Var;
    }

    @Override
    public final void run() {
        switch (this.f26923a) {
            case 0:
                k31 k31Var = this.f26924b;
                a31 a31Var = k31Var.G;
                a31Var.v1(true);
                y21 y21Var = k31Var.f24597s;
                y21Var.v1(true);
                k31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(y21Var);
                AndroidUtilities.updateVisibleRows(a31Var);
                return;
            default:
                k31 k31Var2 = this.f26924b;
                if (k31Var2.k()) {
                    k31Var2.l();
                    return;
                }
                return;
        }
    }
}
