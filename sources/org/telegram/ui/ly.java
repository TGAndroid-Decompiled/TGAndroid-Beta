package org.telegram.ui;

import android.content.Context;
public final class ly implements Runnable {
    public final int f39703a;
    public final my f39704b;

    public ly(my myVar, int i10) {
        this.f39703a = i10;
        this.f39704b = myVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39703a) {
            case 0:
                my myVar = this.f39704b;
                ty tyVar = myVar.E0;
                Context context = myVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                tyVar.showDialog(new rg.j0(3, i10, context, tyVar, null));
                return;
            default:
                ty tyVar2 = this.f39704b.E0;
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
