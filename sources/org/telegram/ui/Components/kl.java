package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class kl implements q0.a {
    public final int f26410a;
    public final tl f26411b;

    public kl(tl tlVar, int i10) {
        this.f26410a = i10;
        this.f26411b = tlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26410a) {
            case 0:
                tl.N(this.f26411b, (IMapsProvider.IMap) obj);
                return;
            default:
                tl.U(this.f26411b, (Location) obj);
                return;
        }
    }
}
