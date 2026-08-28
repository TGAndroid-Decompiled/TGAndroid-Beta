package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qh0 implements Runnable {
    public final int f41804a;
    public final li0 f41805b;

    public qh0(li0 li0Var, int i9) {
        this.f41804a = i9;
        this.f41805b = li0Var;
    }

    @Override
    public final void run() {
        switch (this.f41804a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                li0 li0Var = this.f41805b;
                li0Var.getClass();
                dh.k.f(false);
                dh.k kVar = li0Var.f40155e0;
                if (kVar != null) {
                    kVar.b(li0Var.B);
                }
                AndroidUtilities.runOnUIThread(new qh0(li0Var, 0));
                return;
            case 2:
                dh.k.f(false);
                li0 li0Var2 = this.f41805b;
                dh.k kVar2 = li0Var2.f40155e0;
                if (kVar2 != null) {
                    kVar2.b(li0Var2.B);
                }
                AndroidUtilities.runOnUIThread(new qh0(li0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
