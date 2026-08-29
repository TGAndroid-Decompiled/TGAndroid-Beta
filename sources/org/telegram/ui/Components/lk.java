package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class lk implements Runnable {
    public final int f30353a;
    public final bl f30354b;

    public lk(bl blVar, int i10) {
        this.f30353a = i10;
        this.f30354b = blVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f30353a) {
            case 0:
                bl blVar = this.f30354b;
                double[] dArr = blVar.f28403b.f31050t2;
                blVar.b0(dArr[0], dArr[1]);
                return;
            case 1:
                bl.L(this.f30354b);
                return;
            case 2:
                this.f30354b.Y();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new lk(this.f30354b, 4));
                return;
            case 4:
                View view = this.f30354b.I;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                bl blVar2 = this.f30354b;
                rf.i0 i0Var = blVar2.K;
                if (blVar2.f27167p0) {
                    blVar2.f27167p0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = blVar2.D;
                if (iMap != null && (location = blVar2.f27165n0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    blVar2.f27165n0.setLongitude(blVar2.D.getCameraPosition().target.longitude);
                }
                i0Var.L(blVar2.f27165n0);
                i0Var.I();
                return;
            case 6:
                yk ykVar = this.f30354b.B;
                if (ykVar != null) {
                    ykVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f30354b.I;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f30354b.b0(0.0d, 0.0d);
                return;
        }
    }
}
