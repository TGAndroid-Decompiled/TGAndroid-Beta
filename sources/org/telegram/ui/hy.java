package org.telegram.ui;

import android.content.Context;
public final class hy implements Runnable {
    public final int f37685a;
    public final iy f37686b;

    public hy(iy iyVar, int i10) {
        this.f37685a = i10;
        this.f37686b = iyVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f37685a) {
            case 0:
                iy iyVar = this.f37686b;
                py pyVar = iyVar.B0;
                Context context = iyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                pyVar.showDialog(new fg.v0(3, i10, context, pyVar, null));
                return;
            default:
                py pyVar2 = this.f37686b.B0;
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
