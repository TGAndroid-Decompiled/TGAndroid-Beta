package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.vh;
public final class m implements Runnable {
    public final int f33944a;
    public final t f33945b;

    public m(t tVar, int i10) {
        this.f33944a = i10;
        this.f33945b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f33944a) {
            case 0:
                this.f33945b.requestLayout();
                return;
            default:
                t tVar = this.f33945b;
                TextView textView = tVar.O;
                o oVar = tVar.f34074a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    vh.p(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
