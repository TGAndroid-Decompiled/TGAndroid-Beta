package org.telegram.ui;

import android.content.DialogInterface;
public final class pe implements DialogInterface.OnDismissListener {
    public final int f42384a;
    public final wn f42385b;

    public pe(wn wnVar, int i10) {
        this.f42384a = i10;
        this.f42385b = wnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42384a) {
            case 0:
                dk dkVar = this.f42385b.f45164j2;
                if (dkVar != null) {
                    dkVar.c(false);
                    return;
                }
                return;
            case 1:
                wn.D0(this.f42385b);
                return;
            case 2:
                this.f42385b.p8(false, true, 0.0f);
                return;
            case 3:
                this.f42385b.p8(false, true, 0.0f);
                return;
            case 4:
                this.f42385b.p8(false, true, 0.0f);
                return;
            case 5:
                this.f42385b.p8(false, true, 0.0f);
                return;
            case 6:
                this.f42385b.p8(false, true, 0.0f);
                return;
            case 7:
                this.f42385b.p8(false, true, 0.0f);
                return;
            default:
                this.f42385b.gc = null;
                return;
        }
    }
}
