package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class gl implements Runnable {
    public final int f26599a;
    public final rl f26600b;
    public final IMapsProvider.IMapView f26601c;

    public gl(rl rlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f26599a = i10;
        this.f26600b = rlVar;
        this.f26601c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f26599a) {
            case 0:
                rl.V(this.f26600b, this.f26601c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f26601c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new gl(this.f26600b, iMapView, 0));
                return;
        }
    }
}
