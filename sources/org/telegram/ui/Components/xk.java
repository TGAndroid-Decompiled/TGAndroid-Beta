package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class xk implements q0.a {
    public final int f30342a;
    public final gl f30343b;

    public xk(gl glVar, int i10) {
        this.f30342a = i10;
        this.f30343b = glVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30342a) {
            case 0:
                gl.K(this.f30343b, (IMapsProvider.IMap) obj);
                return;
            default:
                gl.R(this.f30343b, (Location) obj);
                return;
        }
    }
}
