package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class dj0 implements Runnable {
    public final int f24282a;
    public final gj0 f24283b;

    public dj0(gj0 gj0Var, int i10) {
        this.f24282a = i10;
        this.f24283b = gj0Var;
    }

    @Override
    public final void run() {
        switch (this.f24282a) {
            case 0:
                gj0 gj0Var = this.f24283b;
                gj0Var.getClass();
                try {
                    lf.g gVar = gj0Var.A0;
                    if (gVar != null) {
                        gVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(gj0Var.f25179y0);
                return;
            case 1:
                gj0 gj0Var2 = this.f24283b;
                gj0Var2.N = null;
                gj0Var2.n();
                return;
            case 2:
                gj0.h(this.f24283b);
                return;
            case 3:
                gj0.e(this.f24283b);
                return;
            case 4:
                gj0.d(this.f24283b);
                return;
            case 5:
                gj0.f(this.f24283b);
                return;
            default:
                this.f24283b.k();
                return;
        }
    }
}
