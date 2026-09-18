package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class pp0 implements r0.n, org.telegram.ui.ActionBar.l1 {
    public final int f27294a;
    public final vq0 f27295b;

    public pp0(vq0 vq0Var, int i10) {
        this.f27294a = i10;
        this.f27295b = vq0Var;
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        vq0 vq0Var = this.f27295b;
        vq0Var.processLegacyContainerInsets(g10);
        i0.b f7 = m1Var.f42109a.f(519);
        if (!vq0Var.G0.equals(f7)) {
            vq0Var.G0 = f7;
            vq0Var.container.requestLayout();
        }
        return r0.m1.f42108b;
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f27294a) {
            case 1:
                vq0 vq0Var = this.f27295b;
                vq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = vq0Var.J0) != null && n1Var.isShowing()) {
                    vq0Var.J0.d(true);
                    return;
                }
                return;
            default:
                vq0 vq0Var2 = this.f27295b;
                vq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = vq0Var2.J0) != null && n1Var2.isShowing()) {
                    vq0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
