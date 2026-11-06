package org.telegram.ui.Components;

import android.location.Location;
public final class pk implements q0.a {
    public final int f36964a;
    public final wk f36965b;

    public pk(wk wkVar, int i7) {
        this.f36964a = i7;
        this.f36965b = wkVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36964a) {
            case 0:
                wk.Z(this.f36965b, (org.telegram.messenger.fa) obj);
                return;
            default:
                wk.W(this.f36965b, (Location) obj);
                return;
        }
    }
}
