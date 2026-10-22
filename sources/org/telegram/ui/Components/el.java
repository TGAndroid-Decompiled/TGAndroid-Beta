package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class el implements Runnable {
    public final int f25921a;
    public final rl f25922b;

    public el(rl rlVar, int i10) {
        this.f25921a = i10;
        this.f25922b = rlVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f25921a) {
            case 0:
                rl.P(this.f25922b);
                return;
            case 1:
                this.f25922b.b0();
                return;
            case 2:
                rl rlVar = this.f25922b;
                double[] dArr = rlVar.f28176b.A2;
                rlVar.e0(dArr[0], dArr[1]);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new el(this.f25922b, 4));
                return;
            case 4:
                View view = this.f25922b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                rl rlVar2 = this.f25922b;
                hg.s0 s0Var = rlVar2.O;
                if (rlVar2.f29971t0) {
                    rlVar2.f29971t0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = rlVar2.H;
                if (iMap != null && (location = rlVar2.f29968r0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    rlVar2.f29968r0.setLongitude(rlVar2.H.getCameraPosition().target.longitude);
                }
                s0Var.L(rlVar2.f29968r0);
                s0Var.I();
                return;
            case 6:
                ol olVar = this.f25922b.F;
                if (olVar != null) {
                    olVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f25922b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f25922b.e0(0.0d, 0.0d);
                return;
        }
    }
}
