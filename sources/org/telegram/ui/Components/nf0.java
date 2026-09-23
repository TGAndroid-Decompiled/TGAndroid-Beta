package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class nf0 implements Runnable {
    public final int f26419a;
    public final pf0 f26420b;

    public nf0(pf0 pf0Var, int i10) {
        this.f26419a = i10;
        this.f26420b = pf0Var;
    }

    @Override
    public final void run() {
        switch (this.f26419a) {
            case 0:
                org.telegram.ui.bu0 bu0Var = this.f26420b.f27020a;
                RadialProgressView radialProgressView = bu0Var.f27333n;
                View view = bu0Var.f27334r;
                radialProgressView.setVisibility(4);
                if (bu0Var.F) {
                    bu0Var.F = false;
                    bu0Var.setPlaybackSpeed(bu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = bu0Var.f27330b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f26420b.f27020a.h.setVisibility(4);
                return;
        }
    }
}
