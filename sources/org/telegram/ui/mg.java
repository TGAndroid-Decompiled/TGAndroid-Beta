package org.telegram.ui;

import android.content.DialogInterface;
public final class mg implements Runnable {
    public final int f39233a;
    public final qn f39234b;
    public final org.telegram.ui.ActionBar.b2[] f39235c;
    public final int d;

    public mg(qn qnVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f39233a = i11;
        this.f39234b = qnVar;
        this.f39235c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f39233a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f39235c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final qn qnVar = this.f39234b;
                    final int i10 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    qnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    qnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    qnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    qnVar.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f39235c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final qn qnVar2 = this.f39234b;
                    final int i11 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    qnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    qnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    qnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    qnVar2.showDialog(b2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr3 = this.f39235c;
                org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr3[0];
                if (b2Var3 != null) {
                    final qn qnVar3 = this.f39234b;
                    final int i12 = this.d;
                    b2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    qnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    qnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    qnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    qnVar3.showDialog(b2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
