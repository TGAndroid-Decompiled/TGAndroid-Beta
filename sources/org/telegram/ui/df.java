package org.telegram.ui;

import android.view.View;
public final class df implements View.OnLongClickListener {
    public final int f44942a;
    public final cn f44943b;

    public df(cn cnVar, int i7) {
        this.f44942a = i7;
        this.f44943b = cnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2;
        switch (this.f44942a) {
            case 0:
                cn cnVar = this.f44943b;
                org.telegram.messenger.ij ijVar3 = cnVar.f44628t5;
                if (ijVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(ijVar3.R0)) {
                    new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(cnVar.getParentActivity()), cnVar.f44709za).k(false).j();
                }
                return true;
            case 1:
                return cn.H0(this.f44943b);
            default:
                cn cnVar2 = this.f44943b;
                int i7 = cnVar2.Qb;
                if (i7 == 1 && (ijVar2 = cnVar2.F5) != null) {
                    cnVar2.l(ijVar2.e1(), 0, true, 0, true, 0);
                    return true;
                } else if (cnVar2.f44653v5 != null && i7 == 2 && (ijVar = cnVar2.D5) != null) {
                    cnVar2.l(ijVar.e1(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
