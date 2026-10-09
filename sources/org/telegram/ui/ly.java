package org.telegram.ui;

import android.content.Context;
public final class ly implements Runnable {
    public final int f39701a;
    public final my f39702b;

    public ly(my myVar, int i10) {
        this.f39701a = i10;
        this.f39702b = myVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39701a) {
            case 0:
                my myVar = this.f39702b;
                ty tyVar = myVar.E0;
                Context context = myVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                tyVar.showDialog(new rg.j0(3, i10, context, tyVar, null));
                return;
            default:
                ty tyVar2 = this.f39702b.E0;
                px pxVar = tyVar2.M0;
                if (pxVar != null) {
                    pxVar.dismiss();
                    tyVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
