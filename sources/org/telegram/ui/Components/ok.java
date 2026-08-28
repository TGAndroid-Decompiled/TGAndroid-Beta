package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class ok implements q0.a {
    public final int f31406a;
    public final xk f31407b;

    public ok(xk xkVar, int i9) {
        this.f31406a = i9;
        this.f31407b = xkVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f31406a) {
            case 0:
                xk.J(this.f31407b, (IMapsProvider.IMap) obj);
                return;
            default:
                xk.Q(this.f31407b, (Location) obj);
                return;
        }
    }
}
