package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class mg0 implements Runnable {
    public final int f28655a;
    public final og0 f28656b;

    public mg0(og0 og0Var, int i10) {
        this.f28655a = i10;
        this.f28656b = og0Var;
    }

    @Override
    public final void run() {
        switch (this.f28655a) {
            case 0:
                org.telegram.ui.rt0 rt0Var = this.f28656b.f29171a;
                RadialProgressView radialProgressView = rt0Var.f29554n;
                View view = rt0Var.f29555r;
                radialProgressView.setVisibility(4);
                if (rt0Var.F) {
                    rt0Var.F = false;
                    rt0Var.setPlaybackSpeed(rt0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = rt0Var.f29551b;
                if (photoViewer != null) {
                    photoViewer.A0();
                    return;
                }
                return;
            default:
                this.f28656b.f29171a.h.setVisibility(4);
                return;
        }
    }
}
