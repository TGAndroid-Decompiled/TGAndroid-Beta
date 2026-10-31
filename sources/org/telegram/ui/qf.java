package org.telegram.ui;

import android.view.View;
public final class qf implements View.OnLongClickListener {
    public final int f40972a;
    public final un f40973b;

    public qf(un unVar, int i10) {
        this.f40972a = i10;
        this.f40973b = unVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.jj jjVar2;
        switch (this.f40972a) {
            case 0:
                un unVar = this.f40973b;
                org.telegram.messenger.jj jjVar3 = unVar.f42421t5;
                if (jjVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.i0.g(jjVar3.R0)) {
                    new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(unVar.getParentActivity()), unVar.f42477xa).k(false).j();
                }
                return true;
            case 1:
                return un.S0(this.f40973b);
            default:
                un unVar2 = this.f40973b;
                int i10 = unVar2.Jb;
                if (i10 == 1 && (jjVar2 = unVar2.F5) != null) {
                    unVar2.k(jjVar2.f1(), 0, true, 0, true, 0);
                    return true;
                } else if (unVar2.f42446v5 != null && i10 == 2 && (jjVar = unVar2.D5) != null) {
                    unVar2.k(jjVar.f1(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
