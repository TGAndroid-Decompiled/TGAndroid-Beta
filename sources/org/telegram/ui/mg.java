package org.telegram.ui;

import android.content.DialogInterface;
public final class mg implements Runnable {
    public final int f39567a;
    public final sn f39568b;
    public final org.telegram.ui.ActionBar.c2[] f39569c;
    public final int d;

    public mg(sn snVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, int i11) {
        this.f39567a = i11;
        this.f39568b = snVar;
        this.f39569c = c2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f39567a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f39569c;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final sn snVar = this.f39568b;
                    final int i10 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    snVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    snVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    snVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    snVar.showDialog(c2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f39569c;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final sn snVar2 = this.f39568b;
                    final int i11 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    snVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    snVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    snVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    snVar2.showDialog(c2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr3 = this.f39569c;
                org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr3[0];
                if (c2Var3 != null) {
                    final sn snVar3 = this.f39568b;
                    final int i12 = this.d;
                    c2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    snVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    snVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    snVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    snVar3.showDialog(c2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
