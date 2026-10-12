package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.yh;
public final class m implements Runnable {
    public final int f30323a;
    public final t f30324b;

    public m(t tVar, int i10) {
        this.f30323a = i10;
        this.f30324b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f30323a) {
            case 0:
                this.f30324b.requestLayout();
                return;
            default:
                t tVar = this.f30324b;
                TextView textView = tVar.O;
                o oVar = tVar.f30476a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    yh.r(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
