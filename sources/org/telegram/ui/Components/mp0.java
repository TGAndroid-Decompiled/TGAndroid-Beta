package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class mp0 implements Runnable {
    public final int f36227a;
    public final org.telegram.ui.ActionBar.s1[] f36228b;
    public final int f36229c;
    public final int d;

    public mp0(org.telegram.ui.ActionBar.s1[] s1VarArr, int i3, int i10, int i11) {
        this.f36227a = i11;
        this.f36228b = s1VarArr;
        this.f36229c = i3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f36227a) {
            case 0:
                org.telegram.ui.ActionBar.s1[] s1VarArr = this.f36228b;
                org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
                if (s1Var != null) {
                    final int i3 = this.f36229c;
                    final int i10 = this.d;
                    s1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(i3).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(i3).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    s1VarArr[0].show();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.s1[] s1VarArr2 = this.f36228b;
                org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr2[0];
                if (s1Var2 != null) {
                    final int i11 = this.f36229c;
                    final int i12 = this.d;
                    s1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    s1VarArr2[0].show();
                    return;
                }
                return;
        }
    }
}
