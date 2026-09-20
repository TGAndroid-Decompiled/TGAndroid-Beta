package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class vk implements Runnable {
    public final int f29170a;
    public final gl f29171b;
    public final IMapsProvider.IMapView f29172c;

    public vk(gl glVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f29170a = i10;
        this.f29171b = glVar;
        this.f29172c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f29170a) {
            case 0:
                gl.S(this.f29171b, this.f29172c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f29172c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vk(this.f29171b, iMapView, 0));
                return;
        }
    }
}
