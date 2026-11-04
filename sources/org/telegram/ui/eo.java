package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class eo implements Runnable {
    public final int f45010a;
    public final qo f45011b;
    public final org.telegram.ui.ActionBar.s1[] f45012c;
    public final int d;

    public eo(qo qoVar, org.telegram.ui.ActionBar.s1[] s1VarArr, int i3, int i10) {
        this.f45010a = i10;
        this.f45011b = qoVar;
        this.f45012c = s1VarArr;
        this.d = i3;
    }

    @Override
    public final void run() {
        switch (this.f45010a) {
            case 0:
                org.telegram.ui.ActionBar.s1[] s1VarArr = this.f45012c;
                org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
                if (s1Var != null) {
                    final qo qoVar = this.f45011b;
                    final int i3 = this.d;
                    s1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(qoVar.currentAccount).cancelRequest(i3, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(qoVar.currentAccount).cancelRequest(i3, true);
                                    return;
                            }
                        }
                    });
                    qoVar.showDialog(s1VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.s1[] s1VarArr2 = this.f45012c;
                org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr2[0];
                if (s1Var2 != null) {
                    final qo qoVar2 = this.f45011b;
                    final int i10 = this.d;
                    s1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(qoVar2.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(qoVar2.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    qoVar2.showDialog(s1VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
