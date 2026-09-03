package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class sk implements q0.a {
    public final int f31076a;
    public final cl f31077b;

    public sk(cl clVar, int i10) {
        this.f31076a = i10;
        this.f31077b = clVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f31076a) {
            case 0:
                cl.J(this.f31077b, (IMapsProvider.IMap) obj);
                return;
            default:
                cl.R(this.f31077b, (Location) obj);
                return;
        }
    }
}
