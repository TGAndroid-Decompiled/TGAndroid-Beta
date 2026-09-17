package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class vk implements Runnable {
    public final int f31377a;
    public final gl f31378b;
    public final IMapsProvider.IMapView f31379c;

    public vk(gl glVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f31377a = i10;
        this.f31378b = glVar;
        this.f31379c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f31377a) {
            case 0:
                gl.S(this.f31378b, this.f31379c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f31379c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vk(this.f31378b, iMapView, 0));
                return;
        }
    }
}
