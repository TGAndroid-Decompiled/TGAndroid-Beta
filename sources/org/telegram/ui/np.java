package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class np implements Runnable {
    public final int f39025a;
    public final xp f39026b;
    public final org.telegram.ui.ActionBar.b2[] f39027c;
    public final int d;

    public np(xp xpVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f39025a = i11;
        this.f39026b = xpVar;
        this.f39027c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f39025a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f39027c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final xp xpVar = this.f39026b;
                    final int i10 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(xpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(xpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    xpVar.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f39027c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final xp xpVar2 = this.f39026b;
                    final int i11 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(xpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(xpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    xpVar2.showDialog(b2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
