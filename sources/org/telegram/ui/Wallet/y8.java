package org.telegram.ui.Wallet;

import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cc;
import org.telegram.ui.an;
public final class y8 implements Runnable {
    public final int f44765a;
    public final p9 f44766b;

    public y8(p9 p9Var, int i7) {
        this.f44765a = i7;
        this.f44766b = p9Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i7 = this.f44765a;
        p9 p9Var = this.f44766b;
        switch (i7) {
            case 0:
                if (p9Var.J && (editTextBoldCursor = p9Var.I) != null && editTextBoldCursor.isAttachedToWindow() && p9Var.I.hasWindowFocus()) {
                    p9Var.I.requestFocus();
                    if (org.telegram.messenger.g0.J3(p9Var.I)) {
                        p9Var.J = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                float f10 = p9Var.f44335c0;
                if (f10 < 1.0f && p9Var.f44334b0 == null) {
                    r1.g gVar = new r1.g(new r1.f(f10));
                    p9Var.f44334b0 = gVar;
                    r1.h hVar = new r1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.f55748m = hVar;
                    p9Var.f44334b0.f(0.001f);
                    p9Var.f44334b0.b(new p3(p9Var, 2));
                    p9Var.f44334b0.a(new r6(p9Var, 1));
                    p9Var.f44334b0.h();
                    return;
                }
                return;
            case 2:
                p9Var.f44338e0.setLoading(false);
                return;
            case 3:
                p9Var.f44338e0.setLoading(false);
                return;
            case 4:
                p9Var.w0();
                return;
            case 5:
                p9Var.presentFragment(an.ua(p9Var.f44339f.f28200id));
                return;
            default:
                org.telegram.messenger.k5.n(null, 2131743201, cc.a0(p9Var), 2131623994, 36);
                return;
        }
    }
}
