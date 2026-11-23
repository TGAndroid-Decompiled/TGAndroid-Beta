package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class he0 implements Runnable {
    public final int f35720a;
    public final je0 f35721b;

    public he0(je0 je0Var, int i7) {
        this.f35720a = i7;
        this.f35721b = je0Var;
    }

    @Override
    public final void run() {
        switch (this.f35720a) {
            case 0:
                org.telegram.ui.dq0 dq0Var = this.f35721b.f36396a;
                RadialProgressView radialProgressView = dq0Var.f36725n;
                View view = dq0Var.f36726r;
                radialProgressView.setVisibility(4);
                if (dq0Var.G) {
                    dq0Var.G = false;
                    dq0Var.setPlaybackSpeed(dq0Var.F);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = dq0Var.f36721b;
                if (photoViewer != null) {
                    photoViewer.s0();
                    return;
                }
                return;
            default:
                this.f35721b.f36396a.h.setVisibility(4);
                return;
        }
    }
}
