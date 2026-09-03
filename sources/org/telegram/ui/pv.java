package org.telegram.ui;

import android.content.DialogInterface;
public final class pv implements DialogInterface.OnDismissListener {
    public final int f37234a;
    public final qy f37235b;

    public pv(qy qyVar, int i10) {
        this.f37234a = i10;
        this.f37235b = qyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37234a) {
            case 0:
                qy.i0(this.f37235b);
                return;
            case 1:
                qy qyVar = this.f37235b;
                if (qyVar.P3 != null) {
                    qyVar.getMessagesController().removeSuggestion(0L, qyVar.P3);
                    qyVar.P3 = null;
                    qyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f37235b.b4(true);
                return;
            default:
                this.f37235b.b4(true);
                return;
        }
    }
}
