package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class xd0 implements Runnable {
    public final int f40239a;
    public final zd0 f40240b;

    public xd0(zd0 zd0Var, int i7) {
        this.f40239a = i7;
        this.f40240b = zd0Var;
    }

    @Override
    public final void run() {
        switch (this.f40239a) {
            case 0:
                org.telegram.ui.bq0 bq0Var = this.f40240b.f40892a;
                RadialProgressView radialProgressView = bq0Var.f31780n;
                View view = bq0Var.f31781r;
                radialProgressView.setVisibility(4);
                if (bq0Var.F) {
                    bq0Var.F = false;
                    bq0Var.setPlaybackSpeed(bq0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = bq0Var.f31776b;
                if (photoViewer != null) {
                    photoViewer.s0();
                    return;
                }
                return;
            default:
                this.f40240b.f40892a.h.setVisibility(4);
                return;
        }
    }
}
