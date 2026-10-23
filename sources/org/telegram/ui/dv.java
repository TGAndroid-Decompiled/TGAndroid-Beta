package org.telegram.ui;

import android.content.DialogInterface;
public final class dv implements DialogInterface.OnDismissListener {
    public final int f36455a;
    public final cy f36456b;

    public dv(cy cyVar, int i10) {
        this.f36455a = i10;
        this.f36456b = cyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36455a) {
            case 0:
                cy.Y(this.f36456b);
                return;
            case 1:
                cy cyVar = this.f36456b;
                if (cyVar.S3 != null) {
                    cyVar.getMessagesController().removeSuggestion(0L, cyVar.S3);
                    cyVar.S3 = null;
                    cyVar.J4();
                    return;
                }
                return;
            case 2:
                this.f36456b.Z3(true);
                return;
            default:
                this.f36456b.Z3(true);
                return;
        }
    }
}
