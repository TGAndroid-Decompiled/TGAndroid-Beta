package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

public final class gq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.qk0, org.telegram.ui.Components.rk0 {

    public final int f38463a;

    public final lr f38464b;

    public gq(lr lrVar, int i10) {
        this.f38463a = i10;
        this.f38464b = lrVar;
    }

    @Override
    public boolean a(int i10, View view) {
        lr lrVar = this.f38464b;
        if (lrVar.getParentActivity() != null) {
            f2.q0 adapter = lrVar.f40185c.getAdapter();
            hr hrVar = lrVar.f40179a;
            if (adapter == hrVar) {
                return lrVar.h0(hrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        lr.V(this.f38464b, view, i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38463a) {
            case 1:
                this.f38464b.u0();
                break;
            default:
                this.f38464b.finishFragment();
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void run(long j10) {
        lr.U(this.f38464b, j10);
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
