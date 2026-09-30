package org.telegram.ui;

import android.content.DialogInterface;
public final class mv implements DialogInterface.OnDismissListener {
    public final int f35790a;
    public final qy f35791b;

    public mv(qy qyVar, int i10) {
        this.f35790a = i10;
        this.f35791b = qyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35790a) {
            case 0:
                qy.i0(this.f35791b);
                return;
            case 1:
                qy qyVar = this.f35791b;
                if (qyVar.R3 != null) {
                    qyVar.getMessagesController().removeSuggestion(0L, qyVar.R3);
                    qyVar.R3 = null;
                    qyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f35791b.b4(true);
                return;
            default:
                this.f35791b.b4(true);
                return;
        }
    }
}
