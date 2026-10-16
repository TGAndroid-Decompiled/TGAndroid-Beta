package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class og0 implements Runnable {
    public final int f27643a;
    public final qg0 f27644b;

    public og0(qg0 qg0Var, int i10) {
        this.f27643a = i10;
        this.f27644b = qg0Var;
    }

    @Override
    public final void run() {
        switch (this.f27643a) {
            case 0:
                org.telegram.ui.ou0 ou0Var = this.f27644b.f28282a;
                RadialProgressView radialProgressView = ou0Var.f28527n;
                View view = ou0Var.f28528r;
                radialProgressView.setVisibility(4);
                if (ou0Var.F) {
                    ou0Var.F = false;
                    ou0Var.setPlaybackSpeed(ou0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = ou0Var.f28524b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f27644b.f28282a.h.setVisibility(4);
                return;
        }
    }
}
