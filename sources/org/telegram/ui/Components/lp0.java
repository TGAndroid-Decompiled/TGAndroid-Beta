package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class lp0 implements Runnable {
    public final int f35741a;
    public final org.telegram.ui.ActionBar.u1[] f35742b;
    public final int f35743c;
    public final int d;

    public lp0(org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, int i10, int i11) {
        this.f35741a = i11;
        this.f35742b = u1VarArr;
        this.f35743c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f35741a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f35742b;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    final int i7 = this.f35743c;
                    final int i10 = this.d;
                    u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(i7).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(i7).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    u1VarArr[0].show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.f35742b;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr2[0];
                if (u1Var2 != null) {
                    final int i11 = this.f35743c;
                    final int i12 = this.d;
                    u1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(i11).cancelRequest(i12, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(i11).cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    u1VarArr2[0].show();
                    return;
                }
                return;
        }
    }
}
