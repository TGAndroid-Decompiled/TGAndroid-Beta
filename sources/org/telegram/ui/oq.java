package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class oq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.nl0, org.telegram.ui.Components.ol0 {
    public final int f36239a;
    public final qr f36240b;

    public oq(qr qrVar, int i10) {
        this.f36239a = i10;
        this.f36240b = qrVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        qr.V(this.f36240b, view, i10);
    }

    @Override
    public boolean d(int i10, View view) {
        qr qrVar = this.f36240b;
        if (qrVar.getParentActivity() != null) {
            s4.h0 adapter = qrVar.f36823c.getAdapter();
            mr mrVar = qrVar.f36817a;
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
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36239a) {
            case 1:
                this.f36240b.u0();
                return;
            default:
                this.f36240b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        qr.U(this.f36240b, j3);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
