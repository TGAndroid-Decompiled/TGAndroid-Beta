package org.telegram.ui;

import android.content.Context;
public final class hy implements Runnable {
    public final int f37497a;
    public final iy f37498b;

    public hy(iy iyVar, int i10) {
        this.f37497a = i10;
        this.f37498b = iyVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f37497a) {
            case 0:
                iy iyVar = this.f37498b;
                py pyVar = iyVar.B0;
                Context context = iyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                pyVar.showDialog(new fg.v0(3, i10, context, pyVar, null));
                return;
            default:
                py pyVar2 = this.f37498b.B0;
                mx mxVar = pyVar2.J0;
                if (mxVar != null) {
                    mxVar.dismiss();
                    pyVar2.J0 = null;
                    return;
                }
                return;
        }
    }
}
