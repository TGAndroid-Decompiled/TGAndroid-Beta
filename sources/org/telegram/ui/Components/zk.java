package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class zk implements q0.a {
    public final int f30911a;
    public final il f30912b;

    public zk(il ilVar, int i10) {
        this.f30911a = i10;
        this.f30912b = ilVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30911a) {
            case 0:
                il.K(this.f30912b, (IMapsProvider.IMap) obj);
                return;
            default:
                il.R(this.f30912b, (Location) obj);
                return;
        }
    }
}
