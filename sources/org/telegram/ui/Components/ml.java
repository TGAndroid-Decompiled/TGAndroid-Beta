package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class ml implements Runnable {
    public final int f28746a;
    public final xl f28747b;
    public final IMapsProvider.IMapView f28748c;

    public ml(xl xlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f28746a = i10;
        this.f28747b = xlVar;
        this.f28748c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f28746a) {
            case 0:
                xl.V(this.f28747b, this.f28748c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f28748c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ml(this.f28747b, iMapView, 0));
                return;
        }
    }
}
