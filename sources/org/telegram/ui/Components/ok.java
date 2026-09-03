package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class ok implements Runnable {
    public final int f27584a;
    public final al f27585b;
    public final IMapsProvider.IMapView f27586c;

    public ok(al alVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f27584a = i10;
        this.f27585b = alVar;
        this.f27586c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f27584a) {
            case 0:
                al.S(this.f27585b, this.f27586c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f27586c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ok(this.f27585b, iMapView, 0));
                return;
        }
    }
}
