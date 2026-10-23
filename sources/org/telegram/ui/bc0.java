package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class bc0 implements Runnable {
    public final int f36015a;
    public final sc0 f36016b;

    public bc0(sc0 sc0Var, int i10) {
        this.f36015a = i10;
        this.f36016b = sc0Var;
    }

    @Override
    public final void run() {
        switch (this.f36015a) {
            case 0:
                sc0 sc0Var = this.f36016b;
                IMapsProvider.ICameraUpdate iCameraUpdate = sc0Var.J;
                if (iCameraUpdate != null) {
                    sc0Var.I.moveCamera(iCameraUpdate);
                    sc0Var.J = null;
                    return;
                }
                return;
            case 1:
                sc0 sc0Var2 = this.f36016b;
                sc0Var2.getLocationController().setProximityLocation(sc0Var2.f41354e0, 0, true);
                sc0Var2.G = false;
                return;
            case 2:
                sc0 sc0Var3 = this.f36016b;
                IMapsProvider.IMap iMap = sc0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!sc0Var3.R.getRadiusSet()) {
                    double d = sc0Var3.P;
                    if (d > 0.0d) {
                        sc0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = sc0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            sc0Var3.O = null;
                        }
                    }
                }
                sc0Var3.R = null;
                return;
            case 3:
                pc0 pc0Var = this.f36016b.f41377x;
                if (pc0Var != null) {
                    pc0Var.a();
                    return;
                }
                return;
            case 4:
                sc0.V(this.f36016b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new bc0(this.f36016b, 0));
                return;
        }
    }
}
