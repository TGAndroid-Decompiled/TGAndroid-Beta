package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class mc0 implements Runnable {
    public final int f36027a;
    public final cd0 f36028b;
    public final IMapsProvider.IMapView f36029c;

    public mc0(cd0 cd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f36027a = i10;
        this.f36028b = cd0Var;
        this.f36029c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f36027a) {
            case 0:
                cd0 cd0Var = this.f36028b;
                IMapsProvider.IMapView iMapView = this.f36029c;
                if (cd0Var.H != null && cd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        cd0Var.H.getMapAsync(new nc0(cd0Var, 0));
                        cd0Var.f33105r0 = true;
                        if (cd0Var.f33107s0) {
                            cd0Var.H.onResume();
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
                cd0 cd0Var2 = this.f36028b;
                IMapsProvider.IMapView iMapView2 = this.f36029c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new mc0(cd0Var2, iMapView2, 0));
                return;
        }
    }
}
