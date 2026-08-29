package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class vq0 implements Runnable {
    public final int f34168a;
    public final org.telegram.ui.ActionBar.c2[] f34169b;
    public final int f34170c;
    public final int d;

    public vq0(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, int i11, int i12) {
        this.f34168a = i12;
        this.f34169b = c2VarArr;
        this.f34170c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f34168a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f34169b;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final int i10 = this.f34170c;
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
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f34169b;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final int i12 = this.f34170c;
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
