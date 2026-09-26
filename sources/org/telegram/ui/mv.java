package org.telegram.ui;

import android.content.DialogInterface;
public final class mv implements DialogInterface.OnDismissListener {
    public final int f35676a;
    public final qy f35677b;

    public mv(qy qyVar, int i10) {
        this.f35676a = i10;
        this.f35677b = qyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35676a) {
            case 0:
                qy.i0(this.f35677b);
                return;
            case 1:
                qy qyVar = this.f35677b;
                if (qyVar.R3 != null) {
                    qyVar.getMessagesController().removeSuggestion(0L, qyVar.R3);
                    qyVar.R3 = null;
                    qyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f35677b.b4(true);
                return;
            default:
                this.f35677b.b4(true);
                return;
        }
    }
}
