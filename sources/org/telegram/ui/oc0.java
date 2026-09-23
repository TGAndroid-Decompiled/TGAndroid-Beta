package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class oc0 implements Runnable {
    public final int f35764a;
    public final dd0 f35765b;
    public final IMapsProvider.IMapView f35766c;

    public oc0(dd0 dd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f35764a = i10;
        this.f35765b = dd0Var;
        this.f35766c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f35764a) {
            case 0:
                dd0 dd0Var = this.f35765b;
                IMapsProvider.IMapView iMapView = this.f35766c;
                if (dd0Var.K != null && dd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        dd0Var.K.getMapAsync(new pc0(dd0Var, 0));
                        dd0Var.f32606u0 = true;
                        if (dd0Var.f32607v0) {
                            dd0Var.K.onResume();
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
                dd0 dd0Var2 = this.f35765b;
                IMapsProvider.IMapView iMapView2 = this.f35766c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new oc0(dd0Var2, iMapView2, 0));
                return;
        }
    }
}
