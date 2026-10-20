package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class il implements q0.a {
    public final int f27293a;
    public final rl f27294b;

    public il(rl rlVar, int i10) {
        this.f27293a = i10;
        this.f27294b = rlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27293a) {
            case 0:
                rl.N(this.f27294b, (IMapsProvider.IMap) obj);
                return;
            default:
                rl.U(this.f27294b, (Location) obj);
                return;
        }
    }
}
