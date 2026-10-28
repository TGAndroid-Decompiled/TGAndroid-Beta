package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class ac0 implements Runnable {
    public final int f37731a;
    public final rc0 f37732b;
    public final IMapsProvider.IMapView f37733c;

    public ac0(rc0 rc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f37731a = i10;
        this.f37732b = rc0Var;
        this.f37733c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f37731a) {
            case 0:
                rc0 rc0Var = this.f37732b;
                IMapsProvider.IMapView iMapView = this.f37733c;
                if (rc0Var.K != null && rc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        rc0Var.K.getMapAsync(new cc0(rc0Var, 0));
                        rc0Var.f42946t0 = true;
                        if (rc0Var.f42947u0) {
                            rc0Var.K.onResume();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                rc0 rc0Var2 = this.f37732b;
                IMapsProvider.IMapView iMapView2 = this.f37733c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ac0(rc0Var2, iMapView2, 0));
                return;
        }
    }
}
