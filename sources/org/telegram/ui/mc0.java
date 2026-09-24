package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class mc0 implements Runnable {
    public final int f35516a;
    public final cd0 f35517b;

    public mc0(cd0 cd0Var, int i10) {
        this.f35516a = i10;
        this.f35517b = cd0Var;
    }

    @Override
    public final void run() {
        switch (this.f35516a) {
            case 0:
                cd0 cd0Var = this.f35517b;
                IMapsProvider.ICameraUpdate iCameraUpdate = cd0Var.J;
                if (iCameraUpdate != null) {
                    cd0Var.I.moveCamera(iCameraUpdate);
                    cd0Var.J = null;
                    return;
                }
                return;
            case 1:
                cd0 cd0Var2 = this.f35517b;
                cd0Var2.getLocationController().setProximityLocation(cd0Var2.f32648e0, 0, true);
                cd0Var2.G = false;
                return;
            case 2:
                cd0 cd0Var3 = this.f35517b;
                IMapsProvider.IMap iMap = cd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!cd0Var3.R.getRadiusSet()) {
                    double d = cd0Var3.P;
                    if (d > 0.0d) {
                        cd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = cd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            cd0Var3.O = null;
                        }
                    }
                }
                cd0Var3.R = null;
                return;
            case 3:
                zc0 zc0Var = this.f35517b.f32671x;
                if (zc0Var != null) {
                    zc0Var.a();
                    return;
                }
                return;
            case 4:
                cd0.W(this.f35517b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new mc0(this.f35517b, 0));
                return;
        }
    }
}
