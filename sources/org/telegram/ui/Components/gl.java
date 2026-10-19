package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class gl implements Runnable {
    public final int f26609a;
    public final rl f26610b;
    public final IMapsProvider.IMapView f26611c;

    public gl(rl rlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f26609a = i10;
        this.f26610b = rlVar;
        this.f26611c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f26609a) {
            case 0:
                rl.V(this.f26610b, this.f26611c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f26611c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new gl(this.f26610b, iMapView, 0));
                return;
        }
    }
}
