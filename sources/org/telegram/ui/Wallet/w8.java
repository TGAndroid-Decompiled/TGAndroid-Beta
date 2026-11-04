package org.telegram.ui.Wallet;

import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fc;
import org.telegram.ui.wm;
public final class w8 implements Runnable {
    public final int f43355a;
    public final m9 f43356b;

    public w8(m9 m9Var, int i3) {
        this.f43355a = i3;
        this.f43356b = m9Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i3 = this.f43355a;
        m9 m9Var = this.f43356b;
        switch (i3) {
            case 0:
                if (m9Var.J && (editTextBoldCursor = m9Var.I) != null && editTextBoldCursor.isAttachedToWindow() && m9Var.I.hasWindowFocus()) {
                    m9Var.I.requestFocus();
                    if (org.telegram.messenger.g0.K3(m9Var.I)) {
                        m9Var.J = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                float f10 = m9Var.f42871c0;
                if (f10 < 1.0f && m9Var.f42870b0 == null) {
                    q1.g gVar = new q1.g(new q1.f(f10));
                    m9Var.f42870b0 = gVar;
                    q1.h hVar = new q1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.f53653m = hVar;
                    m9Var.f42870b0.f(0.001f);
                    m9Var.f42870b0.b(new o3(m9Var, 2));
                    m9Var.f42870b0.a(new p6(m9Var, 1));
                    m9Var.f42870b0.h();
                    return;
                }
                return;
            case 2:
                m9Var.f42874e0.setLoading(false);
                return;
            case 3:
                m9Var.f42874e0.setLoading(false);
                return;
            case 4:
                m9Var.w0();
                return;
            case 5:
                m9Var.presentFragment(wm.ra(m9Var.f42875f.f27150id));
                return;
            default:
                org.telegram.messenger.k5.o(null, 2131743211, fc.a0(m9Var), 2131623993, 36);
                return;
        }
    }
}
