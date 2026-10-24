package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class fl implements q0.a {
    public final int f26344a;
    public final pl f26345b;

    public fl(pl plVar, int i10) {
        this.f26344a = i10;
        this.f26345b = plVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26344a) {
            case 0:
                pl.N(this.f26345b, (IMapsProvider.IMap) obj);
                return;
            default:
                pl.T(this.f26345b, (Location) obj);
                return;
        }
    }
}
