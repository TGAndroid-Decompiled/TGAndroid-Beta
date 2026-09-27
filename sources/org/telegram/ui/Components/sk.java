package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class sk implements Runnable {
    public final int f28279a;
    public final il f28280b;

    public sk(il ilVar, int i10) {
        this.f28279a = i10;
        this.f28280b = ilVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f28279a) {
            case 0:
                il ilVar = this.f28280b;
                double[] dArr = ilVar.f27104b.f30021x2;
                ilVar.b0(dArr[0], dArr[1]);
                return;
            case 1:
                il.M(this.f28280b);
                return;
            case 2:
                this.f28280b.Y();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new sk(this.f28280b, 4));
                return;
            case 4:
                View view = this.f28280b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                il ilVar2 = this.f28280b;
                gg.t0 t0Var = ilVar2.O;
                if (ilVar2.f25189t0) {
                    ilVar2.f25189t0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = ilVar2.H;
                if (iMap != null && (location = ilVar2.f25186r0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    ilVar2.f25186r0.setLongitude(ilVar2.H.getCameraPosition().target.longitude);
                }
                t0Var.L(ilVar2.f25186r0);
                t0Var.I();
                return;
            case 6:
                fl flVar = this.f28280b.F;
                if (flVar != null) {
                    flVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f28280b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f28280b.b0(0.0d, 0.0d);
                return;
        }
    }
}
