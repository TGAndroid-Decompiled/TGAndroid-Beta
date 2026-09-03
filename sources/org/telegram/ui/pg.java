package org.telegram.ui;

import android.content.DialogInterface;
public final class pg implements Runnable {
    public final int f40008a;
    public final xn f40009b;
    public final org.telegram.ui.ActionBar.d2[] f40010c;
    public final int d;

    public pg(xn xnVar, org.telegram.ui.ActionBar.d2[] d2VarArr, int i10, int i11) {
        this.f40008a = i11;
        this.f40009b = xnVar;
        this.f40010c = d2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f40008a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.f40010c;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    final xn xnVar = this.f40009b;
                    final int i10 = this.d;
                    d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    xnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    xnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    xnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    xnVar.showDialog(d2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.f40010c;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr2[0];
                if (d2Var2 != null) {
                    final xn xnVar2 = this.f40009b;
                    final int i11 = this.d;
                    d2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    xnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    xnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    xnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    xnVar2.showDialog(d2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr3 = this.f40010c;
                org.telegram.ui.ActionBar.d2 d2Var3 = d2VarArr3[0];
                if (d2Var3 != null) {
                    final xn xnVar3 = this.f40009b;
                    final int i12 = this.d;
                    d2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    xnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    xnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    xnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    xnVar3.showDialog(d2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
