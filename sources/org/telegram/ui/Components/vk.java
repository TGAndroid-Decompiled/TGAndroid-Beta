package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class vk implements Runnable {
    public final int f31376a;
    public final gl f31377b;
    public final IMapsProvider.IMapView f31378c;

    public vk(gl glVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f31376a = i10;
        this.f31377b = glVar;
        this.f31378c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f31376a) {
            case 0:
                gl.S(this.f31377b, this.f31378c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f31378c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vk(this.f31377b, iMapView, 0));
                return;
        }
    }
}
