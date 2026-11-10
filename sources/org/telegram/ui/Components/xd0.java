package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class xd0 implements Runnable {
    public final int f40290a;
    public final zd0 f40291b;

    public xd0(zd0 zd0Var, int i7) {
        this.f40290a = i7;
        this.f40291b = zd0Var;
    }

    @Override
    public final void run() {
        switch (this.f40290a) {
            case 0:
                org.telegram.ui.fq0 fq0Var = this.f40291b.f40919a;
                RadialProgressView radialProgressView = fq0Var.f31846n;
                View view = fq0Var.f31847r;
                radialProgressView.setVisibility(4);
                if (fq0Var.F) {
                    fq0Var.F = false;
                    fq0Var.setPlaybackSpeed(fq0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = fq0Var.f31842b;
                if (photoViewer != null) {
                    photoViewer.s0();
                    return;
                }
                return;
            default:
                this.f40291b.f40919a.h.setVisibility(4);
                return;
        }
    }
}
