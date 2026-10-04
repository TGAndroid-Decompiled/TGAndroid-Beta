package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class yk implements Runnable {
    public final int f33165a;
    public final jl f33166b;
    public final IMapsProvider.IMapView f33167c;

    public yk(jl jlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f33165a = i10;
        this.f33166b = jlVar;
        this.f33167c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f33165a) {
            case 0:
                jl.Q(this.f33166b, this.f33167c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f33167c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new yk(this.f33166b, iMapView, 0));
                return;
        }
    }
}
