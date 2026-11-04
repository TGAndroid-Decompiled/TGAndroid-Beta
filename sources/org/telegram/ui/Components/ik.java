package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
public final class ik implements Runnable {
    public final int f34722a;
    public final uk f34723b;

    public ik(uk ukVar, int i3) {
        this.f34722a = i3;
        this.f34723b = ukVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f34722a) {
            case 0:
                uk.S(this.f34723b);
                return;
            case 1:
                uk.U(this.f34723b);
                return;
            case 2:
                uk ukVar = this.f34723b;
                double[] dArr = ukVar.f38416b.f32285v4;
                ukVar.h0(dArr[0], dArr[1]);
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ik(this.f34723b, 6));
                return;
            case 4:
                uk ukVar2 = this.f34723b;
                kg.o0 o0Var = ukVar2.L;
                if (ukVar2.f38791l0) {
                    ukVar2.f38791l0 = false;
                    return;
                }
                org.telegram.messenger.z9 z9Var = ukVar2.E;
                if (z9Var != null && (location = ukVar2.f38789j0) != null) {
                    location.setLatitude(((org.telegram.messenger.va) z9Var.d().f13795b).f25843a);
                    ukVar2.f38789j0.setLongitude(((org.telegram.messenger.va) ukVar2.E.d().f13795b).f25844b);
                }
                o0Var.L(ukVar2.f38789j0);
                o0Var.H();
                return;
            case 5:
                View view = this.f34723b.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            case 6:
                View view2 = this.f34723b.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                return;
            default:
                this.f34723b.h0(0.0d, 0.0d);
                return;
        }
    }
}
