package org.telegram.ui;

import android.content.Context;
public final class jy implements Runnable {
    public final int f34526a;
    public final ky f34527b;

    public jy(ky kyVar, int i10) {
        this.f34526a = i10;
        this.f34527b = kyVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f34526a) {
            case 0:
                ky kyVar = this.f34527b;
                ry ryVar = kyVar.E0;
                Context context = kyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                ryVar.showDialog(new rg.j0(3, i10, context, ryVar, null));
                return;
            default:
                ry ryVar2 = this.f34527b.E0;
                nx nxVar = ryVar2.M0;
                if (nxVar != null) {
                    nxVar.dismiss();
                    ryVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
