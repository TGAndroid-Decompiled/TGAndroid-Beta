package org.telegram.ui.Components;
public final class rj implements Runnable {
    public final int f39323a;
    public final tj f39324b;

    public rj(tj tjVar, int i7) {
        this.f39323a = i7;
        this.f39324b = tjVar;
    }

    @Override
    public final void run() {
        switch (this.f39323a) {
            case 0:
                tj tjVar = this.f39324b;
                if (tjVar.f40048f != null) {
                    tjVar.f40052w = org.telegram.messenger.m10.h(new StringBuilder("+"), tjVar.f40048f.phone, pf.b.c());
                    tjVar.f40051s = tjVar.f40048f;
                    org.telegram.messenger.g0.g3(new rj(tjVar, 1));
                    return;
                }
                return;
            default:
                tj tjVar2 = this.f39324b;
                tjVar2.f40046c.l(tjVar2.f40052w, false);
                return;
        }
    }
}
