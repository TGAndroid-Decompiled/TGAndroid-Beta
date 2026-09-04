package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class xk implements q0.a {
    public final int f32599a;
    public final gl f32600b;

    public xk(gl glVar, int i10) {
        this.f32599a = i10;
        this.f32600b = glVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f32599a) {
            case 0:
                gl.K(this.f32600b, (IMapsProvider.IMap) obj);
                return;
            default:
                gl.R(this.f32600b, (Location) obj);
                return;
        }
    }
}
