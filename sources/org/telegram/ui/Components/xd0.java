package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class xd0 implements Runnable {
    public final int f41663a;
    public final zd0 f41664b;

    public xd0(zd0 zd0Var, int i7) {
        this.f41663a = i7;
        this.f41664b = zd0Var;
    }

    @Override
    public final void run() {
        switch (this.f41663a) {
            case 0:
                org.telegram.ui.bq0 bq0Var = this.f41664b.f42342a;
                RadialProgressView radialProgressView = bq0Var.f32973n;
                View view = bq0Var.f32974r;
                radialProgressView.setVisibility(4);
                if (bq0Var.G) {
                    bq0Var.G = false;
                    bq0Var.setPlaybackSpeed(bq0Var.F);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = bq0Var.f32969b;
                if (photoViewer != null) {
                    photoViewer.s0();
                    return;
                }
                return;
            default:
                this.f41664b.f42342a.h.setVisibility(4);
                return;
        }
    }
}
