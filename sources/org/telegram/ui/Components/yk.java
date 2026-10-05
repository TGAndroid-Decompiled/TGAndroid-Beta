package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class yk implements Runnable {
    public final int f33288a;
    public final jl f33289b;
    public final IMapsProvider.IMapView f33290c;

    public yk(jl jlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f33288a = i10;
        this.f33289b = jlVar;
        this.f33290c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f33288a) {
            case 0:
                jl.Q(this.f33289b, this.f33290c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f33290c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new yk(this.f33289b, iMapView, 0));
                return;
        }
    }
}
