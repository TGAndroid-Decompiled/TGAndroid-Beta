package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
public final class lk implements Runnable {
    public final int f28130a;
    public final bl f28131b;

    public lk(bl blVar, int i10) {
        this.f28130a = i10;
        this.f28131b = blVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f28130a) {
            case 0:
                bl blVar = this.f28131b;
                double[] dArr = blVar.f30947b.f24731u4;
                blVar.e0(dArr[0], dArr[1]);
                return;
            case 1:
                bl.P(this.f28131b);
                return;
            case 2:
                org.telegram.messenger.i0.g3(new lk(this.f28131b, 3));
                return;
            case 3:
                View view = this.f28131b.K;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 4:
                bl blVar2 = this.f28131b;
                zf.h0 h0Var = blVar2.M;
                if (blVar2.f24811q0) {
                    blVar2.f24811q0 = false;
                    return;
                }
                org.telegram.messenger.ga gaVar = blVar2.F;
                if (gaVar != null && (location = blVar2.f24809o0) != null) {
                    location.setLatitude(((org.telegram.messenger.cb) gaVar.d().f9902b).f14971a);
                    blVar2.f24809o0.setLongitude(((org.telegram.messenger.cb) blVar2.F.d().f9902b).f14972b);
                }
                h0Var.M(blVar2.f24809o0);
                h0Var.I();
                return;
            case 5:
                yk ykVar = this.f28131b.D;
                if (ykVar != null) {
                    ykVar.a();
                    return;
                }
                return;
            case 6:
                View view2 = this.f28131b.K;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f28131b.e0(0.0d, 0.0d);
                return;
        }
    }
}
