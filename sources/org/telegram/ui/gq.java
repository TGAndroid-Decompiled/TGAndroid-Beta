package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class gq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.xl0, org.telegram.ui.Components.yl0 {
    public final int f37293a;
    public final jr f37294b;

    public gq(jr jrVar, int i10) {
        this.f37293a = i10;
        this.f37294b = jrVar;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        jr jrVar = this.f37294b;
        if (jrVar.getParentActivity() != null) {
            s4.g0 adapter = jrVar.f38270c.getAdapter();
            fr frVar = jrVar.f38264a;
            if (adapter == frVar) {
                return jrVar.h0(frVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        jr.V(this.f37294b, view, i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37293a) {
            case 1:
                this.f37294b.u0();
                return;
            default:
                this.f37294b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        jr.U(this.f37294b, j10);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
