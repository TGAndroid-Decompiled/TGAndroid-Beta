package org.telegram.ui;

import android.content.DialogInterface;
public final class pv implements DialogInterface.OnDismissListener {
    public final int f40942a;
    public final ty f40943b;

    public pv(ty tyVar, int i10) {
        this.f40942a = i10;
        this.f40943b = tyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40942a) {
            case 0:
                ty.h0(this.f40943b);
                return;
            case 1:
                ty tyVar = this.f40943b;
                if (tyVar.R3 != null) {
                    tyVar.getMessagesController().removeSuggestion(0L, tyVar.R3);
                    tyVar.R3 = null;
                    tyVar.I4();
                    return;
                }
                return;
            case 2:
                this.f40943b.Y3(true);
                return;
            default:
                this.f40943b.Y3(true);
                return;
        }
    }
}
