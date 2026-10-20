package org.telegram.ui;

import android.content.DialogInterface;
public final class hg implements DialogInterface.OnCancelListener {
    public final int f37620a;
    public final Object f37621b;

    public hg(Object obj, int i10) {
        this.f37620a = i10;
        this.f37621b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37620a) {
            case 0:
                qn qnVar = (qn) this.f37621b;
                qnVar.f40634b9 = true;
                qnVar.Z8 = 0;
                qnVar.f40819qb = 0;
                qnVar.N4 = 0;
                qnVar.w9();
                qnVar.Sb(false);
                return;
            case 1:
                io ioVar = (io) this.f37621b;
                ioVar.M0 = false;
                ioVar.f38034b = null;
                ioVar.N0 = false;
                return;
            case 2:
                ((ip) this.f37621b).f38073n = null;
                return;
            default:
                ((ib0) this.f37621b).b();
                return;
        }
    }
}
