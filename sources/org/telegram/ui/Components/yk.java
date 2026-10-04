package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class yk implements Runnable {
    public final int f33164a;
    public final jl f33165b;
    public final IMapsProvider.IMapView f33166c;

    public yk(jl jlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f33164a = i10;
        this.f33165b = jlVar;
        this.f33166c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f33164a) {
            case 0:
                jl.Q(this.f33165b, this.f33166c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f33166c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new yk(this.f33165b, iMapView, 0));
                return;
        }
    }
}
