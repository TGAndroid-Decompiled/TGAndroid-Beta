package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class bl implements Runnable {
    public final int f26898a;
    public final sl f26899b;

    public bl(sl slVar, int i10) {
        this.f26898a = i10;
        this.f26899b = slVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f26898a) {
            case 0:
                sl slVar = this.f26899b;
                double[] dArr = slVar.f30213b.D2;
                slVar.e0(dArr[0], dArr[1]);
                return;
            case 1:
                sl.P(this.f26899b);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new bl(this.f26899b, 3));
                return;
            case 3:
                View view = this.f26899b.K;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 4:
                sl slVar2 = this.f26899b;
                ig.s0 s0Var = slVar2.M;
                if (slVar2.f32607q0) {
                    slVar2.f32607q0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = slVar2.F;
                if (iMap != null && (location = slVar2.f32605o0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    slVar2.f32605o0.setLongitude(slVar2.F.getCameraPosition().target.longitude);
                }
                s0Var.L(slVar2.f32605o0);
                s0Var.I();
                return;
            case 5:
                pl plVar = this.f26899b.f32619y;
                if (plVar != null) {
                    plVar.a();
                    return;
                }
                return;
            case 6:
                View view2 = this.f26899b.K;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f26899b.e0(0.0d, 0.0d);
                return;
        }
    }
}
