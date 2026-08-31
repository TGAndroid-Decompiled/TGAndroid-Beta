package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class kc0 implements Runnable {
    public final int f38347a;
    public final bd0 f38348b;

    public kc0(bd0 bd0Var, int i10) {
        this.f38347a = i10;
        this.f38348b = bd0Var;
    }

    @Override
    public final void run() {
        switch (this.f38347a) {
            case 0:
                bd0 bd0Var = this.f38348b;
                IMapsProvider.ICameraUpdate iCameraUpdate = bd0Var.G;
                if (iCameraUpdate != null) {
                    bd0Var.F.moveCamera(iCameraUpdate);
                    bd0Var.G = null;
                    return;
                }
                return;
            case 1:
                bd0 bd0Var2 = this.f38348b;
                bd0Var2.getLocationController().setProximityLocation(bd0Var2.f35455b0, 0, true);
                bd0Var2.D = false;
                return;
            case 2:
                bd0 bd0Var3 = this.f38348b;
                IMapsProvider.IMap iMap = bd0Var3.F;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!bd0Var3.O.getRadiusSet()) {
                    double d = bd0Var3.M;
                    if (d > 0.0d) {
                        bd0Var3.L.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = bd0Var3.L;
                        if (iCircle != null) {
                            iCircle.remove();
                            bd0Var3.L = null;
                        }
                    }
                }
                bd0Var3.O = null;
                return;
            case 3:
                yc0 yc0Var = this.f38348b.f35483x;
                if (yc0Var != null) {
                    yc0Var.a();
                    return;
                }
                return;
            case 4:
                bd0.W(this.f38348b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new kc0(this.f38348b, 0));
                return;
        }
    }
}
