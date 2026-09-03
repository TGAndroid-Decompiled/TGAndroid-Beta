package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class uf0 implements Runnable {
    public final int f31626a;
    public final wf0 f31627b;

    public uf0(wf0 wf0Var, int i10) {
        this.f31626a = i10;
        this.f31627b = wf0Var;
    }

    @Override
    public final void run() {
        switch (this.f31626a) {
            case 0:
                org.telegram.ui.ut0 ut0Var = this.f31627b.f32746a;
                RadialProgressView radialProgressView = ut0Var.f33058n;
                View view = ut0Var.f33059r;
                radialProgressView.setVisibility(4);
                if (ut0Var.C) {
                    ut0Var.C = false;
                    ut0Var.setPlaybackSpeed(ut0Var.B);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = ut0Var.f33054b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f31627b.f32746a.h.setVisibility(4);
                return;
        }
    }
}
