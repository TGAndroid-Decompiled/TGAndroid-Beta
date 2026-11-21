package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
public final class al implements Runnable {
    public final int f33531a;
    public final ml f33532b;

    public al(ml mlVar, int i7) {
        this.f33531a = i7;
        this.f33532b = mlVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f33531a) {
            case 0:
                ml.T(this.f33532b);
                return;
            case 1:
                ml.V(this.f33532b);
                return;
            case 2:
                ml mlVar = this.f33532b;
                double[] dArr = mlVar.f37521b.f40458y4;
                mlVar.h0(dArr[0], dArr[1]);
                return;
            case 3:
                org.telegram.messenger.g0.g3(new al(this.f33532b, 6));
                return;
            case 4:
                ml mlVar2 = this.f33532b;
                jg.r0 r0Var = mlVar2.L;
                if (mlVar2.f37559l0) {
                    mlVar2.f37559l0 = false;
                    return;
                }
                org.telegram.messenger.da daVar = mlVar2.E;
                if (daVar != null && (location = mlVar2.f37557j0) != null) {
                    location.setLatitude(((org.telegram.messenger.ab) daVar.d().f15536b).f22879a);
                    mlVar2.f37557j0.setLongitude(((org.telegram.messenger.ab) mlVar2.E.d().f15536b).f22880b);
                }
                r0Var.L(mlVar2.f37557j0);
                r0Var.H();
                return;
            case 5:
                View view = this.f33532b.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            case 6:
                View view2 = this.f33532b.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                return;
            default:
                this.f33532b.h0(0.0d, 0.0d);
                return;
        }
    }
}
