package org.telegram.ui.Components;

import android.location.Location;
public final class fl implements q0.a {
    public final int f35256a;
    public final ml f35257b;

    public fl(ml mlVar, int i7) {
        this.f35256a = i7;
        this.f35257b = mlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f35256a) {
            case 0:
                ml.Z(this.f35257b, (org.telegram.messenger.ea) obj);
                return;
            default:
                ml.X(this.f35257b, (Location) obj);
                return;
        }
    }
}
