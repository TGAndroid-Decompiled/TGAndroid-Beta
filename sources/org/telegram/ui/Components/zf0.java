package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class zf0 implements Runnable {
    public final int f30880a;
    public final bg0 f30881b;

    public zf0(bg0 bg0Var, int i10) {
        this.f30880a = i10;
        this.f30881b = bg0Var;
    }

    @Override
    public final void run() {
        switch (this.f30880a) {
            case 0:
                org.telegram.ui.au0 au0Var = this.f30881b.f22998a;
                RadialProgressView radialProgressView = au0Var.f23297n;
                View view = au0Var.f23298r;
                radialProgressView.setVisibility(4);
                if (au0Var.F) {
                    au0Var.F = false;
                    au0Var.setPlaybackSpeed(au0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = au0Var.f23294b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f30881b.f22998a.h.setVisibility(4);
                return;
        }
    }
}
