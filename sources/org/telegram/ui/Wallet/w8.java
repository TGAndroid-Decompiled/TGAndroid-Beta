package org.telegram.ui.Wallet;

import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hc;
import org.telegram.ui.an;
public final class w8 implements Runnable {
    public final int f43303a;
    public final m9 f43304b;

    public w8(m9 m9Var, int i7) {
        this.f43303a = i7;
        this.f43304b = m9Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i7 = this.f43303a;
        m9 m9Var = this.f43304b;
        switch (i7) {
            case 0:
                if (m9Var.I && (editTextBoldCursor = m9Var.H) != null && editTextBoldCursor.isAttachedToWindow() && m9Var.H.hasWindowFocus()) {
                    m9Var.H.requestFocus();
                    if (org.telegram.messenger.g0.K3(m9Var.H)) {
                        m9Var.I = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                float f10 = m9Var.f42815b0;
                if (f10 < 1.0f && m9Var.f42814a0 == null) {
                    r1.g gVar = new r1.g(new r1.f(f10));
                    m9Var.f42814a0 = gVar;
                    r1.h hVar = new r1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.f54267m = hVar;
                    m9Var.f42814a0.f(0.001f);
                    m9Var.f42814a0.b(new p3(m9Var, 2));
                    m9Var.f42814a0.a(new q6(m9Var, 1));
                    m9Var.f42814a0.h();
                    return;
                }
                return;
            case 2:
                m9Var.f42817d0.setLoading(false);
                return;
            case 3:
                m9Var.f42817d0.setLoading(false);
                return;
            case 4:
                m9Var.w0();
                return;
            case 5:
                m9Var.presentFragment(an.ra(m9Var.f42820f.f27105id));
                return;
            default:
                org.telegram.messenger.k5.o(null, 2131743204, hc.a0(m9Var), 2131623993, 36);
                return;
        }
    }
}
