package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class cs0 implements Runnable {
    public final int f24205a;
    public final org.telegram.ui.ActionBar.a2[] f24206b;
    public final int f24207c;
    public final int d;

    public cs0(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, int i11, int i12) {
        this.f24205a = i12;
        this.f24206b = a2VarArr;
        this.f24207c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f24205a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f24206b;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    final int i10 = this.f24207c;
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
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f24206b;
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr2[0];
                if (a2Var2 != null) {
                    final int i12 = this.f24207c;
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
