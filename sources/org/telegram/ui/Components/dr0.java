package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class dr0 implements Runnable {
    public final int f26356a;
    public final org.telegram.ui.ActionBar.d2[] f26357b;
    public final int f26358c;
    public final int d;

    public dr0(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10, int i11, int i12) {
        this.f26356a = i12;
        this.f26357b = d2VarArr;
        this.f26358c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f26356a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.f26357b;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    final int i10 = this.f26358c;
                    final int i11 = this.d;
                    d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    d2VarArr[0].show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.f26357b;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr2[0];
                if (d2Var2 != null) {
                    final int i12 = this.f26358c;
                    final int i13 = this.d;
                    d2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    d2VarArr2[0].show();
                    return;
                }
                return;
        }
    }
}
