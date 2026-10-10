package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class ol implements q0.a {
    public final int f29519a;
    public final xl f29520b;

    public ol(xl xlVar, int i10) {
        this.f29519a = i10;
        this.f29520b = xlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29519a) {
            case 0:
                xl.N(this.f29520b, (IMapsProvider.IMap) obj);
                return;
            default:
                xl.U(this.f29520b, (Location) obj);
                return;
        }
    }
}
