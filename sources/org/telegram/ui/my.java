package org.telegram.ui;

import android.content.Context;
public final class my implements Runnable {
    public final int f35771a;
    public final ny f35772b;

    public my(ny nyVar, int i10) {
        this.f35771a = i10;
        this.f35772b = nyVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f35771a) {
            case 0:
                ny nyVar = this.f35772b;
                uy uyVar = nyVar.E0;
                Context context = nyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                uyVar.showDialog(new rg.j0(3, i10, context, uyVar, null));
                return;
            default:
                uy uyVar2 = this.f35772b.E0;
                qx qxVar = uyVar2.M0;
                if (qxVar != null) {
                    qxVar.dismiss();
                    uyVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
