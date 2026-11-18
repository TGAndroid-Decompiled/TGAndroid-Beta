package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class lo implements Runnable {
    public final int f49612a;
    public final vo f49613b;
    public final org.telegram.ui.ActionBar.u1[] f49614c;
    public final int d;

    public lo(vo voVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, int i10) {
        this.f49612a = i10;
        this.f49613b = voVar;
        this.f49614c = u1VarArr;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f49612a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f49614c;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    final vo voVar = this.f49613b;
                    final int i7 = this.d;
                    u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(voVar.currentAccount).cancelRequest(i7, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(voVar.currentAccount).cancelRequest(i7, true);
                                    return;
                            }
                        }
                    });
                    voVar.showDialog(u1VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.f49614c;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr2[0];
                if (u1Var2 != null) {
                    final vo voVar2 = this.f49613b;
                    final int i10 = this.d;
                    u1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(voVar2.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(voVar2.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    voVar2.showDialog(u1VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
