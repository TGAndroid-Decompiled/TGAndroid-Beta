package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class ep implements Runnable {
    public final int f38918a;
    public final pp f38919b;
    public final org.telegram.ui.ActionBar.e2[] f38920c;
    public final int d;

    public ep(pp ppVar, org.telegram.ui.ActionBar.e2[] e2VarArr, int i10, int i11) {
        this.f38918a = i11;
        this.f38919b = ppVar;
        this.f38920c = e2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f38918a) {
            case 0:
                org.telegram.ui.ActionBar.e2[] e2VarArr = this.f38920c;
                org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                if (e2Var != null) {
                    final pp ppVar = this.f38919b;
                    final int i10 = this.d;
                    e2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(ppVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(ppVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    ppVar.showDialog(e2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = this.f38920c;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2VarArr2[0];
                if (e2Var2 != null) {
                    final pp ppVar2 = this.f38919b;
                    final int i11 = this.d;
                    e2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(ppVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(ppVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    ppVar2.showDialog(e2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
