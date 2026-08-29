package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ph0 implements Runnable {
    public final int f41414a;
    public final ki0 f41415b;

    public ph0(ki0 ki0Var, int i10) {
        this.f41414a = i10;
        this.f41415b = ki0Var;
    }

    @Override
    public final void run() {
        switch (this.f41414a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                ki0 ki0Var = this.f41415b;
                ki0Var.getClass();
                gh.j.f(false);
                gh.j jVar = ki0Var.f39880e0;
                if (jVar != null) {
                    jVar.b(ki0Var.B);
                }
                AndroidUtilities.runOnUIThread(new ph0(ki0Var, 0));
                return;
            case 2:
                gh.j.f(false);
                ki0 ki0Var2 = this.f41415b;
                gh.j jVar2 = ki0Var2.f39880e0;
                if (jVar2 != null) {
                    jVar2.b(ki0Var2.B);
                }
                AndroidUtilities.runOnUIThread(new ph0(ki0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
