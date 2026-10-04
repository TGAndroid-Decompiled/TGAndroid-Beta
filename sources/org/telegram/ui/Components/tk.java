package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class tk implements Runnable {
    public final int f31074a;
    public final jl f31075b;

    public tk(jl jlVar, int i10) {
        this.f31074a = i10;
        this.f31075b = jlVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f31074a) {
            case 0:
                jl jlVar = this.f31075b;
                double[] dArr = jlVar.f29643b.f32872x2;
                jlVar.b0(dArr[0], dArr[1]);
                return;
            case 1:
                jl.K(this.f31075b);
                return;
            case 2:
                this.f31075b.X();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new tk(this.f31075b, 4));
                return;
            case 4:
                View view = this.f31075b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                jl jlVar2 = this.f31075b;
                gg.t0 t0Var = jlVar2.O;
                if (jlVar2.f27825t0) {
                    jlVar2.f27825t0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = jlVar2.H;
                if (iMap != null && (location = jlVar2.f27822r0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    jlVar2.f27822r0.setLongitude(jlVar2.H.getCameraPosition().target.longitude);
                }
                t0Var.L(jlVar2.f27822r0);
                t0Var.I();
                return;
            case 6:
                gl glVar = this.f31075b.F;
                if (glVar != null) {
                    glVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f31075b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f31075b.b0(0.0d, 0.0d);
                return;
        }
    }
}
