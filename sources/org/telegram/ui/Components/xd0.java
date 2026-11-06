package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class xd0 implements Runnable {
    public final int f40274a;
    public final zd0 f40275b;

    public xd0(zd0 zd0Var, int i7) {
        this.f40274a = i7;
        this.f40275b = zd0Var;
    }

    @Override
    public final void run() {
        switch (this.f40274a) {
            case 0:
                org.telegram.ui.cq0 cq0Var = this.f40275b.f40937a;
                RadialProgressView radialProgressView = cq0Var.f31788n;
                View view = cq0Var.f31789r;
                radialProgressView.setVisibility(4);
                if (cq0Var.F) {
                    cq0Var.F = false;
                    cq0Var.setPlaybackSpeed(cq0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = cq0Var.f31784b;
                if (photoViewer != null) {
                    photoViewer.s0();
                    return;
                }
                return;
            default:
                this.f40275b.f40937a.h.setVisibility(4);
                return;
        }
    }
}
