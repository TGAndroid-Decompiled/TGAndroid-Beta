package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class ep implements Runnable {
    public final int f36882a;
    public final qp f36883b;
    public final org.telegram.ui.ActionBar.x1[] f36884c;
    public final int d;

    public ep(qp qpVar, org.telegram.ui.ActionBar.x1[] x1VarArr, int i10, int i11) {
        this.f36882a = i11;
        this.f36883b = qpVar;
        this.f36884c = x1VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f36882a) {
            case 0:
                org.telegram.ui.ActionBar.x1[] x1VarArr = this.f36884c;
                org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
                if (x1Var != null) {
                    final qp qpVar = this.f36883b;
                    final int i10 = this.d;
                    x1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(qpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(qpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    qpVar.showDialog(x1VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.x1[] x1VarArr2 = this.f36884c;
                org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr2[0];
                if (x1Var2 != null) {
                    final qp qpVar2 = this.f36883b;
                    final int i11 = this.d;
                    x1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(qpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(qpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    qpVar2.showDialog(x1VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
