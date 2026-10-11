package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hi0 implements Runnable {
    public final int f38480a;
    public final cj0 f38481b;

    public hi0(cj0 cj0Var, int i10) {
        this.f38480a = i10;
        this.f38481b = cj0Var;
    }

    @Override
    public final void run() {
        switch (this.f38480a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                cj0 cj0Var = this.f38481b;
                cj0Var.getClass();
                vh.f.f(false);
                vh.f fVar = cj0Var.f36770i0;
                if (fVar != null) {
                    fVar.b(cj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new hi0(cj0Var, 0));
                return;
            case 2:
                vh.f.f(false);
                cj0 cj0Var2 = this.f38481b;
                vh.f fVar2 = cj0Var2.f36770i0;
                if (fVar2 != null) {
                    fVar2.b(cj0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new hi0(cj0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
