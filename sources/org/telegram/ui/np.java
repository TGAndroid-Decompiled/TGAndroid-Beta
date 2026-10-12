package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class np implements Runnable {
    public final int f40451a;
    public final xp f40452b;
    public final org.telegram.ui.ActionBar.a2[] f40453c;
    public final int d;

    public np(xp xpVar, org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, int i11) {
        this.f40451a = i11;
        this.f40452b = xpVar;
        this.f40453c = a2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f40451a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f40453c;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    final xp xpVar = this.f40452b;
                    final int i10 = this.d;
                    a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(xpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(xpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    xpVar.showDialog(a2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f40453c;
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr2[0];
                if (a2Var2 != null) {
                    final xp xpVar2 = this.f40452b;
                    final int i11 = this.d;
                    a2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(xpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(xpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    xpVar2.showDialog(a2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
