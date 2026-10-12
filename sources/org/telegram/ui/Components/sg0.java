package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class sg0 implements Runnable {
    public final int f30561a;
    public final ug0 f30562b;

    public sg0(ug0 ug0Var, int i10) {
        this.f30561a = i10;
        this.f30562b = ug0Var;
    }

    @Override
    public final void run() {
        switch (this.f30561a) {
            case 0:
                org.telegram.ui.lu0 lu0Var = this.f30562b.f31160a;
                RadialProgressView radialProgressView = lu0Var.f31509n;
                View view = lu0Var.f31510r;
                radialProgressView.setVisibility(4);
                if (lu0Var.F) {
                    lu0Var.F = false;
                    lu0Var.setPlaybackSpeed(lu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = lu0Var.f31505b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f30562b.f31160a.h.setVisibility(4);
                return;
        }
    }
}
