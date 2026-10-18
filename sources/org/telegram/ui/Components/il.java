package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class il implements q0.a {
    public final int f27253a;
    public final rl f27254b;

    public il(rl rlVar, int i10) {
        this.f27253a = i10;
        this.f27254b = rlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27253a) {
            case 0:
                rl.N(this.f27254b, (IMapsProvider.IMap) obj);
                return;
            default:
                rl.U(this.f27254b, (Location) obj);
                return;
        }
    }
}
