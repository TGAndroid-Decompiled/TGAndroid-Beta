package org.telegram.ui;

import android.view.View;
public final class lq implements org.telegram.messenger.ds, org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.ik0, org.telegram.ui.Components.jk0 {
    public final int f39357a;
    public final pr f39358b;

    public lq(pr prVar, int i10) {
        this.f39357a = i10;
        this.f39358b = prVar;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        pr.a0(this.f39358b, view, i10);
    }

    @Override
    public boolean f(int i10, View view) {
        pr prVar = this.f39358b;
        if (prVar.getParentActivity() != null) {
            s4.g0 adapter = prVar.f40531c.getAdapter();
            lr lrVar = prVar.f40525a;
            if (adapter == lrVar) {
                return prVar.m0(lrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f39357a) {
            case 1:
                this.f39358b.z0();
                return;
            default:
                this.f39358b.finishFragment();
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void run(long j10) {
        pr.Z(this.f39358b, j10);
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
