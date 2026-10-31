package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class nq0 implements Runnable {
    public final int f28877a;
    public final org.telegram.ui.ActionBar.x1[] f28878b;
    public final int f28879c;
    public final int d;

    public nq0(org.telegram.ui.ActionBar.x1[] x1VarArr, int i10, int i11, int i12) {
        this.f28877a = i12;
        this.f28878b = x1VarArr;
        this.f28879c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f28877a) {
            case 0:
                org.telegram.ui.ActionBar.x1[] x1VarArr = this.f28878b;
                org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
                if (x1Var != null) {
                    final int i10 = this.f28879c;
                    final int i11 = this.d;
                    x1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    x1VarArr[0].show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.x1[] x1VarArr2 = this.f28878b;
                org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr2[0];
                if (x1Var2 != null) {
                    final int i12 = this.f28879c;
                    final int i13 = this.d;
                    x1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(i12).cancelRequest(i13, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(i12).cancelRequest(i13, true);
                                    return;
                            }
                        }
                    });
                    x1VarArr2[0].show();
                    return;
                }
                return;
        }
    }
}
