package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class vk implements Runnable {
    public final int f27951a;
    public final ll f27952b;

    public vk(ll llVar, int i10) {
        this.f27951a = i10;
        this.f27952b = llVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f27951a) {
            case 0:
                ll llVar = this.f27952b;
                double[] dArr = llVar.f26422b.f29425x2;
                llVar.b0(dArr[0], dArr[1]);
                return;
            case 1:
                ll.M(this.f27952b);
                return;
            case 2:
                this.f27952b.Y();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new vk(this.f27952b, 4));
                return;
            case 4:
                View view = this.f27952b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                ll llVar2 = this.f27952b;
                fg.t0 t0Var = llVar2.O;
                if (llVar2.f25045t0) {
                    llVar2.f25045t0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = llVar2.H;
                if (iMap != null && (location = llVar2.f25042r0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    llVar2.f25042r0.setLongitude(llVar2.H.getCameraPosition().target.longitude);
                }
                t0Var.L(llVar2.f25042r0);
                t0Var.I();
                return;
            case 6:
                il ilVar = this.f27952b.F;
                if (ilVar != null) {
                    ilVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f27952b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f27952b.b0(0.0d, 0.0d);
                return;
        }
    }
}
