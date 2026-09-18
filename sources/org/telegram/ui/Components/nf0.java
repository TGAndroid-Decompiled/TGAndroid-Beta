package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class nf0 implements Runnable {
    public final int f26453a;
    public final pf0 f26454b;

    public nf0(pf0 pf0Var, int i10) {
        this.f26453a = i10;
        this.f26454b = pf0Var;
    }

    @Override
    public final void run() {
        switch (this.f26453a) {
            case 0:
                org.telegram.ui.ku0 ku0Var = this.f26454b.f27023a;
                RadialProgressView radialProgressView = ku0Var.f27285n;
                View view = ku0Var.f27286r;
                radialProgressView.setVisibility(4);
                if (ku0Var.F) {
                    ku0Var.F = false;
                    ku0Var.setPlaybackSpeed(ku0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = ku0Var.f27282b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f26454b.f27023a.h.setVisibility(4);
                return;
        }
    }
}
