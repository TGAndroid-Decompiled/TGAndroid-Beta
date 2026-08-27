package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

public final class cc0 implements Runnable {

    public final int f37047a;

    public final tc0 f37048b;

    public cc0(tc0 tc0Var, int i10) {
        this.f37047a = i10;
        this.f37048b = tc0Var;
    }

    @Override
    public final void run() {
        switch (this.f37047a) {
            case 0:
                tc0 tc0Var = this.f37048b;
                IMapsProvider.ICameraUpdate iCameraUpdate = tc0Var.F;
                if (iCameraUpdate != null) {
                    tc0Var.E.moveCamera(iCameraUpdate);
                    tc0Var.F = null;
                }
                break;
            case 1:
                tc0 tc0Var2 = this.f37048b;
                tc0Var2.getLocationController().setProximityLocation(tc0Var2.f42856a0, 0, true);
                tc0Var2.C = false;
                break;
            case 2:
                tc0 tc0Var3 = this.f37048b;
                IMapsProvider.IMap iMap = tc0Var3.E;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!tc0Var3.N.getRadiusSet()) {
                    double d = tc0Var3.L;
                    if (d > 0.0d) {
                        tc0Var3.K.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = tc0Var3.K;
                        if (iCircle != null) {
                            iCircle.remove();
                            tc0Var3.K = null;
                        }
                    }
                }
                tc0Var3.N = null;
                break;
            case 3:
                qc0 qc0Var = this.f37048b.f42886x;
                if (qc0Var != null) {
                    qc0Var.a();
                }
                break;
            case 4:
                tc0.W(this.f37048b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new cc0(this.f37048b, 0));
                break;
        }
    }
}
