package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class qk implements Runnable {
    public final int f30419a;
    public final cl f30420b;
    public final IMapsProvider.IMapView f30421c;

    public qk(cl clVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f30419a = i10;
        this.f30420b = clVar;
        this.f30421c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f30419a) {
            case 0:
                cl.S(this.f30420b, this.f30421c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f30421c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new qk(this.f30420b, iMapView, 0));
                return;
        }
    }
}
