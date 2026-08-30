package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class ok implements Runnable {
    public final int f27583a;
    public final al f27584b;
    public final IMapsProvider.IMapView f27585c;

    public ok(al alVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f27583a = i10;
        this.f27584b = alVar;
        this.f27585c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f27583a) {
            case 0:
                al.S(this.f27584b, this.f27585c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f27585c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ok(this.f27584b, iMapView, 0));
                return;
        }
    }
}
