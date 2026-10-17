package org.telegram.ui;

import android.content.DialogInterface;
public final class og implements Runnable {
    public final int f39772a;
    public final sn f39773b;
    public final org.telegram.ui.ActionBar.b2[] f39774c;
    public final int d;

    public og(sn snVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f39772a = i11;
        this.f39773b = snVar;
        this.f39774c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f39772a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f39774c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final sn snVar = this.f39773b;
                    final int i10 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    snVar.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f39774c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final sn snVar2 = this.f39773b;
                    final int i11 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    snVar2.showDialog(b2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr3 = this.f39774c;
                org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr3[0];
                if (b2Var3 != null) {
                    final sn snVar3 = this.f39773b;
                    final int i12 = this.d;
                    b2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    snVar3.showDialog(b2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
