package org.telegram.ui;

import android.content.DialogInterface;
public final class og implements Runnable {
    public final int f42181a;
    public final un f42182b;
    public final org.telegram.ui.ActionBar.e2[] f42183c;
    public final int d;

    public og(un unVar, org.telegram.ui.ActionBar.e2[] e2VarArr, int i10, int i11) {
        this.f42181a = i11;
        this.f42182b = unVar;
        this.f42183c = e2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f42181a) {
            case 0:
                org.telegram.ui.ActionBar.e2[] e2VarArr = this.f42183c;
                org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                if (e2Var != null) {
                    final un unVar = this.f42182b;
                    final int i10 = this.d;
                    e2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    unVar.showDialog(e2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = this.f42183c;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2VarArr2[0];
                if (e2Var2 != null) {
                    final un unVar2 = this.f42182b;
                    final int i11 = this.d;
                    e2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    unVar2.showDialog(e2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e2[] e2VarArr3 = this.f42183c;
                org.telegram.ui.ActionBar.e2 e2Var3 = e2VarArr3[0];
                if (e2Var3 != null) {
                    final un unVar3 = this.f42182b;
                    final int i12 = this.d;
                    e2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    unVar3.showDialog(e2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
