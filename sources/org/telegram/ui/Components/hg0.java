package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class hg0 implements Runnable {
    public final int f26877a;
    public final jg0 f26878b;

    public hg0(jg0 jg0Var, int i10) {
        this.f26877a = i10;
        this.f26878b = jg0Var;
    }

    @Override
    public final void run() {
        switch (this.f26877a) {
            case 0:
                org.telegram.ui.ot0 ot0Var = this.f26878b.f27526a;
                RadialProgressView radialProgressView = ot0Var.f27847n;
                View view = ot0Var.f27848r;
                radialProgressView.setVisibility(4);
                if (ot0Var.F) {
                    ot0Var.F = false;
                    ot0Var.setPlaybackSpeed(ot0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = ot0Var.f27844b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    return;
                }
                return;
            default:
                this.f26878b.f27526a.h.setVisibility(4);
                return;
        }
    }
}
