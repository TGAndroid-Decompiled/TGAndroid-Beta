package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class wf0 implements Runnable {
    public final int f28764a;
    public final yf0 f28765b;

    public wf0(yf0 yf0Var, int i10) {
        this.f28764a = i10;
        this.f28765b = yf0Var;
    }

    @Override
    public final void run() {
        switch (this.f28764a) {
            case 0:
                org.telegram.ui.hu0 hu0Var = this.f28765b.f29318a;
                RadialProgressView radialProgressView = hu0Var.f29662n;
                View view = hu0Var.f29663r;
                radialProgressView.setVisibility(4);
                if (hu0Var.F) {
                    hu0Var.F = false;
                    hu0Var.setPlaybackSpeed(hu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = hu0Var.f29659b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f28765b.f29318a.h.setVisibility(4);
                return;
        }
    }
}
