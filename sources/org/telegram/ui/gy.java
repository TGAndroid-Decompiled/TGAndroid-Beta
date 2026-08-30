package org.telegram.ui;

import android.content.Context;
public final class gy implements Runnable {
    public final int f34698a;
    public final hy f34699b;

    public gy(hy hyVar, int i10) {
        this.f34698a = i10;
        this.f34699b = hyVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f34698a) {
            case 0:
                hy hyVar = this.f34699b;
                oy oyVar = hyVar.B0;
                Context context = hyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                oyVar.showDialog(new eg.v0(3, i10, context, oyVar, null));
                return;
            default:
                oy oyVar2 = this.f34699b.B0;
                lx lxVar = oyVar2.J0;
                if (lxVar != null) {
                    lxVar.dismiss();
                    oyVar2.J0 = null;
                    return;
                }
                return;
        }
    }
}
