package org.telegram.ui.Components;

import android.location.Location;
public final class dl implements q0.a {
    public final int f34379a;
    public final kl f34380b;

    public dl(kl klVar, int i7) {
        this.f34379a = i7;
        this.f34380b = klVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f34379a) {
            case 0:
                kl.Z(this.f34380b, (org.telegram.messenger.da) obj);
                return;
            default:
                kl.X(this.f34380b, (Location) obj);
                return;
        }
    }
}
