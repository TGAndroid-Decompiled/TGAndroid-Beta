package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class jf0 implements Runnable {
    public final int f29651a;
    public final lf0 f29652b;

    public jf0(lf0 lf0Var, int i10) {
        this.f29651a = i10;
        this.f29652b = lf0Var;
    }

    @Override
    public final void run() {
        switch (this.f29651a) {
            case 0:
                org.telegram.ui.et0 et0Var = this.f29652b.f30303a;
                RadialProgressView radialProgressView = et0Var.f30676n;
                View view = et0Var.f30677r;
                radialProgressView.setVisibility(4);
                if (et0Var.B) {
                    et0Var.B = false;
                    et0Var.setPlaybackSpeed(et0Var.A);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = et0Var.f30672b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f29652b.f30303a.h.setVisibility(4);
                return;
        }
    }
}
