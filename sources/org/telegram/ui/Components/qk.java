package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class qk implements q0.a {
    public final int f28198a;
    public final al f28199b;

    public qk(al alVar, int i10) {
        this.f28198a = i10;
        this.f28199b = alVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f28198a) {
            case 0:
                al.J(this.f28199b, (IMapsProvider.IMap) obj);
                return;
            default:
                al.R(this.f28199b, (Location) obj);
                return;
        }
    }
}
