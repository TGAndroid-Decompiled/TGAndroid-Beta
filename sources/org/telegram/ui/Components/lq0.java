package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

public final class lq0 implements Runnable {

    public final int f30450a;

    public final org.telegram.ui.ActionBar.b2[] f30451b;

    public final int f30452c;
    public final int d;

    public lq0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11, int i12) {
        this.f30450a = i12;
        this.f30451b = b2VarArr;
        this.f30452c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f30450a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f30451b;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final int i10 = 0;
                    final int i11 = this.f30452c;
                    final int i12 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    ConnectionsManager.getInstance(i11).cancelRequest(i12, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i11).cancelRequest(i12, true);
                                    break;
                            }
                        }
                    });
                    b2VarArr[0].show();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f30451b;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final int i13 = 1;
                    final int i14 = this.f30452c;
                    final int i15 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i13) {
                                case 0:
                                    ConnectionsManager.getInstance(i14).cancelRequest(i15, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i14).cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    b2VarArr2[0].show();
                    break;
                }
                break;
        }
    }
}
