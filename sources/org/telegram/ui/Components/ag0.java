package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class ag0 implements Runnable {
    public final int f22623a;
    public final cg0 f22624b;

    public ag0(cg0 cg0Var, int i10) {
        this.f22623a = i10;
        this.f22624b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f22623a) {
            case 0:
                org.telegram.ui.au0 au0Var = this.f22624b.f23311a;
                RadialProgressView radialProgressView = au0Var.f23633n;
                View view = au0Var.f23634r;
                radialProgressView.setVisibility(4);
                if (au0Var.F) {
                    au0Var.F = false;
                    au0Var.setPlaybackSpeed(au0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = au0Var.f23630b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f22624b.f23311a.h.setVisibility(4);
                return;
        }
    }
}
