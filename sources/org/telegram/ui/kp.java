package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class kp implements Runnable {
    public final int f35154a;
    public final up f35155b;
    public final org.telegram.ui.ActionBar.b2[] f35156c;
    public final int d;

    public kp(up upVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f35154a = i11;
        this.f35155b = upVar;
        this.f35156c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f35154a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f35156c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final up upVar = this.f35155b;
                    final int i10 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(upVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(upVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    upVar.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f35156c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final up upVar2 = this.f35155b;
                    final int i11 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(upVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(upVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    upVar2.showDialog(b2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
