package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class gq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0 {
    public final int f38647a;
    public final jr f38648b;

    public gq(jr jrVar, int i10) {
        this.f38647a = i10;
        this.f38648b = jrVar;
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        jr.V(this.f38648b, view, i10);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i10, View view) {
        jr jrVar = this.f38648b;
        if (jrVar.getParentActivity() != null) {
            f2.p0 adapter = jrVar.f39624c.getAdapter();
            fr frVar = jrVar.f39618a;
            if (adapter == frVar) {
                return jrVar.h0(frVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38647a) {
            case 1:
                this.f38648b.u0();
                return;
            default:
                this.f38648b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        jr.U(this.f38648b, j10);
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
