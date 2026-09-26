package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class xf0 implements Runnable {
    public final int f30327a;
    public final zf0 f30328b;

    public xf0(zf0 zf0Var, int i10) {
        this.f30327a = i10;
        this.f30328b = zf0Var;
    }

    @Override
    public final void run() {
        switch (this.f30327a) {
            case 0:
                org.telegram.ui.au0 au0Var = this.f30328b.f30865a;
                RadialProgressView radialProgressView = au0Var.f22679n;
                View view = au0Var.f22680r;
                radialProgressView.setVisibility(4);
                if (au0Var.F) {
                    au0Var.F = false;
                    au0Var.setPlaybackSpeed(au0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = au0Var.f22676b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f30328b.f30865a.h.setVisibility(4);
                return;
        }
    }
}
