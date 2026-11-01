package org.telegram.ui.Wallet;

import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cc;
import org.telegram.ui.un;
public final class c9 implements Runnable {
    public final int f34360a;
    public final r9 f34361b;

    public c9(r9 r9Var, int i10) {
        this.f34360a = i10;
        this.f34361b = r9Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i10 = this.f34360a;
        r9 r9Var = this.f34361b;
        switch (i10) {
            case 0:
                if (r9Var.I && (editTextBoldCursor = r9Var.H) != null && editTextBoldCursor.isAttachedToWindow() && r9Var.H.hasWindowFocus()) {
                    r9Var.H.requestFocus();
                    if (org.telegram.messenger.i0.J3(r9Var.H)) {
                        r9Var.I = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                float f7 = r9Var.f35131b0;
                if (f7 < 1.0f && r9Var.f35130a0 == null) {
                    o1.j jVar = new o1.j(new o1.i(f7));
                    r9Var.f35130a0 = jVar;
                    o1.k kVar = new o1.k(1.0f);
                    kVar.a(0.55f);
                    kVar.b(65.0f);
                    jVar.f13958m = kVar;
                    r9Var.f35130a0.f(0.001f);
                    r9Var.f35130a0.b(new q3(r9Var, 2));
                    r9Var.f35130a0.a(new v6(r9Var, 1));
                    r9Var.f35130a0.h();
                    return;
                }
                return;
            case 2:
                r9Var.f35133d0.setLoading(false);
                return;
            case 3:
                r9Var.f35133d0.setLoading(false);
                return;
            case 4:
                r9Var.w0();
                return;
            case 5:
                r9Var.presentFragment(un.ma(r9Var.f35135f.f19943id));
                return;
            default:
                org.telegram.messenger.m5.n(null, 2131743227, cc.a0(r9Var), 2131623993, 36);
                return;
        }
    }
}
