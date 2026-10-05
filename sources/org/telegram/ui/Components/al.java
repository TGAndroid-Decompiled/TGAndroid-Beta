package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class al implements q0.a {
    public final int f24639a;
    public final jl f24640b;

    public al(jl jlVar, int i10) {
        this.f24639a = i10;
        this.f24640b = jlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24639a) {
            case 0:
                jl.I(this.f24640b, (IMapsProvider.IMap) obj);
                return;
            default:
                jl.P(this.f24640b, (Location) obj);
                return;
        }
    }
}
