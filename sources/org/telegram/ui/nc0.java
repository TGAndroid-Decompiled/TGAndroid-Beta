package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class nc0 implements Runnable {
    public final int f35850a;
    public final cd0 f35851b;
    public final IMapsProvider.IMapView f35852c;

    public nc0(cd0 cd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f35850a = i10;
        this.f35851b = cd0Var;
        this.f35852c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f35850a) {
            case 0:
                cd0 cd0Var = this.f35851b;
                IMapsProvider.IMapView iMapView = this.f35852c;
                if (cd0Var.K != null && cd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        cd0Var.K.getMapAsync(new oc0(cd0Var, 0));
                        cd0Var.f32682u0 = true;
                        if (cd0Var.f32683v0) {
                            cd0Var.K.onResume();
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
                cd0 cd0Var2 = this.f35851b;
                IMapsProvider.IMapView iMapView2 = this.f35852c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new nc0(cd0Var2, iMapView2, 0));
                return;
        }
    }
}
