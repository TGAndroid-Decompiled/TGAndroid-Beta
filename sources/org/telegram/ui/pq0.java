package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class pq0 implements org.telegram.ui.Components.b5, org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.m1, org.telegram.ui.ActionBar.b2 {
    public final int f36718a;
    public final cr0 f36719b;

    public pq0(cr0 cr0Var, int i10) {
        this.f36718a = i10;
        this.f36719b = cr0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f36718a) {
            case 0:
                this.f36719b.e0(i10, z10);
                return;
            default:
                this.f36719b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        cr0 cr0Var = this.f36719b;
        if (cr0Var.Y) {
            cr0Var.a0(view, cr0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.s5) {
            org.telegram.ui.Components.ol0 ol0Var = cr0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
            cr0Var.X = z10;
            ol0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        cr0 cr0Var = this.f36719b;
        hr0 hr0Var = cr0Var.f32900t0;
        if (hr0Var != null) {
            switch (hr0Var.f34335a) {
                case 0:
                    ir0 ir0Var = hr0Var.f34336b;
                    ir0Var.f34662a.Z();
                    ir0Var.f34663b.Z();
                    return;
                default:
                    ir0 ir0Var2 = hr0Var.f34336b;
                    ir0Var2.f34662a.Z();
                    ir0Var2.f34663b.Z();
                    return;
            }
        }
        cr0Var.Z();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        cr0 cr0Var = this.f36719b;
        cr0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = cr0Var.m0) != null && o1Var.isShowing()) {
            cr0Var.m0.d(true);
        }
    }
}
