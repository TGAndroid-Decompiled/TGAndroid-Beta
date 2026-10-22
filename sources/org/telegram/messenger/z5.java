package org.telegram.messenger;

import android.location.Location;
public final class z5 implements q0.a {
    public final int f20206a;
    public final LocationController f20207b;

    public z5(LocationController locationController, int i10) {
        this.f20206a = i10;
        this.f20207b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f20206a) {
            case 0:
                this.f20207b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f20207b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
