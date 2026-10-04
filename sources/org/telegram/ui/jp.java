package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class jp implements Runnable {
    public final int f37734a;
    public final tp f37735b;
    public final org.telegram.ui.ActionBar.b2[] f37736c;
    public final int d;

    public jp(tp tpVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f37734a = i11;
        this.f37735b = tpVar;
        this.f37736c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f37734a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f37736c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final tp tpVar = this.f37735b;
                    final int i10 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(tpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(tpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    tpVar.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f37736c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final tp tpVar2 = this.f37735b;
                    final int i11 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(tpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(tpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    tpVar2.showDialog(b2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
