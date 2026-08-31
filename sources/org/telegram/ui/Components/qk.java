package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class qk implements Runnable {
    public final int f30409a;
    public final cl f30410b;
    public final IMapsProvider.IMapView f30411c;

    public qk(cl clVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f30409a = i10;
        this.f30410b = clVar;
        this.f30411c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f30409a) {
            case 0:
                cl.S(this.f30410b, this.f30411c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f30411c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new qk(this.f30410b, iMapView, 0));
                return;
        }
    }
}
