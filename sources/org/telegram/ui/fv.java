package org.telegram.ui;

import android.content.DialogInterface;
public final class fv implements DialogInterface.OnDismissListener {
    public final int f36978a;
    public final ey f36979b;

    public fv(ey eyVar, int i10) {
        this.f36978a = i10;
        this.f36979b = eyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36978a) {
            case 0:
                ey.Y(this.f36979b);
                return;
            case 1:
                ey eyVar = this.f36979b;
                if (eyVar.S3 != null) {
                    eyVar.getMessagesController().removeSuggestion(0L, eyVar.S3);
                    eyVar.S3 = null;
                    eyVar.J4();
                    return;
                }
                return;
            case 2:
                this.f36979b.Z3(true);
                return;
            default:
                this.f36979b.Z3(true);
                return;
        }
    }
}
