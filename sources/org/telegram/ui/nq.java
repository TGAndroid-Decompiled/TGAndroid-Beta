package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class nq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.kl0, org.telegram.ui.Components.ll0 {
    public final int f39502a;
    public final qr f39503b;

    public nq(qr qrVar, int i10) {
        this.f39502a = i10;
        this.f39503b = qrVar;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        qr.V(this.f39503b, view, i10);
    }

    @Override
    public boolean f(int i10, View view) {
        qr qrVar = this.f39503b;
        if (qrVar.getParentActivity() != null) {
            f2.p0 adapter = qrVar.f40605c.getAdapter();
            mr mrVar = qrVar.f40599a;
            if (adapter == mrVar) {
                return qrVar.h0(mrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39502a) {
            case 1:
                this.f39503b.u0();
                return;
            default:
                this.f39503b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        qr.U(this.f39503b, j10);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
