package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class ol implements q0.a {
    public final int f29551a;
    public final xl f29552b;

    public ol(xl xlVar, int i10) {
        this.f29551a = i10;
        this.f29552b = xlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29551a) {
            case 0:
                xl.N(this.f29552b, (IMapsProvider.IMap) obj);
                return;
            default:
                xl.U(this.f29552b, (Location) obj);
                return;
        }
    }
}
