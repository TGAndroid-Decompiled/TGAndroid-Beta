package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mi0 implements Runnable {
    public final int f38272a;
    public final hj0 f38273b;

    public mi0(hj0 hj0Var, int i10) {
        this.f38272a = i10;
        this.f38273b = hj0Var;
    }

    @Override
    public final void run() {
        switch (this.f38272a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                hj0 hj0Var = this.f38273b;
                hj0Var.getClass();
                wh.f.f(false);
                wh.f fVar = hj0Var.f36846i0;
                if (fVar != null) {
                    fVar.b(hj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new mi0(hj0Var, 0));
                return;
            case 2:
                wh.f.f(false);
                hj0 hj0Var2 = this.f38273b;
                wh.f fVar2 = hj0Var2.f36846i0;
                if (fVar2 != null) {
                    fVar2.b(hj0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new mi0(hj0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
