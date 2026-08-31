package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class sk implements q0.a {
    public final int f31073a;
    public final cl f31074b;

    public sk(cl clVar, int i10) {
        this.f31073a = i10;
        this.f31074b = clVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f31073a) {
            case 0:
                cl.J(this.f31074b, (IMapsProvider.IMap) obj);
                return;
            default:
                cl.R(this.f31074b, (Location) obj);
                return;
        }
    }
}
