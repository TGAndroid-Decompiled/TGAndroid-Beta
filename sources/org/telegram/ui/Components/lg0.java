package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class lg0 implements Runnable {
    public final int f28335a;
    public final ng0 f28336b;

    public lg0(ng0 ng0Var, int i10) {
        this.f28335a = i10;
        this.f28336b = ng0Var;
    }

    @Override
    public final void run() {
        switch (this.f28335a) {
            case 0:
                org.telegram.ui.qt0 qt0Var = this.f28336b.f28906a;
                RadialProgressView radialProgressView = qt0Var.f29273n;
                View view = qt0Var.f29274r;
                radialProgressView.setVisibility(4);
                if (qt0Var.F) {
                    qt0Var.F = false;
                    qt0Var.setPlaybackSpeed(qt0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = qt0Var.f29270b;
                if (photoViewer != null) {
                    photoViewer.A0();
                    return;
                }
                return;
            default:
                this.f28336b.f28906a.h.setVisibility(4);
                return;
        }
    }
}
