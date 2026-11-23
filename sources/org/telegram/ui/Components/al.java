package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
public final class al implements Runnable {
    public final int f33544a;
    public final ml f33545b;

    public al(ml mlVar, int i7) {
        this.f33544a = i7;
        this.f33545b = mlVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f33544a) {
            case 0:
                ml.T(this.f33545b);
                return;
            case 1:
                ml.V(this.f33545b);
                return;
            case 2:
                ml mlVar = this.f33545b;
                double[] dArr = mlVar.f37519b.f40450y4;
                mlVar.h0(dArr[0], dArr[1]);
                return;
            case 3:
                org.telegram.messenger.g0.g3(new al(this.f33545b, 6));
                return;
            case 4:
                ml mlVar2 = this.f33545b;
                jg.r0 r0Var = mlVar2.L;
                if (mlVar2.f37557l0) {
                    mlVar2.f37557l0 = false;
                    return;
                }
                org.telegram.messenger.ea eaVar = mlVar2.E;
                if (eaVar != null && (location = mlVar2.f37555j0) != null) {
                    location.setLatitude(((org.telegram.messenger.bb) eaVar.d().f15539b).f23066a);
                    mlVar2.f37555j0.setLongitude(((org.telegram.messenger.bb) mlVar2.E.d().f15539b).f23067b);
                }
                r0Var.L(mlVar2.f37555j0);
                r0Var.H();
                return;
            case 5:
                View view = this.f33545b.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            case 6:
                View view2 = this.f33545b.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                return;
            default:
                this.f33545b.h0(0.0d, 0.0d);
                return;
        }
    }
}
