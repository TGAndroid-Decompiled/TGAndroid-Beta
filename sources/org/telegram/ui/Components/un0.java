package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class un0 implements ri.m, r0.m, org.telegram.ui.ActionBar.f1, ri.n {
    public final int f40382a;
    public final yo0 f40383b;

    public un0(yo0 yo0Var, int i7) {
        this.f40382a = i7;
        this.f40383b = yo0Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        yo0 yo0Var = this.f40383b;
        yo0Var.t0(g10);
        i0.b f10 = l1Var.f56258a.f(519);
        if (!yo0Var.C2.equals(f10)) {
            yo0Var.C2 = f10;
            yo0Var.f30193c.requestLayout();
        }
        return r0.l1.f56257b;
    }

    @Override
    public int e() {
        yo0 yo0Var = this.f40383b;
        yo0Var.getClass();
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, yo0Var.J0);
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.h1 h1Var;
        org.telegram.ui.ActionBar.h1 h1Var2;
        switch (this.f40382a) {
            case 2:
                yo0 yo0Var = this.f40383b;
                yo0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h1Var = yo0Var.F2) != null && h1Var.isShowing()) {
                    yo0Var.F2.d(true);
                    return;
                }
                return;
            default:
                yo0 yo0Var2 = this.f40383b;
                yo0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h1Var2 = yo0Var2.F2) != null && h1Var2.isShowing()) {
                    yo0Var2.F2.d(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void l(int i7) {
        yo0 yo0Var = this.f40383b;
        dh.g gVar = yo0Var.K2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.dd.a(i7, 4)) {
                gVar.h(yo0Var.Y0.e());
            }
            gVar.e(yo0Var.P2, yo0Var.f30190b.getWidth(), yo0Var.f30190b.getHeight());
        }
    }
}
