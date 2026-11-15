package org.telegram.ui.Components;

import android.location.Location;
public final class wk implements q0.a {
    public final int f41370a;
    public final dl f41371b;

    public wk(dl dlVar, int i7) {
        this.f41370a = i7;
        this.f41371b = dlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41370a) {
            case 0:
                dl.Z(this.f41371b, (org.telegram.messenger.ea) obj);
                return;
            default:
                dl.X(this.f41371b, (Location) obj);
                return;
        }
    }
}
