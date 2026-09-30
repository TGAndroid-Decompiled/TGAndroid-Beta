package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class xk implements Runnable {
    public final int f30392a;
    public final il f30393b;
    public final IMapsProvider.IMapView f30394c;

    public xk(il ilVar, IMapsProvider.IMapView iMapView, int i10) {
        this.f30392a = i10;
        this.f30393b = ilVar;
        this.f30394c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f30392a) {
            case 0:
                il.S(this.f30393b, this.f30394c);
                return;
            default:
                IMapsProvider.IMapView iMapView = this.f30394c;
                try {
                    iMapView.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new xk(this.f30393b, iMapView, 0));
                return;
        }
    }
}
