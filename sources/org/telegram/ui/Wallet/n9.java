package org.telegram.ui.Wallet;

import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;
public final class n9 implements Runnable {
    public final int f44661a;
    public final da f44662b;

    public n9(da daVar, int i7) {
        this.f44661a = i7;
        this.f44662b = daVar;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        int i7 = this.f44661a;
        da daVar = this.f44662b;
        switch (i7) {
            case 0:
                if (daVar.J && (editTextBoldCursor = daVar.I) != null && editTextBoldCursor.isAttachedToWindow() && daVar.I.hasWindowFocus()) {
                    daVar.I.requestFocus();
                    if (org.telegram.messenger.g0.I3(daVar.I)) {
                        daVar.J = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                float f10 = daVar.f44055c0;
                if (f10 < 1.0f && daVar.f44054b0 == null) {
                    r1.g gVar = new r1.g(new r1.f(f10));
                    daVar.f44054b0 = gVar;
                    r1.h hVar = new r1.h(1.0f);
                    hVar.a(0.55f);
                    hVar.b(65.0f);
                    gVar.f56323m = hVar;
                    daVar.f44054b0.f(0.001f);
                    daVar.f44054b0.b(new y3(daVar, 2));
                    daVar.f44054b0.a(new h7(daVar, 1));
                    daVar.f44054b0.h();
                    return;
                }
                return;
            case 2:
                daVar.f44058e0.setLoading(false);
                return;
            case 3:
                daVar.f44058e0.setLoading(false);
                return;
            case 4:
                daVar.w0();
                return;
            case 5:
                daVar.presentFragment(bn.ua(daVar.f44059f.f28554id));
                return;
            default:
                org.telegram.messenger.f3.n(null, 2131742963, lc.b0(daVar), 2131623994, 36);
                return;
        }
    }
}
