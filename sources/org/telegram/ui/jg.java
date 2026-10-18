package org.telegram.ui;

import android.content.DialogInterface;
public final class jg implements DialogInterface.OnCancelListener {
    public final int f38178a;
    public final Object f38179b;

    public jg(Object obj, int i10) {
        this.f38178a = i10;
        this.f38179b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f38178a) {
            case 0:
                sn snVar = (sn) this.f38179b;
                snVar.f41187b9 = true;
                snVar.Z8 = 0;
                snVar.f41372qb = 0;
                snVar.N4 = 0;
                snVar.w9();
                snVar.Rb(false);
                return;
            case 1:
                ko koVar = (ko) this.f38179b;
                koVar.M0 = false;
                koVar.f38593b = null;
                koVar.N0 = false;
                return;
            case 2:
                ((kp) this.f38179b).f38632n = null;
                return;
            default:
                ((kb0) this.f38179b).b();
                return;
        }
    }
}
