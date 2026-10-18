package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class il implements q0.a {
    public final int f27260a;
    public final rl f27261b;

    public il(rl rlVar, int i10) {
        this.f27260a = i10;
        this.f27261b = rlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27260a) {
            case 0:
                rl.N(this.f27261b, (IMapsProvider.IMap) obj);
                return;
            default:
                rl.U(this.f27261b, (Location) obj);
                return;
        }
    }
}
