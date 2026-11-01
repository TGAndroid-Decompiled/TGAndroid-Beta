package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
public final class lk implements Runnable {
    public final int f28192a;
    public final bl f28193b;

    public lk(bl blVar, int i10) {
        this.f28192a = i10;
        this.f28193b = blVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f28192a) {
            case 0:
                bl blVar = this.f28193b;
                double[] dArr = blVar.f30964b.f24822u4;
                blVar.e0(dArr[0], dArr[1]);
                return;
            case 1:
                bl.P(this.f28193b);
                return;
            case 2:
                org.telegram.messenger.i0.g3(new lk(this.f28193b, 3));
                return;
            case 3:
                View view = this.f28193b.K;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 4:
                bl blVar2 = this.f28193b;
                zf.h0 h0Var = blVar2.M;
                if (blVar2.f24866q0) {
                    blVar2.f24866q0 = false;
                    return;
                }
                org.telegram.messenger.ha haVar = blVar2.F;
                if (haVar != null && (location = blVar2.f24864o0) != null) {
                    location.setLatitude(((org.telegram.messenger.db) haVar.d().f9903b).f15333a);
                    blVar2.f24864o0.setLongitude(((org.telegram.messenger.db) blVar2.F.d().f9903b).f15334b);
                }
                h0Var.M(blVar2.f24864o0);
                h0Var.I();
                return;
            case 5:
                yk ykVar = this.f28193b.D;
                if (ykVar != null) {
                    ykVar.a();
                    return;
                }
                return;
            case 6:
                View view2 = this.f28193b.K;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f28193b.e0(0.0d, 0.0d);
                return;
        }
    }
}
