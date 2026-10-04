package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class al implements q0.a {
    public final int f24568a;
    public final jl f24569b;

    public al(jl jlVar, int i10) {
        this.f24568a = i10;
        this.f24569b = jlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24568a) {
            case 0:
                jl.I(this.f24569b, (IMapsProvider.IMap) obj);
                return;
            default:
                jl.P(this.f24569b, (Location) obj);
                return;
        }
    }
}
