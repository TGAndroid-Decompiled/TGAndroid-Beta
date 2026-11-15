package org.telegram.ui;

import android.view.View;
public final class bf implements View.OnLongClickListener {
    public final int f45700a;
    public final an f45701b;

    public bf(an anVar, int i7) {
        this.f45700a = i7;
        this.f45701b = anVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2;
        switch (this.f45700a) {
            case 0:
                an anVar = this.f45701b;
                org.telegram.messenger.gj gjVar3 = anVar.f45381u5;
                if (gjVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(gjVar3.T0)) {
                    new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(anVar.getParentActivity()), anVar.Aa).k(false).j();
                }
                return true;
            case 1:
                return an.H0(this.f45701b);
            default:
                an anVar2 = this.f45701b;
                int i7 = anVar2.Rb;
                if (i7 == 1 && (gjVar2 = anVar2.G5) != null) {
                    anVar2.l(gjVar2.e1(), 0, true, 0, true, 0);
                    return true;
                } else if (anVar2.f45408w5 != null && i7 == 2 && (gjVar = anVar2.E5) != null) {
                    anVar2.l(gjVar.e1(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
