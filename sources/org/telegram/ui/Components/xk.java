package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class xk implements Runnable {
    public final int f30400a;
    public final il f30401b;
    public final IMapsProvider.IMapView f30402c;

    public xk(il ilVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f30400a = i10;
        this.f30401b = ilVar;
        this.f30402c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f30400a) {
            case 0:
                il.S(this.f30401b, this.f30402c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f30402c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new xk(this.f30401b, iMapView, 0));
                return;
        }
    }
}
