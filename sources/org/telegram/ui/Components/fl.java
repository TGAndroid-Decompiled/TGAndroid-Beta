package org.telegram.ui.Components;

import android.location.Location;
public final class fl implements q0.a {
    public final int f35235a;
    public final ml f35236b;

    public fl(ml mlVar, int i7) {
        this.f35235a = i7;
        this.f35236b = mlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f35235a) {
            case 0:
                ml.Z(this.f35236b, (org.telegram.messenger.ea) obj);
                return;
            default:
                ml.X(this.f35236b, (Location) obj);
                return;
        }
    }
}
