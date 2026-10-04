package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class al implements q0.a {
    public final int f24569a;
    public final jl f24570b;

    public al(jl jlVar, int i10) {
        this.f24569a = i10;
        this.f24570b = jlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24569a) {
            case 0:
                jl.I(this.f24570b, (IMapsProvider.IMap) obj);
                return;
            default:
                jl.P(this.f24570b, (Location) obj);
                return;
        }
    }
}
