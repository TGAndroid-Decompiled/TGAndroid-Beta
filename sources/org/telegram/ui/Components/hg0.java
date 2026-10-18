package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class hg0 implements Runnable {
    public final int f26889a;
    public final jg0 f26890b;

    public hg0(jg0 jg0Var, int i10) {
        this.f26889a = i10;
        this.f26890b = jg0Var;
    }

    @Override
    public final void run() {
        switch (this.f26889a) {
            case 0:
                org.telegram.ui.qt0 qt0Var = this.f26890b.f27530a;
                RadialProgressView radialProgressView = qt0Var.f27874n;
                View view = qt0Var.f27875r;
                radialProgressView.setVisibility(4);
                if (qt0Var.F) {
                    qt0Var.F = false;
                    qt0Var.setPlaybackSpeed(qt0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = qt0Var.f27871b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f26890b.f27530a.h.setVisibility(4);
                return;
        }
    }
}
