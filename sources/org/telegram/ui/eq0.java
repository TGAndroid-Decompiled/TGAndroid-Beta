package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class eq0 implements org.telegram.ui.Components.e5, org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.m1, org.telegram.ui.ActionBar.b2 {
    public final int f39159a;
    public final rq0 f39160b;

    public eq0(rq0 rq0Var, int i10) {
        this.f39159a = i10;
        this.f39160b = rq0Var;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        switch (this.f39159a) {
            case 0:
                this.f39160b.f0(i10, z10);
                return;
            default:
                this.f39160b.f0(i10, z10);
                return;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        rq0 rq0Var = this.f39160b;
        if (rq0Var.Y) {
            rq0Var.b0(view, rq0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.x5) {
            org.telegram.ui.Components.qm0 qm0Var = rq0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.x5) view).a();
            rq0Var.X = z10;
            qm0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        rq0 rq0Var = this.f39160b;
        uq0 uq0Var = rq0Var.f43267t0;
        if (uq0Var != null) {
            switch (uq0Var.f44517a) {
                case 0:
                    vq0 vq0Var = uq0Var.f44518b;
                    vq0Var.f44885a.a0();
                    vq0Var.f44886b.a0();
                    return;
                default:
                    vq0 vq0Var2 = uq0Var.f44518b;
                    vq0Var2.f44885a.a0();
                    vq0Var2.f44886b.a0();
                    return;
            }
        }
        rq0Var.a0();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        rq0 rq0Var = this.f39160b;
        rq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = rq0Var.m0) != null && o1Var.isShowing()) {
            rq0Var.m0.d(true);
        }
    }
}
