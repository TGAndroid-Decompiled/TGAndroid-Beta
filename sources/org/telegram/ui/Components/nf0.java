package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class nf0 implements Runnable {
    public final int f26447a;
    public final pf0 f26448b;

    public nf0(pf0 pf0Var, int i10) {
        this.f26447a = i10;
        this.f26448b = pf0Var;
    }

    @Override
    public final void run() {
        switch (this.f26447a) {
            case 0:
                org.telegram.ui.iu0 iu0Var = this.f26448b.f27030a;
                RadialProgressView radialProgressView = iu0Var.f27323n;
                View view = iu0Var.f27324r;
                radialProgressView.setVisibility(4);
                if (iu0Var.F) {
                    iu0Var.F = false;
                    iu0Var.setPlaybackSpeed(iu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = iu0Var.f27320b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f26448b.f27030a.h.setVisibility(4);
                return;
        }
    }
}
