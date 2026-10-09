package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class ol implements q0.a {
    public final int f29508a;
    public final xl f29509b;

    public ol(xl xlVar, int i10) {
        this.f29508a = i10;
        this.f29509b = xlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29508a) {
            case 0:
                xl.N(this.f29509b, (IMapsProvider.IMap) obj);
                return;
            default:
                xl.U(this.f29509b, (Location) obj);
                return;
        }
    }
}
