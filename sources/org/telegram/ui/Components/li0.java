package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class li0 implements Runnable {

    public final int f30393a;

    public final oi0 f30394b;

    public li0(oi0 oi0Var, int i10) {
        this.f30393a = i10;
        this.f30394b = oi0Var;
    }

    @Override
    public final void run() {
        switch (this.f30393a) {
            case 0:
                oi0 oi0Var = this.f30394b;
                oi0Var.getClass();
                try {
                    gf.h hVar = oi0Var.f31340z0;
                    if (hVar != null) {
                        hVar.b();
                    }
                    break;
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(oi0Var.f31337x0);
                break;
            case 1:
                oi0 oi0Var2 = this.f30394b;
                oi0Var2.M = null;
                oi0Var2.n();
                break;
            case 2:
                oi0.h(this.f30394b);
                break;
            case 3:
                oi0.e(this.f30394b);
                break;
            case 4:
                oi0.d(this.f30394b);
                break;
            case 5:
                oi0.f(this.f30394b);
                break;
            default:
                this.f30394b.k();
                break;
        }
    }
}
