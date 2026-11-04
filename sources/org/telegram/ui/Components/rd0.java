package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class rd0 implements Runnable {
    public final int f37709a;
    public final td0 f37710b;

    public rd0(td0 td0Var, int i3) {
        this.f37709a = i3;
        this.f37710b = td0Var;
    }

    @Override
    public final void run() {
        switch (this.f37709a) {
            case 0:
                org.telegram.ui.tp0 tp0Var = this.f37710b.f38396a;
                RadialProgressView radialProgressView = tp0Var.f38724n;
                View view = tp0Var.f38725r;
                radialProgressView.setVisibility(4);
                if (tp0Var.G) {
                    tp0Var.G = false;
                    tp0Var.setPlaybackSpeed(tp0Var.F);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = tp0Var.f38720b;
                if (photoViewer != null) {
                    photoViewer.A0();
                    return;
                }
                return;
            default:
                this.f37710b.f38396a.h.setVisibility(4);
                return;
        }
    }
}
