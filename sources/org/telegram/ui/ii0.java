package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ii0 implements Runnable {
    public final int f38667a;
    public final dj0 f38668b;

    public ii0(dj0 dj0Var, int i10) {
        this.f38667a = i10;
        this.f38668b = dj0Var;
    }

    @Override
    public final void run() {
        switch (this.f38667a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                dj0 dj0Var = this.f38668b;
                dj0Var.getClass();
                vh.f.f(false);
                vh.f fVar = dj0Var.f37001i0;
                if (fVar != null) {
                    fVar.b(dj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new ii0(dj0Var, 0));
                return;
            case 2:
                vh.f.f(false);
                dj0 dj0Var2 = this.f38668b;
                vh.f fVar2 = dj0Var2.f37001i0;
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
