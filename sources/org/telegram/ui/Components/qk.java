package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class qk implements Runnable {
    public final int f27591a;
    public final gl f27592b;

    public qk(gl glVar, int i10) {
        this.f27591a = i10;
        this.f27592b = glVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f27591a) {
            case 0:
                gl glVar = this.f27592b;
                double[] dArr = glVar.f26655b.f29157x2;
                glVar.b0(dArr[0], dArr[1]);
                return;
            case 1:
                gl.M(this.f27592b);
                return;
            case 2:
                this.f27592b.Y();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new qk(this.f27592b, 4));
                return;
            case 4:
                View view = this.f27592b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                gl glVar2 = this.f27592b;
                gg.t0 t0Var = glVar2.O;
                if (glVar2.f24405t0) {
                    glVar2.f24405t0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = glVar2.H;
                if (iMap != null && (location = glVar2.f24402r0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    glVar2.f24402r0.setLongitude(glVar2.H.getCameraPosition().target.longitude);
                }
                t0Var.L(glVar2.f24402r0);
                t0Var.I();
                return;
            case 6:
                dl dlVar = this.f27592b.F;
                if (dlVar != null) {
                    dlVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f27592b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f27592b.b0(0.0d, 0.0d);
                return;
        }
    }
}
