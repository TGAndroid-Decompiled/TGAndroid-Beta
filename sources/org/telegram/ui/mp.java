package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class mp implements Runnable {
    public final int f35787a;
    public final wp f35788b;
    public final org.telegram.ui.ActionBar.b2[] f35789c;
    public final int d;

    public mp(wp wpVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f35787a = i11;
        this.f35788b = wpVar;
        this.f35789c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f35787a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f35789c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final wp wpVar = this.f35788b;
                    final int i10 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(wpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(wpVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    wpVar.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f35789c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final wp wpVar2 = this.f35788b;
                    final int i11 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(wpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(wpVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    wpVar2.showDialog(b2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
