package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

public final class kk implements q0.a {

    public final int f30125a;

    public final tk f30126b;

    public kk(tk tkVar, int i10) {
        this.f30125a = i10;
        this.f30126b = tkVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30125a) {
            case 0:
                tk.K(this.f30126b, (IMapsProvider.IMap) obj);
                break;
            default:
                tk.R(this.f30126b, (Location) obj);
                break;
        }
    }
}
