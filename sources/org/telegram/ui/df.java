package org.telegram.ui;

import android.view.View;
public final class df implements View.OnLongClickListener {
    public final int f47085a;
    public final bn f47086b;

    public df(bn bnVar, int i7) {
        this.f47085a = i7;
        this.f47086b = bnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.fj fjVar2;
        switch (this.f47085a) {
            case 0:
                bn bnVar = this.f47086b;
                org.telegram.messenger.fj fjVar3 = bnVar.f46396v5;
                if (fjVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(fjVar3.T0)) {
                    new org.telegram.ui.Components.kc(org.telegram.ui.Components.bb.a(bnVar.getParentActivity()), bnVar.Ba).k(false).j();
                }
                return true;
            case 1:
                return bn.H0(this.f47086b);
            default:
                bn bnVar2 = this.f47086b;
                int i7 = bnVar2.Sb;
                if (i7 == 1 && (fjVar2 = bnVar2.H5) != null) {
                    bnVar2.l(fjVar2.e1(), 0, true, 0, true, 0);
                    return true;
                } else if (bnVar2.f46423x5 != null && i7 == 2 && (fjVar = bnVar2.F5) != null) {
                    bnVar2.l(fjVar.e1(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
