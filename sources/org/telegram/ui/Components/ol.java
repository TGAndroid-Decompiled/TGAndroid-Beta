package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class ol implements Runnable {
    public final int f29235a;
    public final zl f29236b;
    public final IMapsProvider.IMapView f29237c;

    public ol(zl zlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f29235a = i10;
        this.f29236b = zlVar;
        this.f29237c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f29235a) {
            case 0:
                zl.V(this.f29236b, this.f29237c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f29237c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ol(this.f29236b, iMapView, 0));
                return;
        }
    }
}
