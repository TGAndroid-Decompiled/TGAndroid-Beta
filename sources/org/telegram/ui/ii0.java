package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ii0 implements Runnable {
    public final int f34615a;
    public final dj0 f34616b;

    public ii0(dj0 dj0Var, int i10) {
        this.f34615a = i10;
        this.f34616b = dj0Var;
    }

    @Override
    public final void run() {
        switch (this.f34615a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                dj0 dj0Var = this.f34616b;
                dj0Var.getClass();
                vh.f.f(false);
                vh.f fVar = dj0Var.f33090i0;
                if (fVar != null) {
                    fVar.b(dj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new ii0(dj0Var, 0));
                return;
            case 2:
                vh.f.f(false);
                dj0 dj0Var2 = this.f34616b;
                vh.f fVar2 = dj0Var2.f33090i0;
                if (fVar2 != null) {
                    fVar2.b(dj0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new ii0(dj0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
