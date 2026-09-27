package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class di0 implements Runnable {
    public final int f32985a;
    public final yi0 f32986b;

    public di0(yi0 yi0Var, int i10) {
        this.f32985a = i10;
        this.f32986b = yi0Var;
    }

    @Override
    public final void run() {
        switch (this.f32985a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                yi0 yi0Var = this.f32986b;
                yi0Var.getClass();
                vh.f.f(false);
                vh.f fVar = yi0Var.f40233i0;
                if (fVar != null) {
                    fVar.b(yi0Var.F);
                }
                AndroidUtilities.runOnUIThread(new di0(yi0Var, 0));
                return;
            case 2:
                vh.f.f(false);
                yi0 yi0Var2 = this.f32986b;
                vh.f fVar2 = yi0Var2.f40233i0;
                if (fVar2 != null) {
                    fVar2.b(yi0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new di0(yi0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
