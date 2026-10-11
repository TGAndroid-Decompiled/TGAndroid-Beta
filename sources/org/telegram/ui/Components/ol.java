package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class ol implements q0.a {
    public final int f29423a;
    public final xl f29424b;

    public ol(xl xlVar, int i10) {
        this.f29423a = i10;
        this.f29424b = xlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29423a) {
            case 0:
                xl.N(this.f29424b, (IMapsProvider.IMap) obj);
                return;
            default:
                xl.U(this.f29424b, (Location) obj);
                return;
        }
    }
}
