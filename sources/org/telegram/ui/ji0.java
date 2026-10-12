package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ji0 implements Runnable {
    public final int f39217a;
    public final ej0 f39218b;

    public ji0(ej0 ej0Var, int i10) {
        this.f39217a = i10;
        this.f39218b = ej0Var;
    }

    @Override
    public final void run() {
        switch (this.f39217a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                ej0 ej0Var = this.f39218b;
                ej0Var.getClass();
                vh.f.f(false);
                vh.f fVar = ej0Var.f37138i0;
                if (fVar != null) {
                    fVar.b(ej0Var.F);
                }
                AndroidUtilities.runOnUIThread(new ji0(ej0Var, 0));
                return;
            case 2:
                vh.f.f(false);
                ej0 ej0Var2 = this.f39218b;
                vh.f fVar2 = ej0Var2.f37138i0;
                if (fVar2 != null) {
                    fVar2.b(ej0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new ji0(ej0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
