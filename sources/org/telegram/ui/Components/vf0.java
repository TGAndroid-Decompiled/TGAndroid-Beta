package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class vf0 implements Runnable {
    public final int f29071a;
    public final xf0 f29072b;

    public vf0(xf0 xf0Var, int i10) {
        this.f29071a = i10;
        this.f29072b = xf0Var;
    }

    @Override
    public final void run() {
        switch (this.f29071a) {
            case 0:
                org.telegram.ui.iu0 iu0Var = this.f29072b.f30258a;
                RadialProgressView radialProgressView = iu0Var.f30517n;
                View view = iu0Var.f30518r;
                radialProgressView.setVisibility(4);
                if (iu0Var.F) {
                    iu0Var.F = false;
                    iu0Var.setPlaybackSpeed(iu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = iu0Var.f30514b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f29072b.f30258a.h.setVisibility(4);
                return;
        }
    }
}
