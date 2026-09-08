package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hi0 implements Runnable {
    public final int f37062a;
    public final cj0 f37063b;

    public hi0(cj0 cj0Var, int i10) {
        this.f37062a = i10;
        this.f37063b = cj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37062a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                cj0 cj0Var = this.f37063b;
                cj0Var.getClass();
                wh.g.f(false);
                wh.g gVar = cj0Var.f35167i0;
                if (gVar != null) {
                    gVar.b(cj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new hi0(cj0Var, 0));
                return;
            case 2:
                wh.g.f(false);
                cj0 cj0Var2 = this.f37063b;
                wh.g gVar2 = cj0Var2.f35167i0;
                if (gVar2 != null) {
                    gVar2.b(cj0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new hi0(cj0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
