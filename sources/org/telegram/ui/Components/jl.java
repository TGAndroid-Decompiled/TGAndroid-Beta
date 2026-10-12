package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class jl implements Runnable {
    public final int f27560a;
    public final zl f27561b;

    public jl(zl zlVar, int i10) {
        this.f27560a = i10;
        this.f27561b = zlVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f27560a) {
            case 0:
                zl zlVar = this.f27561b;
                double[] dArr = zlVar.f30570b.A2;
                zlVar.e0(dArr[0], dArr[1]);
                return;
            case 1:
                zl.P(this.f27561b);
                return;
            case 2:
                this.f27561b.b0();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new jl(this.f27561b, 4));
                return;
            case 4:
                View view = this.f27561b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                zl zlVar2 = this.f27561b;
                gg.s0 s0Var = zlVar2.O;
                if (zlVar2.f33421t0) {
                    zlVar2.f33421t0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = zlVar2.H;
                if (iMap != null && (location = zlVar2.f33418r0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    zlVar2.f33418r0.setLongitude(zlVar2.H.getCameraPosition().target.longitude);
                }
                s0Var.L(zlVar2.f33418r0);
                s0Var.I();
                return;
            case 6:
                wl wlVar = this.f27561b.F;
                if (wlVar != null) {
                    wlVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f27561b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f27561b.e0(0.0d, 0.0d);
                return;
        }
    }
}
