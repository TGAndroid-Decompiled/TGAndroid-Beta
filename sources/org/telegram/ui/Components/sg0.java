package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class sg0 implements Runnable {
    public final int f30565a;
    public final ug0 f30566b;

    public sg0(ug0 ug0Var, int i10) {
        this.f30565a = i10;
        this.f30566b = ug0Var;
    }

    @Override
    public final void run() {
        switch (this.f30565a) {
            case 0:
                org.telegram.ui.lu0 lu0Var = this.f30566b.f31165a;
                RadialProgressView radialProgressView = lu0Var.f31508n;
                View view = lu0Var.f31509r;
                radialProgressView.setVisibility(4);
                if (lu0Var.F) {
                    lu0Var.F = false;
                    lu0Var.setPlaybackSpeed(lu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = lu0Var.f31504b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f30566b.f31165a.h.setVisibility(4);
                return;
        }
    }
}
