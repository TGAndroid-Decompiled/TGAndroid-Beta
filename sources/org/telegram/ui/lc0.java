package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class lc0 implements Runnable {
    public final int f38704a;
    public final bd0 f38705b;
    public final IMapsProvider.IMapView f38706c;

    public lc0(bd0 bd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f38704a = i10;
        this.f38705b = bd0Var;
        this.f38706c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f38704a) {
            case 0:
                bd0 bd0Var = this.f38705b;
                IMapsProvider.IMapView iMapView = this.f38706c;
                if (bd0Var.H != null && bd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        bd0Var.H.getMapAsync(new mc0(bd0Var, 0));
                        bd0Var.f35475r0 = true;
                        if (bd0Var.f35477s0) {
                            bd0Var.H.onResume();
                            return;
                        }
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                return;
            default:
                bd0 bd0Var2 = this.f38705b;
                IMapsProvider.IMapView iMapView2 = this.f38706c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new lc0(bd0Var2, iMapView2, 0));
                return;
        }
    }
}
