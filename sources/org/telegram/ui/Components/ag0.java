package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class ag0 implements Runnable {
    public final int f24522a;
    public final cg0 f24523b;

    public ag0(cg0 cg0Var, int i10) {
        this.f24522a = i10;
        this.f24523b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f24522a) {
            case 0:
                org.telegram.ui.du0 du0Var = this.f24523b.f25362a;
                RadialProgressView radialProgressView = du0Var.f25719n;
                View view = du0Var.f25720r;
                radialProgressView.setVisibility(4);
                if (du0Var.F) {
                    du0Var.F = false;
                    du0Var.setPlaybackSpeed(du0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = du0Var.f25715b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f24523b.f25362a.h.setVisibility(4);
                return;
        }
    }
}
