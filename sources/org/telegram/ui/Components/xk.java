package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class xk implements q0.a {
    public final int f30339a;
    public final gl f30340b;

    public xk(gl glVar, int i10) {
        this.f30339a = i10;
        this.f30340b = glVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30339a) {
            case 0:
                gl.K(this.f30340b, (IMapsProvider.IMap) obj);
                return;
            default:
                gl.R(this.f30340b, (Location) obj);
                return;
        }
    }
}
