package org.telegram.ui.Components;

import android.location.Location;
public final class dl implements q0.a {
    public final int f34462a;
    public final kl f34463b;

    public dl(kl klVar, int i7) {
        this.f34462a = i7;
        this.f34463b = klVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f34462a) {
            case 0:
                kl.Z(this.f34463b, (org.telegram.messenger.da) obj);
                return;
            default:
                kl.X(this.f34463b, (Location) obj);
                return;
        }
    }
}
