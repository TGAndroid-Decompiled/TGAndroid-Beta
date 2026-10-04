package org.telegram.ui;

import android.content.DialogInterface;
public final class ig implements DialogInterface.OnDismissListener {
    public final int f37416a;
    public final yn f37417b;

    public ig(yn ynVar, int i10) {
        this.f37416a = i10;
        this.f37417b = ynVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37416a) {
            case 0:
                yn.z0(this.f37417b);
                return;
            case 1:
                this.f37417b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f37417b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f37417b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f37417b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f37417b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f37417b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f37417b.Db = null;
                return;
            default:
                ek ekVar = this.f37417b.V1;
                if (ekVar != null) {
                    ekVar.c(false);
                    return;
                }
                return;
        }
    }
}
