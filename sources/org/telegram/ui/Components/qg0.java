package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class qg0 implements Runnable {
    public final int f30203a;
    public final sg0 f30204b;

    public qg0(sg0 sg0Var, int i10) {
        this.f30203a = i10;
        this.f30204b = sg0Var;
    }

    @Override
    public final void run() {
        switch (this.f30203a) {
            case 0:
                org.telegram.ui.ju0 ju0Var = this.f30204b.f30782a;
                RadialProgressView radialProgressView = ju0Var.f31125n;
                View view = ju0Var.f31126r;
                radialProgressView.setVisibility(4);
                if (ju0Var.F) {
                    ju0Var.F = false;
                    ju0Var.setPlaybackSpeed(ju0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = ju0Var.f31121b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f30204b.f30782a.h.setVisibility(4);
                return;
        }
    }
}
