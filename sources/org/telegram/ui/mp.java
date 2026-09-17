package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class mp implements Runnable {
    public final int f35857a;
    public final wp f35858b;
    public final org.telegram.ui.ActionBar.c2[] f35859c;
    public final int d;

    public mp(wp wpVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, int i11) {
        this.f35857a = i11;
        this.f35858b = wpVar;
        this.f35859c = c2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f35857a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f35859c;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final wp wpVar = this.f35858b;
                    final int i10 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(wpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(wpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    wpVar.showDialog(c2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f35859c;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final wp wpVar2 = this.f35858b;
                    final int i11 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(wpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(wpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    wpVar2.showDialog(c2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
