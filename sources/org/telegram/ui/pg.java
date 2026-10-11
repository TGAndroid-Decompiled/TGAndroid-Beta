package org.telegram.ui;

import android.content.DialogInterface;
public final class pg implements DialogInterface.OnCancelListener {
    public final int f40883a;
    public final Object f40884b;

    public pg(Object obj, int i10) {
        this.f40883a = i10;
        this.f40884b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40883a) {
            case 0:
                zn znVar = (zn) this.f40884b;
                znVar.f44756b9 = true;
                znVar.Z8 = 0;
                znVar.f44941qb = 0;
                znVar.N4 = 0;
                znVar.w9();
                znVar.Rb(false);
                return;
            case 1:
                uo uoVar = (uo) this.f40884b;
                uoVar.M0 = false;
                uoVar.f42690b = null;
                uoVar.N0 = false;
                return;
            case 2:
                ((up) this.f40884b).f42773n = null;
                return;
            default:
                ((dc0) this.f40884b).b();
                return;
        }
    }
}
