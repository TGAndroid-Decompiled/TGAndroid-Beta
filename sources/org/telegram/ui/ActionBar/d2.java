package org.telegram.ui.ActionBar;

import org.telegram.messenger.i20;
public final class d2 implements i20 {
    public final int f20247a;
    public final Object f20248b;

    public d2(Object obj, int i10) {
        this.f20247a = i10;
        this.f20248b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f20247a) {
            case 0:
                return ((k2) this.f20248b).getSimpleMenuOverlay();
            default:
                return ((rh.e4) this.f20248b).k();
        }
    }
}
