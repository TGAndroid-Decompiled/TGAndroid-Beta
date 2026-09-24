package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class wk implements Runnable {
    public final int f30057a;
    public final hl f30058b;
    public final IMapsProvider.IMapView f30059c;

    public wk(hl hlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f30057a = i10;
        this.f30058b = hlVar;
        this.f30059c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f30057a) {
            case 0:
                hl.S(this.f30058b, this.f30059c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f30059c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new wk(this.f30058b, iMapView, 0));
                return;
        }
    }
}
