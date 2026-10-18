package org.telegram.ui;

import android.content.DialogInterface;
public final class jg implements DialogInterface.OnCancelListener {
    public final int f38134a;
    public final Object f38135b;

    public jg(Object obj, int i10) {
        this.f38134a = i10;
        this.f38135b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f38134a) {
            case 0:
                sn snVar = (sn) this.f38135b;
                snVar.f41152b9 = true;
                snVar.Z8 = 0;
                snVar.f41337qb = 0;
                snVar.N4 = 0;
                snVar.w9();
                snVar.Rb(false);
                return;
            case 1:
                ko koVar = (ko) this.f38135b;
                koVar.M0 = false;
                koVar.f38548b = null;
                koVar.N0 = false;
                return;
            case 2:
                ((kp) this.f38135b).f38587n = null;
                return;
            default:
                ((kb0) this.f38135b).b();
                return;
        }
    }
}
