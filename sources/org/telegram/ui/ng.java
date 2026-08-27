package org.telegram.ui;

import android.content.DialogInterface;

public final class ng implements Runnable {

    public final int f40825a;

    public final rn f40826b;

    public final org.telegram.ui.ActionBar.b2[] f40827c;
    public final int d;

    public ng(rn rnVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f40825a = i11;
        this.f40826b = rnVar;
        this.f40827c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f40825a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f40827c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final int i10 = 0;
                    final rn rnVar = this.f40826b;
                    final int i11 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    rnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                case 1:
                                    rnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                default:
                                    rnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    rnVar.showDialog(b2VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f40827c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final int i12 = 1;
                    final rn rnVar2 = this.f40826b;
                    final int i13 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    rnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                case 1:
                                    rnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                default:
                                    rnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    rnVar2.showDialog(b2VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr3 = this.f40827c;
                org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr3[0];
                if (b2Var3 != null) {
                    final int i14 = 2;
                    final rn rnVar3 = this.f40826b;
                    final int i15 = this.d;
                    b2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i14) {
                                case 0:
                                    rnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                case 1:
                                    rnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                default:
                                    rnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    rnVar3.showDialog(b2VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
