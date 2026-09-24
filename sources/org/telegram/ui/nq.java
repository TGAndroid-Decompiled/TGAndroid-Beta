package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class nq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ll0, org.telegram.ui.Components.ml0 {
    public final int f35938a;
    public final pr f35939b;

    public nq(pr prVar, int i10) {
        this.f35938a = i10;
        this.f35939b = prVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        pr.V(this.f35939b, view, i10);
    }

    @Override
    public boolean d(int i10, View view) {
        pr prVar = this.f35939b;
        if (prVar.getParentActivity() != null) {
            s4.h0 adapter = prVar.f36604c.getAdapter();
            lr lrVar = prVar.f36598a;
            if (adapter == lrVar) {
                return prVar.h0(lrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f35938a) {
            case 1:
                this.f35939b.u0();
                return;
            default:
                this.f35939b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        pr.U(this.f35939b, j3);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
