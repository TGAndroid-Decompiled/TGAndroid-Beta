package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
public final class jk implements Runnable {
    public final int f35081a;
    public final wk f35082b;

    public jk(wk wkVar, int i7) {
        this.f35081a = i7;
        this.f35082b = wkVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f35081a) {
            case 0:
                wk.S(this.f35082b);
                return;
            case 1:
                wk.U(this.f35082b);
                return;
            case 2:
                wk wkVar = this.f35082b;
                double[] dArr = wkVar.f39071b.f33057u4;
                wkVar.h0(dArr[0], dArr[1]);
                return;
            case 3:
                org.telegram.messenger.g0.h3(new jk(this.f35082b, 6));
                return;
            case 4:
                wk wkVar2 = this.f35082b;
                jg.r0 r0Var = wkVar2.K;
                if (wkVar2.f40075k0) {
                    wkVar2.f40075k0 = false;
                    return;
                }
                org.telegram.messenger.fa faVar = wkVar2.D;
                if (faVar != null && (location = wkVar2.f40073i0) != null) {
                    location.setLatitude(((org.telegram.messenger.cb) faVar.d().f13160b).f21833a);
                    wkVar2.f40073i0.setLongitude(((org.telegram.messenger.cb) wkVar2.D.d().f13160b).f21834b);
                }
                r0Var.L(wkVar2.f40073i0);
                r0Var.H();
                return;
            case 5:
                View view = this.f35082b.I;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            case 6:
                View view2 = this.f35082b.I;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                return;
            default:
                this.f35082b.h0(0.0d, 0.0d);
                return;
        }
    }
}
