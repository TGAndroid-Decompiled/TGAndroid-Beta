package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ii0 implements Runnable {
    public final int f34590a;
    public final dj0 f34591b;

    public ii0(dj0 dj0Var, int i10) {
        this.f34590a = i10;
        this.f34591b = dj0Var;
    }

    @Override
    public final void run() {
        switch (this.f34590a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                dj0 dj0Var = this.f34591b;
                dj0Var.getClass();
                vh.g.f(false);
                vh.g gVar = dj0Var.f33070i0;
                if (gVar != null) {
                    gVar.b(dj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new ii0(dj0Var, 0));
                return;
            case 2:
                vh.g.f(false);
                dj0 dj0Var2 = this.f34591b;
                vh.g gVar2 = dj0Var2.f33070i0;
                if (gVar2 != null) {
                    gVar2.b(dj0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new ii0(dj0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
