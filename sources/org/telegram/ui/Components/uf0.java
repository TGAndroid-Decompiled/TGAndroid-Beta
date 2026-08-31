package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class uf0 implements Runnable {
    public final int f31672a;
    public final wf0 f31673b;

    public uf0(wf0 wf0Var, int i10) {
        this.f31672a = i10;
        this.f31673b = wf0Var;
    }

    @Override
    public final void run() {
        switch (this.f31672a) {
            case 0:
                org.telegram.ui.pt0 pt0Var = this.f31673b.f32741a;
                RadialProgressView radialProgressView = pt0Var.f33064n;
                View view = pt0Var.f33065r;
                radialProgressView.setVisibility(4);
                if (pt0Var.C) {
                    pt0Var.C = false;
                    pt0Var.setPlaybackSpeed(pt0Var.B);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = pt0Var.f33060b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f31673b.f32741a.h.setVisibility(4);
                return;
        }
    }
}
