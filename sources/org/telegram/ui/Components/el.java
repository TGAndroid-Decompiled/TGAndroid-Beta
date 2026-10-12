package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class el implements Runnable {
    public final int f24728a;
    public final ul f24729b;

    public el(ul ulVar, int i10) {
        this.f24728a = i10;
        this.f24729b = ulVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f24728a) {
            case 0:
                ul ulVar = this.f24729b;
                double[] dArr = ulVar.f27671b.A2;
                ulVar.e0(dArr[0], dArr[1]);
                return;
            case 1:
                ul.P(this.f24729b);
                return;
            case 2:
                this.f24729b.b0();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new el(this.f24729b, 4));
                return;
            case 4:
                View view = this.f24729b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                ul ulVar2 = this.f24729b;
                hg.s0 s0Var = ulVar2.O;
                if (ulVar2.f29727t0) {
                    ulVar2.f29727t0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = ulVar2.H;
                if (iMap != null && (location = ulVar2.f29724r0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    ulVar2.f29724r0.setLongitude(ulVar2.H.getCameraPosition().target.longitude);
                }
                s0Var.L(ulVar2.f29724r0);
                s0Var.I();
                return;
            case 6:
                rl rlVar = this.f24729b.F;
                if (rlVar != null) {
                    rlVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f24729b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f24729b.e0(0.0d, 0.0d);
                return;
        }
    }
}
