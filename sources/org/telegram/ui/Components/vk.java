package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class vk implements Runnable {
    public final int f28818a;
    public final gl f28819b;
    public final IMapsProvider.IMapView f28820c;

    public vk(gl glVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f28818a = i10;
        this.f28819b = glVar;
        this.f28820c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f28818a) {
            case 0:
                gl.S(this.f28819b, this.f28820c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f28820c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vk(this.f28819b, iMapView, 0));
                return;
        }
    }
}
