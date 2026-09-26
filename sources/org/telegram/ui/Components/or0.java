package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class or0 implements Runnable {
    public final int f27111a;
    public final org.telegram.ui.ActionBar.a2[] f27112b;
    public final int f27113c;
    public final int d;

    public or0(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, int i11, int i12) {
        this.f27111a = i12;
        this.f27112b = a2VarArr;
        this.f27113c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f27111a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f27112b;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    final int i10 = this.f27113c;
                    final int i11 = this.d;
                    a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    a2VarArr[0].show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f27112b;
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr2[0];
                if (a2Var2 != null) {
                    final int i12 = this.f27113c;
                    final int i13 = this.d;
                    a2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    a2VarArr2[0].show();
                    return;
                }
                return;
        }
    }
}
