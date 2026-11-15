package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
public final class rk implements Runnable {
    public final int f38989a;
    public final dl f38990b;

    public rk(dl dlVar, int i7) {
        this.f38989a = i7;
        this.f38990b = dlVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f38989a) {
            case 0:
                dl.T(this.f38990b);
                return;
            case 1:
                dl.V(this.f38990b);
                return;
            case 2:
                dl dlVar = this.f38990b;
                double[] dArr = dlVar.f33609b.f36507y4;
                dlVar.h0(dArr[0], dArr[1]);
                return;
            case 3:
                org.telegram.messenger.g0.h3(new rk(this.f38990b, 6));
                return;
            case 4:
                dl dlVar2 = this.f38990b;
                jg.r0 r0Var = dlVar2.L;
                if (dlVar2.f33972l0) {
                    dlVar2.f33972l0 = false;
                    return;
                }
                org.telegram.messenger.ea eaVar = dlVar2.E;
                if (eaVar != null && (location = dlVar2.f33970j0) != null) {
                    location.setLatitude(((org.telegram.messenger.bb) eaVar.d().f15288b).f22677a);
                    dlVar2.f33970j0.setLongitude(((org.telegram.messenger.bb) dlVar2.E.d().f15288b).f22678b);
                }
                r0Var.L(dlVar2.f33970j0);
                r0Var.H();
                return;
            case 5:
                View view = this.f38990b.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            case 6:
                View view2 = this.f38990b.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                return;
            default:
                this.f38990b.h0(0.0d, 0.0d);
                return;
        }
    }
}
