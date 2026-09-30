package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class yk implements Runnable {
    public final int f30728a;
    public final jl f30729b;
    public final IMapsProvider.IMapView f30730c;

    public yk(jl jlVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f30728a = i10;
        this.f30729b = jlVar;
        this.f30730c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f30728a) {
            case 0:
                jl.S(this.f30729b, this.f30730c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f30730c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new yk(this.f30729b, iMapView, 0));
                return;
        }
    }
}
