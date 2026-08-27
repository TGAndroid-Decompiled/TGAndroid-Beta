package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

public final class ik implements Runnable {

    public final int f29377a;

    public final tk f29378b;

    public final IMapsProvider.IMapView f29379c;

    public ik(tk tkVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f29377a = i10;
        this.f29378b = tkVar;
        this.f29379c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f29377a) {
            case 0:
                tk.S(this.f29378b, this.f29379c);
                break;
            default:
                IMapsProvider.IMapView iMapView = this.f29379c;
                try {
                    iMapView.onCreate(null);
                    break;
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ik(this.f29378b, iMapView, 0));
                break;
        }
    }
}
