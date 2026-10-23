package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class gl implements Runnable {
    public final int f26600a;
    public final rl f26601b;
    public final IMapsProvider.IMapView f26602c;

    public gl(rl rlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f26600a = i10;
        this.f26601b = rlVar;
        this.f26602c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f26600a) {
            case 0:
                rl.V(this.f26601b, this.f26602c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f26602c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new gl(this.f26601b, iMapView, 0));
                return;
        }
    }
}
