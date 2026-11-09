package org.telegram.ui.Wallet;

import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hc;
import org.telegram.ui.cn;
public final class v8 implements Runnable {
    public final int f43221a;
    public final l9 f43222b;

    public v8(l9 l9Var, int i7) {
        this.f43221a = i7;
        this.f43222b = l9Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i7 = this.f43221a;
        l9 l9Var = this.f43222b;
        switch (i7) {
            case 0:
                if (l9Var.I && (editTextBoldCursor = l9Var.H) != null && editTextBoldCursor.isAttachedToWindow() && l9Var.H.hasWindowFocus()) {
                    l9Var.H.requestFocus();
                    if (org.telegram.messenger.g0.K3(l9Var.H)) {
                        l9Var.I = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                float f10 = l9Var.f42733b0;
                if (f10 < 1.0f && l9Var.f42732a0 == null) {
                    r1.g gVar = new r1.g(new r1.f(f10));
                    l9Var.f42732a0 = gVar;
                    r1.h hVar = new r1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.f54280m = hVar;
                    l9Var.f42732a0.f(0.001f);
                    l9Var.f42732a0.b(new o3(l9Var, 2));
                    l9Var.f42732a0.a(new p6(l9Var, 1));
                    l9Var.f42732a0.h();
                    return;
                }
                return;
            case 2:
                l9Var.f42735d0.setLoading(false);
                return;
            case 3:
                l9Var.f42735d0.setLoading(false);
                return;
            case 4:
                l9Var.w0();
                return;
            case 5:
                l9Var.presentFragment(cn.ta(l9Var.f42738f.f27105id));
                return;
            default:
                org.telegram.messenger.k5.o(null, 2131743201, hc.a0(l9Var), 2131623993, 36);
                return;
        }
    }
}
