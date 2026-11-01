package org.telegram.ui;

import android.content.DialogInterface;
public final class lg implements DialogInterface.OnCancelListener {
    public final int f39271a;
    public final Object f39272b;

    public lg(Object obj, int i10) {
        this.f39271a = i10;
        this.f39272b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39271a) {
            case 0:
                un unVar = (un) this.f39272b;
                unVar.p9 = true;
                unVar.f42161n9 = 0;
                unVar.Mb = 0;
                unVar.Z4 = 0;
                unVar.H9();
                unVar.lc(false);
                return;
            case 1:
                oo ooVar = (oo) this.f39272b;
                ooVar.M0 = false;
                ooVar.f40205b = null;
                ooVar.N0 = false;
                return;
            case 2:
                ((qp) this.f39272b).f40873n = null;
                return;
            default:
                ((ta0) this.f39272b).b();
                return;
        }
    }
}
