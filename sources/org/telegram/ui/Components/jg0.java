package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class jg0 implements Runnable {
    public final int f29644a;
    public final lg0 f29645b;

    public jg0(lg0 lg0Var, int i10) {
        this.f29644a = i10;
        this.f29645b = lg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29644a) {
            case 0:
                org.telegram.ui.vt0 vt0Var = this.f29645b.f30208a;
                RadialProgressView radialProgressView = vt0Var.f30578n;
                View view = vt0Var.f30579r;
                radialProgressView.setVisibility(4);
                if (vt0Var.F) {
                    vt0Var.F = false;
                    vt0Var.setPlaybackSpeed(vt0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = vt0Var.f30575b;
                if (photoViewer != null) {
                    photoViewer.A0();
                    return;
                }
                return;
            default:
                this.f29645b.f30208a.h.setVisibility(4);
                return;
        }
    }
}
