package org.telegram.ui;

import android.content.DialogInterface;
public final class ov implements DialogInterface.OnDismissListener {
    public final int f36256a;
    public final ty f36257b;

    public ov(ty tyVar, int i10) {
        this.f36256a = i10;
        this.f36257b = tyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36256a) {
            case 0:
                ty.i0(this.f36257b);
                return;
            case 1:
                ty tyVar = this.f36257b;
                if (tyVar.R3 != null) {
                    tyVar.getMessagesController().removeSuggestion(0L, tyVar.R3);
                    tyVar.R3 = null;
                    tyVar.U4();
                    return;
                }
                return;
            case 2:
                this.f36257b.k4(true);
                return;
            default:
                this.f36257b.k4(true);
                return;
        }
    }
}
