package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class dl implements Runnable {
    public final int f24138a;
    public final tl f24139b;

    public dl(tl tlVar, int i10) {
        this.f24138a = i10;
        this.f24139b = tlVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f24138a) {
            case 0:
                tl tlVar = this.f24139b;
                double[] dArr = tlVar.f27360b.A2;
                tlVar.e0(dArr[0], dArr[1]);
                return;
            case 1:
                tl.P(this.f24139b);
                return;
            case 2:
                this.f24139b.b0();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new dl(this.f24139b, 4));
                return;
            case 4:
                View view = this.f24139b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                tl tlVar2 = this.f24139b;
                hg.s0 s0Var = tlVar2.O;
                if (tlVar2.f29113t0) {
                    tlVar2.f29113t0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = tlVar2.H;
                if (iMap != null && (location = tlVar2.f29110r0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    tlVar2.f29110r0.setLongitude(tlVar2.H.getCameraPosition().target.longitude);
                }
                s0Var.L(tlVar2.f29110r0);
                s0Var.I();
                return;
            case 6:
                ql qlVar = this.f24139b.F;
                if (qlVar != null) {
                    qlVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f24139b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f24139b.e0(0.0d, 0.0d);
                return;
        }
    }
}
