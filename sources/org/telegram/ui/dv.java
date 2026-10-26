package org.telegram.ui;

import android.content.DialogInterface;
public final class dv implements DialogInterface.OnDismissListener {
    public final int f38938a;
    public final cy f38939b;

    public dv(cy cyVar, int i10) {
        this.f38938a = i10;
        this.f38939b = cyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38938a) {
            case 0:
                cy.h0(this.f38939b);
                return;
            case 1:
                cy cyVar = this.f38939b;
                if (cyVar.S3 != null) {
                    cyVar.getMessagesController().removeSuggestion(0L, cyVar.S3);
                    cyVar.S3 = null;
                    cyVar.T4();
                    return;
                }
                return;
            case 2:
                this.f38939b.j4(true);
                return;
            default:
                this.f38939b.j4(true);
                return;
        }
    }
}
