package org.telegram.ui;

import android.content.DialogInterface;
public final class ev implements DialogInterface.OnDismissListener {
    public final int f36595a;
    public final ey f36596b;

    public ev(ey eyVar, int i10) {
        this.f36595a = i10;
        this.f36596b = eyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36595a) {
            case 0:
                ey.Y(this.f36596b);
                return;
            case 1:
                ey eyVar = this.f36596b;
                if (eyVar.S3 != null) {
                    eyVar.getMessagesController().removeSuggestion(0L, eyVar.S3);
                    eyVar.S3 = null;
                    eyVar.J4();
                    return;
                }
                return;
            case 2:
                this.f36596b.Z3(true);
                return;
            default:
                this.f36596b.Z3(true);
                return;
        }
    }
}
