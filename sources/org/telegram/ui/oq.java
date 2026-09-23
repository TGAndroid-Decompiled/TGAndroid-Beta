package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class oq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.bl0, org.telegram.ui.Components.cl0 {
    public final int f35944a;
    public final qr f35945b;

    public oq(qr qrVar, int i10) {
        this.f35944a = i10;
        this.f35945b = qrVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        qr.V(this.f35945b, view, i10);
    }

    @Override
    public boolean d(int i10, View view) {
        qr qrVar = this.f35945b;
        if (qrVar.getParentActivity() != null) {
            s4.h0 adapter = qrVar.f36551c.getAdapter();
            mr mrVar = qrVar.f36545a;
            if (adapter == mrVar) {
                return qrVar.h0(mrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35944a) {
            case 1:
                this.f35945b.u0();
                return;
            default:
                this.f35945b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        qr.U(this.f35945b, j3);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
