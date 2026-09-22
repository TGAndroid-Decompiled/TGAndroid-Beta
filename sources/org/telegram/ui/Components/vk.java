package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class vk implements Runnable {
    public final int f28817a;
    public final gl f28818b;
    public final IMapsProvider.IMapView f28819c;

    public vk(gl glVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f28817a = i10;
        this.f28818b = glVar;
        this.f28819c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f28817a) {
            case 0:
                gl.S(this.f28818b, this.f28819c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f28819c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vk(this.f28818b, iMapView, 0));
                return;
        }
    }
}
