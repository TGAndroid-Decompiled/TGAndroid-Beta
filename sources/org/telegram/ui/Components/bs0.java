package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class bs0 implements Runnable {
    public final int f25084a;
    public final org.telegram.ui.ActionBar.c2[] f25085b;
    public final int f25086c;
    public final int d;

    public bs0(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, int i11, int i12) {
        this.f25084a = i12;
        this.f25085b = c2VarArr;
        this.f25086c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f25084a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f25085b;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final int i10 = this.f25086c;
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
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f25085b;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final int i12 = this.f25086c;
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
