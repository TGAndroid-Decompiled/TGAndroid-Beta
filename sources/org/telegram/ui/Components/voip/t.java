package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.m10;
public final class t implements Runnable {
    public final int f41229a;
    public final z f41230b;

    public t(z zVar, int i7) {
        this.f41229a = i7;
        this.f41230b = zVar;
    }

    @Override
    public final void run() {
        switch (this.f41229a) {
            case 0:
                this.f41230b.requestLayout();
                return;
            default:
                z zVar = this.f41230b;
                TextView textView = zVar.P;
                v vVar = zVar.f41357a;
                if (!vVar.d.isFirstFrameRendered()) {
                    vVar.animate().cancel();
                    vVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    m10.n(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
