package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class zp0 implements Runnable {
    public final int f43021a;
    public final org.telegram.ui.ActionBar.t1[] f43022b;
    public final int f43023c;
    public final int d;

    public zp0(org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, int i10, int i11) {
        this.f43021a = i11;
        this.f43022b = t1VarArr;
        this.f43023c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f43021a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f43022b;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    final int i7 = this.f43023c;
                    final int i10 = this.d;
                    t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    t1VarArr[0].show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f43022b;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr2[0];
                if (t1Var2 != null) {
                    final int i11 = this.f43023c;
                    final int i12 = this.d;
                    t1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    t1VarArr2[0].show();
                    return;
                }
                return;
        }
    }
}
