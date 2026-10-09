package org.telegram.ui;

import android.content.DialogInterface;
public final class pg implements DialogInterface.OnCancelListener {
    public final int f40794a;
    public final Object f40795b;

    public pg(Object obj, int i10) {
        this.f40794a = i10;
        this.f40795b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40794a) {
            case 0:
                zn znVar = (zn) this.f40795b;
                znVar.f44723b9 = true;
                znVar.Z8 = 0;
                znVar.f44908qb = 0;
                znVar.N4 = 0;
                znVar.w9();
                znVar.Rb(false);
                return;
            case 1:
                uo uoVar = (uo) this.f40795b;
                uoVar.M0 = false;
                uoVar.f42466b = null;
                uoVar.N0 = false;
                return;
            case 2:
                ((up) this.f40795b).f42505n = null;
                return;
            default:
                ((ec0) this.f40795b).b();
                return;
        }
    }
}
