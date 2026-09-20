package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class xk implements q0.a {
    public final int f30295a;
    public final gl f30296b;

    public xk(gl glVar, int i10) {
        this.f30295a = i10;
        this.f30296b = glVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30295a) {
            case 0:
                gl.K(this.f30296b, (IMapsProvider.IMap) obj);
                return;
            default:
                gl.R(this.f30296b, (Location) obj);
                return;
        }
    }
}
