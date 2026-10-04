package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class yk implements Runnable {
    public final int f33171a;
    public final jl f33172b;
    public final IMapsProvider.IMapView f33173c;

    public yk(jl jlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f33171a = i10;
        this.f33172b = jlVar;
        this.f33173c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f33171a) {
            case 0:
                jl.Q(this.f33172b, this.f33173c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f33173c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new yk(this.f33172b, iMapView, 0));
                return;
        }
    }
}
