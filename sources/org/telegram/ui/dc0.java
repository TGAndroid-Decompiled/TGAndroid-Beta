package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

public final class dc0 implements Runnable {

    public final int f37350a;

    public final tc0 f37351b;

    public final IMapsProvider.IMapView f37352c;

    public dc0(tc0 tc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f37350a = i10;
        this.f37351b = tc0Var;
        this.f37352c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f37350a) {
            case 0:
                tc0 tc0Var = this.f37351b;
                IMapsProvider.IMapView iMapView = this.f37352c;
                if (tc0Var.G != null && tc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        tc0Var.G.getMapAsync(new ec0(tc0Var, 0));
                        tc0Var.f42876q0 = true;
                        if (tc0Var.f42878r0) {
                            tc0Var.G.onResume();
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                    break;
                }
                break;
            default:
                tc0 tc0Var2 = this.f37351b;
                IMapsProvider.IMapView iMapView2 = this.f37352c;
                try {
                    iMapView2.onCreate(null);
                    break;
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new dc0(tc0Var2, iMapView2, 0));
                break;
        }
    }
}
