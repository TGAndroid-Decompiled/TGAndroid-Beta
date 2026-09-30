package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class tk implements Runnable {
    public final int f28549a;
    public final jl f28550b;

    public tk(jl jlVar, int i10) {
        this.f28549a = i10;
        this.f28550b = jlVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f28549a) {
            case 0:
                jl jlVar = this.f28550b;
                double[] dArr = jlVar.f27362b.f30329x2;
                jlVar.b0(dArr[0], dArr[1]);
                return;
            case 1:
                jl.M(this.f28550b);
                return;
            case 2:
                this.f28550b.Y();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new tk(this.f28550b, 4));
                return;
            case 4:
                View view = this.f28550b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                jl jlVar2 = this.f28550b;
                gg.t0 t0Var = jlVar2.O;
                if (jlVar2.f25505t0) {
                    jlVar2.f25505t0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = jlVar2.H;
                if (iMap != null && (location = jlVar2.f25502r0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    jlVar2.f25502r0.setLongitude(jlVar2.H.getCameraPosition().target.longitude);
                }
                t0Var.L(jlVar2.f25502r0);
                t0Var.I();
                return;
            case 6:
                gl glVar = this.f28550b.F;
                if (glVar != null) {
                    glVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f28550b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f28550b.b0(0.0d, 0.0d);
                return;
        }
    }
}
