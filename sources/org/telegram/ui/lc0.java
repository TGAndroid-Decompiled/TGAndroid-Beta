package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class lc0 implements Runnable {
    public final int f35733a;
    public final cd0 f35734b;

    public lc0(cd0 cd0Var, int i10) {
        this.f35733a = i10;
        this.f35734b = cd0Var;
    }

    @Override
    public final void run() {
        switch (this.f35733a) {
            case 0:
                cd0 cd0Var = this.f35734b;
                IMapsProvider.ICameraUpdate iCameraUpdate = cd0Var.G;
                if (iCameraUpdate != null) {
                    cd0Var.F.moveCamera(iCameraUpdate);
                    cd0Var.G = null;
                    return;
                }
                return;
            case 1:
                cd0 cd0Var2 = this.f35734b;
                cd0Var2.getLocationController().setProximityLocation(cd0Var2.f33086b0, 0, true);
                cd0Var2.D = false;
                return;
            case 2:
                cd0 cd0Var3 = this.f35734b;
                IMapsProvider.IMap iMap = cd0Var3.F;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!cd0Var3.O.getRadiusSet()) {
                    double d = cd0Var3.M;
                    if (d > 0.0d) {
                        cd0Var3.L.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = cd0Var3.L;
                        if (iCircle != null) {
                            iCircle.remove();
                            cd0Var3.L = null;
                        }
                    }
                }
                cd0Var3.O = null;
                return;
            case 3:
                zc0 zc0Var = this.f35734b.f33113x;
                if (zc0Var != null) {
                    zc0Var.a();
                    return;
                }
                return;
            case 4:
                cd0.W(this.f35734b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new lc0(this.f35734b, 0));
                return;
        }
    }
}
