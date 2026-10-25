package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class el implements Runnable {
    public final int f27893a;
    public final sl f27894b;
    public final IMapsProvider.IMapView f27895c;

    public el(sl slVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f27893a = i10;
        this.f27894b = slVar;
        this.f27895c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f27893a) {
            case 0:
                sl.U(this.f27894b, this.f27895c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f27895c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new el(this.f27894b, iMapView, 0));
                return;
        }
    }
}
