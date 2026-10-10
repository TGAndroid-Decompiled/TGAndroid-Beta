package org.telegram.ui;

import android.content.DialogInterface;
public final class pg implements DialogInterface.OnCancelListener {
    public final int f40838a;
    public final Object f40839b;

    public pg(Object obj, int i10) {
        this.f40838a = i10;
        this.f40839b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40838a) {
            case 0:
                zn znVar = (zn) this.f40839b;
                znVar.f44767b9 = true;
                znVar.Z8 = 0;
                znVar.f44952qb = 0;
                znVar.N4 = 0;
                znVar.w9();
                znVar.Rb(false);
                return;
            case 1:
                uo uoVar = (uo) this.f40839b;
                uoVar.M0 = false;
                uoVar.f42510b = null;
                uoVar.N0 = false;
                return;
            case 2:
                ((up) this.f40839b).f42549n = null;
                return;
            default:
                ((ec0) this.f40839b).b();
                return;
        }
    }
}
