package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class li0 implements Runnable {
    public final int f37766a;
    public final gj0 f37767b;

    public li0(gj0 gj0Var, int i10) {
        this.f37766a = i10;
        this.f37767b = gj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37766a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                gj0 gj0Var = this.f37767b;
                gj0Var.getClass();
                wh.f.f(false);
                wh.f fVar = gj0Var.f36244i0;
                if (fVar != null) {
                    fVar.b(gj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new li0(gj0Var, 0));
                return;
            case 2:
                wh.f.f(false);
                gj0 gj0Var2 = this.f37767b;
                wh.f fVar2 = gj0Var2.f36244i0;
                if (fVar2 != null) {
                    fVar2.b(gj0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new li0(gj0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
