package org.telegram.ui;

import android.content.DialogInterface;
public final class fv implements DialogInterface.OnDismissListener {
    public final int f37384a;
    public final ey f37385b;

    public fv(ey eyVar, int i10) {
        this.f37384a = i10;
        this.f37385b = eyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37384a) {
            case 0:
                ey.h0(this.f37385b);
                return;
            case 1:
                ey eyVar = this.f37385b;
                if (eyVar.S3 != null) {
                    eyVar.getMessagesController().removeSuggestion(0L, eyVar.S3);
                    eyVar.S3 = null;
                    eyVar.J4();
                    return;
                }
                return;
            case 2:
                this.f37385b.Z3(true);
                return;
            default:
                this.f37385b.Z3(true);
                return;
        }
    }
}
