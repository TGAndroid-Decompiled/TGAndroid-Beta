package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class se0 implements Runnable {
    public final int f30277a;
    public final ue0 f30278b;

    public se0(ue0 ue0Var, int i10) {
        this.f30277a = i10;
        this.f30278b = ue0Var;
    }

    @Override
    public final void run() {
        switch (this.f30277a) {
            case 0:
                org.telegram.ui.lr0 lr0Var = this.f30278b.f30946a;
                RadialProgressView radialProgressView = lr0Var.f31273n;
                View view = lr0Var.f31274r;
                radialProgressView.setVisibility(4);
                if (lr0Var.F) {
                    lr0Var.F = false;
                    lr0Var.setPlaybackSpeed(lr0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = lr0Var.f31270b;
                if (photoViewer != null) {
                    photoViewer.A0();
                    return;
                }
                return;
            default:
                this.f30278b.f30946a.h.setVisibility(4);
                return;
        }
    }
}
