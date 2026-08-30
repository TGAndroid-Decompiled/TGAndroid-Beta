package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class kc0 implements Runnable {
    public final int f35617a;
    public final ad0 f35618b;
    public final IMapsProvider.IMapView f35619c;

    public kc0(ad0 ad0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f35617a = i10;
        this.f35618b = ad0Var;
        this.f35619c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f35617a) {
            case 0:
                ad0 ad0Var = this.f35618b;
                IMapsProvider.IMapView iMapView = this.f35619c;
                if (ad0Var.H != null && ad0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        ad0Var.H.getMapAsync(new lc0(ad0Var, 0));
                        ad0Var.f32543r0 = true;
                        if (ad0Var.f32545s0) {
                            ad0Var.H.onResume();
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
                ad0 ad0Var2 = this.f35618b;
                IMapsProvider.IMapView iMapView2 = this.f35619c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new kc0(ad0Var2, iMapView2, 0));
                return;
        }
    }
}
