package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class sk implements q0.a {
    public final int f32662a;
    public final bl f32663b;

    public sk(bl blVar, int i10) {
        this.f32662a = i10;
        this.f32663b = blVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f32662a) {
            case 0:
                bl.J(this.f32663b, (IMapsProvider.IMap) obj);
                return;
            default:
                bl.R(this.f32663b, (Location) obj);
                return;
        }
    }
}
