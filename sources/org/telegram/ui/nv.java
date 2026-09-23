package org.telegram.ui;

import android.content.DialogInterface;
public final class nv implements DialogInterface.OnDismissListener {
    public final int f35607a;
    public final ry f35608b;

    public nv(ry ryVar, int i10) {
        this.f35607a = i10;
        this.f35608b = ryVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35607a) {
            case 0:
                ry.i0(this.f35608b);
                return;
            case 1:
                ry ryVar = this.f35608b;
                if (ryVar.R3 != null) {
                    ryVar.getMessagesController().removeSuggestion(0L, ryVar.R3);
                    ryVar.R3 = null;
                    ryVar.L4();
                    return;
                }
                return;
            case 2:
                this.f35608b.b4(true);
                return;
            default:
                this.f35608b.b4(true);
                return;
        }
    }
}
