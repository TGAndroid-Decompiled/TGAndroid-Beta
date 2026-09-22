package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class vk implements Runnable {
    public final int f29194a;
    public final gl f29195b;
    public final IMapsProvider.IMapView f29196c;

    public vk(gl glVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f29194a = i10;
        this.f29195b = glVar;
        this.f29196c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f29194a) {
            case 0:
                gl.S(this.f29195b, this.f29196c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f29196c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vk(this.f29195b, iMapView, 0));
                return;
        }
    }
}
