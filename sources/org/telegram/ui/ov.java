package org.telegram.ui;

import android.content.DialogInterface;
public final class ov implements DialogInterface.OnDismissListener {
    public final int f40625a;
    public final sy f40626b;

    public ov(sy syVar, int i10) {
        this.f40625a = i10;
        this.f40626b = syVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40625a) {
            case 0:
                sy.h0(this.f40626b);
                return;
            case 1:
                sy syVar = this.f40626b;
                if (syVar.R3 != null) {
                    syVar.getMessagesController().removeSuggestion(0L, syVar.R3);
                    syVar.R3 = null;
                    syVar.I4();
                    return;
                }
                return;
            case 2:
                this.f40626b.Y3(true);
                return;
            default:
                this.f40626b.Y3(true);
                return;
        }
    }
}
