package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class xk implements q0.a {
    public final int f32600a;
    public final gl f32601b;

    public xk(gl glVar, int i10) {
        this.f32600a = i10;
        this.f32601b = glVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f32600a) {
            case 0:
                gl.K(this.f32601b, (IMapsProvider.IMap) obj);
                return;
            default:
                gl.R(this.f32601b, (Location) obj);
                return;
        }
    }
}
