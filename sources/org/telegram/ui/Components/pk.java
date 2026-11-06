package org.telegram.ui.Components;

import android.location.Location;
public final class pk implements q0.a {
    public final int f37085a;
    public final wk f37086b;

    public pk(wk wkVar, int i7) {
        this.f37085a = i7;
        this.f37086b = wkVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37085a) {
            case 0:
                wk.Z(this.f37086b, (org.telegram.messenger.fa) obj);
                return;
            default:
                wk.W(this.f37086b, (Location) obj);
                return;
        }
    }
}
