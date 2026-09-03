package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class lk implements Runnable {
    public final int f28799a;
    public final cl f28800b;

    public lk(cl clVar, int i10) {
        this.f28799a = i10;
        this.f28800b = clVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f28799a) {
            case 0:
                cl clVar = this.f28800b;
                double[] dArr = clVar.f26590b.f29117u2;
                clVar.b0(dArr[0], dArr[1]);
                return;
            case 1:
                cl.M(this.f28800b);
                return;
            case 2:
                this.f28800b.Y();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new lk(this.f28800b, 4));
                return;
            case 4:
                View view = this.f28800b.J;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                cl clVar2 = this.f28800b;
                uf.h0 h0Var = clVar2.L;
                if (clVar2.f25989q0) {
                    clVar2.f25989q0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = clVar2.E;
                if (iMap != null && (location = clVar2.f25987o0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    clVar2.f25987o0.setLongitude(clVar2.E.getCameraPosition().target.longitude);
                }
                h0Var.L(clVar2.f25987o0);
                h0Var.I();
                return;
            case 6:
                zk zkVar = this.f28800b.C;
                if (zkVar != null) {
                    zkVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f28800b.J;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f28800b.b0(0.0d, 0.0d);
                return;
        }
    }
}
