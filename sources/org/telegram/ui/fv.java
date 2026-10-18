package org.telegram.ui;

import android.content.DialogInterface;
public final class fv implements DialogInterface.OnDismissListener {
    public final int f37013a;
    public final ey f37014b;

    public fv(ey eyVar, int i10) {
        this.f37013a = i10;
        this.f37014b = eyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37013a) {
            case 0:
                ey.Y(this.f37014b);
                return;
            case 1:
                ey eyVar = this.f37014b;
                if (eyVar.S3 != null) {
                    eyVar.getMessagesController().removeSuggestion(0L, eyVar.S3);
                    eyVar.S3 = null;
                    eyVar.J4();
                    return;
                }
                return;
            case 2:
                this.f37014b.Z3(true);
                return;
            default:
                this.f37014b.Z3(true);
                return;
        }
    }
}
