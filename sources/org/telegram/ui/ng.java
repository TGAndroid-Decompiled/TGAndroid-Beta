package org.telegram.ui;

import android.content.DialogInterface;
public final class ng implements Runnable {
    public final int f41794a;
    public final wn f41795b;
    public final org.telegram.ui.ActionBar.e2[] f41796c;
    public final int d;

    public ng(wn wnVar, org.telegram.ui.ActionBar.e2[] e2VarArr, int i10, int i11) {
        this.f41794a = i11;
        this.f41795b = wnVar;
        this.f41796c = e2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f41794a) {
            case 0:
                org.telegram.ui.ActionBar.e2[] e2VarArr = this.f41796c;
                org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                if (e2Var != null) {
                    final wn wnVar = this.f41795b;
                    final int i10 = this.d;
                    e2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    wnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    wnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    wnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    wnVar.showDialog(e2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = this.f41796c;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2VarArr2[0];
                if (e2Var2 != null) {
                    final wn wnVar2 = this.f41795b;
                    final int i11 = this.d;
                    e2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    wnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    wnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    wnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    wnVar2.showDialog(e2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e2[] e2VarArr3 = this.f41796c;
                org.telegram.ui.ActionBar.e2 e2Var3 = e2VarArr3[0];
                if (e2Var3 != null) {
                    final wn wnVar3 = this.f41795b;
                    final int i12 = this.d;
                    e2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    wnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    wnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    wnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    wnVar3.showDialog(e2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
