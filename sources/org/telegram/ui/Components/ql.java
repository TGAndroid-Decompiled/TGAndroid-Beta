package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class ql implements q0.a {
    public final int f29861a;
    public final zl f29862b;

    public ql(zl zlVar, int i10) {
        this.f29861a = i10;
        this.f29862b = zlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29861a) {
            case 0:
                zl.N(this.f29862b, (IMapsProvider.IMap) obj);
                return;
            default:
                zl.U(this.f29862b, (Location) obj);
                return;
        }
    }
}
