package org.telegram.ui.Components;

import android.location.Location;
public final class rk implements q0.a {
    public final int f30009a;
    public final bl f30010b;

    public rk(bl blVar, int i10) {
        this.f30009a = i10;
        this.f30010b = blVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30009a) {
            case 0:
                bl.N(this.f30010b, (org.telegram.messenger.ha) obj);
                return;
            default:
                bl.T(this.f30010b, (Location) obj);
                return;
        }
    }
}
