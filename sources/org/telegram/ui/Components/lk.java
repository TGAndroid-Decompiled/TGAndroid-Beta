package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class lk implements Runnable {
    public final int f28759a;
    public final cl f28760b;

    public lk(cl clVar, int i10) {
        this.f28759a = i10;
        this.f28760b = clVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f28759a) {
            case 0:
                cl clVar = this.f28760b;
                double[] dArr = clVar.f26546b.f29099u2;
                clVar.b0(dArr[0], dArr[1]);
                return;
            case 1:
                cl.M(this.f28760b);
                return;
            case 2:
                this.f28760b.Y();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new lk(this.f28760b, 4));
                return;
            case 4:
                View view = this.f28760b.J;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                cl clVar2 = this.f28760b;
                uf.h0 h0Var = clVar2.L;
                if (clVar2.f26012q0) {
                    clVar2.f26012q0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = clVar2.E;
                if (iMap != null && (location = clVar2.f26010o0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    clVar2.f26010o0.setLongitude(clVar2.E.getCameraPosition().target.longitude);
                }
                h0Var.L(clVar2.f26010o0);
                h0Var.I();
                return;
            case 6:
                zk zkVar = this.f28760b.C;
                if (zkVar != null) {
                    zkVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f28760b.J;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f28760b.b0(0.0d, 0.0d);
                return;
        }
    }
}
