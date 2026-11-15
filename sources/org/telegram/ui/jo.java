package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class jo implements Runnable {
    public final int f48389a;
    public final to f48390b;
    public final org.telegram.ui.ActionBar.t1[] f48391c;
    public final int d;

    public jo(to toVar, org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, int i10) {
        this.f48389a = i10;
        this.f48390b = toVar;
        this.f48391c = t1VarArr;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f48389a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f48391c;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    final to toVar = this.f48390b;
                    final int i7 = this.d;
                    t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(toVar.currentAccount).cancelRequest(i7, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(toVar.currentAccount).cancelRequest(i7, true);
                                    return;
                            }
                        }
                    });
                    toVar.showDialog(t1VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f48391c;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr2[0];
                if (t1Var2 != null) {
                    final to toVar2 = this.f48390b;
                    final int i10 = this.d;
                    t1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(toVar2.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(toVar2.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    toVar2.showDialog(t1VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
