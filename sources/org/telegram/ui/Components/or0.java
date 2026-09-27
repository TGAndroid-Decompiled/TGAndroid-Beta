package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class or0 implements Runnable {
    public final int f27205a;
    public final org.telegram.ui.ActionBar.c2[] f27206b;
    public final int f27207c;
    public final int d;

    public or0(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, int i11, int i12) {
        this.f27205a = i12;
        this.f27206b = c2VarArr;
        this.f27207c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f27205a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f27206b;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final int i10 = this.f27207c;
                    final int i11 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    c2VarArr[0].show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f27206b;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final int i12 = this.f27207c;
                    final int i13 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    c2VarArr2[0].show();
                    return;
                }
                return;
        }
    }
}
