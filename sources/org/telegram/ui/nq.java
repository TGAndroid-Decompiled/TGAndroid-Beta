package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class nq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ol0, org.telegram.ui.Components.pl0 {
    public final int f36099a;
    public final pr f36100b;

    public nq(pr prVar, int i10) {
        this.f36099a = i10;
        this.f36100b = prVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        pr.V(this.f36100b, view, i10);
    }

    @Override
    public boolean d(int i10, View view) {
        pr prVar = this.f36100b;
        if (prVar.getParentActivity() != null) {
            s4.h0 adapter = prVar.f36715c.getAdapter();
            lr lrVar = prVar.f36709a;
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
        switch (this.f36099a) {
            case 1:
                this.f36100b.u0();
                return;
            default:
                this.f36100b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        pr.U(this.f36100b, j3);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
