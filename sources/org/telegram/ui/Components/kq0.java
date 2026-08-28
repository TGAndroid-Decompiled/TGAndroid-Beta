package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class kq0 implements Runnable {
    public final int f30222a;
    public final org.telegram.ui.ActionBar.c2[] f30223b;
    public final int f30224c;
    public final int d;

    public kq0(org.telegram.ui.ActionBar.c2[] c2VarArr, int i9, int i10, int i11) {
        this.f30222a = i11;
        this.f30223b = c2VarArr;
        this.f30224c = i9;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f30222a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f30223b;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final int i9 = this.f30224c;
                    final int i10 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(i9).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(i9).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    c2VarArr[0].show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f30223b;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final int i11 = this.f30224c;
                    final int i12 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    c2VarArr2[0].show();
                    return;
                }
                return;
        }
    }
}
