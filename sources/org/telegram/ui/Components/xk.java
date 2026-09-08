package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class xk implements q0.a {
    public final int f32626a;
    public final gl f32627b;

    public xk(gl glVar, int i10) {
        this.f32626a = i10;
        this.f32627b = glVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f32626a) {
            case 0:
                gl.K(this.f32627b, (IMapsProvider.IMap) obj);
                return;
            default:
                gl.R(this.f32627b, (Location) obj);
                return;
        }
    }
}
