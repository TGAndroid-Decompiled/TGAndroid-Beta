package org.telegram.ui.Components;

import android.location.Location;
public final class nk implements q0.a {
    public final int f36570a;
    public final uk f36571b;

    public nk(uk ukVar, int i3) {
        this.f36570a = i3;
        this.f36571b = ukVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36570a) {
            case 0:
                uk.Z(this.f36571b, (org.telegram.messenger.z9) obj);
                return;
            default:
                uk.W(this.f36571b, (Location) obj);
                return;
        }
    }
}
