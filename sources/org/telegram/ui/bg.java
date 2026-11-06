package org.telegram.ui;

import android.content.DialogInterface;
public final class bg implements Runnable {
    public final int f44297a;
    public final an f44298b;
    public final org.telegram.ui.ActionBar.u1[] f44299c;
    public final int d;

    public bg(an anVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, int i10) {
        this.f44297a = i10;
        this.f44298b = anVar;
        this.f44299c = u1VarArr;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f44297a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f44299c;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    final an anVar = this.f44298b;
                    final int i7 = this.d;
                    u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    anVar.getConnectionsManager().cancelRequest(i7, true);
                                    return;
                                case 1:
                                    anVar.getConnectionsManager().cancelRequest(i7, true);
                                    return;
                                default:
                                    anVar.getConnectionsManager().cancelRequest(i7, true);
                                    return;
                            }
                        }
                    });
                    anVar.showDialog(u1VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.f44299c;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr2[0];
                if (u1Var2 != null) {
                    final an anVar2 = this.f44298b;
                    final int i10 = this.d;
                    u1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    anVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    anVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    anVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    anVar2.showDialog(u1VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.u1[] u1VarArr3 = this.f44299c;
                org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr3[0];
                if (u1Var3 != null) {
                    final an anVar3 = this.f44298b;
                    final int i11 = this.d;
                    u1Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    anVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    anVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    anVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    anVar3.showDialog(u1VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
