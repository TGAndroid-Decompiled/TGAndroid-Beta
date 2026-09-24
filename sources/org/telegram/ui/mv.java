package org.telegram.ui;

import android.content.DialogInterface;
public final class mv implements DialogInterface.OnDismissListener {
    public final int f35663a;
    public final qy f35664b;

    public mv(qy qyVar, int i10) {
        this.f35663a = i10;
        this.f35664b = qyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35663a) {
            case 0:
                qy.i0(this.f35664b);
                return;
            case 1:
                qy qyVar = this.f35664b;
                if (qyVar.R3 != null) {
                    qyVar.getMessagesController().removeSuggestion(0L, qyVar.R3);
                    qyVar.R3 = null;
                    qyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f35664b.b4(true);
                return;
            default:
                this.f35664b.b4(true);
                return;
        }
    }
}
