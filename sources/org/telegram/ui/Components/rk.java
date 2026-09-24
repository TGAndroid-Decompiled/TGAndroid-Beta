package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class rk implements Runnable {
    public final int f27975a;
    public final hl f27976b;

    public rk(hl hlVar, int i10) {
        this.f27975a = i10;
        this.f27976b = hlVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f27975a) {
            case 0:
                hl hlVar = this.f27976b;
                double[] dArr = hlVar.f27083b.f30044x2;
                hlVar.b0(dArr[0], dArr[1]);
                return;
            case 1:
                hl.M(this.f27976b);
                return;
            case 2:
                this.f27976b.Y();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new rk(this.f27976b, 4));
                return;
            case 4:
                View view = this.f27976b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                hl hlVar2 = this.f27976b;
                gg.t0 t0Var = hlVar2.O;
                if (hlVar2.f24792t0) {
                    hlVar2.f24792t0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = hlVar2.H;
                if (iMap != null && (location = hlVar2.f24789r0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    hlVar2.f24789r0.setLongitude(hlVar2.H.getCameraPosition().target.longitude);
                }
                t0Var.L(hlVar2.f24789r0);
                t0Var.I();
                return;
            case 6:
                el elVar = this.f27976b.F;
                if (elVar != null) {
                    elVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f27976b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f27976b.b0(0.0d, 0.0d);
                return;
        }
    }
}
