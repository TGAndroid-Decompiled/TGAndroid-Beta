package org.telegram.ui;

import android.content.DialogInterface;
public final class hg implements DialogInterface.OnCancelListener {
    public final int f37625a;
    public final Object f37626b;

    public hg(Object obj, int i10) {
        this.f37625a = i10;
        this.f37626b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37625a) {
            case 0:
                qn qnVar = (qn) this.f37626b;
                qnVar.f40638b9 = true;
                qnVar.Z8 = 0;
                qnVar.f40823qb = 0;
                qnVar.N4 = 0;
                qnVar.w9();
                qnVar.Sb(false);
                return;
            case 1:
                io ioVar = (io) this.f37626b;
                ioVar.M0 = false;
                ioVar.f38039b = null;
                ioVar.N0 = false;
                return;
            case 2:
                ((ip) this.f37626b).f38078n = null;
                return;
            default:
                ((ib0) this.f37626b).b();
                return;
        }
    }
}
