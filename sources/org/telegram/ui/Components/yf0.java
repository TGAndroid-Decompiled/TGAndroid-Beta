package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class yf0 implements Runnable {
    public final int f30637a;
    public final ag0 f30638b;

    public yf0(ag0 ag0Var, int i10) {
        this.f30637a = i10;
        this.f30638b = ag0Var;
    }

    @Override
    public final void run() {
        switch (this.f30637a) {
            case 0:
                org.telegram.ui.au0 au0Var = this.f30638b.f22640a;
                RadialProgressView radialProgressView = au0Var.f23008n;
                View view = au0Var.f23009r;
                radialProgressView.setVisibility(4);
                if (au0Var.F) {
                    au0Var.F = false;
                    au0Var.setPlaybackSpeed(au0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = au0Var.f23005b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f30638b.f22640a.h.setVisibility(4);
                return;
        }
    }
}
