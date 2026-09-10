package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class al implements Runnable {
    public final int f21530a;
    public final ll f21531b;
    public final IMapsProvider.IMapView f21532c;

    public al(ll llVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f21530a = i10;
        this.f21531b = llVar;
        this.f21532c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f21530a) {
            case 0:
                ll.S(this.f21531b, this.f21532c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f21532c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new al(this.f21531b, iMapView, 0));
                return;
        }
    }
}
