package org.telegram.ui;

import android.content.DialogInterface;
public final class jg implements DialogInterface.OnCancelListener {
    public final int f38162a;
    public final Object f38163b;

    public jg(Object obj, int i10) {
        this.f38162a = i10;
        this.f38163b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f38162a) {
            case 0:
                sn snVar = (sn) this.f38163b;
                snVar.f41166b9 = true;
                snVar.Z8 = 0;
                snVar.f41351qb = 0;
                snVar.N4 = 0;
                snVar.w9();
                snVar.Rb(false);
                return;
            case 1:
                ko koVar = (ko) this.f38163b;
                koVar.M0 = false;
                koVar.f38585b = null;
                koVar.N0 = false;
                return;
            case 2:
                ((kp) this.f38163b).f38626n = null;
                return;
            default:
                ((kb0) this.f38163b).b();
                return;
        }
    }
}
