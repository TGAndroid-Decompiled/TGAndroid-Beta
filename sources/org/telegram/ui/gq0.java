package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class gq0 implements org.telegram.ui.Components.e5, org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.m1, org.telegram.ui.ActionBar.b2 {
    public final int f39669a;
    public final tq0 f39670b;

    public gq0(tq0 tq0Var, int i10) {
        this.f39669a = i10;
        this.f39670b = tq0Var;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        switch (this.f39669a) {
            case 0:
                this.f39670b.f0(i10, z10);
                return;
            default:
                this.f39670b.f0(i10, z10);
                return;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        tq0 tq0Var = this.f39670b;
        if (tq0Var.Y) {
            tq0Var.b0(view, tq0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.x5) {
            org.telegram.ui.Components.rm0 rm0Var = tq0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.x5) view).a();
            tq0Var.X = z10;
            rm0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        tq0 tq0Var = this.f39670b;
        wq0 wq0Var = tq0Var.f43753t0;
        if (wq0Var != null) {
            switch (wq0Var.f45385a) {
                case 0:
                    xq0 xq0Var = wq0Var.f45386b;
                    xq0Var.f45760a.a0();
                    xq0Var.f45761b.a0();
                    return;
                default:
                    xq0 xq0Var2 = wq0Var.f45386b;
                    xq0Var2.f45760a.a0();
                    xq0Var2.f45761b.a0();
                    return;
            }
        }
        tq0Var.a0();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        tq0 tq0Var = this.f39670b;
        tq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = tq0Var.m0) != null && o1Var.isShowing()) {
            tq0Var.m0.d(true);
        }
    }
}
