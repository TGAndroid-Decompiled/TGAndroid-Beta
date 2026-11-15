package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class xd0 implements Runnable {
    public final int f41655a;
    public final zd0 f41656b;

    public xd0(zd0 zd0Var, int i7) {
        this.f41655a = i7;
        this.f41656b = zd0Var;
    }

    @Override
    public final void run() {
        switch (this.f41655a) {
            case 0:
                org.telegram.ui.bq0 bq0Var = this.f41656b.f42342a;
                RadialProgressView radialProgressView = bq0Var.f32976n;
                View view = bq0Var.f32977r;
                radialProgressView.setVisibility(4);
                if (bq0Var.G) {
                    bq0Var.G = false;
                    bq0Var.setPlaybackSpeed(bq0Var.F);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = bq0Var.f32972b;
                if (photoViewer != null) {
                    photoViewer.s0();
                    return;
                }
                return;
            default:
                this.f41656b.f42342a.h.setVisibility(4);
                return;
        }
    }
}
