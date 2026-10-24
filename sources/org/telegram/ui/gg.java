package org.telegram.ui;

import android.content.DialogInterface;
public final class gg implements DialogInterface.OnCancelListener {
    public final int f37559a;
    public final Object f37560b;

    public gg(Object obj, int i10) {
        this.f37559a = i10;
        this.f37560b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37559a) {
            case 0:
                sn snVar = (sn) this.f37560b;
                snVar.f41616n9 = true;
                snVar.f41590l9 = 0;
                snVar.Db = 0;
                snVar.Z4 = 0;
                snVar.w9();
                snVar.Tb(false);
                return;
            case 1:
                ko koVar = (ko) this.f37560b;
                koVar.L0 = false;
                koVar.f38953b = null;
                koVar.M0 = false;
                return;
            case 2:
                ((kp) this.f37560b).f38992n = null;
                return;
            default:
                ((ob0) this.f37560b).b();
                return;
        }
    }
}
