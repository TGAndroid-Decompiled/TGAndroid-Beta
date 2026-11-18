package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
public final class yk implements Runnable {
    public final int f42512a;
    public final kl f42513b;

    public yk(kl klVar, int i7) {
        this.f42512a = i7;
        this.f42513b = klVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f42512a) {
            case 0:
                kl.T(this.f42513b);
                return;
            case 1:
                kl.V(this.f42513b);
                return;
            case 2:
                kl klVar = this.f42513b;
                double[] dArr = klVar.f36766b.f39742y4;
                klVar.h0(dArr[0], dArr[1]);
                return;
            case 3:
                org.telegram.messenger.g0.g3(new yk(this.f42513b, 6));
                return;
            case 4:
                kl klVar2 = this.f42513b;
                jg.r0 r0Var = klVar2.L;
                if (klVar2.f36804l0) {
                    klVar2.f36804l0 = false;
                    return;
                }
                org.telegram.messenger.da daVar = klVar2.E;
                if (daVar != null && (location = klVar2.f36802j0) != null) {
                    location.setLatitude(((org.telegram.messenger.ab) daVar.d().f15536b).f22854a);
                    klVar2.f36802j0.setLongitude(((org.telegram.messenger.ab) klVar2.E.d().f15536b).f22855b);
                }
                r0Var.L(klVar2.f36802j0);
                r0Var.H();
                return;
            case 5:
                View view = this.f42513b.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            case 6:
                View view2 = this.f42513b.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                return;
            default:
                this.f42513b.h0(0.0d, 0.0d);
                return;
        }
    }
}
