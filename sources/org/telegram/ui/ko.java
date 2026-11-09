package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class ko implements Runnable {
    public final int f47318a;
    public final uo f47319b;
    public final org.telegram.ui.ActionBar.u1[] f47320c;
    public final int d;

    public ko(uo uoVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, int i10) {
        this.f47318a = i10;
        this.f47319b = uoVar;
        this.f47320c = u1VarArr;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f47318a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f47320c;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    final uo uoVar = this.f47319b;
                    final int i7 = this.d;
                    u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    uoVar.showDialog(u1VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.f47320c;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr2[0];
                if (u1Var2 != null) {
                    final uo uoVar2 = this.f47319b;
                    final int i10 = this.d;
                    u1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    uoVar2.showDialog(u1VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
