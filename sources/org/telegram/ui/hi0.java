package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hi0 implements Runnable {
    public final int f33398a;
    public final cj0 f33399b;

    public hi0(cj0 cj0Var, int i10) {
        this.f33398a = i10;
        this.f33399b = cj0Var;
    }

    @Override
    public final void run() {
        switch (this.f33398a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                cj0 cj0Var = this.f33399b;
                cj0Var.getClass();
                uh.g.f(false);
                uh.g gVar = cj0Var.f31694i0;
                if (gVar != null) {
                    gVar.b(cj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new hi0(cj0Var, 0));
                return;
            case 2:
                uh.g.f(false);
                cj0 cj0Var2 = this.f33399b;
                uh.g gVar2 = cj0Var2.f31694i0;
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
