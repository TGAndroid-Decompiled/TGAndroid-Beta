package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class gl implements Runnable {
    public final int f26589a;
    public final rl f26590b;
    public final IMapsProvider.IMapView f26591c;

    public gl(rl rlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f26589a = i10;
        this.f26590b = rlVar;
        this.f26591c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f26589a) {
            case 0:
                rl.V(this.f26590b, this.f26591c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f26591c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new gl(this.f26590b, iMapView, 0));
                return;
        }
    }
}
