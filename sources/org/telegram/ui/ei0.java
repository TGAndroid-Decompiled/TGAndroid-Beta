package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ei0 implements Runnable {
    public final int f36061a;
    public final zi0 f36062b;

    public ei0(zi0 zi0Var, int i10) {
        this.f36061a = i10;
        this.f36062b = zi0Var;
    }

    @Override
    public final void run() {
        switch (this.f36061a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                zi0 zi0Var = this.f36062b;
                zi0Var.getClass();
                vh.f.f(false);
                vh.f fVar = zi0Var.f43815i0;
                if (fVar != null) {
                    fVar.b(zi0Var.F);
                }
                AndroidUtilities.runOnUIThread(new ei0(zi0Var, 0));
                return;
            case 2:
                vh.f.f(false);
                zi0 zi0Var2 = this.f36062b;
                vh.f fVar2 = zi0Var2.f43815i0;
                if (fVar2 != null) {
                    fVar2.b(zi0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new ei0(zi0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
