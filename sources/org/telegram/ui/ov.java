package org.telegram.ui;

import android.content.DialogInterface;
public final class ov implements DialogInterface.OnDismissListener {
    public final int f40383a;
    public final ay f40384b;

    public ov(ay ayVar, int i10) {
        this.f40383a = i10;
        this.f40384b = ayVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40383a) {
            case 0:
                ay ayVar = this.f40384b;
                if (ayVar.R3 != null) {
                    ayVar.getMessagesController().h4(0L, ayVar.R3);
                    ayVar.R3 = null;
                    ayVar.W4();
                    return;
                }
                return;
            case 1:
                this.f40384b.m4(true);
                return;
            case 2:
                this.f40384b.m4(true);
                return;
            default:
                ay.k0(this.f40384b);
                return;
        }
    }
}
