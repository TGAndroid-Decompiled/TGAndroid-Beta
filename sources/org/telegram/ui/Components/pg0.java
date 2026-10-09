package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class pg0 implements Runnable {
    public final int f29861a;
    public final rg0 f29862b;

    public pg0(rg0 rg0Var, int i10) {
        this.f29861a = i10;
        this.f29862b = rg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29861a) {
            case 0:
                org.telegram.ui.ju0 ju0Var = this.f29862b.f30440a;
                RadialProgressView radialProgressView = ju0Var.f30787n;
                View view = ju0Var.f30788r;
                radialProgressView.setVisibility(4);
                if (ju0Var.F) {
                    ju0Var.F = false;
                    ju0Var.setPlaybackSpeed(ju0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = ju0Var.f30783b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f29862b.f30440a.h.setVisibility(4);
                return;
        }
    }
}
