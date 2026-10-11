package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class rg0 implements Runnable {
    public final int f30454a;
    public final tg0 f30455b;

    public rg0(tg0 tg0Var, int i10) {
        this.f30454a = i10;
        this.f30455b = tg0Var;
    }

    @Override
    public final void run() {
        switch (this.f30454a) {
            case 0:
                org.telegram.ui.iu0 iu0Var = this.f30455b.f31092a;
                RadialProgressView radialProgressView = iu0Var.f31441n;
                View view = iu0Var.f31442r;
                radialProgressView.setVisibility(4);
                if (iu0Var.F) {
                    iu0Var.F = false;
                    iu0Var.setPlaybackSpeed(iu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = iu0Var.f31437b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f30455b.f31092a.h.setVisibility(4);
                return;
        }
    }
}
