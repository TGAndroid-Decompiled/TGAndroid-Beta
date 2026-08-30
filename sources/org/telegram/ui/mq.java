package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class mq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.jl0, org.telegram.ui.Components.kl0 {
    public final int f36369a;
    public final pr f36370b;

    public mq(pr prVar, int i10) {
        this.f36369a = i10;
        this.f36370b = prVar;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        pr.V(this.f36370b, view, i10);
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public boolean f(int i10, View view) {
        pr prVar = this.f36370b;
        if (prVar.getParentActivity() != null) {
            f2.o0 adapter = prVar.f37450c.getAdapter();
            lr lrVar = prVar.f37444a;
            if (adapter == lrVar) {
                return prVar.h0(lrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f36369a) {
            case 1:
                this.f36370b.u0();
                return;
            default:
                this.f36370b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        pr.U(this.f36370b, j10);
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
