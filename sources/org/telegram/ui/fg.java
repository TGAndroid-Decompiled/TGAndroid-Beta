package org.telegram.ui;

import android.content.DialogInterface;
public final class fg implements DialogInterface.OnDismissListener {
    public final int f34074a;
    public final zn f34075b;

    public fg(zn znVar, int i10) {
        this.f34074a = i10;
        this.f34075b = znVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34074a) {
            case 0:
                zn.B0(this.f34075b);
                return;
            case 1:
                this.f34075b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f34075b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f34075b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f34075b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f34075b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f34075b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f34075b.Db = null;
                return;
            default:
                fk fkVar = this.f34075b.U1;
                if (fkVar != null) {
                    fkVar.c(false);
                    return;
                }
                return;
        }
    }
}
