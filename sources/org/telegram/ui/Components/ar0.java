package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class ar0 implements Runnable {
    public final int f24473a;
    public final org.telegram.ui.ActionBar.b2[] f24474b;
    public final int f24475c;
    public final int d;

    public ar0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11, int i12) {
        this.f24473a = i12;
        this.f24474b = b2VarArr;
        this.f24475c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f24473a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f24474b;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final int i10 = this.f24475c;
                    final int i11 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    b2VarArr[0].show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f24474b;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final int i12 = this.f24475c;
                    final int i13 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    b2VarArr2[0].show();
                    return;
                }
                return;
        }
    }
}
