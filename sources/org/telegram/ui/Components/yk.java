package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
public final class yk implements Runnable {
    public final int f42501a;
    public final kl f42502b;

    public yk(kl klVar, int i7) {
        this.f42501a = i7;
        this.f42502b = klVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f42501a) {
            case 0:
                kl.T(this.f42502b);
                return;
            case 1:
                kl.V(this.f42502b);
                return;
            case 2:
                kl klVar = this.f42502b;
                double[] dArr = klVar.f37135b.f40039y4;
                klVar.h0(dArr[0], dArr[1]);
                return;
            case 3:
                org.telegram.messenger.g0.g3(new yk(this.f42502b, 6));
                return;
            case 4:
                kl klVar2 = this.f42502b;
                jg.r0 r0Var = klVar2.L;
                if (klVar2.f36783l0) {
                    klVar2.f36783l0 = false;
                    return;
                }
                org.telegram.messenger.da daVar = klVar2.E;
                if (daVar != null && (location = klVar2.f36781j0) != null) {
                    location.setLatitude(((org.telegram.messenger.ab) daVar.d().f14540b).f22962a);
                    klVar2.f36781j0.setLongitude(((org.telegram.messenger.ab) klVar2.E.d().f14540b).f22963b);
                }
                r0Var.L(klVar2.f36781j0);
                r0Var.H();
                return;
            case 5:
                View view = this.f42502b.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            case 6:
                View view2 = this.f42502b.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                return;
            default:
                this.f42502b.h0(0.0d, 0.0d);
                return;
        }
    }
}
