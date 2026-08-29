package org.telegram.ui;

import android.content.DialogInterface;
public final class kg implements Runnable {
    public final int f39859a;
    public final tn f39860b;
    public final org.telegram.ui.ActionBar.c2[] f39861c;
    public final int d;

    public kg(tn tnVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, int i11) {
        this.f39859a = i11;
        this.f39860b = tnVar;
        this.f39861c = c2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f39859a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f39861c;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final tn tnVar = this.f39860b;
                    final int i10 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    tnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    tnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    tnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    tnVar.showDialog(c2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f39861c;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final tn tnVar2 = this.f39860b;
                    final int i11 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    tnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    tnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    tnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    tnVar2.showDialog(c2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr3 = this.f39861c;
                org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr3[0];
                if (c2Var3 != null) {
                    final tn tnVar3 = this.f39860b;
                    final int i12 = this.d;
                    c2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    tnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    tnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    tnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    tnVar3.showDialog(c2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
