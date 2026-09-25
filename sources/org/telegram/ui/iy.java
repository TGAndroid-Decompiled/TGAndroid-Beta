package org.telegram.ui;

import android.content.Context;
public final class iy implements Runnable {
    public final int f34598a;
    public final jy f34599b;

    public iy(jy jyVar, int i10) {
        this.f34598a = i10;
        this.f34599b = jyVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f34598a) {
            case 0:
                jy jyVar = this.f34599b;
                qy qyVar = jyVar.E0;
                Context context = jyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                qyVar.showDialog(new rg.j0(3, i10, context, qyVar, null));
                return;
            default:
                qy qyVar2 = this.f34599b.E0;
                mx mxVar = qyVar2.M0;
                if (mxVar != null) {
                    mxVar.dismiss();
                    qyVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
