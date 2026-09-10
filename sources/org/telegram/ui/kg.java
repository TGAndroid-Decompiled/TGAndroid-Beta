package org.telegram.ui;

import android.content.DialogInterface;
public final class kg implements DialogInterface.OnDismissListener {
    public final int f34355a;
    public final eo f34356b;

    public kg(eo eoVar, int i10) {
        this.f34355a = i10;
        this.f34356b = eoVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34355a) {
            case 0:
                eo.B0(this.f34356b);
                return;
            case 1:
                this.f34356b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f34356b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f34356b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f34356b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f34356b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f34356b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f34356b.Gb = null;
                return;
            default:
                jk jkVar = this.f34356b.X1;
                if (jkVar != null) {
                    jkVar.c(false);
                    return;
                }
                return;
        }
    }
}
