package org.telegram.ui;

import android.view.View;
public final class qf implements View.OnLongClickListener {
    public final int f40765a;
    public final un f40766b;

    public qf(un unVar, int i10) {
        this.f40765a = i10;
        this.f40766b = unVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.kj kjVar2;
        switch (this.f40765a) {
            case 0:
                un unVar = this.f40766b;
                org.telegram.messenger.kj kjVar3 = unVar.f42232t5;
                if (kjVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.i0.g(kjVar3.R0)) {
                    new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(unVar.getParentActivity()), unVar.f42288xa).k(false).j();
                }
                return true;
            case 1:
                return un.x1(this.f40766b);
            default:
                un unVar2 = this.f40766b;
                int i10 = unVar2.Kb;
                if (i10 == 1 && (kjVar2 = unVar2.F5) != null) {
                    unVar2.l(kjVar2.f1(), 0, true, 0, true, 0);
                    return true;
                } else if (unVar2.f42257v5 != null && i10 == 2 && (kjVar = unVar2.D5) != null) {
                    unVar2.l(kjVar.f1(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
