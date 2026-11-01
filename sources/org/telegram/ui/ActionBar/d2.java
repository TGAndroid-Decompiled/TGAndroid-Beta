package org.telegram.ui.ActionBar;

import org.telegram.messenger.j20;
public final class d2 implements j20 {
    public final int f20248a;
    public final Object f20249b;

    public d2(Object obj, int i10) {
        this.f20248a = i10;
        this.f20249b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f20248a) {
            case 0:
                return ((k2) this.f20249b).getSimpleMenuOverlay();
            default:
                return ((rh.e4) this.f20249b).k();
        }
    }
}
