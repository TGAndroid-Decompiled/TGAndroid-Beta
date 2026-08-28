package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class we0 implements Runnable {
    public final int f34218a;
    public final ye0 f34219b;

    public we0(ye0 ye0Var, int i9) {
        this.f34218a = i9;
        this.f34219b = ye0Var;
    }

    @Override
    public final void run() {
        switch (this.f34218a) {
            case 0:
                org.telegram.ui.gt0 gt0Var = this.f34219b.f34958a;
                RadialProgressView radialProgressView = gt0Var.f35291n;
                View view = gt0Var.f35292r;
                radialProgressView.setVisibility(4);
                if (gt0Var.B) {
                    gt0Var.B = false;
                    gt0Var.setPlaybackSpeed(gt0Var.A);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = gt0Var.f35287b;
                if (photoViewer != null) {
                    photoViewer.y0();
                    return;
                }
                return;
            default:
                this.f34219b.f34958a.h.setVisibility(4);
                return;
        }
    }
}
