package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class wf0 implements Runnable {
    public final int f30033a;
    public final yf0 f30034b;

    public wf0(yf0 yf0Var, int i10) {
        this.f30033a = i10;
        this.f30034b = yf0Var;
    }

    @Override
    public final void run() {
        switch (this.f30033a) {
            case 0:
                org.telegram.ui.iu0 iu0Var = this.f30034b.f30569a;
                RadialProgressView radialProgressView = iu0Var.f30787n;
                View view = iu0Var.f30788r;
                radialProgressView.setVisibility(4);
                if (iu0Var.F) {
                    iu0Var.F = false;
                    iu0Var.setPlaybackSpeed(iu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = iu0Var.f30784b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f30034b.f30569a.h.setVisibility(4);
                return;
        }
    }
}
