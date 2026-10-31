package org.telegram.ui;

import android.view.View;
public final class lq implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.hk0, org.telegram.ui.Components.ik0 {
    public final int f39365a;
    public final pr f39366b;

    public lq(pr prVar, int i10) {
        this.f39365a = i10;
        this.f39366b = prVar;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        pr.Z(this.f39366b, view, i10);
    }

    @Override
    public boolean f(int i10, View view) {
        pr prVar = this.f39366b;
        if (prVar.getParentActivity() != null) {
            s4.g0 adapter = prVar.f40724c.getAdapter();
            lr lrVar = prVar.f40718a;
            if (adapter == lrVar) {
                return prVar.l0(lrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f39365a) {
            case 1:
                this.f39366b.y0();
                return;
            default:
                this.f39366b.finishFragment();
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void run(long j10) {
        pr.Y(this.f39366b, j10);
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
