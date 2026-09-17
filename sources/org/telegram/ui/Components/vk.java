package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class vk implements Runnable {
    public final int f31350a;
    public final gl f31351b;
    public final IMapsProvider.IMapView f31352c;

    public vk(gl glVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f31350a = i10;
        this.f31351b = glVar;
        this.f31352c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f31350a) {
            case 0:
                gl.S(this.f31351b, this.f31352c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f31352c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vk(this.f31351b, iMapView, 0));
                return;
        }
    }
}
