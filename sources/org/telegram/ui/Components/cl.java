package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class cl implements q0.a {
    public final int f22153a;
    public final ll f22154b;

    public cl(ll llVar, int i10) {
        this.f22153a = i10;
        this.f22154b = llVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f22153a) {
            case 0:
                ll.K(this.f22154b, (IMapsProvider.IMap) obj);
                return;
            default:
                ll.R(this.f22154b, (Location) obj);
                return;
        }
    }
}
