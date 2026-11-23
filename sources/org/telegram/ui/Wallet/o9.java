package org.telegram.ui.Wallet;

import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kc;
import org.telegram.ui.bn;
public final class o9 implements Runnable {
    public final int f44833a;
    public final ea f44834b;

    public o9(ea eaVar, int i7) {
        this.f44833a = i7;
        this.f44834b = eaVar;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i7 = this.f44833a;
        ea eaVar = this.f44834b;
        switch (i7) {
            case 0:
                if (eaVar.J && (editTextBoldCursor = eaVar.I) != null && editTextBoldCursor.isAttachedToWindow() && eaVar.I.hasWindowFocus()) {
                    eaVar.I.requestFocus();
                    if (org.telegram.messenger.g0.I3(eaVar.I)) {
                        eaVar.J = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                float f10 = eaVar.f44227c0;
                if (f10 < 1.0f && eaVar.f44226b0 == null) {
                    r1.g gVar = new r1.g(new r1.f(f10));
                    eaVar.f44226b0 = gVar;
                    r1.h hVar = new r1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.f56446m = hVar;
                    eaVar.f44226b0.f(0.001f);
                    eaVar.f44226b0.b(new z3(eaVar, 2));
                    eaVar.f44226b0.a(new i7(eaVar, 1));
                    eaVar.f44226b0.h();
                    return;
                }
                return;
            case 2:
                eaVar.f44230e0.setLoading(false);
                return;
            case 3:
                eaVar.f44230e0.setLoading(false);
                return;
            case 4:
                eaVar.w0();
                return;
            case 5:
                eaVar.presentFragment(bn.ua(eaVar.f44231f.f28641id));
                return;
            default:
                org.telegram.messenger.f3.n(null, 2131742950, kc.b0(eaVar), 2131623994, 36);
                return;
        }
    }
}
