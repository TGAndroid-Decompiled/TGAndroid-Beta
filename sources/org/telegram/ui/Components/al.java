package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class al implements q0.a {
    public final int f24573a;
    public final jl f24574b;

    public al(jl jlVar, int i10) {
        this.f24573a = i10;
        this.f24574b = jlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24573a) {
            case 0:
                jl.I(this.f24574b, (IMapsProvider.IMap) obj);
                return;
            default:
                jl.P(this.f24574b, (Location) obj);
                return;
        }
    }
}
