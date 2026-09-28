package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class xk implements Runnable {
    public final int f30399a;
    public final il f30400b;
    public final IMapsProvider.IMapView f30401c;

    public xk(il ilVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f30399a = i10;
        this.f30400b = ilVar;
        this.f30401c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f30399a) {
            case 0:
                il.S(this.f30400b, this.f30401c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f30401c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new xk(this.f30400b, iMapView, 0));
                return;
        }
    }
}
