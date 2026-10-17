package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class ap implements Runnable {
    public final int f35477a;
    public final kp f35478b;
    public final org.telegram.ui.ActionBar.b2[] f35479c;
    public final int d;

    public ap(kp kpVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f35477a = i11;
        this.f35478b = kpVar;
        this.f35479c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f35477a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f35479c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final kp kpVar = this.f35478b;
                    final int i10 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(kpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(kpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    kpVar.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f35479c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final kp kpVar2 = this.f35478b;
                    final int i11 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(kpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(kpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    kpVar2.showDialog(b2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
