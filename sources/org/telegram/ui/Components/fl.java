package org.telegram.ui.Components;

import android.location.Location;
public final class fl implements q0.a {
    public final int f35254a;
    public final ml f35255b;

    public fl(ml mlVar, int i7) {
        this.f35254a = i7;
        this.f35255b = mlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f35254a) {
            case 0:
                ml.Z(this.f35255b, (org.telegram.messenger.da) obj);
                return;
            default:
                ml.X(this.f35255b, (Location) obj);
                return;
        }
    }
}
