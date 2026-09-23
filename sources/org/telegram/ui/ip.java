package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class ip implements Runnable {
    public final int f34225a;
    public final sp f34226b;
    public final org.telegram.ui.ActionBar.b2[] f34227c;
    public final int d;

    public ip(sp spVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f34225a = i11;
        this.f34226b = spVar;
        this.f34227c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f34225a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f34227c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final sp spVar = this.f34226b;
                    final int i10 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    spVar.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f34227c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final sp spVar2 = this.f34226b;
                    final int i11 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    spVar2.showDialog(b2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
