package org.telegram.messenger;

import android.location.Location;
public final class z5 implements q0.a {
    public final int f20270a;
    public final LocationController f20271b;

    public z5(LocationController locationController, int i10) {
        this.f20270a = i10;
        this.f20271b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f20270a) {
            case 0:
                this.f20271b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f20271b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
