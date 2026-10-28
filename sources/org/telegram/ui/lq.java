package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class lq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.bm0, org.telegram.ui.Components.cm0 {
    public final int f41232a;
    public final mr f41233b;

    public lq(mr mrVar, int i10) {
        this.f41232a = i10;
        this.f41233b = mrVar;
    }

    @Override
    public boolean c(int i10, View view) {
        mr mrVar = this.f41233b;
        if (mrVar.getParentActivity() != null) {
            s4.h0 adapter = mrVar.f41508c.getAdapter();
            ir irVar = mrVar.f41502a;
            if (adapter == irVar) {
                return mrVar.i0(irVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        mr.W(this.f41233b, view, i10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f41232a) {
            case 1:
                this.f41233b.v0();
                return;
            default:
                this.f41233b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        mr.V(this.f41233b, j10);
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
