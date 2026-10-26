package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class cp implements Runnable {
    public final int f38506a;
    public final np f38507b;
    public final org.telegram.ui.ActionBar.e2[] f38508c;
    public final int d;

    public cp(np npVar, org.telegram.ui.ActionBar.e2[] e2VarArr, int i10, int i11) {
        this.f38506a = i11;
        this.f38507b = npVar;
        this.f38508c = e2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f38506a) {
            case 0:
                org.telegram.ui.ActionBar.e2[] e2VarArr = this.f38508c;
                org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                if (e2Var != null) {
                    final np npVar = this.f38507b;
                    final int i10 = this.d;
                    e2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(npVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(npVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    npVar.showDialog(e2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = this.f38508c;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2VarArr2[0];
                if (e2Var2 != null) {
                    final np npVar2 = this.f38507b;
                    final int i11 = this.d;
                    e2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(npVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(npVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    npVar2.showDialog(e2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
