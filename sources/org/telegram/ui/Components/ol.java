package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class ol implements Runnable {
    public final int f29232a;
    public final zl f29233b;
    public final IMapsProvider.IMapView f29234c;

    public ol(zl zlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f29232a = i10;
        this.f29233b = zlVar;
        this.f29234c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f29232a) {
            case 0:
                zl.V(this.f29233b, this.f29234c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f29234c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ol(this.f29233b, iMapView, 0));
                return;
        }
    }
}
