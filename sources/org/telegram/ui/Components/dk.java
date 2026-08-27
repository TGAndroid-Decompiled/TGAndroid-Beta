package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

public final class dk implements Runnable {

    public final int f27784a;

    public final tk f27785b;

    public dk(tk tkVar, int i10) {
        this.f27784a = i10;
        this.f27785b = tkVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f27784a) {
            case 0:
                tk tkVar = this.f27785b;
                double[] dArr = tkVar.f34900b.f28695t2;
                tkVar.b0(dArr[0], dArr[1]);
                break;
            case 1:
                tk.M(this.f27785b);
                break;
            case 2:
                this.f27785b.Y();
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new dk(this.f27785b, 4));
                break;
            case 4:
                View view = this.f27785b.I;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                tk tkVar2 = this.f27785b;
                pf.h0 h0Var = tkVar2.K;
                if (!tkVar2.f32813p0) {
                    IMapsProvider.IMap iMap = tkVar2.D;
                    if (iMap != null && (location = tkVar2.f32811n0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        tkVar2.f32811n0.setLongitude(tkVar2.D.getCameraPosition().target.longitude);
                    }
                    h0Var.L(tkVar2.f32811n0);
                    h0Var.I();
                } else {
                    tkVar2.f32813p0 = false;
                }
                break;
            case 6:
                qk qkVar = this.f27785b.B;
                if (qkVar != null) {
                    qkVar.a();
                }
                break;
            case 7:
                View view2 = this.f27785b.I;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                }
                break;
            default:
                this.f27785b.b0(0.0d, 0.0d);
                break;
        }
    }
}
