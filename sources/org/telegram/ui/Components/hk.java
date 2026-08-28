package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class hk implements Runnable {
    public final int f29104a;
    public final xk f29105b;

    public hk(xk xkVar, int i9) {
        this.f29104a = i9;
        this.f29105b = xkVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f29104a) {
            case 0:
                xk xkVar = this.f29105b;
                double[] dArr = xkVar.f27493b.f30159t2;
                xkVar.a0(dArr[0], dArr[1]);
                return;
            case 1:
                xk.L(this.f29105b);
                return;
            case 2:
                this.f29105b.X();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new hk(this.f29105b, 4));
                return;
            case 4:
                View view = this.f29105b.I;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                xk xkVar2 = this.f29105b;
                of.p0 p0Var = xkVar2.K;
                if (xkVar2.f34703p0) {
                    xkVar2.f34703p0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = xkVar2.D;
                if (iMap != null && (location = xkVar2.f34701n0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    xkVar2.f34701n0.setLongitude(xkVar2.D.getCameraPosition().target.longitude);
                }
                p0Var.L(xkVar2.f34701n0);
                p0Var.I();
                return;
            case 6:
                uk ukVar = this.f29105b.B;
                if (ukVar != null) {
                    ukVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f29105b.I;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f29105b.a0(0.0d, 0.0d);
                return;
        }
    }
}
