package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class vk implements Runnable {
    public final int f28820a;
    public final gl f28821b;
    public final IMapsProvider.IMapView f28822c;

    public vk(gl glVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f28820a = i10;
        this.f28821b = glVar;
        this.f28822c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f28820a) {
            case 0:
                gl.S(this.f28821b, this.f28822c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f28822c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vk(this.f28821b, iMapView, 0));
                return;
        }
    }
}
