package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class vk implements Runnable {
    public final int f31349a;
    public final gl f31350b;
    public final IMapsProvider.IMapView f31351c;

    public vk(gl glVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f31349a = i10;
        this.f31350b = glVar;
        this.f31351c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f31349a) {
            case 0:
                gl.S(this.f31350b, this.f31351c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f31351c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vk(this.f31350b, iMapView, 0));
                return;
        }
    }
}
