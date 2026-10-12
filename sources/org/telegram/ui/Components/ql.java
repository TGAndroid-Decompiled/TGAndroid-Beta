package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class ql implements q0.a {
    public final int f29859a;
    public final zl f29860b;

    public ql(zl zlVar, int i10) {
        this.f29859a = i10;
        this.f29860b = zlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29859a) {
            case 0:
                zl.N(this.f29860b, (IMapsProvider.IMap) obj);
                return;
            default:
                zl.U(this.f29860b, (Location) obj);
                return;
        }
    }
}
