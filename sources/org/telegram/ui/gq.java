package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class gq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.bm0, org.telegram.ui.Components.cm0 {
    public final int f37651a;
    public final jr f37652b;

    public gq(jr jrVar, int i10) {
        this.f37651a = i10;
        this.f37652b = jrVar;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        jr.V(this.f37652b, view, i10);
    }

    @Override
    public boolean d(int i10, View view) {
        jr jrVar = this.f37652b;
        if (jrVar.getParentActivity() != null) {
            s4.g0 adapter = jrVar.f38634c.getAdapter();
            fr frVar = jrVar.f38628a;
            if (adapter == frVar) {
                return jrVar.h0(frVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37651a) {
            case 1:
                this.f37652b.u0();
                return;
            default:
                this.f37652b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        jr.U(this.f37652b, j10);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
