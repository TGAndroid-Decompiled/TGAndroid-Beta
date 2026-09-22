package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class qk implements Runnable {
    public final int f27586a;
    public final gl f27587b;

    public qk(gl glVar, int i10) {
        this.f27586a = i10;
        this.f27587b = glVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f27586a) {
            case 0:
                gl glVar = this.f27587b;
                double[] dArr = glVar.f26786b.f29155x2;
                glVar.b0(dArr[0], dArr[1]);
                return;
            case 1:
                gl.M(this.f27587b);
                return;
            case 2:
                this.f27587b.Y();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new qk(this.f27587b, 4));
                return;
            case 4:
                View view = this.f27587b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                gl glVar2 = this.f27587b;
                gg.t0 t0Var = glVar2.O;
                if (glVar2.f24584t0) {
                    glVar2.f24584t0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = glVar2.H;
                if (iMap != null && (location = glVar2.f24581r0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    glVar2.f24581r0.setLongitude(glVar2.H.getCameraPosition().target.longitude);
                }
                t0Var.L(glVar2.f24581r0);
                t0Var.I();
                return;
            case 6:
                dl dlVar = this.f27587b.F;
                if (dlVar != null) {
                    dlVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f27587b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f27587b.b0(0.0d, 0.0d);
                return;
        }
    }
}
