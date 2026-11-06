package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class io implements Runnable {
    public final int f46686a;
    public final so f46687b;
    public final org.telegram.ui.ActionBar.u1[] f46688c;
    public final int d;

    public io(so soVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, int i10) {
        this.f46686a = i10;
        this.f46687b = soVar;
        this.f46688c = u1VarArr;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f46686a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f46688c;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    final so soVar = this.f46687b;
                    final int i7 = this.d;
                    u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(soVar.currentAccount).cancelRequest(i7, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(soVar.currentAccount).cancelRequest(i7, true);
                                    return;
                            }
                        }
                    });
                    soVar.showDialog(u1VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.f46688c;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr2[0];
                if (u1Var2 != null) {
                    final so soVar2 = this.f46687b;
                    final int i10 = this.d;
                    u1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(soVar2.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(soVar2.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    soVar2.showDialog(u1VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
