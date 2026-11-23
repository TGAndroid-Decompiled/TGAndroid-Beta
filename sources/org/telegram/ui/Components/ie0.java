package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class ie0 implements Runnable {
    public final int f36198a;
    public final ke0 f36199b;

    public ie0(ke0 ke0Var, int i7) {
        this.f36198a = i7;
        this.f36199b = ke0Var;
    }

    @Override
    public final void run() {
        switch (this.f36198a) {
            case 0:
                org.telegram.ui.eq0 eq0Var = this.f36199b.f36862a;
                RadialProgressView radialProgressView = eq0Var.f37129n;
                View view = eq0Var.f37130r;
                radialProgressView.setVisibility(4);
                if (eq0Var.G) {
                    eq0Var.G = false;
                    eq0Var.setPlaybackSpeed(eq0Var.F);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = eq0Var.f37125b;
                if (photoViewer != null) {
                    photoViewer.s0();
                    return;
                }
                return;
            default:
                this.f36199b.f36862a.h.setVisibility(4);
                return;
        }
    }
}
