package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class hl implements Runnable {
    public final int f27085a;
    public final xl f27086b;

    public hl(xl xlVar, int i10) {
        this.f27085a = i10;
        this.f27086b = xlVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f27085a) {
            case 0:
                xl xlVar = this.f27086b;
                double[] dArr = xlVar.f30173b.A2;
                xlVar.e0(dArr[0], dArr[1]);
                return;
            case 1:
                xl.P(this.f27086b);
                return;
            case 2:
                this.f27086b.b0();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new hl(this.f27086b, 4));
                return;
            case 4:
                View view = this.f27086b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                return;
            case 5:
                xl xlVar2 = this.f27086b;
                gg.s0 s0Var = xlVar2.O;
                if (xlVar2.f32925t0) {
                    xlVar2.f32925t0 = false;
                    return;
                }
                IMapsProvider.IMap iMap = xlVar2.H;
                if (iMap != null && (location = xlVar2.f32922r0) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    xlVar2.f32922r0.setLongitude(xlVar2.H.getCameraPosition().target.longitude);
                }
                s0Var.L(xlVar2.f32922r0);
                s0Var.I();
                return;
            case 6:
                ul ulVar = this.f27086b.F;
                if (ulVar != null) {
                    ulVar.a();
                    return;
                }
                return;
            case 7:
                View view2 = this.f27086b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            default:
                this.f27086b.e0(0.0d, 0.0d);
                return;
        }
    }
}
