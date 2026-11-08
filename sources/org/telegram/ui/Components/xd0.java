package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class xd0 implements Runnable {
    public final int f40295a;
    public final zd0 f40296b;

    public xd0(zd0 zd0Var, int i7) {
        this.f40295a = i7;
        this.f40296b = zd0Var;
    }

    @Override
    public final void run() {
        switch (this.f40295a) {
            case 0:
                org.telegram.ui.cq0 cq0Var = this.f40296b.f40956a;
                RadialProgressView radialProgressView = cq0Var.f31797n;
                View view = cq0Var.f31798r;
                radialProgressView.setVisibility(4);
                if (cq0Var.F) {
                    cq0Var.F = false;
                    cq0Var.setPlaybackSpeed(cq0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = cq0Var.f31793b;
                if (photoViewer != null) {
                    photoViewer.s0();
                    return;
                }
                return;
            default:
                this.f40296b.f40956a.h.setVisibility(4);
                return;
        }
    }
}
