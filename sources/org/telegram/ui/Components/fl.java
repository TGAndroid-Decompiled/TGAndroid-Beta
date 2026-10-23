package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class fl implements Runnable {
    public final int f26372a;
    public final rl f26373b;
    public final IMapsProvider.IMapView f26374c;

    public fl(rl rlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f26372a = i10;
        this.f26373b = rlVar;
        this.f26374c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f26372a) {
            case 0:
                rl.U(this.f26373b, this.f26374c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f26374c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new fl(this.f26373b, iMapView, 0));
                return;
        }
    }
}
