package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class ko implements Runnable {
    public final int f49322a;
    public final uo f49323b;
    public final org.telegram.ui.ActionBar.t1[] f49324c;
    public final int d;

    public ko(uo uoVar, org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, int i10) {
        this.f49322a = i10;
        this.f49323b = uoVar;
        this.f49324c = t1VarArr;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f49322a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f49324c;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    final uo uoVar = this.f49323b;
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
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f49324c;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr2[0];
                if (t1Var2 != null) {
                    final uo uoVar2 = this.f49323b;
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
