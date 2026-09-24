package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class hp implements Runnable {
    public final int f34254a;
    public final rp f34255b;
    public final org.telegram.ui.ActionBar.a2[] f34256c;
    public final int d;

    public hp(rp rpVar, org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, int i11) {
        this.f34254a = i11;
        this.f34255b = rpVar;
        this.f34256c = a2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f34254a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f34256c;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    final rp rpVar = this.f34255b;
                    final int i10 = this.d;
                    a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    rpVar.showDialog(a2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f34256c;
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr2[0];
                if (a2Var2 != null) {
                    final rp rpVar2 = this.f34255b;
                    final int i11 = this.d;
                    a2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    rpVar2.showDialog(a2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
