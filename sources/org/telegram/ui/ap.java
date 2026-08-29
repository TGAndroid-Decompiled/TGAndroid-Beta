package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class ap implements Runnable {
    public final int f36579a;
    public final kp f36580b;
    public final org.telegram.ui.ActionBar.c2[] f36581c;
    public final int d;

    public ap(kp kpVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, int i11) {
        this.f36579a = i11;
        this.f36580b = kpVar;
        this.f36581c = c2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f36579a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f36581c;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final kp kpVar = this.f36580b;
                    final int i10 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    kpVar.showDialog(c2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f36581c;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final kp kpVar2 = this.f36580b;
                    final int i11 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    kpVar2.showDialog(c2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
