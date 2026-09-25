package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class xf0 implements Runnable {
    public final int f30328a;
    public final zf0 f30329b;

    public xf0(zf0 zf0Var, int i10) {
        this.f30328a = i10;
        this.f30329b = zf0Var;
    }

    @Override
    public final void run() {
        switch (this.f30328a) {
            case 0:
                org.telegram.ui.au0 au0Var = this.f30329b.f30866a;
                RadialProgressView radialProgressView = au0Var.f22680n;
                View view = au0Var.f22681r;
                radialProgressView.setVisibility(4);
                if (au0Var.F) {
                    au0Var.F = false;
                    au0Var.setPlaybackSpeed(au0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = au0Var.f22677b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f30329b.f30866a.h.setVisibility(4);
                return;
        }
    }
}
