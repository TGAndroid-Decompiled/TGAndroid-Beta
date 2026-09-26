package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class nc0 implements Runnable {
    public final int f35848a;
    public final cd0 f35849b;
    public final IMapsProvider.IMapView f35850c;

    public nc0(cd0 cd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f35848a = i10;
        this.f35849b = cd0Var;
        this.f35850c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f35848a) {
            case 0:
                cd0 cd0Var = this.f35849b;
                IMapsProvider.IMapView iMapView = this.f35850c;
                if (cd0Var.K != null && cd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        cd0Var.K.getMapAsync(new oc0(cd0Var, 0));
                        cd0Var.f32680u0 = true;
                        if (cd0Var.f32681v0) {
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
                cd0 cd0Var2 = this.f35849b;
                IMapsProvider.IMapView iMapView2 = this.f35850c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new nc0(cd0Var2, iMapView2, 0));
                return;
        }
    }
}
