package org.telegram.ui;

import android.view.View;
public final class df implements View.OnLongClickListener {
    public final int f46922a;
    public final bn f46923b;

    public df(bn bnVar, int i7) {
        this.f46922a = i7;
        this.f46923b = bnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2;
        switch (this.f46922a) {
            case 0:
                bn bnVar = this.f46923b;
                org.telegram.messenger.gj gjVar3 = bnVar.f46181v5;
                if (gjVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(gjVar3.T0)) {
                    new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.Ba).k(false).j();
                }
                return true;
            case 1:
                return bn.H0(this.f46923b);
            default:
                bn bnVar2 = this.f46923b;
                int i7 = bnVar2.Sb;
                if (i7 == 1 && (gjVar2 = bnVar2.H5) != null) {
                    bnVar2.l(gjVar2.e1(), 0, true, 0, true, 0);
                    return true;
                } else if (bnVar2.f46208x5 != null && i7 == 2 && (gjVar = bnVar2.F5) != null) {
                    bnVar2.l(gjVar.e1(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
