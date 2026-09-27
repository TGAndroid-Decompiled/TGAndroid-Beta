package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class yf0 implements Runnable {
    public final int f30659a;
    public final ag0 f30660b;

    public yf0(ag0 ag0Var, int i10) {
        this.f30659a = i10;
        this.f30660b = ag0Var;
    }

    @Override
    public final void run() {
        switch (this.f30659a) {
            case 0:
                org.telegram.ui.du0 du0Var = this.f30660b.f22675a;
                RadialProgressView radialProgressView = du0Var.f23014n;
                View view = du0Var.f23015r;
                radialProgressView.setVisibility(4);
                if (du0Var.F) {
                    du0Var.F = false;
                    du0Var.setPlaybackSpeed(du0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = du0Var.f23011b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f30660b.f22675a.h.setVisibility(4);
                return;
        }
    }
}
