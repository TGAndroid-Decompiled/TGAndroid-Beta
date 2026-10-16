package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class pp implements Runnable {
    public final int f38982a;
    public final aq f38983b;
    public final org.telegram.ui.ActionBar.a2[] f38984c;
    public final int d;

    public pp(aq aqVar, org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, int i11) {
        this.f38982a = i11;
        this.f38983b = aqVar;
        this.f38984c = a2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f38982a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f38984c;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    final aq aqVar = this.f38983b;
                    final int i10 = this.d;
                    a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(aqVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(aqVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    aqVar.showDialog(a2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f38984c;
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr2[0];
                if (a2Var2 != null) {
                    final aq aqVar2 = this.f38983b;
                    final int i11 = this.d;
                    a2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(aqVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(aqVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    aqVar2.showDialog(a2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
