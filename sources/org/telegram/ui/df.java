package org.telegram.ui;

import android.view.View;
public final class df implements View.OnLongClickListener {
    public final int f45058a;
    public final an f45059b;

    public df(an anVar, int i7) {
        this.f45058a = i7;
        this.f45059b = anVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2;
        switch (this.f45058a) {
            case 0:
                an anVar = this.f45059b;
                org.telegram.messenger.ij ijVar3 = anVar.f43966t5;
                if (ijVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(ijVar3.R0)) {
                    new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(anVar.getParentActivity()), anVar.f44023xa).k(false).j();
                }
                return true;
            case 1:
                return an.D0(this.f45059b);
            default:
                an anVar2 = this.f45059b;
                int i7 = anVar2.Ob;
                if (i7 == 1 && (ijVar2 = anVar2.F5) != null) {
                    anVar2.l(ijVar2.f1(), 0, true, 0, true, 0);
                    return true;
                } else if (anVar2.f43991v5 != null && i7 == 2 && (ijVar = anVar2.D5) != null) {
                    anVar2.l(ijVar.f1(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
