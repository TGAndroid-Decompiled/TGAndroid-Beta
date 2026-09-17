package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class xk implements q0.a {
    public final int f29928a;
    public final gl f29929b;

    public xk(gl glVar, int i10) {
        this.f29928a = i10;
        this.f29929b = glVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29928a) {
            case 0:
                gl.K(this.f29929b, (IMapsProvider.IMap) obj);
                return;
            default:
                gl.R(this.f29929b, (Location) obj);
                return;
        }
    }
}
