package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class xk implements Runnable {
    public final int f30427a;
    public final il f30428b;
    public final IMapsProvider.IMapView f30429c;

    public xk(il ilVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f30427a = i10;
        this.f30428b = ilVar;
        this.f30429c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f30427a) {
            case 0:
                il.S(this.f30428b, this.f30429c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f30429c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new xk(this.f30428b, iMapView, 0));
                return;
        }
    }
}
