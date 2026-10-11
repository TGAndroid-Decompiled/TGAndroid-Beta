package org.telegram.ui;

import android.content.DialogInterface;
public final class ov implements DialogInterface.OnDismissListener {
    public final int f40659a;
    public final sy f40660b;

    public ov(sy syVar, int i10) {
        this.f40659a = i10;
        this.f40660b = syVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40659a) {
            case 0:
                sy.h0(this.f40660b);
                return;
            case 1:
                sy syVar = this.f40660b;
                if (syVar.R3 != null) {
                    syVar.getMessagesController().removeSuggestion(0L, syVar.R3);
                    syVar.R3 = null;
                    syVar.I4();
                    return;
                }
                return;
            case 2:
                this.f40660b.Y3(true);
                return;
            default:
                this.f40660b.Y3(true);
                return;
        }
    }
}
