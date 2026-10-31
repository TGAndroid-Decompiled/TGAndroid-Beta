package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.z20;
public final class l implements Runnable {
    public final int f31510a;
    public final r f31511b;

    public l(r rVar, int i10) {
        this.f31510a = i10;
        this.f31511b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f31510a) {
            case 0:
                this.f31511b.requestLayout();
                return;
            default:
                r rVar = this.f31511b;
                TextView textView = rVar.O;
                n nVar = rVar.f31600a;
                if (!nVar.d.isFirstFrameRendered()) {
                    nVar.animate().cancel();
                    nVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    z20.l(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
