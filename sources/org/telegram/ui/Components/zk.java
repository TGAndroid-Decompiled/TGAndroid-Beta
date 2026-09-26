package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class zk implements q0.a {
    public final int f30913a;
    public final il f30914b;

    public zk(il ilVar, int i10) {
        this.f30913a = i10;
        this.f30914b = ilVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30913a) {
            case 0:
                il.K(this.f30914b, (IMapsProvider.IMap) obj);
                return;
            default:
                il.R(this.f30914b, (Location) obj);
                return;
        }
    }
}
