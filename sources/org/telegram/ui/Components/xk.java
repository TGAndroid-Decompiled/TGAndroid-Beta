package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class xk implements q0.a {
    public final int f29989a;
    public final gl f29990b;

    public xk(gl glVar, int i10) {
        this.f29989a = i10;
        this.f29990b = glVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29989a) {
            case 0:
                gl.K(this.f29990b, (IMapsProvider.IMap) obj);
                return;
            default:
                gl.R(this.f29990b, (Location) obj);
                return;
        }
    }
}
