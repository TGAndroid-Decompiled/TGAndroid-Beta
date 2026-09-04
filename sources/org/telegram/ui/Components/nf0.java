package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class nf0 implements Runnable {
    public final int f28740a;
    public final pf0 f28741b;

    public nf0(pf0 pf0Var, int i10) {
        this.f28740a = i10;
        this.f28741b = pf0Var;
    }

    @Override
    public final void run() {
        switch (this.f28740a) {
            case 0:
                org.telegram.ui.hu0 hu0Var = this.f28741b.f29367a;
                RadialProgressView radialProgressView = hu0Var.f29712n;
                View view = hu0Var.f29713r;
                radialProgressView.setVisibility(4);
                if (hu0Var.F) {
                    hu0Var.F = false;
                    hu0Var.setPlaybackSpeed(hu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = hu0Var.f29708b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f28741b.f29367a.h.setVisibility(4);
                return;
        }
    }
}
