package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class zf0 implements Runnable {
    public final int f30881a;
    public final bg0 f30882b;

    public zf0(bg0 bg0Var, int i10) {
        this.f30881a = i10;
        this.f30882b = bg0Var;
    }

    @Override
    public final void run() {
        switch (this.f30881a) {
            case 0:
                org.telegram.ui.au0 au0Var = this.f30882b.f22967a;
                RadialProgressView radialProgressView = au0Var.f23295n;
                View view = au0Var.f23296r;
                radialProgressView.setVisibility(4);
                if (au0Var.F) {
                    au0Var.F = false;
                    au0Var.setPlaybackSpeed(au0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = au0Var.f23292b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f30882b.f22967a.h.setVisibility(4);
                return;
        }
    }
}
