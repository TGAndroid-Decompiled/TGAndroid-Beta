package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class qg0 implements Runnable {
    public final int f30237a;
    public final sg0 f30238b;

    public qg0(sg0 sg0Var, int i10) {
        this.f30237a = i10;
        this.f30238b = sg0Var;
    }

    @Override
    public final void run() {
        switch (this.f30237a) {
            case 0:
                org.telegram.ui.iu0 iu0Var = this.f30238b.f30862a;
                RadialProgressView radialProgressView = iu0Var.f31244n;
                View view = iu0Var.f31245r;
                radialProgressView.setVisibility(4);
                if (iu0Var.F) {
                    iu0Var.F = false;
                    iu0Var.setPlaybackSpeed(iu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = iu0Var.f31240b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f30238b.f30862a.h.setVisibility(4);
                return;
        }
    }
}
