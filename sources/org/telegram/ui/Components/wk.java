package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class wk implements Runnable {
    public final int f29735a;
    public final hl f29736b;
    public final IMapsProvider.IMapView f29737c;

    public wk(hl hlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f29735a = i10;
        this.f29736b = hlVar;
        this.f29737c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f29735a) {
            case 0:
                hl.S(this.f29736b, this.f29737c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f29737c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new wk(this.f29736b, iMapView, 0));
                return;
        }
    }
}
