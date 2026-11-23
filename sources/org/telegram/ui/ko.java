package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class ko implements Runnable {
    public final int f49505a;
    public final uo f49506b;
    public final org.telegram.ui.ActionBar.t1[] f49507c;
    public final int d;

    public ko(uo uoVar, org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, int i10) {
        this.f49505a = i10;
        this.f49506b = uoVar;
        this.f49507c = t1VarArr;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f49505a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f49507c;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    final uo uoVar = this.f49506b;
                    final int i7 = this.d;
                    t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(uoVar.currentAccount).cancelRequest(i7, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(uoVar.currentAccount).cancelRequest(i7, true);
                                    return;
                            }
                        }
                    });
                    uoVar.showDialog(t1VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f49507c;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr2[0];
                if (t1Var2 != null) {
                    final uo uoVar2 = this.f49506b;
                    final int i10 = this.d;
                    t1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(uoVar2.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(uoVar2.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    uoVar2.showDialog(t1VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
