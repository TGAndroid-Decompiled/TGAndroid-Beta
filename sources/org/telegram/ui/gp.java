package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class gp implements Runnable {
    public final int f37146a;
    public final rp f37147b;
    public final org.telegram.ui.ActionBar.d2[] f37148c;
    public final int d;

    public gp(rp rpVar, org.telegram.ui.ActionBar.d2[] d2VarArr, int i10, int i11) {
        this.f37146a = i11;
        this.f37147b = rpVar;
        this.f37148c = d2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f37146a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.f37148c;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    final rp rpVar = this.f37147b;
                    final int i10 = this.d;
                    d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(rpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(rpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    rpVar.showDialog(d2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.f37148c;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr2[0];
                if (d2Var2 != null) {
                    final rp rpVar2 = this.f37147b;
                    final int i11 = this.d;
                    d2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(rpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(rpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    rpVar2.showDialog(d2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
