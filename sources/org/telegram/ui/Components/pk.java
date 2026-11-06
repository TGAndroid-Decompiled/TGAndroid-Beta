package org.telegram.ui.Components;

import android.location.Location;
public final class pk implements q0.a {
    public final int f36980a;
    public final wk f36981b;

    public pk(wk wkVar, int i7) {
        this.f36980a = i7;
        this.f36981b = wkVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36980a) {
            case 0:
                wk.Z(this.f36981b, (org.telegram.messenger.fa) obj);
                return;
            default:
                wk.W(this.f36981b, (Location) obj);
                return;
        }
    }
}
