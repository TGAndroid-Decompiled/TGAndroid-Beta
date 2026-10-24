package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class cl implements Runnable {
    public final int f25350a;
    public final pl f25351b;
    public final IMapsProvider.IMapView f25352c;

    public cl(pl plVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f25350a = i10;
        this.f25351b = plVar;
        this.f25352c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f25350a) {
            case 0:
                pl.U(this.f25351b, this.f25352c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f25352c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new cl(this.f25351b, iMapView, 0));
                return;
        }
    }
}
