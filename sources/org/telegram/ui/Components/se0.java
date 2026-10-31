package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class se0 implements Runnable {
    public final int f30231a;
    public final ue0 f30232b;

    public se0(ue0 ue0Var, int i10) {
        this.f30231a = i10;
        this.f30232b = ue0Var;
    }

    @Override
    public final void run() {
        switch (this.f30231a) {
            case 0:
                org.telegram.ui.mr0 mr0Var = this.f30232b.f30912a;
                RadialProgressView radialProgressView = mr0Var.f31238n;
                View view = mr0Var.f31239r;
                radialProgressView.setVisibility(4);
                if (mr0Var.F) {
                    mr0Var.F = false;
                    mr0Var.setPlaybackSpeed(mr0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = mr0Var.f31235b;
                if (photoViewer != null) {
                    photoViewer.A0();
                    return;
                }
                return;
            default:
                this.f30232b.f30912a.h.setVisibility(4);
                return;
        }
    }
}
