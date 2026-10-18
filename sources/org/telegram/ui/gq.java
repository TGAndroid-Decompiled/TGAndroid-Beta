package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class gq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.xl0, org.telegram.ui.Components.yl0 {
    public final int f37273a;
    public final jr f37274b;

    public gq(jr jrVar, int i10) {
        this.f37273a = i10;
        this.f37274b = jrVar;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        jr jrVar = this.f37274b;
        if (jrVar.getParentActivity() != null) {
            s4.g0 adapter = jrVar.f38264c.getAdapter();
            fr frVar = jrVar.f38258a;
            if (adapter == frVar) {
                return jrVar.h0(frVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        jr.V(this.f37274b, view, i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37273a) {
            case 1:
                this.f37274b.u0();
                return;
            default:
                this.f37274b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        jr.U(this.f37274b, j10);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
