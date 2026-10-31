package org.telegram.ui.Wallet;

import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cc;
import org.telegram.ui.un;
public final class c9 implements Runnable {
    public final int f34359a;
    public final r9 f34360b;

    public c9(r9 r9Var, int i10) {
        this.f34359a = i10;
        this.f34360b = r9Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i10 = this.f34359a;
        r9 r9Var = this.f34360b;
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
                float f7 = r9Var.f35126b0;
                if (f7 < 1.0f && r9Var.f35125a0 == null) {
                    o1.j jVar = new o1.j(new o1.i(f7));
                    r9Var.f35125a0 = jVar;
                    o1.k kVar = new o1.k(1.0f);
                    kVar.a(0.55f);
                    kVar.b(65.0f);
                    jVar.f13957m = kVar;
                    r9Var.f35125a0.f(0.001f);
                    r9Var.f35125a0.b(new q3(r9Var, 2));
                    r9Var.f35125a0.a(new v6(r9Var, 1));
                    r9Var.f35125a0.h();
                    return;
                }
                return;
            case 2:
                r9Var.f35128d0.setLoading(false);
                return;
            case 3:
                r9Var.f35128d0.setLoading(false);
                return;
            case 4:
                r9Var.v0();
                return;
            case 5:
                r9Var.presentFragment(un.ha(r9Var.f35130f.f19942id));
                return;
            default:
                org.telegram.messenger.m5.n(null, 2131743227, cc.a0(r9Var), 2131623993, 36);
                return;
        }
    }
}
