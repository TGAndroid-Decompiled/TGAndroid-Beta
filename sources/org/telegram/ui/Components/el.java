package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class el implements Runnable {
    public final int f27873a;
    public final sl f27874b;
    public final IMapsProvider.IMapView f27875c;

    public el(sl slVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f27873a = i10;
        this.f27874b = slVar;
        this.f27875c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f27873a) {
            case 0:
                sl.U(this.f27874b, this.f27875c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f27875c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new el(this.f27874b, iMapView, 0));
                return;
        }
    }
}
