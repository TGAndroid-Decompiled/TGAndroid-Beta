package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.mk;
public final class m implements Runnable {
    public final int f31556a;
    public final t f31557b;

    public m(t tVar, int i10) {
        this.f31556a = i10;
        this.f31557b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f31556a) {
            case 0:
                this.f31557b.requestLayout();
                return;
            default:
                t tVar = this.f31557b;
                TextView textView = tVar.O;
                o oVar = tVar.f31708a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    mk.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
