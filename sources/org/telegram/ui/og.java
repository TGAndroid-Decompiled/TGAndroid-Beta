package org.telegram.ui;

import android.content.DialogInterface;
public final class og implements Runnable {
    public final int f40255a;
    public final un f40256b;
    public final org.telegram.ui.ActionBar.x1[] f40257c;
    public final int d;

    public og(un unVar, org.telegram.ui.ActionBar.x1[] x1VarArr, int i10, int i11) {
        this.f40255a = i11;
        this.f40256b = unVar;
        this.f40257c = x1VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f40255a) {
            case 0:
                org.telegram.ui.ActionBar.x1[] x1VarArr = this.f40257c;
                org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
                if (x1Var != null) {
                    final un unVar = this.f40256b;
                    final int i10 = this.d;
                    x1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    unVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    unVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    unVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    unVar.showDialog(x1VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.x1[] x1VarArr2 = this.f40257c;
                org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr2[0];
                if (x1Var2 != null) {
                    final un unVar2 = this.f40256b;
                    final int i11 = this.d;
                    x1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    unVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    unVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    unVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    unVar2.showDialog(x1VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.x1[] x1VarArr3 = this.f40257c;
                org.telegram.ui.ActionBar.x1 x1Var3 = x1VarArr3[0];
                if (x1Var3 != null) {
                    final un unVar3 = this.f40256b;
                    final int i12 = this.d;
                    x1Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    unVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    unVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    unVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    unVar3.showDialog(x1VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
