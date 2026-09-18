package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class xk implements q0.a {
    public final int f29931a;
    public final gl f29932b;

    public xk(gl glVar, int i10) {
        this.f29931a = i10;
        this.f29932b = glVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29931a) {
            case 0:
                gl.K(this.f29932b, (IMapsProvider.IMap) obj);
                return;
            default:
                gl.R(this.f29932b, (Location) obj);
                return;
        }
    }
}
