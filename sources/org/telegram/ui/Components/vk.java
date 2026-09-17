package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class vk implements Runnable {
    public final int f28815a;
    public final gl f28816b;
    public final IMapsProvider.IMapView f28817c;

    public vk(gl glVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f28815a = i10;
        this.f28816b = glVar;
        this.f28817c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f28815a) {
            case 0:
                gl.S(this.f28816b, this.f28817c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f28817c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vk(this.f28816b, iMapView, 0));
                return;
        }
    }
}
