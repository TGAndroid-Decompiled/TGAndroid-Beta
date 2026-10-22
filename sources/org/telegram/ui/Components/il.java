package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class il implements q0.a {
    public final int f27296a;
    public final rl f27297b;

    public il(rl rlVar, int i10) {
        this.f27296a = i10;
        this.f27297b = rlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27296a) {
            case 0:
                rl.N(this.f27297b, (IMapsProvider.IMap) obj);
                return;
            default:
                rl.U(this.f27297b, (Location) obj);
                return;
        }
    }
}
