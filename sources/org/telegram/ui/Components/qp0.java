package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class qp0 implements li.h, r0.n, org.telegram.ui.ActionBar.m1, li.i {
    public final int f27815a;
    public final vq0 f27816b;

    public qp0(vq0 vq0Var, int i10) {
        this.f27815a = i10;
        this.f27816b = vq0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        vq0 vq0Var = this.f27816b;
        vq0Var.processLegacyContainerInsets(g10);
        i0.b f7 = l1Var.f42185a.f(519);
        if (!vq0Var.G0.equals(f7)) {
            vq0Var.G0 = f7;
            vq0Var.container.requestLayout();
        }
        return r0.l1.f42184b;
    }

    @Override
    public int g() {
        vq0 vq0Var = this.f27816b;
        vq0Var.getClass();
        return vq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6);
    }

    @Override
    public void j(int i10) {
        vq0.m(this.f27816b, i10);
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f27815a) {
            case 2:
                vq0 vq0Var = this.f27816b;
                vq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = vq0Var.J0) != null && o1Var.isShowing()) {
                    vq0Var.J0.d(true);
                    return;
                }
                return;
            default:
                vq0 vq0Var2 = this.f27816b;
                vq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var2 = vq0Var2.J0) != null && o1Var2.isShowing()) {
                    vq0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
