package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class ml implements Runnable {
    public final int f28851a;
    public final xl f28852b;
    public final IMapsProvider.IMapView f28853c;

    public ml(xl xlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f28851a = i10;
        this.f28852b = xlVar;
        this.f28853c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f28851a) {
            case 0:
                xl.V(this.f28852b, this.f28853c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f28853c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ml(this.f28852b, iMapView, 0));
                return;
        }
    }
}
