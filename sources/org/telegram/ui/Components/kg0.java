package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class kg0 implements Runnable {
    public final int f29956a;
    public final mg0 f29957b;

    public kg0(mg0 mg0Var, int i10) {
        this.f29956a = i10;
        this.f29957b = mg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29956a) {
            case 0:
                org.telegram.ui.xt0 xt0Var = this.f29957b.f30537a;
                RadialProgressView radialProgressView = xt0Var.f30910n;
                View view = xt0Var.f30911r;
                radialProgressView.setVisibility(4);
                if (xt0Var.F) {
                    xt0Var.F = false;
                    xt0Var.setPlaybackSpeed(xt0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = xt0Var.f30907b;
                if (photoViewer != null) {
                    photoViewer.A0();
                    return;
                }
                return;
            default:
                this.f29957b.f30537a.h.setVisibility(4);
                return;
        }
    }
}
