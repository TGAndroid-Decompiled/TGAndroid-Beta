package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class al implements q0.a {
    public final int f22655a;
    public final jl f22656b;

    public al(jl jlVar, int i10) {
        this.f22655a = i10;
        this.f22656b = jlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f22655a) {
            case 0:
                jl.K(this.f22656b, (IMapsProvider.IMap) obj);
                return;
            default:
                jl.R(this.f22656b, (Location) obj);
                return;
        }
    }
}
