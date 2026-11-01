package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.a30;
public final class l implements Runnable {
    public final int f31579a;
    public final r f31580b;

    public l(r rVar, int i10) {
        this.f31579a = i10;
        this.f31580b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f31579a) {
            case 0:
                this.f31580b.requestLayout();
                return;
            default:
                r rVar = this.f31580b;
                TextView textView = rVar.O;
                n nVar = rVar.f31663a;
                if (!nVar.d.isFirstFrameRendered()) {
                    nVar.animate().cancel();
                    nVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    a30.l(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
