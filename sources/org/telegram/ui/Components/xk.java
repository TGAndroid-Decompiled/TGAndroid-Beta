package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class xk implements q0.a {
    public final int f32627a;
    public final gl f32628b;

    public xk(gl glVar, int i10) {
        this.f32627a = i10;
        this.f32628b = glVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f32627a) {
            case 0:
                gl.K(this.f32628b, (IMapsProvider.IMap) obj);
                return;
            default:
                gl.R(this.f32628b, (Location) obj);
                return;
        }
    }
}
