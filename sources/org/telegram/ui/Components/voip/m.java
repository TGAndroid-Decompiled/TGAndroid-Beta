package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.nk;
public final class m implements Runnable {
    public final int f31560a;
    public final t f31561b;

    public m(t tVar, int i10) {
        this.f31560a = i10;
        this.f31561b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f31560a) {
            case 0:
                this.f31561b.requestLayout();
                return;
            default:
                t tVar = this.f31561b;
                TextView textView = tVar.O;
                o oVar = tVar.f31712a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    nk.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
