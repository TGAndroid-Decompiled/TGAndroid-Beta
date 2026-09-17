package org.telegram.ui;

import android.content.Context;
public final class oy implements Runnable {
    public final int f36454a;
    public final py f36455b;

    public oy(py pyVar, int i10) {
        this.f36454a = i10;
        this.f36455b = pyVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f36454a) {
            case 0:
                py pyVar = this.f36455b;
                wy wyVar = pyVar.E0;
                Context context = pyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
                wyVar.showDialog(new rg.j0(3, i10, context, wyVar, null));
                return;
            default:
                wy wyVar2 = this.f36455b.E0;
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
