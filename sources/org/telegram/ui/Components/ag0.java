package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class ag0 implements Runnable {
    public final int f24523a;
    public final cg0 f24524b;

    public ag0(cg0 cg0Var, int i10) {
        this.f24523a = i10;
        this.f24524b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f24523a) {
            case 0:
                org.telegram.ui.du0 du0Var = this.f24524b.f25363a;
                RadialProgressView radialProgressView = du0Var.f25720n;
                View view = du0Var.f25721r;
                radialProgressView.setVisibility(4);
                if (du0Var.F) {
                    du0Var.F = false;
                    du0Var.setPlaybackSpeed(du0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = du0Var.f25716b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f24524b.f25363a.h.setVisibility(4);
                return;
        }
    }
}
