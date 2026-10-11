package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class kp implements Runnable {
    public final int f39425a;
    public final up f39426b;
    public final org.telegram.ui.ActionBar.a2[] f39427c;
    public final int d;

    public kp(up upVar, org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, int i11) {
        this.f39425a = i11;
        this.f39426b = upVar;
        this.f39427c = a2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f39425a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f39427c;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    final up upVar = this.f39426b;
                    final int i10 = this.d;
                    a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(upVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(upVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    upVar.showDialog(a2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f39427c;
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr2[0];
                if (a2Var2 != null) {
                    final up upVar2 = this.f39426b;
                    final int i11 = this.d;
                    a2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(upVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(upVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    upVar2.showDialog(a2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
