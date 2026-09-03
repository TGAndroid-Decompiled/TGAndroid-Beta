package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class oq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.il0, org.telegram.ui.Components.jl0 {
    public final int f36862a;
    public final rr f36863b;

    public oq(rr rrVar, int i10) {
        this.f36862a = i10;
        this.f36863b = rrVar;
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        rr.V(this.f36863b, view, i10);
    }

    @Override
    public boolean d(int i10, View view) {
        rr rrVar = this.f36863b;
        if (rrVar.getParentActivity() != null) {
            f2.o0 adapter = rrVar.f37961c.getAdapter();
            nr nrVar = rrVar.f37955a;
            if (adapter == nrVar) {
                return rrVar.h0(nrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f36862a) {
            case 1:
                this.f36863b.u0();
                return;
            default:
                this.f36863b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        rr.U(this.f36863b, j10);
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
