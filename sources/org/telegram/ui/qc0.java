package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class qc0 implements Runnable {
    public final int f39692a;
    public final gd0 f39693b;

    public qc0(gd0 gd0Var, int i10) {
        this.f39692a = i10;
        this.f39693b = gd0Var;
    }

    @Override
    public final void run() {
        switch (this.f39692a) {
            case 0:
                gd0 gd0Var = this.f39693b;
                IMapsProvider.ICameraUpdate iCameraUpdate = gd0Var.J;
                if (iCameraUpdate != null) {
                    gd0Var.I.moveCamera(iCameraUpdate);
                    gd0Var.J = null;
                    return;
                }
                return;
            case 1:
                gd0 gd0Var2 = this.f39693b;
                gd0Var2.getLocationController().setProximityLocation(gd0Var2.f36570e0, 0, true);
                gd0Var2.G = false;
                return;
            case 2:
                gd0 gd0Var3 = this.f39693b;
                IMapsProvider.IMap iMap = gd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!gd0Var3.R.getRadiusSet()) {
                    double d = gd0Var3.P;
                    if (d > 0.0d) {
                        gd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = gd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            gd0Var3.O = null;
                        }
                    }
                }
                gd0Var3.R = null;
                return;
            case 3:
                dd0 dd0Var = this.f39693b.f36593x;
                if (dd0Var != null) {
                    dd0Var.a();
                    return;
                }
                return;
            case 4:
                gd0.U(this.f39693b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new qc0(this.f39693b, 0));
                return;
        }
    }
}
