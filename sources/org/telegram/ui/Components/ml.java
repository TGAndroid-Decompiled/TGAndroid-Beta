package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class ml implements Runnable {
    public final int f28873a;
    public final xl f28874b;
    public final IMapsProvider.IMapView f28875c;

    public ml(xl xlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f28873a = i10;
        this.f28874b = xlVar;
        this.f28875c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f28873a) {
            case 0:
                xl.V(this.f28874b, this.f28875c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f28875c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ml(this.f28874b, iMapView, 0));
                return;
        }
    }
}
