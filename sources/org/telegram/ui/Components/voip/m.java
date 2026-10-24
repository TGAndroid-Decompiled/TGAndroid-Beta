package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.tl;
public final class m implements Runnable {
    public final int f31711a;
    public final t f31712b;

    public m(t tVar, int i10) {
        this.f31711a = i10;
        this.f31712b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f31711a) {
            case 0:
                this.f31712b.requestLayout();
                return;
            default:
                t tVar = this.f31712b;
                TextView textView = tVar.O;
                o oVar = tVar.f31863a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    tl.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
