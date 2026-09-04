package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class qk implements Runnable {
    public final int f29751a;
    public final gl f29752b;

    public qk(gl glVar, int i10) {
        this.f29751a = i10;
        this.f29752b = glVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f29751a) {
            case 0:
                gl glVar = this.f29752b;
                double[] dArr = glVar.f28753b.f31338x2;
                glVar.b0(dArr[0], dArr[1]);
                return;
            case 1:
                gl.M(this.f29752b);
                return;
            case 2:
                this.f29752b.Y();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new qk(this.f29752b, 4));
                return;
            case 4:
                View view = this.f29752b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                gl glVar2 = this.f29752b;
                hg.t0 t0Var = glVar2.O;
                if (glVar2.f26449t0) {
                    glVar2.f26449t0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = glVar2.H;
                if (iMap != null && (location = glVar2.f26446r0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    glVar2.f26446r0.setLongitude(glVar2.H.getCameraPosition().target.longitude);
                }
                t0Var.L(glVar2.f26446r0);
                t0Var.I();
                return;
            case 6:
                dl dlVar = this.f29752b.F;
                if (dlVar != null) {
                    dlVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f29752b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f29752b.b0(0.0d, 0.0d);
                return;
        }
    }
}
