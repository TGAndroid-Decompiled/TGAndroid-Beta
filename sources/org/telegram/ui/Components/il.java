package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class il implements Runnable {
    public final int f25650a;
    public final tl f25651b;
    public final IMapsProvider.IMapView f25652c;

    public il(tl tlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f25650a = i10;
        this.f25651b = tlVar;
        this.f25652c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f25650a) {
            case 0:
                tl.V(this.f25651b, this.f25652c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f25652c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new il(this.f25651b, iMapView, 0));
                return;
        }
    }
}
