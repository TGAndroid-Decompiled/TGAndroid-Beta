package org.telegram.ui.Components;

import android.location.Location;
public final class pk implements q0.a {
    public final int f37006a;
    public final wk f37007b;

    public pk(wk wkVar, int i7) {
        this.f37006a = i7;
        this.f37007b = wkVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37006a) {
            case 0:
                wk.Z(this.f37007b, (org.telegram.messenger.fa) obj);
                return;
            default:
                wk.W(this.f37007b, (Location) obj);
                return;
        }
    }
}
