package org.telegram.ui;

import android.content.DialogInterface;
public final class dv implements DialogInterface.OnDismissListener {
    public final int f36450a;
    public final cy f36451b;

    public dv(cy cyVar, int i10) {
        this.f36450a = i10;
        this.f36451b = cyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36450a) {
            case 0:
                cy.Y(this.f36451b);
                return;
            case 1:
                cy cyVar = this.f36451b;
                if (cyVar.S3 != null) {
                    cyVar.getMessagesController().removeSuggestion(0L, cyVar.S3);
                    cyVar.S3 = null;
                    cyVar.J4();
                    return;
                }
                return;
            case 2:
                this.f36451b.Z3(true);
                return;
            default:
                this.f36451b.Z3(true);
                return;
        }
    }
}
