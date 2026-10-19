package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class il implements q0.a {
    public final int f27268a;
    public final rl f27269b;

    public il(rl rlVar, int i10) {
        this.f27268a = i10;
        this.f27269b = rlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27268a) {
            case 0:
                rl.N(this.f27269b, (IMapsProvider.IMap) obj);
                return;
            default:
                rl.U(this.f27269b, (Location) obj);
                return;
        }
    }
}
