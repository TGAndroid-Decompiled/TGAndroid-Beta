package org.telegram.ui;

import android.content.DialogInterface;
public final class gg implements DialogInterface.OnCancelListener {
    public final int f37596a;
    public final Object f37597b;

    public gg(Object obj, int i10) {
        this.f37596a = i10;
        this.f37597b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37596a) {
            case 0:
                sn snVar = (sn) this.f37597b;
                snVar.f41619n9 = true;
                snVar.f41593l9 = 0;
                snVar.Db = 0;
                snVar.Z4 = 0;
                snVar.w9();
                snVar.Tb(false);
                return;
            case 1:
                ko koVar = (ko) this.f37597b;
                koVar.L0 = false;
                koVar.f38985b = null;
                koVar.M0 = false;
                return;
            case 2:
                ((kp) this.f37597b).f39024n = null;
                return;
            default:
                ((ob0) this.f37597b).b();
                return;
        }
    }
}
