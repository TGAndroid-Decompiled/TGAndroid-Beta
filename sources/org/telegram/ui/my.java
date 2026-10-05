package org.telegram.ui;

import android.content.Context;
public final class my implements Runnable {
    public final int f38768a;
    public final ny f38769b;

    public my(ny nyVar, int i10) {
        this.f38768a = i10;
        this.f38769b = nyVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38768a) {
            case 0:
                ny nyVar = this.f38769b;
                uy uyVar = nyVar.E0;
                Context context = nyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                uyVar.showDialog(new rg.k0(3, i10, context, uyVar, null));
                return;
            default:
                uy uyVar2 = this.f38769b.E0;
                ox oxVar = uyVar2.M0;
                if (oxVar != null) {
                    oxVar.dismiss();
                    uyVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
