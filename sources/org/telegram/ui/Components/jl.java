package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class jl implements Runnable {
    public final int f26402a;
    public final ul f26403b;
    public final IMapsProvider.IMapView f26404c;

    public jl(ul ulVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f26402a = i10;
        this.f26403b = ulVar;
        this.f26404c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f26402a) {
            case 0:
                ul.V(this.f26403b, this.f26404c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f26404c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new jl(this.f26403b, iMapView, 0));
                return;
        }
    }
}
