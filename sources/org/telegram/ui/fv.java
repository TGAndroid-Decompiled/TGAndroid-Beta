package org.telegram.ui;

import android.content.DialogInterface;
public final class fv implements DialogInterface.OnDismissListener {
    public final int f37422a;
    public final ey f37423b;

    public fv(ey eyVar, int i10) {
        this.f37422a = i10;
        this.f37423b = eyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37422a) {
            case 0:
                ey.h0(this.f37423b);
                return;
            case 1:
                ey eyVar = this.f37423b;
                if (eyVar.S3 != null) {
                    eyVar.getMessagesController().removeSuggestion(0L, eyVar.S3);
                    eyVar.S3 = null;
                    eyVar.J4();
                    return;
                }
                return;
            case 2:
                this.f37423b.Z3(true);
                return;
            default:
                this.f37423b.Z3(true);
                return;
        }
    }
}
