package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class ac0 implements Runnable {
    public final int f36507a;
    public final rc0 f36508b;
    public final IMapsProvider.IMapView f36509c;

    public ac0(rc0 rc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f36507a = i10;
        this.f36508b = rc0Var;
        this.f36509c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f36507a) {
            case 0:
                rc0 rc0Var = this.f36508b;
                IMapsProvider.IMapView iMapView = this.f36509c;
                if (rc0Var.G != null && rc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        rc0Var.G.getMapAsync(new bc0(rc0Var, 0));
                        rc0Var.f42053q0 = true;
                        if (rc0Var.f42055r0) {
                            rc0Var.G.onResume();
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            default:
                rc0 rc0Var2 = this.f36508b;
                IMapsProvider.IMapView iMapView2 = this.f36509c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ac0(rc0Var2, iMapView2, 0));
                return;
        }
    }
}
