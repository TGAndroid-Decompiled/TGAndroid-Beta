package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class eq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.nk0, org.telegram.ui.Components.ok0 {
    public final int f38005a;
    public final jr f38006b;

    public eq(jr jrVar, int i9) {
        this.f38005a = i9;
        this.f38006b = jrVar;
    }

    @Override
    public boolean a(int i9, View view) {
        jr jrVar = this.f38006b;
        if (jrVar.getParentActivity() != null) {
            f2.r0 adapter = jrVar.f39563c.getAdapter();
            er erVar = jrVar.f39557a;
            if (adapter == erVar) {
                return jrVar.g0(erVar.E(i9), false, view);
            }
        }
        return false;
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        jr.U(this.f38006b, view, i9);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f38005a) {
            case 1:
                this.f38006b.t0();
                return;
            default:
                this.f38006b.finishFragment();
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void run(long j10) {
        jr.T(this.f38006b, j10);
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
