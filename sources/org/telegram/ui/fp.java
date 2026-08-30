package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class fp implements Runnable {
    public final int f34298a;
    public final qp f34299b;
    public final org.telegram.ui.ActionBar.d2[] f34300c;
    public final int d;

    public fp(qp qpVar, org.telegram.ui.ActionBar.d2[] d2VarArr, int i10, int i11) {
        this.f34298a = i11;
        this.f34299b = qpVar;
        this.f34300c = d2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f34298a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.f34300c;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    final qp qpVar = this.f34299b;
                    final int i10 = this.d;
                    d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    qpVar.showDialog(d2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.f34300c;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr2[0];
                if (d2Var2 != null) {
                    final qp qpVar2 = this.f34299b;
                    final int i11 = this.d;
                    d2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    qpVar2.showDialog(d2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
