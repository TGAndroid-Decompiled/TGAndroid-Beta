package org.telegram.ui;

import android.content.DialogInterface;
public final class dv implements DialogInterface.OnDismissListener {
    public final int f36454a;
    public final cy f36455b;

    public dv(cy cyVar, int i10) {
        this.f36454a = i10;
        this.f36455b = cyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36454a) {
            case 0:
                cy.Y(this.f36455b);
                return;
            case 1:
                cy cyVar = this.f36455b;
                if (cyVar.S3 != null) {
                    cyVar.getMessagesController().removeSuggestion(0L, cyVar.S3);
                    cyVar.S3 = null;
                    cyVar.J4();
                    return;
                }
                return;
            case 2:
                this.f36455b.Z3(true);
                return;
            default:
                this.f36455b.Z3(true);
                return;
        }
    }
}
