package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class zk implements q0.a {
    public final int f30910a;
    public final il f30911b;

    public zk(il ilVar, int i10) {
        this.f30910a = i10;
        this.f30911b = ilVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30910a) {
            case 0:
                il.K(this.f30911b, (IMapsProvider.IMap) obj);
                return;
            default:
                il.R(this.f30911b, (Location) obj);
                return;
        }
    }
}
