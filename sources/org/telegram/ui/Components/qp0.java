package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class qp0 implements r0.n, org.telegram.ui.ActionBar.l1 {
    public final int f27648a;
    public final wq0 f27649b;

    public qp0(wq0 wq0Var, int i10) {
        this.f27648a = i10;
        this.f27649b = wq0Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        wq0 wq0Var = this.f27649b;
        wq0Var.processLegacyContainerInsets(g10);
        i0.b f7 = l1Var.f42175a.f(519);
        if (!wq0Var.G0.equals(f7)) {
            wq0Var.G0 = f7;
            wq0Var.container.requestLayout();
        }
        return r0.l1.f42174b;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f27648a) {
            case 1:
                wq0 wq0Var = this.f27649b;
                wq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = wq0Var.J0) != null && n1Var.isShowing()) {
                    wq0Var.J0.d(true);
                    return;
                }
                return;
            default:
                wq0 wq0Var2 = this.f27649b;
                wq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = wq0Var2.J0) != null && n1Var2.isShowing()) {
                    wq0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
