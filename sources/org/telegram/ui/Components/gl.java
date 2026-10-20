package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class gl implements Runnable {
    public final int f26596a;
    public final rl f26597b;
    public final IMapsProvider.IMapView f26598c;

    public gl(rl rlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f26596a = i10;
        this.f26597b = rlVar;
        this.f26598c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f26596a) {
            case 0:
                rl.V(this.f26597b, this.f26598c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f26598c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new gl(this.f26597b, iMapView, 0));
                return;
        }
    }
}
