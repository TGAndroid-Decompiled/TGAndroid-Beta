package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class pc0 implements Runnable {
    public final int f36375a;
    public final fd0 f36376b;

    public pc0(fd0 fd0Var, int i10) {
        this.f36375a = i10;
        this.f36376b = fd0Var;
    }

    @Override
    public final void run() {
        switch (this.f36375a) {
            case 0:
                fd0 fd0Var = this.f36376b;
                IMapsProvider.ICameraUpdate iCameraUpdate = fd0Var.J;
                if (iCameraUpdate != null) {
                    fd0Var.I.moveCamera(iCameraUpdate);
                    fd0Var.J = null;
                    return;
                }
                return;
            case 1:
                fd0 fd0Var2 = this.f36376b;
                fd0Var2.getLocationController().setProximityLocation(fd0Var2.f33493e0, 0, true);
                fd0Var2.G = false;
                return;
            case 2:
                fd0 fd0Var3 = this.f36376b;
                IMapsProvider.IMap iMap = fd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!fd0Var3.R.getRadiusSet()) {
                    double d = fd0Var3.P;
                    if (d > 0.0d) {
                        fd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = fd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            fd0Var3.O = null;
                        }
                    }
                }
                fd0Var3.R = null;
                return;
            case 3:
                cd0 cd0Var = this.f36376b.f33516x;
                if (cd0Var != null) {
                    cd0Var.a();
                    return;
                }
                return;
            case 4:
                fd0.W(this.f36376b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new pc0(this.f36376b, 0));
                return;
        }
    }
}
