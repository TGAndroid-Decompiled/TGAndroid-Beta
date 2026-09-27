package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class ip implements Runnable {
    public final int f34512a;
    public final sp f34513b;
    public final org.telegram.ui.ActionBar.c2[] f34514c;
    public final int d;

    public ip(sp spVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, int i11) {
        this.f34512a = i11;
        this.f34513b = spVar;
        this.f34514c = c2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f34512a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f34514c;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final sp spVar = this.f34513b;
                    final int i10 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(spVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(spVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    spVar.showDialog(c2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f34514c;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final sp spVar2 = this.f34513b;
                    final int i11 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(spVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(spVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    spVar2.showDialog(c2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
