package org.telegram.ui;

import android.content.DialogInterface;
public final class pg implements DialogInterface.OnCancelListener {
    public final int f40792a;
    public final Object f40793b;

    public pg(Object obj, int i10) {
        this.f40792a = i10;
        this.f40793b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40792a) {
            case 0:
                zn znVar = (zn) this.f40793b;
                znVar.f44721b9 = true;
                znVar.Z8 = 0;
                znVar.f44906qb = 0;
                znVar.N4 = 0;
                znVar.w9();
                znVar.Rb(false);
                return;
            case 1:
                uo uoVar = (uo) this.f40793b;
                uoVar.M0 = false;
                uoVar.f42464b = null;
                uoVar.N0 = false;
                return;
            case 2:
                ((up) this.f40793b).f42503n = null;
                return;
            default:
                ((ec0) this.f40793b).b();
                return;
        }
    }
}
