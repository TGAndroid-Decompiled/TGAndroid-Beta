package org.telegram.ui;

import android.content.DialogInterface;
public final class hg implements DialogInterface.OnCancelListener {
    public final int f37624a;
    public final Object f37625b;

    public hg(Object obj, int i10) {
        this.f37624a = i10;
        this.f37625b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37624a) {
            case 0:
                qn qnVar = (qn) this.f37625b;
                qnVar.f40637b9 = true;
                qnVar.Z8 = 0;
                qnVar.f40822qb = 0;
                qnVar.N4 = 0;
                qnVar.w9();
                qnVar.Sb(false);
                return;
            case 1:
                io ioVar = (io) this.f37625b;
                ioVar.M0 = false;
                ioVar.f38038b = null;
                ioVar.N0 = false;
                return;
            case 2:
                ((ip) this.f37625b).f38077n = null;
                return;
            default:
                ((ib0) this.f37625b).b();
                return;
        }
    }
}
