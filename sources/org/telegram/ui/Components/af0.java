package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

public final class af0 implements Runnable {

    public final int f26737a;

    public final cf0 f26738b;

    public af0(cf0 cf0Var, int i10) {
        this.f26737a = i10;
        this.f26738b = cf0Var;
    }

    @Override
    public final void run() {
        switch (this.f26737a) {
            case 0:
                org.telegram.ui.ht0 ht0Var = this.f26738b.f27413a;
                RadialProgressView radialProgressView = ht0Var.f27742n;
                View view = ht0Var.f27743r;
                radialProgressView.setVisibility(4);
                if (ht0Var.B) {
                    ht0Var.B = false;
                    ht0Var.setPlaybackSpeed(ht0Var.A);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = ht0Var.f27738b;
                if (photoViewer != null) {
                    photoViewer.z0();
                }
                break;
            default:
                this.f26738b.f27413a.h.setVisibility(4);
                break;
        }
    }
}
