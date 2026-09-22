package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gi0 implements Runnable {
    public final int f33862a;
    public final bj0 f33863b;

    public gi0(bj0 bj0Var, int i10) {
        this.f33862a = i10;
        this.f33863b = bj0Var;
    }

    @Override
    public final void run() {
        switch (this.f33862a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                bj0 bj0Var = this.f33863b;
                bj0Var.getClass();
                vh.g.f(false);
                vh.g gVar = bj0Var.f32185i0;
                if (gVar != null) {
                    gVar.b(bj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new gi0(bj0Var, 0));
                return;
            case 2:
                vh.g.f(false);
                bj0 bj0Var2 = this.f33863b;
                vh.g gVar2 = bj0Var2.f32185i0;
                if (gVar2 != null) {
                    gVar2.b(bj0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new gi0(bj0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
