package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class yd0 implements Runnable {
    public final int f40703a;
    public final ae0 f40704b;

    public yd0(ae0 ae0Var, int i7) {
        this.f40703a = i7;
        this.f40704b = ae0Var;
    }

    @Override
    public final void run() {
        switch (this.f40703a) {
            case 0:
                org.telegram.ui.eq0 eq0Var = this.f40704b.f31777a;
                RadialProgressView radialProgressView = eq0Var.f32243n;
                View view = eq0Var.f32244r;
                radialProgressView.setVisibility(4);
                if (eq0Var.F) {
                    eq0Var.F = false;
                    eq0Var.setPlaybackSpeed(eq0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = eq0Var.f32239b;
                if (photoViewer != null) {
                    photoViewer.s0();
                    return;
                }
                return;
            default:
                this.f40704b.f31777a.h.setVisibility(4);
                return;
        }
    }
}
