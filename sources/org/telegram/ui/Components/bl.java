package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class bl implements Runnable {
    public final int f25095a;
    public final rl f25096b;

    public bl(rl rlVar, int i10) {
        this.f25095a = i10;
        this.f25096b = rlVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f25095a) {
            case 0:
                rl rlVar = this.f25096b;
                double[] dArr = rlVar.f28366b.D2;
                rlVar.f0(dArr[0], dArr[1]);
                return;
            case 1:
                rl.P(this.f25096b);
                return;
            case 2:
                this.f25096b.c0();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new bl(this.f25096b, 4));
                return;
            case 4:
                View view = this.f25096b.K;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                rl rlVar2 = this.f25096b;
                hg.s0 s0Var = rlVar2.M;
                if (rlVar2.f30208r0) {
                    rlVar2.f30208r0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = rlVar2.F;
                if (iMap != null && (location = rlVar2.f30205p0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    rlVar2.f30205p0.setLongitude(rlVar2.F.getCameraPosition().target.longitude);
                }
                s0Var.L(rlVar2.f30205p0);
                s0Var.I();
                return;
            case 6:
                ol olVar = this.f25096b.f30218y;
                if (olVar != null) {
                    olVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f25096b.K;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f25096b.f0(0.0d, 0.0d);
                return;
        }
    }
}
