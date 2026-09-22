package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class yf0 implements Runnable {
    public final int f30645a;
    public final ag0 f30646b;

    public yf0(ag0 ag0Var, int i10) {
        this.f30645a = i10;
        this.f30646b = ag0Var;
    }

    @Override
    public final void run() {
        switch (this.f30645a) {
            case 0:
                org.telegram.ui.iu0 iu0Var = this.f30646b.f22654a;
                RadialProgressView radialProgressView = iu0Var.f22987n;
                View view = iu0Var.f22988r;
                radialProgressView.setVisibility(4);
                if (iu0Var.F) {
                    iu0Var.F = false;
                    iu0Var.setPlaybackSpeed(iu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = iu0Var.f22984b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f30646b.f22654a.h.setVisibility(4);
                return;
        }
    }
}
