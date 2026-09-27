package org.telegram.ui;

import android.content.Context;
public final class ly implements Runnable {
    public final int f35473a;
    public final my f35474b;

    public ly(my myVar, int i10) {
        this.f35473a = i10;
        this.f35474b = myVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f35473a) {
            case 0:
                my myVar = this.f35474b;
                ty tyVar = myVar.E0;
                Context context = myVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.o2) tyVar).currentAccount;
                tyVar.showDialog(new rg.j0(3, i10, context, tyVar, null));
                return;
            default:
                ty tyVar2 = this.f35474b.E0;
                mx mxVar = tyVar2.M0;
                if (mxVar != null) {
                    mxVar.dismiss();
                    tyVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
