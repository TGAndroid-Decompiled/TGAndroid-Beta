package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class jc0 implements Runnable {
    public final int f35314a;
    public final ad0 f35315b;

    public jc0(ad0 ad0Var, int i10) {
        this.f35314a = i10;
        this.f35315b = ad0Var;
    }

    @Override
    public final void run() {
        switch (this.f35314a) {
            case 0:
                ad0 ad0Var = this.f35315b;
                IMapsProvider.ICameraUpdate iCameraUpdate = ad0Var.G;
                if (iCameraUpdate != null) {
                    ad0Var.F.moveCamera(iCameraUpdate);
                    ad0Var.G = null;
                    return;
                }
                return;
            case 1:
                ad0 ad0Var2 = this.f35315b;
                ad0Var2.getLocationController().setProximityLocation(ad0Var2.f32524b0, 0, true);
                ad0Var2.D = false;
                return;
            case 2:
                ad0 ad0Var3 = this.f35315b;
                IMapsProvider.IMap iMap = ad0Var3.F;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!ad0Var3.O.getRadiusSet()) {
                    double d = ad0Var3.M;
                    if (d > 0.0d) {
                        ad0Var3.L.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = ad0Var3.L;
                        if (iCircle != null) {
                            iCircle.remove();
                            ad0Var3.L = null;
                        }
                    }
                }
                ad0Var3.O = null;
                return;
            case 3:
                xc0 xc0Var = this.f35315b.f32551x;
                if (xc0Var != null) {
                    xc0Var.a();
                    return;
                }
                return;
            case 4:
                ad0.W(this.f35315b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new jc0(this.f35315b, 0));
                return;
        }
    }
}
