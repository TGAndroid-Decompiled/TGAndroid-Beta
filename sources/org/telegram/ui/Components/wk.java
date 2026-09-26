package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class wk implements Runnable {
    public final int f30077a;
    public final hl f30078b;
    public final IMapsProvider.IMapView f30079c;

    public wk(hl hlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f30077a = i10;
        this.f30078b = hlVar;
        this.f30079c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f30077a) {
            case 0:
                hl.S(this.f30078b, this.f30079c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f30079c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new wk(this.f30078b, iMapView, 0));
                return;
        }
    }
}
