package org.telegram.ui;

import android.content.Context;
public final class oy implements Runnable {
    public final int f35642a;
    public final py f35643b;

    public oy(py pyVar, int i10) {
        this.f35642a = i10;
        this.f35643b = pyVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f35642a) {
            case 0:
                py pyVar = this.f35643b;
                wy wyVar = pyVar.E0;
                Context context = pyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                wyVar.showDialog(new qg.k0(3, i10, context, wyVar, null));
                return;
            default:
                wy wyVar2 = this.f35643b.E0;
                sx sxVar = wyVar2.M0;
                if (sxVar != null) {
                    sxVar.dismiss();
                    wyVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
