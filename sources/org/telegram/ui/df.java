package org.telegram.ui;

import android.view.View;
public final class df implements View.OnLongClickListener {
    public final int f46959a;
    public final bn f46960b;

    public df(bn bnVar, int i7) {
        this.f46959a = i7;
        this.f46960b = bnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.fj fjVar2;
        switch (this.f46959a) {
            case 0:
                bn bnVar = this.f46960b;
                org.telegram.messenger.fj fjVar3 = bnVar.f46224v5;
                if (fjVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(fjVar3.T0)) {
                    new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.Ba).k(false).j();
                }
                return true;
            case 1:
                return bn.H0(this.f46960b);
            default:
                bn bnVar2 = this.f46960b;
                int i7 = bnVar2.Sb;
                if (i7 == 1 && (fjVar2 = bnVar2.H5) != null) {
                    bnVar2.l(fjVar2.e1(), 0, true, 0, true, 0);
                    return true;
                } else if (bnVar2.f46251x5 != null && i7 == 2 && (fjVar = bnVar2.F5) != null) {
                    bnVar2.l(fjVar.e1(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
