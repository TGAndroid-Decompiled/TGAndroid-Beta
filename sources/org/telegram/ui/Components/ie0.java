package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class ie0 implements Runnable {
    public final int f36243a;
    public final ke0 f36244b;

    public ie0(ke0 ke0Var, int i7) {
        this.f36243a = i7;
        this.f36244b = ke0Var;
    }

    @Override
    public final void run() {
        switch (this.f36243a) {
            case 0:
                org.telegram.ui.dq0 dq0Var = this.f36244b.f36896a;
                RadialProgressView radialProgressView = dq0Var.f37172n;
                View view = dq0Var.f37173r;
                radialProgressView.setVisibility(4);
                if (dq0Var.G) {
                    dq0Var.G = false;
                    dq0Var.setPlaybackSpeed(dq0Var.F);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = dq0Var.f37168b;
                if (photoViewer != null) {
                    photoViewer.s0();
                    return;
                }
                return;
            default:
                this.f36244b.f36896a.h.setVisibility(4);
                return;
        }
    }
}
