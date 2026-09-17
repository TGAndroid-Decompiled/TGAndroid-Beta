package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class nf0 implements Runnable {
    public final int f28741a;
    public final pf0 f28742b;

    public nf0(pf0 pf0Var, int i10) {
        this.f28741a = i10;
        this.f28742b = pf0Var;
    }

    @Override
    public final void run() {
        switch (this.f28741a) {
            case 0:
                org.telegram.ui.hu0 hu0Var = this.f28742b.f29368a;
                RadialProgressView radialProgressView = hu0Var.f29713n;
                View view = hu0Var.f29714r;
                radialProgressView.setVisibility(4);
                if (hu0Var.F) {
                    hu0Var.F = false;
                    hu0Var.setPlaybackSpeed(hu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = hu0Var.f29709b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f28742b.f29368a.h.setVisibility(4);
                return;
        }
    }
}
