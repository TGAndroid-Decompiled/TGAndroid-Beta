package org.telegram.ui;

import android.content.DialogInterface;
public final class pg implements DialogInterface.OnCancelListener {
    public final int f40849a;
    public final Object f40850b;

    public pg(Object obj, int i10) {
        this.f40849a = i10;
        this.f40850b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40849a) {
            case 0:
                zn znVar = (zn) this.f40850b;
                znVar.f44722b9 = true;
                znVar.Z8 = 0;
                znVar.f44907qb = 0;
                znVar.N4 = 0;
                znVar.w9();
                znVar.Rb(false);
                return;
            case 1:
                uo uoVar = (uo) this.f40850b;
                uoVar.M0 = false;
                uoVar.f42656b = null;
                uoVar.N0 = false;
                return;
            case 2:
                ((up) this.f40850b).f42739n = null;
                return;
            default:
                ((dc0) this.f40850b).b();
                return;
        }
    }
}
