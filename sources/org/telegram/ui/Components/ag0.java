package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class ag0 implements Runnable {
    public final int f24527a;
    public final cg0 f24528b;

    public ag0(cg0 cg0Var, int i10) {
        this.f24527a = i10;
        this.f24528b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f24527a) {
            case 0:
                org.telegram.ui.du0 du0Var = this.f24528b.f25368a;
                RadialProgressView radialProgressView = du0Var.f25725n;
                View view = du0Var.f25726r;
                radialProgressView.setVisibility(4);
                if (du0Var.F) {
                    du0Var.F = false;
                    du0Var.setPlaybackSpeed(du0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = du0Var.f25721b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f24528b.f25368a.h.setVisibility(4);
                return;
        }
    }
}
