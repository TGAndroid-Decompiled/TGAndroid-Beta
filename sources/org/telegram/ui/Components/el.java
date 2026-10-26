package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class el implements Runnable {
    public final int f27895a;
    public final sl f27896b;
    public final IMapsProvider.IMapView f27897c;

    public el(sl slVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f27895a = i10;
        this.f27896b = slVar;
        this.f27897c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f27895a) {
            case 0:
                sl.U(this.f27896b, this.f27897c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f27897c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new el(this.f27896b, iMapView, 0));
                return;
        }
    }
}
