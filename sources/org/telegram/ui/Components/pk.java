package org.telegram.ui.Components;

import android.location.Location;
public final class pk implements q0.a {
    public final int f37031a;
    public final wk f37032b;

    public pk(wk wkVar, int i7) {
        this.f37031a = i7;
        this.f37032b = wkVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37031a) {
            case 0:
                wk.Z(this.f37032b, (org.telegram.messenger.fa) obj);
                return;
            default:
                wk.W(this.f37032b, (Location) obj);
                return;
        }
    }
}
