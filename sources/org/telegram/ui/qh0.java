package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qh0 implements Runnable {
    public final int f40585a;
    public final li0 f40586b;

    public qh0(li0 li0Var, int i10) {
        this.f40585a = i10;
        this.f40586b = li0Var;
    }

    @Override
    public final void run() {
        switch (this.f40585a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                li0 li0Var = this.f40586b;
                li0Var.getClass();
                wh.f.f(false);
                wh.f fVar = li0Var.f38942i0;
                if (fVar != null) {
                    fVar.b(li0Var.F);
                }
                AndroidUtilities.runOnUIThread(new qh0(li0Var, 0));
                return;
            case 2:
                wh.f.f(false);
                li0 li0Var2 = this.f40586b;
                wh.f fVar2 = li0Var2.f38942i0;
                if (fVar2 != null) {
                    fVar2.b(li0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new qh0(li0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
