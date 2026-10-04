package org.telegram.ui;

import android.content.DialogInterface;
public final class ig implements DialogInterface.OnDismissListener {
    public final int f37415a;
    public final yn f37416b;

    public ig(yn ynVar, int i10) {
        this.f37415a = i10;
        this.f37416b = ynVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37415a) {
            case 0:
                yn.z0(this.f37416b);
                return;
            case 1:
                this.f37416b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f37416b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f37416b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f37416b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f37416b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f37416b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f37416b.Db = null;
                return;
            default:
                ek ekVar = this.f37416b.V1;
                if (ekVar != null) {
                    ekVar.c(false);
                    return;
                }
                return;
        }
    }
}
