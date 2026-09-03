package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class tf0 implements Runnable {
    public final int f28983a;
    public final vf0 f28984b;

    public tf0(vf0 vf0Var, int i10) {
        this.f28983a = i10;
        this.f28984b = vf0Var;
    }

    @Override
    public final void run() {
        switch (this.f28983a) {
            case 0:
                org.telegram.ui.ut0 ut0Var = this.f28984b.f29469a;
                RadialProgressView radialProgressView = ut0Var.f30241n;
                View view = ut0Var.f30242r;
                radialProgressView.setVisibility(4);
                if (ut0Var.C) {
                    ut0Var.C = false;
                    ut0Var.setPlaybackSpeed(ut0Var.B);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = ut0Var.f30238b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f28984b.f29469a.h.setVisibility(4);
                return;
        }
    }
}
