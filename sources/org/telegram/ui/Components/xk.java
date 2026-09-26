package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class xk implements Runnable {
    public final int f30362a;
    public final il f30363b;
    public final IMapsProvider.IMapView f30364c;

    public xk(il ilVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f30362a = i10;
        this.f30363b = ilVar;
        this.f30364c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f30362a) {
            case 0:
                il.S(this.f30363b, this.f30364c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f30364c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new xk(this.f30363b, iMapView, 0));
                return;
        }
    }
}
