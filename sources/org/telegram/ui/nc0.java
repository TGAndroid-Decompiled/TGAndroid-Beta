package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class nc0 implements Runnable {
    public final int f35960a;
    public final cd0 f35961b;
    public final IMapsProvider.IMapView f35962c;

    public nc0(cd0 cd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f35960a = i10;
        this.f35961b = cd0Var;
        this.f35962c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f35960a) {
            case 0:
                cd0 cd0Var = this.f35961b;
                IMapsProvider.IMapView iMapView = this.f35962c;
                if (cd0Var.K != null && cd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        cd0Var.K.getMapAsync(new oc0(cd0Var, 0));
                        cd0Var.f32769u0 = true;
                        if (cd0Var.f32770v0) {
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
                cd0 cd0Var2 = this.f35961b;
                IMapsProvider.IMapView iMapView2 = this.f35962c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new nc0(cd0Var2, iMapView2, 0));
                return;
        }
    }
}
