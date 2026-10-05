package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class pq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nl0, org.telegram.ui.Components.ol0 {
    public final int f39617a;
    public final rr f39618b;

    public pq(rr rrVar, int i10) {
        this.f39617a = i10;
        this.f39618b = rrVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        rr.T(this.f39618b, view, i10);
    }

    @Override
    public boolean d(int i10, View view) {
        rr rrVar = this.f39618b;
        if (rrVar.getParentActivity() != null) {
            s4.h0 adapter = rrVar.f40170c.getAdapter();
            nr nrVar = rrVar.f40164a;
            if (adapter == nrVar) {
                return rrVar.h0(nrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39617a) {
            case 1:
                this.f39618b.u0();
                return;
            default:
                this.f39618b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        rr.S(this.f39618b, j3);
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
