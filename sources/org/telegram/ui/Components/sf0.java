package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class sf0 implements Runnable {
    public final int f28705a;
    public final uf0 f28706b;

    public sf0(uf0 uf0Var, int i10) {
        this.f28705a = i10;
        this.f28706b = uf0Var;
    }

    @Override
    public final void run() {
        switch (this.f28705a) {
            case 0:
                org.telegram.ui.nt0 nt0Var = this.f28706b.f29212a;
                RadialProgressView radialProgressView = nt0Var.f29452n;
                View view = nt0Var.f29453r;
                radialProgressView.setVisibility(4);
                if (nt0Var.C) {
                    nt0Var.C = false;
                    nt0Var.setPlaybackSpeed(nt0Var.B);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = nt0Var.f29449b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f28706b.f29212a.h.setVisibility(4);
                return;
        }
    }
}
