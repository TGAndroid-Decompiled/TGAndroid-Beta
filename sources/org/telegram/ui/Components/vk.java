package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class vk implements Runnable {
    public final int f29095a;
    public final gl f29096b;
    public final IMapsProvider.IMapView f29097c;

    public vk(gl glVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f29095a = i10;
        this.f29096b = glVar;
        this.f29097c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f29095a) {
            case 0:
                gl.S(this.f29096b, this.f29097c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f29097c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vk(this.f29096b, iMapView, 0));
                return;
        }
    }
}
