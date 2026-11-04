package org.telegram.ui.Components.voip;

import android.widget.TextView;
public final class l implements Runnable {
    public final int f39443a;
    public final r f39444b;

    public l(r rVar, int i3) {
        this.f39443a = i3;
        this.f39444b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f39443a) {
            case 0:
                this.f39444b.requestLayout();
                return;
            default:
                r rVar = this.f39444b;
                TextView textView = rVar.P;
                n nVar = rVar.f39546a;
                if (!nVar.d.isFirstFrameRendered()) {
                    nVar.animate().cancel();
                    nVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    org.telegram.messenger.camera.q.k(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
