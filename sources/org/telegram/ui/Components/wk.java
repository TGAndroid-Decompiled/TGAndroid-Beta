package org.telegram.ui.Components;

import android.location.Location;
public final class wk implements q0.a {
    public final int f41373a;
    public final dl f41374b;

    public wk(dl dlVar, int i7) {
        this.f41373a = i7;
        this.f41374b = dlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41373a) {
            case 0:
                dl.Z(this.f41374b, (org.telegram.messenger.ea) obj);
                return;
            default:
                dl.X(this.f41374b, (Location) obj);
                return;
        }
    }
}
