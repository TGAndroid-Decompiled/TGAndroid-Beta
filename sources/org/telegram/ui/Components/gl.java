package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class gl implements Runnable {
    public final int f26611a;
    public final rl f26612b;
    public final IMapsProvider.IMapView f26613c;

    public gl(rl rlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f26611a = i10;
        this.f26612b = rlVar;
        this.f26613c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f26611a) {
            case 0:
                rl.V(this.f26612b, this.f26613c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f26613c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new gl(this.f26612b, iMapView, 0));
                return;
        }
    }
}
