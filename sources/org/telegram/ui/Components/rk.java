package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class rk implements Runnable {
    public final int f27983a;
    public final hl f27984b;

    public rk(hl hlVar, int i10) {
        this.f27983a = i10;
        this.f27984b = hlVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f27983a) {
            case 0:
                hl hlVar = this.f27984b;
                double[] dArr = hlVar.f27087b.f30064x2;
                hlVar.b0(dArr[0], dArr[1]);
                return;
            case 1:
                hl.M(this.f27984b);
                return;
            case 2:
                this.f27984b.Y();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new rk(this.f27984b, 4));
                return;
            case 4:
                View view = this.f27984b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                hl hlVar2 = this.f27984b;
                gg.t0 t0Var = hlVar2.O;
                if (hlVar2.f24818t0) {
                    hlVar2.f24818t0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = hlVar2.H;
                if (iMap != null && (location = hlVar2.f24815r0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    hlVar2.f24815r0.setLongitude(hlVar2.H.getCameraPosition().target.longitude);
                }
                t0Var.L(hlVar2.f24815r0);
                t0Var.I();
                return;
            case 6:
                el elVar = this.f27984b.F;
                if (elVar != null) {
                    elVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f27984b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f27984b.b0(0.0d, 0.0d);
                return;
        }
    }
}
