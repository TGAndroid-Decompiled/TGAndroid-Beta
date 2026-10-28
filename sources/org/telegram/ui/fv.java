package org.telegram.ui;

import android.content.DialogInterface;
public final class fv implements DialogInterface.OnDismissListener {
    public final int f39431a;
    public final ey f39432b;

    public fv(ey eyVar, int i10) {
        this.f39431a = i10;
        this.f39432b = eyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39431a) {
            case 0:
                ey.h0(this.f39432b);
                return;
            case 1:
                ey eyVar = this.f39432b;
                if (eyVar.S3 != null) {
                    eyVar.getMessagesController().removeSuggestion(0L, eyVar.S3);
                    eyVar.S3 = null;
                    eyVar.T4();
                    return;
                }
                return;
            case 2:
                this.f39432b.j4(true);
                return;
            default:
                this.f39432b.j4(true);
                return;
        }
    }
}
