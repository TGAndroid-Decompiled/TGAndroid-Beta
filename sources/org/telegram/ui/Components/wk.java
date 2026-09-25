package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class wk implements Runnable {
    public final int f30078a;
    public final hl f30079b;
    public final IMapsProvider.IMapView f30080c;

    public wk(hl hlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f30078a = i10;
        this.f30079b = hlVar;
        this.f30080c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f30078a) {
            case 0:
                hl.S(this.f30079b, this.f30080c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f30080c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new wk(this.f30079b, iMapView, 0));
                return;
        }
    }
}
