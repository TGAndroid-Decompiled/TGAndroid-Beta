package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class ac0 implements Runnable {
    public final int f35726a;
    public final rc0 f35727b;
    public final IMapsProvider.IMapView f35728c;

    public ac0(rc0 rc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f35726a = i10;
        this.f35727b = rc0Var;
        this.f35728c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f35726a) {
            case 0:
                rc0 rc0Var = this.f35727b;
                IMapsProvider.IMapView iMapView = this.f35728c;
                if (rc0Var.K != null && rc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        rc0Var.K.getMapAsync(new cc0(rc0Var, 0));
                        rc0Var.f41117t0 = true;
                        if (rc0Var.f41118u0) {
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
                rc0 rc0Var2 = this.f35727b;
                IMapsProvider.IMapView iMapView2 = this.f35728c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ac0(rc0Var2, iMapView2, 0));
                return;
        }
    }
}
