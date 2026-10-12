package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class ng0 implements Runnable {
    public final int f27665a;
    public final pg0 f27666b;

    public ng0(pg0 pg0Var, int i10) {
        this.f27665a = i10;
        this.f27666b = pg0Var;
    }

    @Override
    public final void run() {
        switch (this.f27665a) {
            case 0:
                org.telegram.ui.pu0 pu0Var = this.f27666b.f28309a;
                RadialProgressView radialProgressView = pu0Var.f28595n;
                View view = pu0Var.f28596r;
                radialProgressView.setVisibility(4);
                if (pu0Var.F) {
                    pu0Var.F = false;
                    pu0Var.setPlaybackSpeed(pu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = pu0Var.f28592b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f27666b.f28309a.h.setVisibility(4);
                return;
        }
    }
}
