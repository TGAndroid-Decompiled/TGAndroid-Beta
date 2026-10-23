package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class il implements q0.a {
    public final int f27297a;
    public final rl f27298b;

    public il(rl rlVar, int i10) {
        this.f27297a = i10;
        this.f27298b = rlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27297a) {
            case 0:
                rl.N(this.f27298b, (IMapsProvider.IMap) obj);
                return;
            default:
                rl.U(this.f27298b, (Location) obj);
                return;
        }
    }
}
