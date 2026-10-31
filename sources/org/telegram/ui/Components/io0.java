package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class io0 implements ei.n, r0.m, org.telegram.ui.ActionBar.i1, ei.o {
    public final int f27048a;
    public final op0 f27049b;

    public io0(op0 op0Var, int i10) {
        this.f27048a = i10;
        this.f27049b = op0Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        WindowInsets g10 = j1Var.g();
        op0 op0Var = this.f27049b;
        op0Var.t0(g10);
        i0.c f7 = j1Var.f46132a.f(519);
        if (!op0Var.f29152y2.equals(f7)) {
            op0Var.f29152y2 = f7;
            op0Var.f21589c.requestLayout();
        }
        return r0.j1.f46131b;
    }

    @Override
    public int c() {
        op0 op0Var = this.f27049b;
        op0Var.getClass();
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, op0Var.I0);
    }

    @Override
    public void j(int i10) {
        op0 op0Var = this.f27049b;
        tg.f fVar = op0Var.G2;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (v7.u7.a(i10, 4)) {
                fVar.h(op0Var.X0.e());
            }
            fVar.e(op0Var.L2, op0Var.f21586b.getWidth(), op0Var.f21586b.getHeight());
        }
    }

    @Override
    public void r(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        org.telegram.ui.ActionBar.k1 k1Var2;
        switch (this.f27048a) {
            case 2:
                op0 op0Var = this.f27049b;
                op0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = op0Var.B2) != null && k1Var.isShowing()) {
                    op0Var.B2.d(true);
                    return;
                }
                return;
            default:
                op0 op0Var2 = this.f27049b;
                op0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var2 = op0Var2.B2) != null && k1Var2.isShowing()) {
                    op0Var2.B2.d(true);
                    return;
                }
                return;
        }
    }
}
