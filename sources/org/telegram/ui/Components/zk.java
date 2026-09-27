package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class zk implements q0.a {
    public final int f30942a;
    public final il f30943b;

    public zk(il ilVar, int i10) {
        this.f30942a = i10;
        this.f30943b = ilVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30942a) {
            case 0:
                il.K(this.f30943b, (IMapsProvider.IMap) obj);
                return;
            default:
                il.R(this.f30943b, (Location) obj);
                return;
        }
    }
}
