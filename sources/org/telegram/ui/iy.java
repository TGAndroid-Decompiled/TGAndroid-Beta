package org.telegram.ui;

import android.content.Context;
public final class iy implements Runnable {
    public final int f35042a;
    public final jy f35043b;

    public iy(jy jyVar, int i10) {
        this.f35042a = i10;
        this.f35043b = jyVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f35042a) {
            case 0:
                jy jyVar = this.f35043b;
                qy qyVar = jyVar.B0;
                Context context = jyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                qyVar.showDialog(new eg.v0(3, i10, context, qyVar, null));
                return;
            default:
                qy qyVar2 = this.f35043b.B0;
                nx nxVar = qyVar2.J0;
                if (nxVar != null) {
                    nxVar.dismiss();
                    qyVar2.J0 = null;
                    return;
                }
                return;
        }
    }
}
