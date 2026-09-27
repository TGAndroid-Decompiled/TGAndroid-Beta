package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class qc0 implements Runnable {
    public final int f36709a;
    public final fd0 f36710b;
    public final IMapsProvider.IMapView f36711c;

    public qc0(fd0 fd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f36709a = i10;
        this.f36710b = fd0Var;
        this.f36711c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f36709a) {
            case 0:
                fd0 fd0Var = this.f36710b;
                IMapsProvider.IMapView iMapView = this.f36711c;
                if (fd0Var.K != null && fd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        fd0Var.K.getMapAsync(new rc0(fd0Var, 0));
                        fd0Var.f33512u0 = true;
                        if (fd0Var.f33513v0) {
                            fd0Var.K.onResume();
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
                fd0 fd0Var2 = this.f36710b;
                IMapsProvider.IMapView iMapView2 = this.f36711c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new qc0(fd0Var2, iMapView2, 0));
                return;
        }
    }
}
