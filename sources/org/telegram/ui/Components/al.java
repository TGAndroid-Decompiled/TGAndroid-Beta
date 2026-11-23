package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
public final class al implements Runnable {
    public final int f33505a;
    public final ml f33506b;

    public al(ml mlVar, int i7) {
        this.f33505a = i7;
        this.f33506b = mlVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f33505a) {
            case 0:
                ml.T(this.f33506b);
                return;
            case 1:
                ml.V(this.f33506b);
                return;
            case 2:
                ml mlVar = this.f33506b;
                double[] dArr = mlVar.f37477b.f40435y4;
                mlVar.h0(dArr[0], dArr[1]);
                return;
            case 3:
                org.telegram.messenger.g0.g3(new al(this.f33506b, 6));
                return;
            case 4:
                ml mlVar2 = this.f33506b;
                jg.r0 r0Var = mlVar2.L;
                if (mlVar2.f37515l0) {
                    mlVar2.f37515l0 = false;
                    return;
                }
                org.telegram.messenger.ea eaVar = mlVar2.E;
                if (eaVar != null && (location = mlVar2.f37513j0) != null) {
                    location.setLatitude(((org.telegram.messenger.bb) eaVar.d().f15524b).f23030a);
                    mlVar2.f37513j0.setLongitude(((org.telegram.messenger.bb) mlVar2.E.d().f15524b).f23031b);
                }
                r0Var.L(mlVar2.f37513j0);
                r0Var.H();
                return;
            case 5:
                View view = this.f33506b.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            case 6:
                View view2 = this.f33506b.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                return;
            default:
                this.f33506b.h0(0.0d, 0.0d);
                return;
        }
    }
}
