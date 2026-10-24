package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class zk implements Runnable {
    public final int f33284a;
    public final pl f33285b;

    public zk(pl plVar, int i10) {
        this.f33284a = i10;
        this.f33285b = plVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f33284a) {
            case 0:
                pl plVar = this.f33285b;
                double[] dArr = plVar.f27704b.D2;
                plVar.e0(dArr[0], dArr[1]);
                return;
            case 1:
                pl.P(this.f33285b);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zk(this.f33285b, 3));
                return;
            case 3:
                View view = this.f33285b.K;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 4:
                pl plVar2 = this.f33285b;
                hg.s0 s0Var = plVar2.M;
                if (plVar2.f29604q0) {
                    plVar2.f29604q0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = plVar2.F;
                if (iMap != null && (location = plVar2.f29602o0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    plVar2.f29602o0.setLongitude(plVar2.F.getCameraPosition().target.longitude);
                }
                s0Var.L(plVar2.f29602o0);
                s0Var.I();
                return;
            case 5:
                ml mlVar = this.f33285b.f29616y;
                if (mlVar != null) {
                    mlVar.a();
                    return;
                }
                return;
            case 6:
                View view2 = this.f33285b.K;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f33285b.e0(0.0d, 0.0d);
                return;
        }
    }
}
