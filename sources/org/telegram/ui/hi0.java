package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hi0 implements Runnable {
    public final int f34170a;
    public final cj0 f34171b;

    public hi0(cj0 cj0Var, int i10) {
        this.f34170a = i10;
        this.f34171b = cj0Var;
    }

    @Override
    public final void run() {
        switch (this.f34170a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                cj0 cj0Var = this.f34171b;
                cj0Var.getClass();
                vh.g.f(false);
                vh.g gVar = cj0Var.f32683i0;
                if (gVar != null) {
                    gVar.b(cj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new hi0(cj0Var, 0));
                return;
            case 2:
                vh.g.f(false);
                cj0 cj0Var2 = this.f34171b;
                vh.g gVar2 = cj0Var2.f32683i0;
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
