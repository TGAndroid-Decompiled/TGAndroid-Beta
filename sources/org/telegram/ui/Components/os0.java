package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class os0 implements Runnable {
    public final int f31381a;
    public final org.telegram.ui.ActionBar.e2[] f31382b;
    public final int f31383c;
    public final int d;

    public os0(org.telegram.ui.ActionBar.e2[] e2VarArr, int i10, int i11, int i12) {
        this.f31381a = i12;
        this.f31382b = e2VarArr;
        this.f31383c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f31381a) {
            case 0:
                org.telegram.ui.ActionBar.e2[] e2VarArr = this.f31382b;
                org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                if (e2Var != null) {
                    final int i10 = this.f31383c;
                    final int i11 = this.d;
                    e2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    e2VarArr[0].show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = this.f31382b;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2VarArr2[0];
                if (e2Var2 != null) {
                    final int i12 = this.f31383c;
                    final int i13 = this.d;
                    e2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    e2VarArr2[0].show();
                    return;
                }
                return;
        }
    }
}
