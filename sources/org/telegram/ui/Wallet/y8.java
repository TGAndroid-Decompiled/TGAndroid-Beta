package org.telegram.ui.Wallet;

import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gc;
import org.telegram.ui.cn;
public final class y8 implements Runnable {
    public final int f43390a;
    public final o9 f43391b;

    public y8(o9 o9Var, int i7) {
        this.f43390a = i7;
        this.f43391b = o9Var;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i7 = this.f43390a;
        o9 o9Var = this.f43391b;
        switch (i7) {
            case 0:
                if (o9Var.I && (editTextBoldCursor = o9Var.H) != null && editTextBoldCursor.isAttachedToWindow() && o9Var.H.hasWindowFocus()) {
                    o9Var.H.requestFocus();
                    if (org.telegram.messenger.g0.K3(o9Var.H)) {
                        o9Var.I = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                float f10 = o9Var.f42917b0;
                if (f10 < 1.0f && o9Var.f42916a0 == null) {
                    r1.g gVar = new r1.g(new r1.f(f10));
                    o9Var.f42916a0 = gVar;
                    r1.h hVar = new r1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.f54279m = hVar;
                    o9Var.f42916a0.f(0.001f);
                    o9Var.f42916a0.b(new q3(o9Var, 2));
                    o9Var.f42916a0.a(new s6(o9Var, 1));
                    o9Var.f42916a0.h();
                    return;
                }
                return;
            case 2:
                o9Var.f42919d0.setLoading(false);
                return;
            case 3:
                o9Var.f42919d0.setLoading(false);
                return;
            case 4:
                o9Var.w0();
                return;
            case 5:
                o9Var.presentFragment(cn.ta(o9Var.f42922f.f27109id));
                return;
            default:
                org.telegram.messenger.k5.o(null, 2131743201, gc.a0(o9Var), 2131623993, 36);
                return;
        }
    }
}
