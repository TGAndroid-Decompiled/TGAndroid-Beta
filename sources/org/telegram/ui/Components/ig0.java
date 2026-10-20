package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class ig0 implements Runnable {
    public final int f27272a;
    public final kg0 f27273b;

    public ig0(kg0 kg0Var, int i10) {
        this.f27272a = i10;
        this.f27273b = kg0Var;
    }

    @Override
    public final void run() {
        switch (this.f27272a) {
            case 0:
                org.telegram.ui.ot0 ot0Var = this.f27273b.f27874a;
                RadialProgressView radialProgressView = ot0Var.f28155n;
                View view = ot0Var.f28156r;
                radialProgressView.setVisibility(4);
                if (ot0Var.F) {
                    ot0Var.F = false;
                    ot0Var.setPlaybackSpeed(ot0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = ot0Var.f28152b;
                if (photoViewer != null) {
                    photoViewer.A0();
                    return;
                }
                return;
            default:
                this.f27273b.f27874a.h.setVisibility(4);
                return;
        }
    }
}
