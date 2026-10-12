package org.telegram.ui;

import android.content.Context;
public final class ny implements Runnable {
    public final int f40504a;
    public final oy f40505b;

    public ny(oy oyVar, int i10) {
        this.f40504a = i10;
        this.f40505b = oyVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40504a) {
            case 0:
                oy oyVar = this.f40505b;
                vy vyVar = oyVar.E0;
                Context context = oyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
                vyVar.showDialog(new rg.j0(3, i10, context, vyVar, null));
                return;
            default:
                vy vyVar2 = this.f40505b.E0;
                rx rxVar = vyVar2.M0;
                if (rxVar != null) {
                    rxVar.dismiss();
                    vyVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
