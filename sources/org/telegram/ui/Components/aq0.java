package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class aq0 implements Runnable {
    public final int f33589a;
    public final org.telegram.ui.ActionBar.t1[] f33590b;
    public final int f33591c;
    public final int d;

    public aq0(org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, int i10, int i11) {
        this.f33589a = i11;
        this.f33590b = t1VarArr;
        this.f33591c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f33589a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f33590b;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    final int i7 = this.f33591c;
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
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f33590b;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr2[0];
                if (t1Var2 != null) {
                    final int i11 = this.f33591c;
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
