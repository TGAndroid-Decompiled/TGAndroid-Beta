package org.telegram.ui;

import android.content.DialogInterface;
public final class mv implements DialogInterface.OnDismissListener {
    public final int f35675a;
    public final qy f35676b;

    public mv(qy qyVar, int i10) {
        this.f35675a = i10;
        this.f35676b = qyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35675a) {
            case 0:
                qy.i0(this.f35676b);
                return;
            case 1:
                qy qyVar = this.f35676b;
                if (qyVar.R3 != null) {
                    qyVar.getMessagesController().removeSuggestion(0L, qyVar.R3);
                    qyVar.R3 = null;
                    qyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f35676b.b4(true);
                return;
            default:
                this.f35676b.b4(true);
                return;
        }
    }
}
