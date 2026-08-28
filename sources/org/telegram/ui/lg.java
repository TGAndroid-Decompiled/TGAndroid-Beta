package org.telegram.ui;

import android.content.DialogInterface;
public final class lg implements Runnable {
    public final int f40130a;
    public final qn f40131b;
    public final org.telegram.ui.ActionBar.c2[] f40132c;
    public final int d;

    public lg(qn qnVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i9, int i10) {
        this.f40130a = i10;
        this.f40131b = qnVar;
        this.f40132c = c2VarArr;
        this.d = i9;
    }

    @Override
    public final void run() {
        switch (this.f40130a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f40132c;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final qn qnVar = this.f40131b;
                    final int i9 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    qnVar.getConnectionsManager().cancelRequest(i9, true);
                                    return;
                                case 1:
                                    qnVar.getConnectionsManager().cancelRequest(i9, true);
                                    return;
                                default:
                                    qnVar.getConnectionsManager().cancelRequest(i9, true);
                                    return;
                            }
                        }
                    });
                    qnVar.showDialog(c2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f40132c;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final qn qnVar2 = this.f40131b;
                    final int i10 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    qnVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    qnVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    qnVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    qnVar2.showDialog(c2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr3 = this.f40132c;
                org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr3[0];
                if (c2Var3 != null) {
                    final qn qnVar3 = this.f40131b;
                    final int i11 = this.d;
                    c2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    qnVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    qnVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    qnVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    qnVar3.showDialog(c2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
