package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class gl implements Runnable {
    public final int f26582a;
    public final rl f26583b;
    public final IMapsProvider.IMapView f26584c;

    public gl(rl rlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f26582a = i10;
        this.f26583b = rlVar;
        this.f26584c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f26582a) {
            case 0:
                rl.V(this.f26583b, this.f26584c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f26584c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new gl(this.f26583b, iMapView, 0));
                return;
        }
    }
}
