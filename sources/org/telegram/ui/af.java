package org.telegram.ui;

import android.view.View;
public final class af implements View.OnLongClickListener {
    public final int f43766a;
    public final wm f43767b;

    public af(wm wmVar, int i3) {
        this.f43766a = i3;
        this.f43767b = wmVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.zi ziVar2;
        switch (this.f43766a) {
            case 0:
                wm wmVar = this.f43767b;
                org.telegram.messenger.zi ziVar3 = wmVar.f51500u5;
                if (ziVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(ziVar3.R0)) {
                    new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(wmVar.getParentActivity()), wmVar.f51557ya).k(false).j();
                }
                return true;
            case 1:
                return wm.D0(this.f43767b);
            default:
                wm wmVar2 = this.f43767b;
                int i3 = wmVar2.Pb;
                if (i3 == 1 && (ziVar2 = wmVar2.G5) != null) {
                    wmVar2.l(ziVar2.f1(), 0, true, 0, true, 0);
                    return true;
                } else if (wmVar2.f51526w5 != null && i3 == 2 && (ziVar = wmVar2.E5) != null) {
                    wmVar2.l(ziVar.f1(), 0, true, 0, true, 0);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
