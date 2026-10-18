package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class hg0 implements Runnable {
    public final int f26882a;
    public final jg0 f26883b;

    public hg0(jg0 jg0Var, int i10) {
        this.f26882a = i10;
        this.f26883b = jg0Var;
    }

    @Override
    public final void run() {
        switch (this.f26882a) {
            case 0:
                org.telegram.ui.qt0 qt0Var = this.f26883b.f27523a;
                RadialProgressView radialProgressView = qt0Var.f27867n;
                View view = qt0Var.f27868r;
                radialProgressView.setVisibility(4);
                if (qt0Var.F) {
                    qt0Var.F = false;
                    qt0Var.setPlaybackSpeed(qt0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = qt0Var.f27864b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f26883b.f27523a.h.setVisibility(4);
                return;
        }
    }
}
