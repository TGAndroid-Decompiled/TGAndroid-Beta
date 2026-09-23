package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class nc0 implements Runnable {
    public final int f35497a;
    public final dd0 f35498b;

    public nc0(dd0 dd0Var, int i10) {
        this.f35497a = i10;
        this.f35498b = dd0Var;
    }

    @Override
    public final void run() {
        switch (this.f35497a) {
            case 0:
                dd0 dd0Var = this.f35498b;
                IMapsProvider.ICameraUpdate iCameraUpdate = dd0Var.J;
                if (iCameraUpdate != null) {
                    dd0Var.I.moveCamera(iCameraUpdate);
                    dd0Var.J = null;
                    return;
                }
                return;
            case 1:
                dd0 dd0Var2 = this.f35498b;
                dd0Var2.getLocationController().setProximityLocation(dd0Var2.f32587e0, 0, true);
                dd0Var2.G = false;
                return;
            case 2:
                dd0 dd0Var3 = this.f35498b;
                IMapsProvider.IMap iMap = dd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!dd0Var3.R.getRadiusSet()) {
                    double d = dd0Var3.P;
                    if (d > 0.0d) {
                        dd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = dd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            dd0Var3.O = null;
                        }
                    }
                }
                dd0Var3.R = null;
                return;
            case 3:
                ad0 ad0Var = this.f35498b.f32610x;
                if (ad0Var != null) {
                    ad0Var.a();
                    return;
                }
                return;
            case 4:
                dd0.W(this.f35498b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new nc0(this.f35498b, 0));
                return;
        }
    }
}
