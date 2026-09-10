package org.telegram.messenger;

import android.location.Location;
public final class z5 implements q0.a {
    public final int f17120a;
    public final LocationController f17121b;

    public z5(LocationController locationController, int i10) {
        this.f17120a = i10;
        this.f17121b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f17120a) {
            case 0:
                this.f17121b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f17121b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
