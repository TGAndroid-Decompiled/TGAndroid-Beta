package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ji0 implements Runnable {
    public final int f39220a;
    public final ej0 f39221b;

    public ji0(ej0 ej0Var, int i10) {
        this.f39220a = i10;
        this.f39221b = ej0Var;
    }

    @Override
    public final void run() {
        switch (this.f39220a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                ej0 ej0Var = this.f39221b;
                ej0Var.getClass();
                vh.f.f(false);
                vh.f fVar = ej0Var.f37143i0;
                if (fVar != null) {
                    fVar.b(ej0Var.F);
                }
                AndroidUtilities.runOnUIThread(new ji0(ej0Var, 0));
                return;
            case 2:
                vh.f.f(false);
                ej0 ej0Var2 = this.f39221b;
                vh.f fVar2 = ej0Var2.f37143i0;
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
