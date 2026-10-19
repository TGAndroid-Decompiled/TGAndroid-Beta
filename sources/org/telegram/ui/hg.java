package org.telegram.ui;

import android.content.DialogInterface;
public final class hg implements DialogInterface.OnCancelListener {
    public final int f37614a;
    public final Object f37615b;

    public hg(Object obj, int i10) {
        this.f37614a = i10;
        this.f37615b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37614a) {
            case 0:
                qn qnVar = (qn) this.f37615b;
                qnVar.f40628b9 = true;
                qnVar.Z8 = 0;
                qnVar.f40813qb = 0;
                qnVar.N4 = 0;
                qnVar.w9();
                qnVar.Rb(false);
                return;
            case 1:
                io ioVar = (io) this.f37615b;
                ioVar.M0 = false;
                ioVar.f38028b = null;
                ioVar.N0 = false;
                return;
            case 2:
                ((ip) this.f37615b).f38067n = null;
                return;
            default:
                ((ib0) this.f37615b).b();
                return;
        }
    }
}
