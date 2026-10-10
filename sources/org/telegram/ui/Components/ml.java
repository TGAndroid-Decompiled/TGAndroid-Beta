package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class ml implements Runnable {
    public final int f28833a;
    public final xl f28834b;
    public final IMapsProvider.IMapView f28835c;

    public ml(xl xlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f28833a = i10;
        this.f28834b = xlVar;
        this.f28835c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f28833a) {
            case 0:
                xl.V(this.f28834b, this.f28835c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f28835c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ml(this.f28834b, iMapView, 0));
                return;
        }
    }
}
