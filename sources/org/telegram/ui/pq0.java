package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class pq0 implements org.telegram.ui.Components.c5, org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.l1, org.telegram.ui.ActionBar.a2 {
    public final int f36671a;
    public final cr0 f36672b;

    public pq0(cr0 cr0Var, int i10) {
        this.f36671a = i10;
        this.f36672b = cr0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f36671a) {
            case 0:
                this.f36672b.e0(i10, z10);
                return;
            default:
                this.f36672b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        cr0 cr0Var = this.f36672b;
        if (cr0Var.Y) {
            cr0Var.a0(view, cr0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.u5) {
            org.telegram.ui.Components.xl0 xl0Var = cr0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.u5) view).a();
            cr0Var.X = z10;
            xl0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        cr0 cr0Var = this.f36672b;
        gr0 gr0Var = cr0Var.f32857t0;
        if (gr0Var != null) {
            switch (gr0Var.f33954a) {
                case 0:
                    hr0 hr0Var = gr0Var.f33955b;
                    hr0Var.f34263a.Z();
                    hr0Var.f34264b.Z();
                    return;
                default:
                    hr0 hr0Var2 = gr0Var.f33955b;
                    hr0Var2.f34263a.Z();
                    hr0Var2.f34264b.Z();
                    return;
            }
        }
        cr0Var.Z();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        cr0 cr0Var = this.f36672b;
        cr0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = cr0Var.m0) != null && n1Var.isShowing()) {
            cr0Var.m0.d(true);
        }
    }
}
