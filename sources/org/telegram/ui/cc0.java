package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class cc0 implements Runnable {
    public final int f36331a;
    public final sc0 f36332b;
    public final IMapsProvider.IMapView f36333c;

    public cc0(sc0 sc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f36331a = i10;
        this.f36332b = sc0Var;
        this.f36333c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f36331a) {
            case 0:
                sc0 sc0Var = this.f36332b;
                IMapsProvider.IMapView iMapView = this.f36333c;
                if (sc0Var.K != null && sc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        sc0Var.K.getMapAsync(new dc0(sc0Var, 0));
                        sc0Var.f41373u0 = true;
                        if (sc0Var.f41374v0) {
                            sc0Var.K.onResume();
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
                sc0 sc0Var2 = this.f36332b;
                IMapsProvider.IMapView iMapView2 = this.f36333c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new cc0(sc0Var2, iMapView2, 0));
                return;
        }
    }
}
