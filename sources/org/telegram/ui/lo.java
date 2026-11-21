package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class lo implements Runnable {
    public final int f49663a;
    public final vo f49664b;
    public final org.telegram.ui.ActionBar.t1[] f49665c;
    public final int d;

    public lo(vo voVar, org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, int i10) {
        this.f49663a = i10;
        this.f49664b = voVar;
        this.f49665c = t1VarArr;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f49663a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f49665c;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    final vo voVar = this.f49664b;
                    final int i7 = this.d;
                    t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    voVar.showDialog(t1VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f49665c;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr2[0];
                if (t1Var2 != null) {
                    final vo voVar2 = this.f49664b;
                    final int i10 = this.d;
                    t1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    voVar2.showDialog(t1VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
