package org.telegram.ui.Components;

import android.location.Location;
public final class rk implements q0.a {
    public final int f29945a;
    public final bl f29946b;

    public rk(bl blVar, int i10) {
        this.f29945a = i10;
        this.f29946b = blVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29945a) {
            case 0:
                bl.N(this.f29946b, (org.telegram.messenger.ga) obj);
                return;
            default:
                bl.T(this.f29946b, (Location) obj);
                return;
        }
    }
}
