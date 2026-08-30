package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class qk implements q0.a {
    public final int f28146a;
    public final al f28147b;

    public qk(al alVar, int i10) {
        this.f28146a = i10;
        this.f28147b = alVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f28146a) {
            case 0:
                al.J(this.f28147b, (IMapsProvider.IMap) obj);
                return;
            default:
                al.R(this.f28147b, (Location) obj);
                return;
        }
    }
}
