package org.telegram.ui;

import android.content.DialogInterface;
public final class mv implements DialogInterface.OnDismissListener {
    public final int f35680a;
    public final qy f35681b;

    public mv(qy qyVar, int i10) {
        this.f35680a = i10;
        this.f35681b = qyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35680a) {
            case 0:
                qy.i0(this.f35681b);
                return;
            case 1:
                qy qyVar = this.f35681b;
                if (qyVar.R3 != null) {
                    qyVar.getMessagesController().removeSuggestion(0L, qyVar.R3);
                    qyVar.R3 = null;
                    qyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f35681b.b4(true);
                return;
            default:
                this.f35681b.b4(true);
                return;
        }
    }
}
