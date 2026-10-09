package org.telegram.ui;

import android.content.DialogInterface;
public final class pv implements DialogInterface.OnDismissListener {
    public final int f40896a;
    public final ty f40897b;

    public pv(ty tyVar, int i10) {
        this.f40896a = i10;
        this.f40897b = tyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40896a) {
            case 0:
                ty.h0(this.f40897b);
                return;
            case 1:
                ty tyVar = this.f40897b;
                if (tyVar.R3 != null) {
                    tyVar.getMessagesController().removeSuggestion(0L, tyVar.R3);
                    tyVar.R3 = null;
                    tyVar.I4();
                    return;
                }
                return;
            case 2:
                this.f40897b.Y3(true);
                return;
            default:
                this.f40897b.Y3(true);
                return;
        }
    }
}
