package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bi0 implements Runnable {
    public final int f32124a;
    public final wi0 f32125b;

    public bi0(wi0 wi0Var, int i10) {
        this.f32124a = i10;
        this.f32125b = wi0Var;
    }

    @Override
    public final void run() {
        switch (this.f32124a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                wi0 wi0Var = this.f32125b;
                wi0Var.getClass();
                vh.g.f(false);
                vh.g gVar = wi0Var.f39008i0;
                if (gVar != null) {
                    gVar.b(wi0Var.F);
                }
                AndroidUtilities.runOnUIThread(new bi0(wi0Var, 0));
                return;
            case 2:
                vh.g.f(false);
                wi0 wi0Var2 = this.f32125b;
                vh.g gVar2 = wi0Var2.f39008i0;
                if (gVar2 != null) {
                    gVar2.b(wi0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new bi0(wi0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
