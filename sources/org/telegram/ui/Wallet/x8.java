package org.telegram.ui.Wallet;

import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hc;
import org.telegram.ui.an;
public final class x8 implements Runnable {
    public final int f43334a;
    public final n9 f43335b;

    public x8(n9 n9Var, int i7) {
        this.f43334a = i7;
        this.f43335b = n9Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i7 = this.f43334a;
        n9 n9Var = this.f43335b;
        switch (i7) {
            case 0:
                if (n9Var.I && (editTextBoldCursor = n9Var.H) != null && editTextBoldCursor.isAttachedToWindow() && n9Var.H.hasWindowFocus()) {
                    n9Var.H.requestFocus();
                    if (org.telegram.messenger.g0.K3(n9Var.H)) {
                        n9Var.I = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                float f10 = n9Var.f42845b0;
                if (f10 < 1.0f && n9Var.f42844a0 == null) {
                    r1.g gVar = new r1.g(new r1.f(f10));
                    n9Var.f42844a0 = gVar;
                    r1.h hVar = new r1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.f54174m = hVar;
                    n9Var.f42844a0.f(0.001f);
                    n9Var.f42844a0.b(new q3(n9Var, 2));
                    n9Var.f42844a0.a(new r6(n9Var, 1));
                    n9Var.f42844a0.h();
                    return;
                }
                return;
            case 2:
                n9Var.f42847d0.setLoading(false);
                return;
            case 3:
                n9Var.f42847d0.setLoading(false);
                return;
            case 4:
                n9Var.w0();
                return;
            case 5:
                n9Var.presentFragment(an.ra(n9Var.f42850f.f27102id));
                return;
            default:
                org.telegram.messenger.k5.o(null, 2131743202, hc.a0(n9Var), 2131623993, 36);
                return;
        }
    }
}
