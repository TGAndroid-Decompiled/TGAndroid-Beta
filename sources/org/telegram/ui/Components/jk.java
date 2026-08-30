package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class jk implements Runnable {
    public final int f25999a;
    public final al f26000b;

    public jk(al alVar, int i10) {
        this.f25999a = i10;
        this.f26000b = alVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f25999a) {
            case 0:
                al alVar = this.f26000b;
                double[] dArr = alVar.f24278b.f26747u2;
                alVar.b0(dArr[0], dArr[1]);
                return;
            case 1:
                al.M(this.f26000b);
                return;
            case 2:
                this.f26000b.Y();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new jk(this.f26000b, 4));
                return;
            case 4:
                View view = this.f26000b.J;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                al alVar2 = this.f26000b;
                tf.h0 h0Var = alVar2.L;
                if (alVar2.f23434q0) {
                    alVar2.f23434q0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = alVar2.E;
                if (iMap != null && (location = alVar2.f23432o0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    alVar2.f23432o0.setLongitude(alVar2.E.getCameraPosition().target.longitude);
                }
                h0Var.L(alVar2.f23432o0);
                h0Var.I();
                return;
            case 6:
                xk xkVar = this.f26000b.C;
                if (xkVar != null) {
                    xkVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f26000b.J;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f26000b.b0(0.0d, 0.0d);
                return;
        }
    }
}
