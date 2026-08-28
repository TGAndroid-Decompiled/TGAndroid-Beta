package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class mk implements Runnable {
    public final int f30880a;
    public final xk f30881b;
    public final IMapsProvider.IMapView f30882c;

    public mk(xk xkVar, IMapsProvider.IMapView iMapView, int i9) {
        this.f30880a = i9;
        this.f30881b = xkVar;
        this.f30882c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f30880a) {
            case 0:
                xk.R(this.f30881b, this.f30882c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f30882c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new mk(this.f30881b, iMapView, 0));
                return;
        }
    }
}
