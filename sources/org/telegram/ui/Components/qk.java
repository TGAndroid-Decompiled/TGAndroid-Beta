package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class qk implements Runnable {
    public final int f31975a;
    public final bl f31976b;
    public final IMapsProvider.IMapView f31977c;

    public qk(bl blVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f31975a = i10;
        this.f31976b = blVar;
        this.f31977c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f31975a) {
            case 0:
                bl.S(this.f31976b, this.f31977c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f31977c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new qk(this.f31976b, iMapView, 0));
                return;
        }
    }
}
