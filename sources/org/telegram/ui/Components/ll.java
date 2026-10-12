package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class ll implements q0.a {
    public final int f27063a;
    public final ul f27064b;

    public ll(ul ulVar, int i10) {
        this.f27063a = i10;
        this.f27064b = ulVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27063a) {
            case 0:
                ul.N(this.f27064b, (IMapsProvider.IMap) obj);
                return;
            default:
                ul.U(this.f27064b, (Location) obj);
                return;
        }
    }
}
